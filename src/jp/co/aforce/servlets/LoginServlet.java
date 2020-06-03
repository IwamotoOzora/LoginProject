package jp.co.aforce.servlets;

import java.io.IOException;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import jp.co.aforce.beans.LoginBean;
import jp.co.aforce.beans.UserBean;
import jp.co.aforce.models.LoginModel;
import jp.co.aforce.models.UserModel;

@SuppressWarnings("serial")
@WebServlet("/LoginServlet")
public class LoginServlet extends HttpServlet {

	@Override
	public void doGet(HttpServletRequest request, HttpServletResponse response)
			throws IOException, ServletException {

		//GETリクエストはありえないので、無条件でログイン画面に飛ばす
		RequestDispatcher rDispatcher = request.getRequestDispatcher("/Views/login.jsp");
		rDispatcher.forward(request, response);
	}

	@Override
	public void doPost(HttpServletRequest request, HttpServletResponse response)
			throws IOException, ServletException {

		//文字のエンコードをUTF-8とする。これがないと文字化け。
		request.setCharacterEncoding("UTF-8");
		//ユーザによって入力された情報を取り出す
		String username = request.getParameter("username");
		String password = request.getParameter("password");

		//取り出した情報をloginBeanに格納する
		LoginBean loginBean = new LoginBean();
		loginBean.setUsername(username);
		loginBean.setPassword(password);

		//モデルをインスタンス化する
		LoginModel loginModel = new LoginModel();
		String forward_jsp = "/Views/login.jsp";

		//入力された情報がDBに存在するか調べる
		if (loginModel.loginCheck(username, password)) {

			//TODO ここはオリジナル処理を考える↓↓
			//例）ログインしたユーザの情報を表示する
			//DB上にあるすべてのユーザ情報を取得
			UserModel userModel = new UserModel();
			List<UserBean> users = userModel.getAllUsers();

			//TODO ここはオリジナル処理を考える↑↑

			//リクエストオブジェクトに設定
			request.setAttribute("users", users);

			//ユーザ名の表示
			request.setAttribute("loginBean", loginBean);

			//ログインに成功した先のJSPを指定
			forward_jsp = "/Views/success.jsp";

			//ログインが失敗したときの処理
		} else {
			//エラーメッセージを設定
			loginBean.setEmsg("ユーザ名またはパスワードが違います");
			request.setAttribute("loginBean", loginBean);
		}
		//forward_jspに設定されているJSPへディスパッチ
		RequestDispatcher rDispatcher = request.getRequestDispatcher(forward_jsp);
		rDispatcher.forward(request, response);
	}
}

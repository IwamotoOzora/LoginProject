package jp.co.aforce.beans;

import java.io.Serializable;

@SuppressWarnings("serial")
public class LoginBean implements Serializable {

	private String username; //ユーザネーム
	private String password; //パスワード
	private String emsg;     //エラーメッセージ

	//引数なしのデフォルト・コンストラクタ
	public LoginBean() {

	}

	//ゲッター
	public String getUsername() {
		return username;
	}

	public String getPassword() {
		return password;
	}

	public String getEmsg() {
		return emsg;
	}

	//セッター
	public void setUsername(String username) {
		this.username = username;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public void setEmsg(String emsg) {

		this.emsg = emsg;
 	}


}

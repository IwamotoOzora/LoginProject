package jp.co.aforce.models;

import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import jp.co.aforce.beans.UserBean;
import jp.co.aforce.util.DBUtil;

public class UserModel {

	public List<UserBean> getAllUsers() {

		ResultSet rs = null;
        List<UserBean> users = new ArrayList<UserBean>();

		try {
			//DBに接続するための手続き
			DBUtil.makeConnection();
			DBUtil.makeStatement();

			String SQL = "SELECT * FROM `users`;";

		    rs =  DBUtil.execute(SQL);

		    rs.beforeFirst();
		    while (rs.next()) {
		    	UserBean userBean = new UserBean();
		    	userBean.setUsername(rs.getString("username"));
		    	userBean.setPassword(rs.getString("password"));
                users.add(userBean);
            }

		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			DBUtil.closeConnection();
		}
		return users;


	}


}



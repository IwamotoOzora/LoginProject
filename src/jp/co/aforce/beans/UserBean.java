package jp.co.aforce.beans;

import java.io.Serializable;

public class UserBean implements Serializable {

	private String username;
	private String password;

    public UserBean() {

    }

    public String getUsername() {
		return username;
	}

	public String getPassword() {
		return password;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public void setPassword(String password) {
		this.password = password;
	}
}

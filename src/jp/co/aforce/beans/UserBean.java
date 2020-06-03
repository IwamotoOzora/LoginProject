package jp.co.aforce.beans;

import java.io.Serializable;

public class UserBean implements Serializable {

	private String username;
	private String password;
	private int age;
	private String no;

	public UserBean() {

	}

	//ゲッター
	public String getUsername() {
		return username;
	}

	public String getPassword() {
		return password;
	}

	public int getAge() {
		return age;
	}

	public String getNo() {
		return no;
	}

	//セッター
	public void setUsername(String username) {
		this.username = username;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public void setNo(String no) {
		this.no = no;
	}
}

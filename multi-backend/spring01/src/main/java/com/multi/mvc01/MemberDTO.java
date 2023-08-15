package com.multi.mvc01;

public class MemberDTO {
	//데이터타입 변수명; --> ram에 공간을 만들게 된다.
	//만들어지는 위치가 변수를 사용할 수 있는 영역을 결정.
	//변수가 만들어지는 것을 포함하는 {괄호}안에서 사용할 수 있음.
	//클래스 바로 아래에 만들어지는 변수는
	//클래스 전체영역에서 사용될 수 있는 변수
	//전역변수(global변수) ==> 자동초기화
	private String id; //null
	private String pw; //null
	private String name; //null
	private String tel; //null
	
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getPw() {
		return pw;
	}
	public void setPw(String pw) {
		this.pw = pw;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getTel() {
		return tel;
	}
	public void setTel(String tel) {
		this.tel = tel;
	}
	
	@Override
	public String toString() {
		return "MemberDTO [id=" + id + ", pw=" + pw + ", name=" + name + ", tel=" + tel + "]";
	}
}

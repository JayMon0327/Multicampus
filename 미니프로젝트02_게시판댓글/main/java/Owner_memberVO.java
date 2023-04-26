package com.multi.mvc901;

public class Owner_memberVO {

	private String id;
	private String pw;
	private String homeNum;
	private String address;
	private String address_de;
	private String picture;
	private java.sql.Timestamp regdate;
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
	public String getHomeNum() {
		return homeNum;
	}
	public void setHomeNum(String homeNum) {
		this.homeNum = homeNum;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getAddress_de() {
		return address_de;
	}
	public void setAddress_de(String address_de) {
		this.address_de = address_de;
	}
	public String getPicture() {
		return picture;
	}
	public void setPicture(String picture) {
		this.picture = picture;
	}
	public java.sql.Timestamp getRegDate() {
		return regdate;
	}
	public void setRegDate(java.sql.Timestamp regDate) {
		this.regdate = regDate;
	}
	@Override
	public String toString() {
		return "Owner_memberVO [id=" + id + ", pw=" + pw + ", homeNum=" + homeNum + ", address=" + address
				+ ", address_de=" + address_de + ", picture=" + picture + ", regDate=" + regdate + "]";
	}
	
	
}

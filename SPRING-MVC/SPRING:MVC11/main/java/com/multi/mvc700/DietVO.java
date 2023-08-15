package com.multi.mvc700;

public class DietVO {
	
	private String no;
	private String morning;
	private String lunch;
	private String dinner;
	private String img;
	public String getNo() {
		return no;
	}
	public void setNo(String no) {
		this.no = no;
	}
	public String getMorning() {
		return morning;
	}
	public void setMorning(String morning) {
		this.morning = morning;
	}
	public String getLunch() {
		return lunch;
	}
	public void setLunch(String lunch) {
		this.lunch = lunch;
	}
	public String getDinner() {
		return dinner;
	}
	public void setDinner(String dinner) {
		this.dinner = dinner;
	}
	public String getImg() {
		return img;
	}
	public void setImg(String img) {
		this.img = img;
	}
	@Override
	public String toString() {
		return "DietVO [no=" + no + ", morning=" + morning + ", lunch=" + lunch + ", dinner=" + dinner + ", img=" + img
				+ "]";
	}
	

}

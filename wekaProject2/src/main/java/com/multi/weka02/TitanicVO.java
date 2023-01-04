package com.multi.weka02;

public class TitanicVO {
	private double sexFemale;
	private double age;
	private double sibsp;
	private double fare;
	private double classThird;
	private double classFirst;
	private double classSecond;
	private double alive;
	public double getSexFemale() {
		return sexFemale;
	}
	public void setSexFemale(double sexFemale) {
		this.sexFemale = sexFemale;
	}
	public double getAge() {
		return age;
	}
	public void setAge(double age) {
		this.age = age;
	}
	public double getSibsp() {
		return sibsp;
	}
	public void setSibsp(double sibsp) {
		this.sibsp = sibsp;
	}
	public double getFare() {
		return fare;
	}
	public void setFare(double fare) {
		this.fare = fare;
	}
	public double getClassThird() {
		return classThird;
	}
	public void setClassThird(double classThird) {
		this.classThird = classThird;
	}
	public double getClassFirst() {
		return classFirst;
	}
	public void setClassFirst(double classFirst) {
		this.classFirst = classFirst;
	}
	public double getClassSecond() {
		return classSecond;
	}
	public void setClassSecond(double classSecond) {
		this.classSecond = classSecond;
	}
	public double getAlive() {
		return alive;
	}
	public void setAlive(double alive) {
		this.alive = alive;
	}
	@Override
	public String toString() {
		return "TitanicVO [sexFemale=" + sexFemale + ", age=" + age + ", sibsp=" + sibsp + ", fare=" + fare
				+ ", classThird=" + classThird + ", classFirst=" + classFirst + ", classSecond=" + classSecond
				+ ", alive=" + alive + "]";
	}
}

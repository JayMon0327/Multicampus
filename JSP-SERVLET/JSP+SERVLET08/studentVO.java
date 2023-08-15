package multi;

public class studentVO {
	private String name;
	private String number;
	private String department;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getNumber() {
		return number;
	}
	public void setNumber(String number) {
		this.number = number;
	}
	public String getDepartment() {
		return department;
	}
	public void setDepartment(String department) {
		this.department = department;
	}
	@Override
	public String toString() {
		return "strudentVO [name=" + name + ", number=" + number + ", department=" + department + "]";
	}
	
	
}

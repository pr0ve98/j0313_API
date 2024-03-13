package api1_Object;

public class T2_toStringVO {
	private String name;
	private int age;
	private boolean gender;
	private String job;
	private String address;
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public boolean isGender() {
		return gender;
	}
	public void setGender(boolean gender) {
		this.gender = gender;
	}
	public String getJob() {
		return job;
	}
	public void setJob(String job) {
		this.job = job;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}

	// toString을 VO(DTO) 객체에 override 하는 이유: 값이 넘어왔는지 안 넘어왔는지 찍어보기 위해
	// override 를 안 하면 주소가 나옴
//	@Override
//	public String toString() {
//		return "VO = [name="+name+", age= "+age+", gender="+gender+", job="+job+", address="+address+"]";
	
	// Source -> Generate toString
	@Override
	public String toString() {
		return "T2_toStringVO [name=" + name + ", age=" + age + ", gender=" + gender + ", job=" + job + ", address="
				+ address + "]";
	}
	
	
	
}

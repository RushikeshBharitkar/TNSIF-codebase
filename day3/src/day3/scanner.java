package day3;

public class scanner {
	
	private int income;
	private String gender;
	private int age ;
	private long mobilenumber;
	private int tax;
	
	private String name ;
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getIncome() {
		return income;
	}

	public void setIncome(int income) {
		this.income = income;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public long getMobilenumber() {
		return mobilenumber;
	}

	public void setMobilenumber(long mobilenumber) {
		this.mobilenumber = mobilenumber;
	}

	public int getTax() {
		return tax;
	}

	public void setTax(int tax) {
		this.tax = tax;
	}

	

	
	//object class method returns string representation of person object 
		@Override
		public String toString() {
			return "Person [name=" + name + ", income=" + income + ", gender=" + gender + ", age=" + age + ", mobileNumber="
					+ mobilenumber + ", tax=" + tax + "]";
		}
		

}
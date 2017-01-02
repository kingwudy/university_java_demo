package practise11;

public class Worker {
	private String name;
	private int age;
	private double salary;
	private Address address;
	public Worker(String name, int age, double salary, Address address) {
		this.name = name;
		this.age = age;
		this.salary = salary;
		this.address = address;
	}
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
	public double getSalary() {
		return salary;
	}
	public void setSalary(double salary) {
		this.salary = salary;
	}
	public Address getAddress() {
		return address;
	}
	public void setAddress(Address address) {
		this.address = address;
	}
	@Override
	public int hashCode() {
		// TODO Auto-generated method stub
		return 0;
	}
	@Override
	public boolean equals(Object obj) {
		if(!(obj instanceof Worker))
			return false;
		Worker w = (Worker) obj;
		if(this.name==w.name&&this.age==w.age&&this.salary==w.salary&&this.address.equals(w.address))
			return true;
		else
			return false;
	}
	
	
}

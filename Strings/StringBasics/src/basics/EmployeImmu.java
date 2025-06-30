package basics;

//mutable class
class Address {

	String city;
	String pincode;

	public Address(String city, String string) {
		super();
		this.city = city;
		this.pincode = string;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getPincode() {
		return pincode;
	}

	public void setPincode(String pincode) {
		this.pincode = pincode;
	}

	@Override
	public String toString() {
		return "Address [city=" + city + ", pincode=" + pincode + "]";
	}

}

final class EmployeImmu {
	private String name;
	private int empId;
	private Address addr;

	public EmployeImmu(String name, int empId, Address addr) {
		super();
		this.name = name;
		this.empId = empId;
		this.addr = new Address(addr.getCity(), addr.getPincode());
	}

	public String getName() {
		return name;
	}

	public int getEmpId() {
		return empId;
	}

	public Address getAddr() {
		return new Address(addr.getCity(), addr.getPincode());
	}

	@Override
	public String toString() {
		return "EmployeImmu [name=" + name + ", empId=" + empId + ", addr=" + addr + "]";
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Address adr = new Address("Bangalore", "560100");
		EmployeImmu emp = new EmployeImmu("Bhavana", 101, adr);

		System.out.println(emp);

		// Modify original Address object
		adr.setCity("Chennai");

		// Verify immutability
		System.out.println(emp); // Bhavana - 101 - Bangalore 560100

		// Try modifying through getter
		emp.getAddr().setCity("Delhi");

		// Again verify immutability
		System.out.println(emp); // Bhavana - 101 - Bangalore 560100

	}

}

package POJOforSerializationAndDeserialization;


public class EmployeeDetailsWithArray {
	String name;
	String eid;
	int[] phone;
	String[] email;
	String address;
	public EmployeeDetailsWithArray(String name, String eid, int[] phone, String[] email, String address) {
		this.name = name;
		this.eid = eid;
		this.phone = phone;
		this.email = email;
		this.address = address;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getEid() {
		return eid;
	}
	public void setEid(String eid) {
		this.eid = eid;
	}
	public int[] getPhone() {
		return phone;
	}
	public void setPhone(int[] phone) {
		this.phone = phone;
	}
	public String[] getEmail() {
		return email;
	}
	public void setEmail(String[] email) {
		this.email = email;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	
	
	}

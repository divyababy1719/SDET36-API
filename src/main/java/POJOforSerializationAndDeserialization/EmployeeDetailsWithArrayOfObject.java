package POJOforSerializationAndDeserialization;


public class EmployeeDetailsWithArrayOfObject {

	String name;
	String eid;
	int[] phone;
	SpouseDetails s ;
	
	public EmployeeDetailsWithArrayOfObject(String name, String eid, int[] phone, SpouseDetails s) {
		this.name = name;
		this.eid = eid;
		this.phone = phone;
		this.s = s;
	}
	
	public EmployeeDetailsWithArrayOfObject() {
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

	public SpouseDetails getS() {
		return s;
	}

	public void setS(SpouseDetails s) {
		this.s = s;
	}

	
}

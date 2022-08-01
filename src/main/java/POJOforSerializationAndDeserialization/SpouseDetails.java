package POJOforSerializationAndDeserialization;

public class SpouseDetails {

	String name;
	long phone;
	String company;
	public SpouseDetails(String name, long phone, String company) {
		this.name = name;
		this.phone = phone;
		this.company = company;
	}
	
	public SpouseDetails() {
		super();
	}

	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}
	/**
	 * @param name the name to set
	 */
	public void setName(String name) {
		this.name = name;
	}
	/**
	 * @return the phone
	 */
	public long getPhone() {
		return phone;
	}
	/**
	 * @param phone the phone to set
	 */
	public void setPhone(long phone) {
		this.phone = phone;
	}
	/**
	 * @return the company
	 */
	public String getCompany() {
		return company;
	}
	/**
	 * @param company the company to set
	 */
	public void setCompany(String company) {
		this.company = company;
	}
	
	
	
}

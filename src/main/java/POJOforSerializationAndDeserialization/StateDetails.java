package POJOforSerializationAndDeserialization;

public class StateDetails {

	String Sname;
	int NoOfDistricts;
	String[] airports;
	//Object Districts;
	Districts s1;
	Districts s2;
	
	public StateDetails(String sname, int noOfDistricts,String[] airports, Districts s1,Districts s2) {
		super();
		Sname = sname;
		NoOfDistricts = noOfDistricts;
		this.airports = airports;
		this.s1=s1;
		this.s2=s2;
	}
	public StateDetails() 
	{
	}
	public String getSname()
	{
		return Sname;
	}
	public void setSname(String Sname)
	{
		this.Sname=Sname;
	}
	public int getNoOfDistricts()
	{
		return NoOfDistricts;
	}
	public void setNoOfDistricts(int NoOfDistricts)
	{
	this.NoOfDistricts=NoOfDistricts;	
	}
	public String[] getairports()
	{
		return airports;
	}
	public void setairports(String[] airports)
	{
		this.airports=airports;
	}
	/*public Object getDistrict()
	{
		return Districts;
	}
	 public void setDistrict(Object District)
	 {
		 this.Districts=District;
	 }*/
	public Districts getS1() {
		return s1;
	}
	public void setS1(Districts s1) {
		this.s1 = s1;
	}
	public Districts getS2() {
		return s2;
	}
	public void setS2(Districts s2) {
		this.s2 = s2;
	}
	
	}

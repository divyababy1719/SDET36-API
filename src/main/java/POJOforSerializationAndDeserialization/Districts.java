package POJOforSerializationAndDeserialization;
public class Districts {
	String Dname;
	int NoOfVillages;
	String MPname;
	
	public Districts(String Dname,int NoOfVillages,String MPName)
	{
		this.Dname=Dname;
		this.NoOfVillages=NoOfVillages;
		this.MPname=MPName;
	}
	public Districts() {
		super();
	}

	public String getDname()
	{
		return Dname;
	}
	public void setDname(String Dname)
	{
		this.Dname=Dname;
	}
	public int getNoOfVillages()
	{
		return NoOfVillages;
	}
	public void setNoOfVillages(int NoOfVillages)
	{
		this.NoOfVillages=NoOfVillages;
	}
	public String getMPname()
	{
		return MPname;
	}
	public void setMPname(String MPname)
	{
		 this.MPname=MPname;
	}
}

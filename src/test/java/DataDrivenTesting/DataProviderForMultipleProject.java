package DataDrivenTesting;

import org.testng.annotations.DataProvider;

public class DataProviderForMultipleProject {
	@DataProvider(name="getData")
	public Object[][] allData()
	{
		return new Object[][]  {{"Divya","RMG1_","Created",10},{"Soumya","RMG2_","Created",12},{"Sachin","RMG3_","Created",9},{"Gokul","RMG4_","Created",14}};
	}

}

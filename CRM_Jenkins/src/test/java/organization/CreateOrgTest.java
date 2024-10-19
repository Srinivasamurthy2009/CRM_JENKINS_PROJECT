package organization;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class CreateOrgTest {

	@Test (groups = "Regression Test")
	
	public void createOrg() {
		Reporter.log("Created Organization Successfully", true);
	}
}

package organization;

import org.testng.Reporter;
import org.testng.annotations.Test;

import com.aventstack.extentreports.model.Report;

public class CreateOrgTest {

	@Test
	
	public void createOrg() {
		Reporter.log("Created Organization Successfully", true);
	}
}

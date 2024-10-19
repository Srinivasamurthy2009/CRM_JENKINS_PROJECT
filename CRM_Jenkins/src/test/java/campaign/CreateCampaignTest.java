package campaign;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class CreateCampaignTest {

		@Test (groups = "Smoke Test" )
		
		public void createOrg() {
			Reporter.log("Created Campaign Successfully", true);
		}

}

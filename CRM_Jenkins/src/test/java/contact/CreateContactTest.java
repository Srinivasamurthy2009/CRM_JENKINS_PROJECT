package contact;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class CreateContactTest {

		@Test (groups = "Regression Test")
		
		public void createOrg() {
			Reporter.log("Created Contact Successfully", true);
		}

}

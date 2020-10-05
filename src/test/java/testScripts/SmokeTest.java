package testScripts;

import org.testng.annotations.Test;

import pages.IndexPage;
import utility.Base;

public class SmokeTest extends Base{
	
	
	//Sample test
	@Test
	public void test() {
		IndexPage indexpage = new IndexPage();
		indexpage.goto_IndexPage();
		indexpage.enterUserName();
	}

}

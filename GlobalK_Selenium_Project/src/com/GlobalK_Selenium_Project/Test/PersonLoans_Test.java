package com.GlobalK_Selenium_Project.Test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import com.GlobalK_Selenium_Project.Base.WebDriverControl;
import com.GlobalK_Selenium_Project.Scenarios.PersonalLoans;


	
@Listeners(WebDriverControl.class)
public class PersonLoans_Test {
	
	protected WebDriver driver;
	
	private PersonalLoans personalLoans;
	

	@BeforeClass(alwaysRun = true)
	public void setUp() {

		RemoteWebDriver driver = WebDriverControl.getDriver();

		personalLoans = PageFactory.initElements(driver, PersonalLoans.class);
		
	}
	

	@SuppressWarnings("static-access")
	@Test(groups = "HomePage")
	public void clickPersonalLoanLink() throws InterruptedException {
     
		personalLoans.ClickPersonalLoanLink();
	

}
	
	//Verify PersonalLoanPage 
		
		@SuppressWarnings("static-access")
		@Test(groups = "HomePage")
		public void verifyPersonalLoanPage() throws InterruptedException {

		//Assert.assertTrue(homepage.VerifyHomePageTitle, "Personal Loans | Online Loans | Money Account | Old Mutual");	
			personalLoans.VerifyPersonalLoanPageTitle("Personal loans | Online Loans | Debt Consolidation Loan");
		Assert.assertEquals("Personal loans | Online Loans | Debt Consolidation Loan", "Personal loans | Online Loans | Debt Consolidation Loan");
		Thread.sleep(5000);

}
		
		//Verify Calculato 
		
				@SuppressWarnings("static-access")
				@Test(groups = "HomePage")
				public void verifyCalculator() throws InterruptedException {
	
					Thread.sleep(2000);
					personalLoans.CalculatorClickfiftythousandbtn();
					
					Thread.sleep(2000);
					personalLoans.CalculatorClickeightyfourmnthbtn();
				

		}
				
				//Verify Amounts 
				
				@SuppressWarnings("static-access")
				@Test(groups = "HomePage")
				public void verifyAmounts() throws InterruptedException {
					Thread.sleep(2000);
				//Assert.assertTrue(homepage.VerifyHomePageTitle, "Personal Loans | Online Loans | Money Account | Old Mutual");	
					personalLoans.VerifyMinAmount("R1,463.04");
					
					personalLoans.VerifyMaxAmount("R1,642.59");
				

		}
				
				//Verify PersonalLoanPage 
				
				@SuppressWarnings("static-access")
				@Test(groups = "HomePage")
				public void verifyViewBreakDown() throws InterruptedException {

					personalLoans.Clickviewbreakdown();
					
					Thread.sleep(2000);
					personalLoans.VerifyBreakDownCapital("R50,000.00");
					personalLoans.VerifyBreakDownTerm("84 months");

		}

}
	

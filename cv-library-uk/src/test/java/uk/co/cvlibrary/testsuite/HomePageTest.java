package uk.co.cvlibrary.testsuite;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;
import uk.co.cvlibrary.pages.Homepage;
import uk.co.cvlibrary.pages.ResultPage;
import uk.co.cvlibrary.testbase.TestBase;

public class HomePageTest extends TestBase {
    Homepage homepage = new Homepage();
    ResultPage resultPage = new ResultPage();

    @Test  (groups = { "smoke" })
    public void verifyTheResults() {
       homepage.acceptingCookies();
        homepage.enterJobTitle("Developer");
        homepage.enterLocation("London");
        homepage.enterDistanceDropdown("10");
        homepage.clickOnMoreSearchOptionLink();
        homepage.enterminsalary("50,000");
        homepage.enterSalaryMax("65,000");
        homepage.selectSalaryTypeDropdown("Per annum");
        homepage.enterJobTypeFromDropDown("Permanent");
        homepage.clickOnFindJobsButton();

        String actual = resultPage.verifyTheResults();
        System.out.println(actual);
       String expected = "Permanent Developer jobs in London";
//
        Assert.assertEquals(actual, expected);
    }
}

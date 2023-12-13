package uk.co.cvlibrary.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import uk.co.cvlibrary.utility.Utility;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

public class Homepage extends Utility {
//    Locators - jobTitle, location, distanceDropDown, moreSearchOptionsLink, salaryMin,
//    salaryMax, salaryTypeDropDown, jobTypeDropDown, findJobsBtn

    By jobTitle = By.id("keywords");
    By Location = By.id("location");
    By DistanceDropDown = By.xpath("//div[@class='hps-distance hps-transition']/select");
    By MoreSearchOptionsLink = By.xpath("//button[@id='toggle-hp-search']");
    By SalaryMin = By.xpath("//div[@class='hps-sal-min']/input");
    By SalaryMax = By.id("salarymax");
    By SalaryTypeDropDown = By.id("salarytype");
    By jobTypeDropDown = By.id("tempperm");
    By FindJobsBtn = By.id("hp-search-btn");

public void acceptingCookies(){
    driver.switchTo().frame("gdpr-consent-notice");

    clickOnElement(By.xpath("//div[@class='action-buttons top-bottom right-column ng-star-inserted']/button[2]"));
    driver.switchTo().defaultContent();
}


    public void enterJobTitle(String jobtitle) {

        sendTextToElement(jobTitle, jobtitle);
    }

    public void enterLocation(String location) {
        sendTextToElement(Location, location);


    }

    public void enterDistanceDropdown(String distanceDropDown) {
        sendTextToElement(DistanceDropDown, distanceDropDown);
    }

    public void clickOnMoreSearchOptionLink() {
        clickOnElement(MoreSearchOptionsLink);

    }

    public void enterminsalary(String salarymin) {
        sendTextToElement(SalaryMin, salarymin);
    }

    public void enterSalaryMax(String salarymax) {
        sendTextToElement(SalaryMax, salarymax);
    }

    public void selectSalaryTypeDropdown(String salaryTypeDropdown) {
        selectByVisibleTextFromDropDown(SalaryTypeDropDown, salaryTypeDropdown);
    }


    public void enterJobTypeFromDropDown(String JobTypeDropDown) {
        selectByVisibleTextFromDropDown(jobTypeDropDown, JobTypeDropDown);
    }

    public void clickOnFindJobsButton() {
        clickOnElement(FindJobsBtn);
    }
By facebook=By.xpath("//div[@class='footer__social']/a[1]");

public void switchWindow(){
    clickOnElement(facebook);
    Set<String> handles = driver.getWindowHandles();
    List<String> hlist=new ArrayList<>(handles);
    if (switchToRightWindow("Facebook", hlist)) {
        System.out.println(driver.getCurrentUrl()+ ": " + driver.getTitle());
    }

}}
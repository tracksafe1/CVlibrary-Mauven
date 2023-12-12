package uk.co.cvlibrary.pages;

import org.openqa.selenium.By;
import uk.co.cvlibrary.utility.Utility;

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

    public void enterJobTitle(String jobtitle) {
        sendTextToElement(jobTitle, jobtitle);
    }

    public void enterLocation(String location) {
        sendTextToElement(Location, location);

//      sendTextToElement(Location,location);
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

}
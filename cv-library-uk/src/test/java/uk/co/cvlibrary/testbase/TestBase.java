package uk.co.cvlibrary.testbase;


import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import uk.co.cvlibrary.propertyreader.PropertyReader;
import uk.co.cvlibrary.utility.Utility;

public class TestBase extends Utility {

    String browser = PropertyReader.getInstance().getProperty("browser");

    @BeforeMethod (alwaysRun = true)
    public void setUp(){
        selectBrowser(browser);

    }

    @AfterMethod
    public void tearDown(){

        closeBrowser();
    }


}

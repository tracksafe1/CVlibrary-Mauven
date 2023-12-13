package uk.co.cvlibrary.testsuite;

import org.testng.annotations.Test;
import uk.co.cvlibrary.pages.Homepage;
import uk.co.cvlibrary.testbase.TestBase;

public class SwitchWindowTest extends TestBase {
    Homepage homepage=new Homepage();
    @Test
    public void test(){
        homepage.acceptingCookies();
        homepage.switchWindow();
    }
}

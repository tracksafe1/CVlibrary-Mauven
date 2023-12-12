package uk.co.cvlibrary.pages;

import org.openqa.selenium.By;
import uk.co.cvlibrary.utility.Utility;

public class ResultPage extends Utility {
    By resultText = By.xpath("//div[@class=\"page-main\"]/div[1]/div[1]");

    public String verifyTheResults() {
        return getTextFromElement(resultText);

    }
}

package TestPage;

import org.testng.Assert;

import BasePage.BaseApp;

public class LoginPage extends BaseApp {

    String What = "//input[@data-test='search-jobTitle-input']";
    String Where = "//input[@data-test='search-location-input']";
    String Search = "//input[@data-test='search-button']";
    String Dropbox = "//select[@data-test='search-distance-input']";
    String dropdown = "//option[text()='+30 Miles']";

    public void navigate_url(String What, String Where) throws InterruptedException {

        MoveToElement(What);
        typeIn(What, What);

        MoveToElement(Where);
        typeIn(Where, Where);

        MoveToElement(Dropbox);
        click(Dropbox);
        MoveToElement(dropdown);
        click(dropdown);
        Assert.assertEquals(isDisplayed(dropdown), true);

        String actualText = getText(What);

        // Expected string to verify
        String expectedText = What;

        // Verify the text
        if (actualText.equals(expectedText)) {
            System.out.println("String verification successful!");
        } else {
            System.out.println("String verification failed!");
        }

    }
}
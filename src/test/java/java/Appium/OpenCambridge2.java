package java.Appium;

import Appium.BaseClass;
import io.appium.java_client.android.AndroidDriver;
import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.WebElement;

import java.net.MalformedURLException;
import java.net.URL;

public class OpenCambridge2 extends BaseClass {

    @Test
    public void test() throws MalformedURLException, InterruptedException {
        AndroidDriver driver = lunchAndroid();

        driver.get("http://cambridgeconsulting.us/");
        Thread.sleep(2000);
        WebElement logo = driver.findElementByXPath("//*[@class='fusion-logo-link']");
        Thread.sleep(2000);

        Assert.assertTrue(logo.isDisplayed());
          /*  if (logo.isDisplayed()) {
                System.out.println("Logo is there");

            } else {

*/

    }
}

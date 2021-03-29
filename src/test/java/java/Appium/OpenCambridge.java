package java.Appium;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.remote.MobileCapabilityType;
import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.Set;

public class OpenCambridge {

    @Test
    public void test() throws MalformedURLException, InterruptedException {
        DesiredCapabilities desiredCapabilities = new DesiredCapabilities();

        desiredCapabilities.setCapability(MobileCapabilityType.PLATFORM_NAME, "Android");
        desiredCapabilities.setCapability(MobileCapabilityType.DEVICE_NAME, "AndroidEmulator");
        desiredCapabilities.setCapability(MobileCapabilityType.PLATFORM_VERSION, "10.0");
        desiredCapabilities.setCapability(MobileCapabilityType.AUTOMATION_NAME, "UiAutomator2");
        desiredCapabilities.setCapability(MobileCapabilityType.BROWSER_NAME, "chrome");
        desiredCapabilities.setCapability("chromedriverExecutable", "C:\\Users\\bicer\\IdeaProjects\\cambridgeAndroid\\driver\\chromedriver.exe");
        //desiredCapabilities.setCapability(MobileCapabilityType.NO_RESET, true);

        AndroidDriver<WebElement> driver = new AndroidDriver<WebElement>(new URL("http:127.0.0.1:4723/wd/hub"), desiredCapabilities);

        driver.get("http://cambridgeconsulting.us/");

        Thread.sleep(2000);
        WebElement logo = driver.findElementByXPath("//*[@class='fusion-logo-link']");
        Thread.sleep(2000);

        Assert.assertTrue(logo.isDisplayed());
        if (logo.isDisplayed()) {
            System.out.println("Logo is there");

        } else {
            System.out.println("not there");
        }
     // driver.findElementByXPath("//*[@class=\"wrapper\"]/header/div[1]/div[3]/div/div[2]/a[2]']").click();
       /* inputBox.sendKeys("Selenium");
        inputBox.click();
        driver.findElementByClassName("//*[@class='s']").sendKeys("Selenium");
*/

        // android.view.View

    }
}

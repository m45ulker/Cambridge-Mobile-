package java.Appium;

import Appium.BaseClass;
import io.appium.java_client.android.AndroidDriver;
import org.junit.Test;
import org.openqa.selenium.WebDriver;

import java.net.MalformedURLException;

public class Test5 extends BaseClass {
    @Test
    public void test() throws MalformedURLException {
        AndroidDriver driver = lunchAndroid();

        driver.get("www.amazon.com ");

    }
}

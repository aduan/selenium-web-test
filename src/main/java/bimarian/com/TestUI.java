package bimarian.com;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.Test;

import java.net.URL;

public class TestUI {

    //@Test
    public void test01Firefox() {
        WebDriver driver = new FirefoxDriver();
        driver.get("http://bimarian.com");
        System.out.println("Firefox browser opened and navigated to Bimarian site");
        driver.quit();
    }


    @Test
    public void test02Chrome() throws Exception {
        System.setProperty("webdriver.chrome.driver", "/usr/bin/chromedriver");
        //WebDriver driver = new ChromeDriver();
        WebDriver driver = new RemoteWebDriver(
                new URL("http://10.20.100.185:4444/wd/hub"),
                DesiredCapabilities.chrome());
        driver.get("https://www.baidu.com/");
        System.out.println("Chrome browser opened and navigated to baidu site" + driver.getTitle());
        driver.quit();
    }
}

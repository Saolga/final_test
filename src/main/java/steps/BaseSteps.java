package steps;

import cucumber.api.java.After;
import cucumber.api.java.Before;
import io.qameta.allure.Attachment;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import utils.TestProperties;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

public class BaseSteps {
    private static WebDriver driver;
    private static String baseUrl;
    private static Properties properties = TestProperties.getInstance().getProperties();

    private static HashSet<String> names = new HashSet<>();

    public static WebDriver getDriver() {
        return driver;
    }

    @Attachment(type = "image/png", value = "Screenshot")
    public static byte[] takeScreenshot() {
        return ((TakesScreenshot) driver).getScreenshotAs(OutputType.BYTES);
    }

    @Before
    public static void setUp() {
        System.setProperty("webdriver.chrome.driver", properties.getProperty("webdriver.chrome.driver"));
        driver = new ChromeDriver();

        baseUrl = properties.getProperty("app.url");
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
        driver.manage().window().maximize();
        driver.get(baseUrl);
    }

    @After
    public static void tearDown() {
        driver.quit();
    }


    public static boolean isname(String name) {
        String a=name.toLowerCase();
        if (names.contains(a)) {
            return true;
        }
        return false;
    }

    public static void setname(String name) {
        String a=name.toLowerCase();
        names.add(a);
    }

    public static int getnamesize() {
        return names.size();
    }

    public static void pr() {
        for (String a : names)
            System.out.println(a + "   " + a.length());
    }
    public static void clearName(){
        names.removeAll(names);
    }

}

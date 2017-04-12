package DataBaseHerokuAppPages.HerokuDataBase;

import cucumber.api.java.Before;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.util.concurrent.TimeUnit;

/**
 * Created by User on 09/04/2017.
 */
public class DataBaseHook {

    public static WebDriver driver;


    @Before
    public WebDriver setup(){
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\User\\Documents\\ZLATAN\\ChromeDriver.exe");
        driver = new ChromeDriver();
        // System.setProperty("webdriver.gecko.driver","C:\\Users\\User\\Documents\\ZLATAN\\geckodriver.exe");
        // driver = new FirefoxDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
        return driver;
    }
    // @cucumber.api.java.After
    // public void teardown(){
    //  driver.quit();
     }





//}

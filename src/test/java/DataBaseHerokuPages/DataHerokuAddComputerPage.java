package DataBaseHerokuPages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

/**
 * Created by User on 09/04/2017.
 */
public class DataHerokuAddComputerPage {

    public WebDriver driver;

                 public DataHerokuAddComputerPage(WebDriver driver){
                     this.driver = driver;
                     PageFactory.initElements(driver,this);

                 }
                 @FindBy(how = How.ID,using = "name")public static WebElement Name;
                 @FindBy(how = How.ID,using = "introduced")public static WebElement Intro;
                 @FindBy(how = How.ID,using = "discontinued")public static WebElement Discont;
                 @FindBy(how = How.ID,using = "company")public static WebElement Company;
                @FindBy(how = How.XPATH,using = "//*[@id=\'main\']/form/div/input")public static WebElement Create;




                 public void SetUp(){
                     Name.sendKeys("ANITA");
                     Intro.sendKeys("2017-04-12");
                     Discont.sendKeys("2017-05-15");
                     Select rash = new Select(Company);
                     rash.selectByVisibleText("Tandy Corporation");
                     Create.click();
                 }
}

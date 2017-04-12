package DataBaseHerokuPages;

import org.apache.http.util.Asserts;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

/**
 * Created by User on 10/04/2017.
 */
public class DataHerokuConfirmPage {

    public WebDriver driver;

             public DataHerokuConfirmPage(WebDriver driver){
                 this.driver = driver;
                 PageFactory.initElements(driver,this);


             }
      @FindBy(how = How.CSS,using = ".alert-message.warning")public static WebElement Message;


             public void Confirmation(){
                 boolean doneComputerAlhajihasbeencreated = Message.isDisplayed();
                // String Message = driver.getTitle();
                // Assert.assertTrue(Message.contains("Done! Computer Alhaji has been created"));
             }
}

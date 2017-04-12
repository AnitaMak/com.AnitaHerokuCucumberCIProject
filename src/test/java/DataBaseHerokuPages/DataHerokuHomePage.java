package DataBaseHerokuPages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

/**
 * Created by User on 09/04/2017.
 */
public class DataHerokuHomePage {

    public WebDriver driver;

           public DataHerokuHomePage(WebDriver driver){
               this.driver = driver;
               PageFactory.initElements(driver,this);


           }
           @FindBy(how = How.ID,using = "add")public static WebElement ADDNewComputer;




           public void Create(){

               ADDNewComputer.click();

    }



       }






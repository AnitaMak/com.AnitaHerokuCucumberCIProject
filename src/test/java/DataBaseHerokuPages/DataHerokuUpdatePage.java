package DataBaseHerokuPages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

/**
 * Created by User on 10/04/2017.
 */
public class DataHerokuUpdatePage {

    public WebDriver driver;


            public DataHerokuUpdatePage(WebDriver driver){
                this.driver = driver;
                PageFactory.initElements(driver,this);

            }

            @FindBy(how = How.ID,using = "searchbox")public static WebElement FilterByName;
            @FindBy(how = How.ID,using = "searchsubmit")public static WebElement Search;
          @FindBy(how = How.XPATH,using = ".//*[@id='main']/table/tbody/tr[4]/td[1]/a")public static WebElement Click;
          @FindBy(how = How.XPATH,using = ".//*[@id='main']/form[2]/input")public static WebElement Delete;


                    public void SearchUpdate(){
                    FilterByName.sendKeys("ANITA");
                    Search.click();
                    Click.click();
                    Delete.click();
            }
}

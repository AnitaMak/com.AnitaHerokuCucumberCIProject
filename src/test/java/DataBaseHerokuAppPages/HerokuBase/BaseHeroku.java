package DataBaseHerokuAppPages.HerokuBase;

import DataBaseHerokuAppPages.HerokuDataBase.DataBaseHook;
import DataBaseHerokuPages.*;
import org.openqa.selenium.WebDriver;

/**
 * Created by User on 09/04/2017.
 */
public class BaseHeroku {

    public WebDriver driver;
   public DataHerokuHomePage DHA;
   public DataHerokuAddComputerPage DHP;
   public DataHerokuConfirmPage DHC;
   public DataHerokuUpdatePage DHU;

           public BaseHeroku(){
               this.driver = DataBaseHook.driver;

               DataHerokuHomePage DHA = new DataHerokuHomePage(driver);
               DataHerokuAddComputerPage DHP = new DataHerokuAddComputerPage(driver);
               DataHerokuConfirmPage DHC = new DataHerokuConfirmPage(driver);
               DataHerokuUpdatePage DHU = new DataHerokuUpdatePage(driver);

           }
}

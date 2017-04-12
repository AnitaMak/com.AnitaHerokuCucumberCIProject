package DataBaseHerokuAppPages.HerokuDataBase;

import DataBaseHerokuAppPages.HerokuBase.BaseHeroku;
import DataBaseHerokuPages.*;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.openqa.selenium.WebDriver;

/**
 * Created by User on 09/04/2017.
 */
public class DataBaseStepDef extends BaseHeroku {
   public WebDriver driver;

               public DataBaseStepDef(){

                   this.driver = DataBaseHook.driver;
               }

    @Given("^As a user am presented with the home page$")
    public void as_a_user_am_presented_with_the_home_page() throws Throwable {
       driver.get("http://computer-database.herokuapp.com/computers?s=-2");
    }

    @Given("^Am able to navigate to Add  a new computer and click to create  from the webpage$")
    public void am_able_to_navigate_to_Add_a_new_computer_and_click_to_create_from_the_webpage() throws Throwable {
        DataHerokuHomePage DHA = new DataHerokuHomePage(driver);
        DHA.Create();
    }

    @When("^Am able to read and also populate the field required with all the necessary information$")
    public void am_able_to_read_and_also_populate_the_field_required_with_all_the_necessary_information() throws Throwable {
        DataHerokuAddComputerPage DHP = new DataHerokuAddComputerPage(driver);
        DHP.SetUp();
    }

    @Then("^As a user am able to confirm a new computer is created$")
    public void as_a_user_am_able_to_confirm_a_new_computer_is_created() throws Throwable {
        DataHerokuConfirmPage DHC = new DataHerokuConfirmPage(driver);
        DHC.Confirmation();
    }

    @Then("^As a user am able to update all the information created from the home page$")
    public void as_a_user_am_able_to_update_all_the_information_created_from_the_home_page() throws Throwable {
        DataHerokuUpdatePage DHU = new DataHerokuUpdatePage(driver);
        DHU.SearchUpdate();
    }
    @Then("^As a user am able to click on any name from update list created$")
    public void as_a_user_am_able_to_click_on_any_name_from_update_list_created() throws Throwable {
        DataHerokuUpdatePage DHU = new DataHerokuUpdatePage(driver);
        DHU.SearchUpdate();
    }

    @Then("^As a user am able to delete from the edit page and confirm it was deleted successfully$")
    public void as_a_user_am_able_to_delete_from_the_edit_page_and_confirm_it_was_deleted_successfully() throws Throwable {
        DataHerokuUpdatePage DHU = new DataHerokuUpdatePage(driver);
         DHU.SearchUpdate();
    }

}

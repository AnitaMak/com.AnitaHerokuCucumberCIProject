package DataBaseHerokuAppPages.HerokuDataBase;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import org.junit.runner.RunWith;

/**
 * Created by User on 09/04/2017.
 */



@RunWith(Cucumber.class)
@CucumberOptions(
        features = "src/test/ResourceJug",
        plugin = {"html:target/cucumber"},
        tags = "@GOOGLE",
        monochrome = true


)




public class DataBaseTestRunner {
}

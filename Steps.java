package StepDefinition;

import PageObject.CalculatorPage;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.util.concurrent.TimeUnit;

public class Steps
{
    public WebDriver driver;
    CalculatorPage cp;

    @Given("I Launched browser")
    public void i_launched_browser() {
        System.setProperty("webdriver.gecko.driver","src/test/Drivers/geckodriver.exe");
        driver = new FirefoxDriver();
        cp = new CalculatorPage(driver);
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
    }

    @When("I Open Url {string}")
    public void i_open_url(String url) {
        driver.get(url);
    }

    @When("I Entered age as {string} select button {string} height as {string} weight as {string} there")
    public void i_entered_age_as_select_button_height_as_weight_as_there(String age, String gender, String height, String weight) {
        cp.setAge(age);
        cp.setGender(gender);
        cp.setHeight(height);
        cp.setWeight(weight);
    }

    @When("I click on Calculate")
    public void i_click_on_calculate() {
        cp.clickOnCalculate();
    }

    @Then("I got result")
    public void i_got_result() {
        cp.result();
    }

    @Then("Close Browser")
    public void close_browser() {
        driver.quit();
    }

}

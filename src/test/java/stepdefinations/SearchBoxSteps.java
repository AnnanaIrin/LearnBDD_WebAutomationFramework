package stepdefinations;

import configuration.common.WebTestBase;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;
import pages.HomePage;

import static configuration.common.GlobalReUsableMethods.verifyText;

public class SearchBoxSteps extends WebTestBase {
//    HomePage homePage;
    HomePage homePage=new HomePage();


    @Given("user is landed on costco homepage")
    public void user_is_landed_on_costco_homepage() {
        System.out.println("Costco home page landed");



    }
    @Given("user enter valid product name")
    public void user_enter_valid_product_name() throws InterruptedException {
       // HomePage homePage=new HomePage();
        homePage.enterProductName("hand soap");

    }
    @When("user click on search button")
    public void user_click_on_search_button() {
        homePage.clickOnSearchButton();


    }
    @Then("user should see the valid product appears")
    public void user_should_see_the_valid_product_appears(){
        verifyText(homePage.verifySearchProduct,"We found 1 results for \"hand soap\"","Product name does not match");



    }


    @Given("user is enter Invalid product name")
    public void user_is_enter_invalid_product_name() {

    }
    @Then("user should see the partial matched valid product appears")
    public void user_should_see_the_partial_matched_valid_product_appears() {

    }
    @Then("user should not see the Invalid product appears")
    public void user_should_not_see_the_invalid_product_appears() {

    }























}

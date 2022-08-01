package stepdefinations;

import configuration.common.WebTestBase;
import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;
import pages.HomePage;

import java.util.List;

import static configuration.common.GlobalReUsableMethods.verifyText;
import static org.checkerframework.checker.units.qual.Prefix.one;

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
        homePage.enterProductName("Furniture");

    }
    @When("user click on search button")
    public void user_click_on_search_button() {
        homePage.clickOnSearchButton();


    }
    @Then("user should see the valid product appears")
    public void user_should_see_the_valid_product_appears(){
        verifyText(homePage.verifySearchProduct,"Furniture","Product name does not match");



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

    @Given("user enter {string} valid product name")
    public void user_enter_valid_product_name(String productName) {
        // HomePage homePage=new HomePage();
        homePage.enterProductName(productName);


    }

    @Then("user should see {string} the valid product appears")
    public void user_should_see_the_valid_product_appears(String expectedProduct) {
        verifyText(homePage.verifySearchProduct, expectedProduct  ,"Product name does not match");

    }

    @Given("user enter valid {string} products name")
    public void user_enter_valid_products_name(String productName) {
        homePage.enterProductName(productName);

    }
    @Then("user should see the valid {string} products appears")
    public void user_should_see_the_valid_products_appears(String expectedProduct) {
        verifyText(homePage.verifySearchProduct, expectedProduct  ,"Product name does not match");

    }



    @And("user enter {string} valid product name for search")
    public void user_enter_see_valid_product_name_for_search(String expectedProduct) {



    }

    @Then("user should see {string} the valid product appears after search")
    public void user_should_see_the_valid_product_appears_after_search(String expectedProduct) {
        verifyText(homePage.verifySearchProduct, expectedProduct  ,"Product name does not match");

    }

    @Given("user enter valid user name & password")
    public void user_enter_valid_user_name_password(DataTable dt) {
        // Write code here that turns the phrase above into concrete actions
        // For automatic transformation, change DataTable to one of
        // E, List<E>, List<List<E>>, List<Map<K,V>>, Map<K,V> or
        // Map<K, List<V>>. E,K,V must be a String, Integer, Float,
        // Double, Byte, Short, Long, BigInteger or BigDecimal.
        //
        // For other transformations you can register a DataTableType.
        List<List<String>> data= dt.asLists(String.class);
        String userName=data.get(1).get(0);
        String password=data.get(1).get(1);
        System.out.println("****Value: "+userName);
        homePage.enterProductName(userName);
        homePage.enterProductName(password);


    }

    @When("user click on signIn button")
    public void user_click_on_sign_in_button() {

    }

    @Then("user should see profile name")
    public void user_should_see_profile_name() {

    }

    @Given("user enter valid product name for search")
    public void user_enter_valid_product_name_for_search(DataTable dataTable) {
        List<List<String>> data= dataTable.asLists(String.class);
        String productName=data.get(1).get(0);
       // homePage.enterProductName(productName);
        homePage.enterProductName(data.get(1).get(0));//first row second one is colum





    }

    @Then("user should see the valid product appears after search")
    public void user_should_see_the_valid_product_appears_after_search(io.cucumber.datatable.DataTable dataTable) {
        List<List<String>> data= dataTable.asLists(String.class);
        String expectedProduct=data.get(1).get(0);
        verifyText(homePage.verifySearchProduct, expectedProduct  ,"Product name does not match");

    }





















}

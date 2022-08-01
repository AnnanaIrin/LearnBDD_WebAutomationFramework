package pages;

import configuration.common.WebTestBase;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import static configuration.common.GlobalReUsableMethods.clickOnElement;
import static configuration.common.GlobalReUsableMethods.enterValueOnElement;
import static org.apache.commons.io.FileUtils.waitFor;
import static pageelements.HomePageElements.*;

public class HomePage extends WebTestBase {

    //Constructor
    public HomePage(){
        PageFactory.initElements(driver,this);
    }



    @FindBy(xpath = searchBoxWebElement)
    public WebElement searchBox;
    @FindBy(xpath =searchButtonWebElement)
    public WebElement searchButton;
    @FindBy(xpath =verifySearchProductWebElement)
    public WebElement verifySearchProduct;

    //Search product
    public void searchValidProduct(String productName) throws InterruptedException {
        //searchBox.sendKeys();
        enterValueOnElement(searchBox,productName);
        waitFor(5);
        clickOnElement(searchButton);
        waitFor(5);
    }

    public void enterProductName(String productName){
        enterValueOnElement(searchBox,productName);
    }

    public void clickOnSearchButton(){
        clickOnElement(searchButton);
    }


}

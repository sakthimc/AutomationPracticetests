package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

public class homePage {
    private WebDriver driver;

    public homePage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    @FindBy(how = How.CSS, using = "div#contact-link > a")
    private WebElement contactUsLink;

    @FindBy(how = How.CSS, using = "header#header div.header_user_info > a")
    private WebElement signInLink;

    @FindBy(how = How.CSS, using = "input#search_query_top")
    private WebElement productSearchTextArea;

    @FindBy(how = How.CSS, using = "form#searchbox > button[type=\"submit\"]")
    private WebElement searchButton;

    public void clickContactUsPageLink() {
        contactUsLink.click();
    }

    public void clickSignInLink() {
        signInLink.click();
    }

    public void searchProduct(String product) {
        productSearchTextArea.sendKeys(product);
    }

    public void clickProductSearch() {
        searchButton.click();
    }
}

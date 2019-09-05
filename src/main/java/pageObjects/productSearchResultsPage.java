package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class productSearchResultsPage {
    private WebDriver driver;

    public productSearchResultsPage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    @FindBy(how = How.CSS, using = "div#center_column a.button.ajax_add_to_cart_button.btn.btn-default > span")
    private WebElement addToCartButton;

    @FindBy(how = How.CSS, using = "div#layer_cart a > span")
    private WebElement proceedToCartButton;

    @FindBy(how = How.CSS, using = "div#center_column img")
    private WebElement productResultImage;

    public void clickAddToCartButton() {
        Actions builder = new Actions(driver);
        builder.moveToElement(productResultImage).perform();
        WebDriverWait wait = new WebDriverWait(driver, 10);
        wait.until(ExpectedConditions.elementToBeClickable(addToCartButton));
        addToCartButton.click();
    }

    public void clickProceedToCartButton() {
        WebDriverWait wait = new WebDriverWait(driver, 10);
        wait.until(ExpectedConditions.elementToBeClickable(proceedToCartButton));
        proceedToCartButton.click();
    }
}

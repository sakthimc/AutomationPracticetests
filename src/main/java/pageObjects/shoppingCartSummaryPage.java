package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.json.JsonOutput;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class shoppingCartSummaryPage {
    private WebDriver driver;

    public shoppingCartSummaryPage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    @FindBy(how = How.CSS, using = "table#cart_summary a > i")
    private WebElement removeProductLink;

    @FindBy(how = How.CSS, using = "div#center_column > p")
    private WebElement productRemovedConfirmationMessage;

    public void removeProductFromCart() {
        removeProductLink.click();
    }

    public void verifyProductSuccessfullyRemoved() {
        productRemovedConfirmationMessage.isDisplayed();
        WebDriverWait wait = new WebDriverWait(driver, 10);
        wait.until(ExpectedConditions.elementToBeClickable(productRemovedConfirmationMessage));
        String confirmProdRemoval = productRemovedConfirmationMessage.getText();
        System.out.println("" + confirmProdRemoval);
        driver.quit();
    }

}

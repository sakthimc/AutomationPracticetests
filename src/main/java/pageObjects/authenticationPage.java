package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class authenticationPage {
    private WebDriver driver;

    public authenticationPage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    @FindBy(how = How.CSS, using = "input#email_create")
    private WebElement emailAddressField;

    @FindBy(how = How.CSS, using = "button#SubmitCreate > span")
    private WebElement createAccountButton;

    @FindBy(how = How.ID, using = "create_account_error")
    private WebElement accountCreateError;

    public void enterEmailAddress(String emailAdd) {
        emailAddressField.sendKeys(emailAdd);
    }

    public void setCreateAccountButton() {
        createAccountButton.click();
    }

    public void verifyAccountCreationError() {
        accountCreateError.isDisplayed();
        WebDriverWait wait = new WebDriverWait(driver, 10);
        wait.until(ExpectedConditions.visibilityOf(accountCreateError));
        String accountCreationError = accountCreateError.getText();
        System.out.println("" + accountCreationError);
        driver.quit();
    }
}

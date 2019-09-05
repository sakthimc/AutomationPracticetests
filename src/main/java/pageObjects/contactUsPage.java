package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class contactUsPage {
    private WebDriver driver;

    public contactUsPage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    @FindBy(how = How.CSS, using = "select#id_contact")
    private WebElement dropDownSubjectHeading;

    @FindBy(how = How.CSS, using = "input#email")
    private WebElement emailAddressField;

    @FindBy(how = How.CSS, using = "input#id_order")
    private WebElement orderReferenceField;

    @FindBy(how = How.CSS, using = "textarea#message")
    private WebElement messageTextArea;

    @FindBy(how = How.CSS, using = "uniform-fileUpload")
    private WebElement fileUploadField;

    @FindBy(how = How.CSS, using = "button#submitMessage > span")
    private WebElement sendButton;

    @FindBy(how = How.CSS, using = "div#center_column > p")
    private WebElement sendMessageConfirmation;

    public void fillContactUsForm() {
        Select subHeading = new Select(dropDownSubjectHeading);
        subHeading.selectByValue("2");
        emailAddressField.sendKeys("123@email.com");
        orderReferenceField.sendKeys("ref1234");
        WebDriverWait wait = new WebDriverWait(driver, 18);
        wait.until(ExpectedConditions.elementToBeClickable(messageTextArea));
        messageTextArea.sendKeys("I couldnt place an order");
        sendButton.click();
    }

    public void verifyConfirmationMessage() {
        WebDriverWait wait = new WebDriverWait(driver, 18);
        wait.until(ExpectedConditions.elementToBeClickable(sendMessageConfirmation));
        sendMessageConfirmation.isDisplayed();
        String confirmMessage = sendMessageConfirmation.getText();
        System.out.println("" + confirmMessage);
        driver.quit();
    }

}

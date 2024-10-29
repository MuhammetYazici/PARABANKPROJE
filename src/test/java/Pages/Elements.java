package Pages;

import Utilities.GWD;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Elements extends Parent{

    public Elements(){
        PageFactory.initElements(GWD.getDriver(),this);
    }
    // betul locator
    @FindBy(xpath="//*[text()='Customer Login']")
    public WebElement customer_login;

    @FindBy(name="username")
    public WebElement login_username;

    @FindBy(name="password")
    public WebElement login_password;

    @FindBy(xpath = "//*[@value='Log In']")
    public WebElement login_button;

    @FindBy(xpath = "//*[text()='Welcome']")
    public WebElement login_wellcome;

    @FindBy(xpath = "//*[@class='error']")
    public WebElement login_error;

    @FindBy(xpath="//*[text()='Log Out']")
    public WebElement Log_Out;

    // muhammet locator
    @FindBy(xpath = "//a[text()='Bill Pay']")
    public WebElement billPay;

    @FindBy(xpath = "//div[@id='billpayForm']//input[@name='payee.name']")
    public WebElement payeName;

    @FindBy(xpath = "//div[@id='billpayForm']//input[@name='payee.address.street']")
    public WebElement payeAddress;

    @FindBy(xpath = "//div[@id='billpayForm']//input[@name='payee.address.city']")
    public WebElement payeCity;

    @FindBy(xpath = "//div[@id='billpayForm']//input[@name='payee.address.state']")
    public WebElement payeState;

    @FindBy(xpath = "//div[@id='billpayForm']//input[@name='payee.address.zipCode']")
    public WebElement payeZipCode;

    @FindBy(xpath = "//div[@id='billpayForm']//input[@name='payee.phoneNumber']")
    public WebElement payePhoneNumber;

    @FindBy(xpath = "//div[@id='billpayForm']//input[@name='payee.accountNumber']")
    public WebElement payeAccount;

    @FindBy(xpath = "//div[@id='billpayForm']//input[@name='verifyAccount']")
    public WebElement payeVerAccount;

    @FindBy(xpath = "//div[@id='billpayForm']//input[@name='amount']")
    public WebElement payeAmount;

    @FindBy(xpath = "//div[@id='billpayForm']//select")
    public WebElement payefromAcoount;

    @FindBy(xpath = "//div[@id='billpayForm']//input[@value='Send Payment']")
    public WebElement payeSend;

    @FindBy(xpath = "//div[@id='billpayResult']//p[1]")
    public WebElement payeSuccessMessage;

    @FindBy(linkText= "Accounts Overview")
    public WebElement accountOverviewButton;

    @FindBy(xpath= "//a[text()='13899']")
    public WebElement  accountNumber;

    public WebElement getWebElement(String strElementName){

        switch (strElementName.trim())
        {

            case "billPay"  : return this.billPay;
            case "payeSend" : return this.payeSend;
            case "payeName" : return this.payeName;
            case "payeAddress" : return this.payeAddress;
            case "payeCity" : return this.payeCity;
            case "payeState" : return this.payeState;
            case "payeZipCode": return this.payeZipCode;
            case "payePhoneNumber": return this.payePhoneNumber;
            case "payeAccount": return this.payeAccount;
            case "payeVerAccount": return this.payeVerAccount;
            case "payeAmount": return this.payeAmount;
            case "payeSuccessMessage": return this.payeSuccessMessage;
            case "payefromAcoount": return this.payefromAcoount;
            //betul
            case "Username" : return this.login_username;
            case "Testuser" : return this.login_password;
//betul
        }
        return null;
    }




}

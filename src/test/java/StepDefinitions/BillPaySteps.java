package StepDefinitions;

import Pages.Elements;
import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import org.openqa.selenium.WebElement;

import java.util.List;

public class BillPaySteps {
    Elements el = new Elements();

    @And("Click on the Elements")
    public void clickOnTheElements(DataTable element) {
        List<String> elements = element.asList();

        for (int i = 0; i < elements.size(); i++) {
            el.myClick(el.getWebElement(elements
                    .get(i)));

        }
    }

    @Then("Send payment")
    public void sendPayment(DataTable dtbilgiler) {
        List<List<String>> bilgiler = dtbilgiler.asLists();

        for (int i = 0; i < bilgiler.size(); i++) {
            WebElement payler =el.getWebElement(bilgiler.get(i).get(0));
            el.mySendKeys(payler,bilgiler.get(i).get(1));
        }
    }

 /*   @And("Select from account")
    public void selectFromAccount() {
        el.myClick(el.payefromAcoount);
    }
*/
    @And("receive invoice successfully paid message")
    public void receiveInvoiceSuccessfullyPaidMessage() {
        el.verifyContainsText(el.payeSuccessMessage,"success");
    }

    @And("Navigate to Accounts Overview")
    public void navigateToAccountsOverview() {
        el.myClick(el.accountOverviewButton);
    }

    @And("Click the account number")
    public void clickTheAccountNumber() {
        el.myClick(el.accountNumber);
    }

}

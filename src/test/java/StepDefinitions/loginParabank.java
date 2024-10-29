package StepDefinitions;

import Pages.Elements;
import Utilities.GWD;
import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.*;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import java.time.Duration;
import java.util.List;

public class loginParabank {
    Elements el=new Elements();
    WebDriverWait wait=new WebDriverWait(GWD.getDriver(), Duration.ofSeconds(5));

    @Given("user visits the parabank website.")
    public void userVisitsTheParabankWebsite() {
        GWD.getDriver().get("https://parabank.parasoft.com/");

    }
    @And("the user sees the {string} section on the home page.")
    public void theUserSeesTheSectionOnTheHomePage(String customer_login) {
        Assert.assertTrue(el.customer_login.getText().equalsIgnoreCase(customer_login),"Login sayfasında değilsiniz");
    }


    @And("Who user logs with the following information:")
    public void whoUserLogsWithTheFollowingInformation(DataTable dtUserPass) {

        List<List<String>> listUserPass=  dtUserPass.asLists();
        for (int i = 0; i < listUserPass.size(); i++) {
            el.mySendKeys(el.login_username,listUserPass.get(i).get(0));
            el.mySendKeys(el.login_password,listUserPass.get(i).get(1));
            el.myClick(el.login_button);
        }
    }

    @And("The user confirms that you successfully login.")
    public void theUserConfirmsThatYouSuccessfullyLogin() {
        Assert.assertTrue(el.login_wellcome.getText().equals("Welcome"),"login başarı olmamıştır");
    }

    @But("user switches the session with the log out option.")
    public void userSwitchesTheSessionWithTheLogOutOption() {
        el.myClick(el.Log_Out);
    }
}
// betul
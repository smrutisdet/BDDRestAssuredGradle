package steps;

import cucumber.api.PendingException;
import cucumber.api.java8.En;
import entities.LoginDetails;
import excelDataReaders.LoginDataReader;
import pages.LoginPage;

public class LoginSteps extends BaseSteps implements En {

    public LoginSteps() {

        Given("^(.*) logs in$", (String currentUser) -> {
            LoginDetails loginDetails = new LoginDataReader(loginTestDataFileName).getLoginDetails(currentUser);
            pageStore.get(LoginPage.class).loginAs(loginDetails);
        });

        And("^user should still see the login page$", () -> {
            pageStore.get(LoginPage.class).isLoginPage();
        });

        And("^user should see the Home page$", () -> {
            pageStore.get(LoginPage.class).isHomePage();
        });
    }
}

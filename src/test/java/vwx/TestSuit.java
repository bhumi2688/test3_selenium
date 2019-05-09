package vwx;

import org.junit.Test;

public class TestSuit extends BaseTest {
    Homepage homepage = new Homepage();
    Registrationpage registrationpage = new Registrationpage();
    RegistrationSuccessPage registrationsuccesspage = new RegistrationSuccessPage();

    @Testpublic void userShouldbeAbleToRegisterSuccessfully(){

        homepage.clickOnRegisterButton();
        registrationpage.userEntersRegistrationDetails();
        registrationsuccesspage.verifyUserSeeRegistrationSuccessMessage();



    }
}

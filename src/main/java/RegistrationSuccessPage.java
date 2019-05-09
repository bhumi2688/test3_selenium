import org.openqa.selenium.By;

public class RegistrationSuccessPage extends Utils {

    private By _RegisterSuccessPage = By.xpath("//div[@class=\"result\"]");

    public void verifyUserSeeRegistrationSuccessMessage(){
        assertURL("registerresult");
        assertTextMessage("Your registration completed");
    }










}

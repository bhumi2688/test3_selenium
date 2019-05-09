import org.omg.CORBA.Current;
import org.openqa.selenium.By;

public class RegistrationPage extends Utils {

    LoadProp loadProp = new LoadProp();

    private By _female = By.xpath("//input[@id =\"gender-female\"]");
    private By _firstname = By.xpath("//input[@id=\"FirstName\"]");
    private By _lastname = By.xpath("//input[@id=\"LastName\"]");
    private By _email = By.xpath("//input[@id=\"Email\"]");
    private By _password = By.xpath("//input[@id=\"Password\"]");
    private By _confirmpassword = By.xpath("//input[@id=\"ConfirmPassword\"]");
    private By _registerbutton = By.xpath("Register-button");
    private static String timestamp = GetCurrentTimeStamp();



   // public void verifyUserIsOnRegisterPage() {
       // assertURL("register");
    //}
     //   public void userEnterRegistrationDetails(){
       //     sendText(_female,"female");
         //   sendText(_firstname, loadProp.getProperty("bhumi"));          //did copypaste but dnt know how we get so have comment out
           // sendText(_lastname, "patel");
            //sendText(_email, "testtest" + timestamp+ "@test.com");
            //sendText(_password, "bhumi26");
            //sendText(_confirmpassword, "bhumi26");

      //  }
    }




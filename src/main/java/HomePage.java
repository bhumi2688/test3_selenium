import org.openqa.selenium.By;

public class HomePage extends Utils {


    private By _registerLink = By.xpath("//a[@class='ico-register']") ;
    private By _categoriesLink = By.linkText ("Categories");
    private By _computerLink = By.linkText("Computer");
    private By _apparelLink = By.linkText("Apparel");

    public void clickonRegisterButton(){
        clickElementBy(_registerLink);
    }
    public void clickonCategories(String Link){
        clickElementBy(_categoriesLink);
    }
    public void clickonComputer(){
        clickElementBy(_computerLink);
    }
    public void clickonApparel(){
        clickElementBy(_apparelLink);
    }


}

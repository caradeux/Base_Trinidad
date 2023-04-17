package pageObject;

import constantGlobal.Constans;
import io.qameta.allure.Step;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;


public class SauceDemoPage extends Base {

    @FindBy(id = Constans.USERNAME)
    private WebElement inputUserName;

    @FindBy(name = Constans.PASSWORD)
    private WebElement inputPassword;

    @FindBy(xpath = Constans.BUTTON_LOGIN)
    private WebElement buttonLogin;

    private By userName = By.id("user-name");
    private By password = By.id("password");
    private By shoppingCart = By.cssSelector(Constans.SHOPPING_CART);

    public SauceDemoPage(WebDriver driver) {
        super(driver);
    }

    @Step("Ingreso de Usuario")
    public void givenThatTheUser() {

        clearInput(inputUserName);
        insertValue(userName, "standard_user");

        clearInput(inputPassword);
        insertValue(password, "secret_sauce");
    }

    @Step("Presiona Boton Ingresar")
    public void whenTheUser() {
        clickButton(buttonLogin);
    }

    public boolean isExistElement() {
        return isDisplayed(shoppingCart);
    }

}

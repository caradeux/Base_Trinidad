package pageObject;

import constantGlobal.Constans;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.Properties;

public class LoginPageObject {

    private WebDriver webDriver;

    Properties propiedades = new Properties();

    @FindBy(id = "vSECUSERRUT")
    private WebElement TxtvSECUSERRUT;

    public WebElement getTxtvSECUSERRUT() {
        return TxtvSECUSERRUT;
    }

    @FindBy(id = "vSECUSERPASSWORD")
    private WebElement TxtvSECUSERPASSWORD;

    public WebElement getTxtvSECUSERPASSWORD() {
        return TxtvSECUSERPASSWORD;
    }

    @FindBy(id = "BTNENTER")
    private WebElement BtnBTNENTER;

    public WebElement getBtnBTNENTER() {
        return BtnBTNENTER;
    }


    public void Inicializar() throws Exception {


        TxtvSECUSERRUT.clear();

        TxtvSECUSERPASSWORD.clear();
        Thread.sleep(2000);

    }

    public void Login() throws Exception {
        TxtvSECUSERRUT.click();
        TxtvSECUSERRUT.sendKeys(Constans.USERNAME);

        TxtvSECUSERPASSWORD.click();
        TxtvSECUSERPASSWORD.sendKeys(Constans.PASSWORD);

        Thread.sleep(500);

        BtnBTNENTER.click();
        Thread.sleep(2000);
    }


}

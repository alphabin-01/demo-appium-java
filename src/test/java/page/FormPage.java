package page;

import PageObject.BasePo;
import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import org.openqa.selenium.WebElement;
import java.util.List;

public class FormPage extends BasePo {

    public FormPage(AndroidDriver<AndroidElement> driver) {
        super(driver);
    }

    public void fillInputField(){
        getEmailField().sendKeys("hello!!!!");
        getSwitchButton().click();
        MobileElement dropdown = driver.findElementByXPath("//android.view.ViewGroup[@content-desc=\"Dropdown\"]/android.view.ViewGroup/android.widget.EditText");
        dropdown.click();
        MobileElement clickOption = driver.findElementByXPath("(//android.widget.CheckedTextView)[2]");
        clickOption.click();
//        getActiveButton().click();
//        getAlert1().click();
    }

    public MobileElement getSwitchButton(){
        MobileElement switchOn = driver.findElementByAccessibilityId("switch");
        return switchOn;
    }

    public MobileElement getEmailField(){
        String pageSorce = driver.getPageSource();
        System.out.println(pageSorce);
        WebElement x = driver.findElementByAccessibilityId("text-input");
        MobileElement inputField = (MobileElement)x;
        return inputField;
    }

    public MobileElement getActiveButton(){
        MobileElement activeButton = driver.findElementByXPath("//android.view.ViewGroup[@content-desc=\"button-Active\"]/android.view.ViewGroup/android.widget.TextView");
        return activeButton;
    }

    public MobileElement getAlert1(){
        List<AndroidElement> mobileElements = driver.findElementsByClassName("android.widget.Button");
        MobileElement mobileElement = mobileElements.get(1);
        return mobileElement;
//        MobileElement ok = driver.findElementByXPath("(//android.widget.Button)[2]");
//        return ok;
    }
}


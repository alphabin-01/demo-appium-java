package page;

import PageObject.BasePo;
import io.appium.java_client.MobileBy;
import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;

public class LoginPage extends BasePo {

    public LoginPage(AndroidDriver<AndroidElement> driver) {
        super(driver);
    }
    public void fillEmailEditText(){
        String pagesource = driver.getPageSource();
        System.out.println(pagesource);
        MobileElement emailTextFiels = driver.findElement(new MobileBy.ByAccessibilityId("input-email"));
        emailTextFiels.sendKeys("jitaliptl07@gmail.com");
    }

    public void fillPasswordEditText(){
        MobileElement passwordTextfiels = driver.findElementByAccessibilityId("input-password");
        passwordTextfiels.sendKeys("jitali@07");
    }

    public void clickToLoginButton(){
        MobileElement loginButton = driver.findElementByXPath("//android.view.ViewGroup[@content-desc=\"button-LOGIN\"]/android.view.ViewGroup");
        loginButton.click();
        String pagesource = driver.getPageSource();
        System.out.println(pagesource);
        MobileElement popUpMessage = driver.findElementByClassName("android.widget.Button");
        popUpMessage.click();

    }
}

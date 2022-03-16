package page;

import PageObject.BasePo;
import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;

public class HomePage extends BasePo {

    public HomePage(AndroidDriver<AndroidElement> driver) {
        super(driver);
    }

    public void navigateToLoginPage(){
        MobileElement loginButton = driver.findElementByAccessibilityId("Login");
        loginButton.click();
    }

    public void navigateToFormPage(){
        MobileElement formButton = driver.findElementByAccessibilityId("Forms");
        formButton.click();
    }

    public void navigateToDragPage(){
        MobileElement dragButton = driver.findElementByAccessibilityId("Drag");
        dragButton.click();
    }

    public void navigateToSwipePage(){
        MobileElement swipeButton = driver.findElementByAccessibilityId("Swipe");
        swipeButton.click();
    }

}

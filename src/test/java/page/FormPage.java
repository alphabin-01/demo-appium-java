package page;

import PageObject.BasePo;
import Utils.WaitUtils;
import io.appium.java_client.MobileBy;
import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;

public class FormPage extends BasePo {

    public FormPage(AndroidDriver<AndroidElement> driver) {
        super(driver);
    }

    public void fillInputField(){
        MobileElement inputField = driver.findElement(new MobileBy.ByAccessibilityId("text-input"));
        inputField.sendKeys("hello!!!!");
        MobileElement switchOn = driver.findElement(new MobileBy.ByAccessibilityId("switch"));
        switchOn.click();
        MobileElement dropdown = driver.findElementByXPath("//android.view.ViewGroup[@content-desc=\"Dropdown\"]/android.view.ViewGroup/android.widget.EditText");
        dropdown.click();
        MobileElement clickOption = driver.findElementByXPath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/androidx.appcompat.widget.LinearLayoutCompat/android.widget.FrameLayout/android.widget.ListView/android.widget.CheckedTextView[2]");
        clickOption.click();
        getActiveButton().click();
        getAlert1().click();
    }

    public MobileElement getActiveButton(){
        MobileElement activeButton = driver.findElementByXPath("//android.view.ViewGroup[@content-desc=\"button-Active\"]/android.view.ViewGroup/android.widget.TextView");
        return activeButton;
    }

    public MobileElement getAlert1(){
        MobileElement alert1 = driver.findElementById("android:id/button1");
        return alert1;
    }
}


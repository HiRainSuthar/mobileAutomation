package generalStore;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;

import java.net.MalformedURLException;

public class productSumValidation extends base {

    public static void main(String[] args) throws MalformedURLException {

        AndroidDriver<AndroidElement> driver = driverInit();

        driver.findElementById("com.androidsample.generalstore:id/nameField").sendKeys("Hi");
        driver.findElementByXPath("//android.widget.RadioButton[@text='Female']").click();
        driver.findElementById("com.androidsample.generalstore:id/spinnerCountry").click();
        driver.findElementByAndroidUIAutomator("new UiScrollable(new UiSelector()).scrollIntoView(text(\"Belarus\"));");
        driver.findElementByXPath("//android.widget.TextView[@text='Belarus']").click();
        driver.findElementById("com.androidsample.generalstore:id/btnLetsShop").click();

        //Adding to products in cards
        driver.findElementsByXPath("//*[@text='ADD TO CART']").get(0).click();
        driver.findElementsByXPath("//*[@text='ADD TO CART']").get(0).click();
        //clicking on add to cart
        driver.findElementById("com.androidsample.generalstore:id/appbar_btn_cart").click();
    }
}

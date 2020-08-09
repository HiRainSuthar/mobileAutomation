package generalStore;

import io.appium.java_client.android.AndroidDriver;

import java.net.MalformedURLException;

public class toastMessageValidation extends base {

    public static void main(String[] args) {
        try {
            AndroidDriver driver = driverInit();
        } catch (MalformedURLException e) {
            e.printStackTrace();
        }

        //Toast message will only be there if any of the form is parameter value is not provided so below
        //skipping providing name value
//        driver.findElementById("com.androidsample.generalstore:id/nameField").sendKeys("Hi");
        driver.findElementByXPath("//android.widget.RadioButton[@text='Female']").click();
        driver.findElementById("com.androidsample.generalstore:id/spinnerCountry").click();
        driver.findElementByAndroidUIAutomator("new UiScrollable(new UiSelector()).scrollIntoView(text(\"Belarus\"));");
        driver.findElementByXPath("//android.widget.TextView[@text='Belarus']").click();
        driver.findElementById("com.androidsample.generalstore:id/btnLetsShop").click();

        //getting value of the toast message
        String toastMessage = driver.findElementByXPath("//android.widget.Toast[1]").getAttribute("name");
        System.out.println("Value of toastMessage is "+ toastMessage);
        System.out.println("Test Success");
    }
}

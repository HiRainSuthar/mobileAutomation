package generalStore;

import io.appium.java_client.android.AndroidDriver;

import javax.swing.plaf.synth.SynthTextAreaUI;
import java.net.MalformedURLException;

public class formfill extends base {

    public static void main(String[] args) {

        {
            try {
                AndroidDriver driver = driverInit();
            } catch (MalformedURLException e) {
                System.out.println(e.getMessage());
                System.out.println(e.getCause());
                e.printStackTrace();
            }
        }

        driver.findElementById("com.androidsample.generalstore:id/nameField").sendKeys("Hi");
        driver.findElementByXPath("//android.widget.RadioButton[@text='Female']").click();
        driver.findElementById("com.androidsample.generalstore:id/spinnerCountry").click();
        driver.findElementByAndroidUIAutomator("new UiScrollable(new UiSelector()).scrollIntoView(text(\"Belarus\"));");
        driver.findElementByXPath("//android.widget.TextView[@text='Belarus']").click();
        driver.findElementById("com.androidsample.generalstore:id/btnLetsShop").click();
        System.out.println("Test Success");
    }
}

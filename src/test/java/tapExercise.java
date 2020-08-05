import io.appium.java_client.TouchAction;
import io.appium.java_client.android.AndroidDriver;

import java.net.MalformedURLException;
import java.util.concurrent.TimeUnit;

import io.appium.java_client.TouchAction;
import org.openqa.selenium.WebElement;

import static io.appium.java_client.touch.TapOptions.tapOptions;
import static io.appium.java_client.touch.offset.ElementOption.element;

public class tapExercise extends calcTest {

    public static void main(String[] args) {

        try {
            AndroidDriver driver = openCalc();
        } catch (MalformedURLException e) {
            e.printStackTrace();
        }

        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        TouchAction taction = new TouchAction(driver);
        WebElement tapel =  driver.findElementByXPath("//android.widget.TextView[@text ='Preference']");
        taction.tap(tapOptions().withElement(element(tapel))).perform();
        System.out.println("Touchaction success");
    }
}

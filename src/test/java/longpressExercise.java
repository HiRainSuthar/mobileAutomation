import io.appium.java_client.TouchAction;
import io.appium.java_client.android.AndroidDriver;
import static io.appium.java_client.touch.LongPressOptions.longPressOptions;
import org.openqa.selenium.WebElement;

import javax.swing.plaf.synth.SynthTextAreaUI;
import java.net.MalformedURLException;
import static java.time.Duration.ofSeconds;
import java.util.concurrent.TimeUnit;
import static io.appium.java_client.touch.offset.ElementOption.element;

public class longpressExercise extends calcTest {

    public static void main(String[] args) throws InterruptedException {

        try {
            AndroidDriver driver = openCalc();
        } catch (MalformedURLException e) {
            e.printStackTrace();
        }

        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.findElementByXPath("//android.widget.TextView[@text ='Views']").click();
        Thread.sleep(2);
        driver.findElementByXPath("//android.widget.TextView[@text ='Expandable Lists']").click();
        Thread.sleep(2);
        driver.findElementByXPath("//android.widget.TextView[@text ='1. Custom Adapter']").click();
        TouchAction taction = new TouchAction(driver);
        WebElement longpressElement = driver.findElementByXPath("//android.widget.TextView[@text ='People Names']");
        taction.longPress(longPressOptions().withElement(element(longpressElement)).withDuration(ofSeconds(2))).release().perform();
        System.out.println("logpress action success");
        Thread.sleep(5);
        WebElement toVerify = driver.findElementById("android:id/title");
        System.out.println("Value of element displayed is "+ toVerify.isDisplayed());
    }
}

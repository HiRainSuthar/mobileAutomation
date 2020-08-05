import io.appium.java_client.TouchAction;
import io.appium.java_client.android.AndroidDriver;
import org.openqa.selenium.WebElement;

import java.net.MalformedURLException;
import java.util.concurrent.TimeUnit;

import static io.appium.java_client.touch.LongPressOptions.longPressOptions;
import static io.appium.java_client.touch.offset.ElementOption.element;
import static java.time.Duration.ofSeconds;

public class swipeExercise extends calcTest {
    public static void main(String[] args) throws InterruptedException {

        try {
            AndroidDriver driver = openCalc();
        } catch (MalformedURLException e) {
            e.printStackTrace();
        }

        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.findElementByXPath("//android.widget.TextView[@text ='Views']").click();
        Thread.sleep(2);
        driver.findElementByXPath("//android.widget.TextView[@text ='Date Widgets']").click();
        Thread.sleep(2);
        driver.findElementByXPath("//android.widget.TextView[@text ='2. Inline']").click();
        driver.findElementByXPath("//*[@content-desc = '9']").click();
        Thread.sleep(2);
        TouchAction taction = new TouchAction(driver);
        WebElement swipeElement = driver.findElementByXPath("//*[@content-desc = '15']");
        Thread.sleep(2);
        WebElement movToElement = driver.findElementByXPath("//*[@content-desc = '45']");
        taction.longPress(longPressOptions().withElement(element(swipeElement)).withDuration(ofSeconds(2)))
                .moveTo(element(movToElement))
                .release()
                .perform();
        System.out.println("Swipe action success");
    }
}

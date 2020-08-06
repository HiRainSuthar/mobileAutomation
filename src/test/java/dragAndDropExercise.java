import io.appium.java_client.TouchAction;
import io.appium.java_client.android.AndroidDriver;
import static io.appium.java_client.touch.LongPressOptions.longPressOptions;
import org.openqa.selenium.WebElement;

import javax.swing.plaf.synth.SynthTextAreaUI;
import java.net.MalformedURLException;
import static java.time.Duration.ofSeconds;
import java.util.concurrent.TimeUnit;
import static io.appium.java_client.touch.offset.ElementOption.element;
import static io.appium.java_client.touch.offset.ElementOption.element;

public class dragAndDropExercise extends calcTest {

    public static void main(String[] args) throws InterruptedException {

        try {
            AndroidDriver driver = openCalc();
        } catch (MalformedURLException e) {
            e.printStackTrace();
        }

        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.findElementByXPath("//android.widget.TextView[@text ='Views']").click();
        Thread.sleep(2);
        driver.findElementByXPath("//android.widget.TextView[@text='Drag and Drop']").click();
        WebElement source = (WebElement) driver.findElementsByClassName("android.view.View").get(0);
        WebElement destination = (WebElement) driver.findElementsByClassName("android.view.View").get(1);
        TouchAction t = new TouchAction(driver);
        //longpress(source)/move(destination)//release
        //    t.longPress(longPressOptions().withElement(element(source))).moveTo(element(destination)).release().perform();
        t.longPress(element(source)).moveTo(element(destination)).release().perform();
    }
}

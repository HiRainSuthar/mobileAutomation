import io.appium.java_client.android.AndroidDriver;

import java.net.MalformedURLException;
import java.util.concurrent.TimeUnit;

public class uiAutomatorTest extends calcTest {

    public static void main(String[] args) {

        try {
            AndroidDriver driver = openCalc();
        } catch (MalformedURLException e) {
            e.printStackTrace();
        }

        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        driver.findElementByAndroidUIAutomator("text(\"Views\")").click();
        int count = driver.findElementsByAndroidUIAutomator("new UiSelector().clickable(false)").size();
        System.out.println("Count of elements are "+ count);
    }
}

import io.appium.java_client.android.AndroidDriver;

import java.net.MalformedURLException;
import java.util.concurrent.TimeUnit;

public class basicTests extends calcTest {

    public static void main(String[] args) {

        try {
            AndroidDriver driver = openCalc();
        } catch (MalformedURLException e) {
            e.printStackTrace();
        }

        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.findElementByXPath("//android.widget.TextView[@text ='Preference']").click();
        driver.findElementByXPath("//android.widget.TextView[@text ='3. Preference dependencies']").click();
        driver.findElementById("android:id/checkbox").click();
        driver.findElementByXPath("(//android.widget.RelativeLayout)[2]").click();
        driver.findElementById("android:id/edit").sendKeys("wifiSettingsName");
        driver.findElementByXPath("//android.widget.Button[@text='OK']").click();
    }
}

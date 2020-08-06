import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.remote.MobileCapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;

import java.io.File;
import java.net.MalformedURLException;
import java.net.URL;

public class baseChrome {

    static AndroidDriver driver;

    public static AndroidDriver openChrome() throws MalformedURLException {
        File apkSetup = new File("src/main/resources");
        File fs = new File(apkSetup, "chromedriver.exe");
        DesiredCapabilities dscap = new DesiredCapabilities();
        dscap.setCapability(MobileCapabilityType.DEVICE_NAME, "testEmulator");
        dscap.setCapability(MobileCapabilityType.PLATFORM_NAME, "Android");
        dscap.setCapability(MobileCapabilityType.BROWSER_NAME, "Chrome");
        dscap.setCapability("chromedriverExecutable",fs.getAbsolutePath());

        URL url = new URL("http://127.0.0.1:4723/wd/hub");
        driver = new AndroidDriver(url, dscap);
        System.out.println("Application started");
        return driver;
    }
}

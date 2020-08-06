import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.remote.MobileCapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;

import java.io.File;
import java.net.MalformedURLException;
import java.net.URL;

public class invokeAppWithActivityName {

    static AndroidDriver driver;

    public static void main(String[] args) throws MalformedURLException {

        DesiredCapabilities dscap = new DesiredCapabilities();
        dscap.setCapability(MobileCapabilityType.DEVICE_NAME, "Android device");
        dscap.setCapability(MobileCapabilityType.PLATFORM_NAME, "Android");
//        dscap.setCapability(MobileCapabilityType.APP, "net.one97.paytm");
//        dscap.setCapability("appPackage","net.one97.paytm");
        dscap.setCapability("appActivity","net.one97.paytm.AJRMainActivity");
//        dscap.setCapability("systemPort" ,"8201");
//        dscap.setCapability("devicename","someRealMobilename");
//        dscap.setCapability("udid","d2475e99");
//        dscap.setCapability("platformName","Android");
//        dscap.setCapability("platformVersion","10");
//        dscap.setCapability("appPackage","com.coloros.calculator");
//        dscap.setCapability("appActivity","com.android.calculator2.Calculator");
//        dscap.setCapability("","");

        URL url = new URL("http://127.0.0.1:4723/wd/hub");
        driver = new AndroidDriver(url, dscap);
        System.out.println("Application started");
    }
}

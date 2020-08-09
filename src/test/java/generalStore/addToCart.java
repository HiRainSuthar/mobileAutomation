package generalStore;

import io.appium.java_client.MobileBy;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import org.openqa.selenium.By;

import java.net.MalformedURLException;

public class addToCart extends base {

    public static void main(String[] args) throws MalformedURLException {

        AndroidDriver<AndroidElement> driver = driverInit();

        driver.findElementById("com.androidsample.generalstore:id/nameField").sendKeys("Hi");
        driver.findElementByXPath("//android.widget.RadioButton[@text='Female']").click();
        driver.findElementById("com.androidsample.generalstore:id/spinnerCountry").click();
        driver.findElementByAndroidUIAutomator("new UiScrollable(new UiSelector()).scrollIntoView(text(\"Belarus\"));");
        driver.findElementByXPath("//android.widget.TextView[@text='Belarus']").click();
        driver.findElementById("com.androidsample.generalstore:id/btnLetsShop").click();

        driver.findElement(MobileBy.AndroidUIAutomator("new UiScrollable(new UiSelector().resourceId(\"com.androidsample.generalstore:id/rvProductList\")).scrollIntoView(new UiSelector().textMatches(\"Jordan 6 Rings\").instance(0))"));

        int count = driver.findElementsById("com.androidsample.generalstore:id/productName").size();

        for (int i = 0; i < count; i++) {
            String text;
            text = driver.findElements(By.id("com.androidsample.generalstore:id/productName")).get(i).getText();
            if (text.equalsIgnoreCase("Jordan 6 Rings")) {
                driver.findElements(By.id("com.androidsample.generalstore:id/productAddCart")).get(i).click();
                break;
            }
        }
        driver.findElement(By.id("com.androidsample.generalstore:id/appbar_btn_cart")).click();
        String lastPageText = driver.findElement(By.id("com.androidsample.generalstore:id/productName")).getText();
        System.out.println("Text of the page is "+lastPageText);
    }
}



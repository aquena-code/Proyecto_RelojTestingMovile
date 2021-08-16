package factoryDevices;

import io.appium.java_client.AppiumDriver;
import org.openqa.selenium.remote.DesiredCapabilities;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

public class Android implements IDevice{
    @Override
    public AppiumDriver create() throws MalformedURLException {
        DesiredCapabilities capabilities = new DesiredCapabilities();
        capabilities.setCapability("deviceName", "ALV MOVIL");
        capabilities.setCapability("platformVersion", "6.0.1");
        capabilities.setCapability("appPackage", "com.google.android.deskclock");
        capabilities.setCapability("appActivity", "com.android.deskclock.DeskClock");
        capabilities.setCapability("platformName", "Android");

        AppiumDriver driver = new AppiumDriver(new URL("http://127.0.0.1:4723/wd/hub"), capabilities);

        driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
        return driver;
    }
}

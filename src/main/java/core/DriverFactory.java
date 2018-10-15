package core;

import org.openqa.selenium.WebDriver;

public class DriverFactory {
    private static DriverType type = DriverType.CHROME;
    private static WebDriver drivers = null;

    public static WebDriver getWebDriver(){
        if(drivers == null){
            drivers = type.getDriver();
        }
        return drivers;
    }

    public static void quit(){
        if(drivers != null){
            drivers.quit();
        }
    }
}

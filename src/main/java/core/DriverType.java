package core;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public enum DriverType implements IDriverType{
    CHROME{
        @Override
        public WebDriver getDriver(){
            String path = "C:\\Users\\pfadeev\\IdeaProjects\\avito\\src\\main\\resources\\chromedriver.exe";
            System.setProperty("webdriver.chrome.driver", path);
            return new ChromeDriver();
        }
    }
}

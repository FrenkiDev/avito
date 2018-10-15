package utils.struct;

import core.DriverFactory;
import org.openqa.selenium.TimeoutException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import static core.DriverFactory.getWebDriver;

public class WebElementAction {
static int time = 3;
    public static boolean waitVisibility(WebElement webElement){
        try {
            WebDriverWait wait = new WebDriverWait(getWebDriver(), 10);
            wait.until(ExpectedConditions.visibilityOfAllElements(webElement));
            return true;
        }catch (TimeoutException te){
            System.out.println("Время ожидания истекло.");
        }catch (Exception e){
            System.out.println("Элемент не найден.");
        }
        return false;
    }

    public static boolean sendText(WebElement webElement, String text){
        waitVisibility(webElement);
        webElement.sendKeys(text);
        return true;
    }

    public static boolean click(WebElement btnSearch) {
        waitVisibility(btnSearch);
        waitClicable(btnSearch);
        btnSearch.click();
        return true;
    }

    private static boolean waitClicable(WebElement btnSearch) {
        try {
            WebDriverWait wait = new WebDriverWait(getWebDriver(), time);
            wait.until(ExpectedConditions.elementToBeClickable(btnSearch));
            return true;
        }catch (Exception e){
            System.out.printf("Элемент не прокликивается.");
        }
        return false;
    }
}

package utils.struct;

import org.openqa.selenium.TimeoutException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import static core.DriverFactory.getWebDriver;

class WebElementAction {
    private static int time = 3;

    static boolean waitVisibility(WebElement webElement) {
        if (webElement != null) {
            try {
                WebDriverWait wait = new WebDriverWait(getWebDriver(), 10);
                wait.until(ExpectedConditions.visibilityOfAllElements(webElement));
                return true;
            } catch (TimeoutException te) {
                System.out.println("Время ожидания истекло.");
            } catch (Exception e) {
                System.out.println("Элемент не найден.");
            }
        }else {
            System.out.println("Элемент null");
        }

        return false;
    }

    static boolean sendText(WebElement webElement, String text) {
        waitVisibility(webElement);
        if (text != null) {
            webElement.sendKeys(text);
            return true;
        }else {
            System.out.println("Входная стррока пустая.");
        }

        return false;
    }

    static boolean click(WebElement btnSearch) {
        waitVisibility(btnSearch);
        waitClicable(btnSearch);
        btnSearch.click();
        return true;
    }

    static boolean waitClicable(WebElement btnSearch) {
        if (btnSearch != null) {
            try {
                WebDriverWait wait = new WebDriverWait(getWebDriver(), time);
                wait.until(ExpectedConditions.elementToBeClickable(btnSearch));
                return true;
            } catch (Exception e) {
                System.out.print("Элемент не прокликивается.");
            }
        }else {
            System.out.println("Элемент null");
        }
        return false;
    }
}

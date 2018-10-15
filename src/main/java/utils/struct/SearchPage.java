package utils.struct;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import utils.IClikc;
import utils.ISendText;

public class SearchPage extends Page implements IClikc, ISendText {
    @FindBy(xpath = "//*[@id=\"text\"]")
    WebElement inputSearch;
    @FindBy(xpath = "//button[span[contains(text(),\"Найти\")]]")
    WebElement btnSearch;

    @Override
    public boolean click() {
        return WebElementAction.click(btnSearch);
    }

    @Override
    public boolean sendText(String text) {
        return WebElementAction.sendText(inputSearch, "Гугл");
    }
}

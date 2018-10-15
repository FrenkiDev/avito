package utils.struct;

import org.openqa.selenium.support.PageFactory;

import static core.DriverFactory.getWebDriver;

public abstract class Page {
    public Page() {
        PageFactory.initElements(getWebDriver(), this);
    }
}

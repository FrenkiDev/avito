package step;

import core.DriverFactory;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import utils.struct.SearchPage;
import utils.struct.WebElementController;

public class Search {
    private SearchPage page = new SearchPage();

    @Given("Запустить браузер \"([^\"]*)\"$")
    public void init(String url){
        DriverFactory.getWebDriver().get(url);
    }

    @Given("^Ввести в поле значение \"([^\"]*)\"$")
    public void inputText(String text) {
        WebElementController.sendText(page, text);
    }

    @When("^Нажать на кнопу \"([^\"]*)\"$")
    public void clickButton(String button) {
        WebElementController.click(page);
    }

    @Then("^Ожидаемое \"([^\"]*)\" полученное$")
    public void check(String result) {
        DriverFactory.quit();
    }
}

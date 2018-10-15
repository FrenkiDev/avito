import core.DriverFactory;
import utils.struct.SearchPage;
import utils.struct.WebElementController;

public class Runner {
    public static void main(String[] args) {
        DriverFactory.getWebDriver().get("http:\\www.yandex.ru");
        SearchPage page = new SearchPage();
        WebElementController.sendText(page, "Прогать");
        WebElementController.click(page);
        DriverFactory.quit();
    }
}

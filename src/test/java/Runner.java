import cucumber.api.CucumberOptions;

@CucumberOptions(
        features = "src/test/features",
        glue = "test/resources/features",
        tags = "@F"
)
public class Runner {
}

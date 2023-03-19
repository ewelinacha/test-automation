import org.junit.jupiter.api.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Ultimateqatest {
    String projectLocation = System.getProperty("user.dir");
    String UltimateQAURL = "https://ultimateqa.com/simple-html-elements-for-automation/";

    @Test
    public void testOne()
    {
        System.out.println(projectLocation);
        System.setProperty("webdriver.chrome.driver", projectLocation + "/external resources/chromedriver.exe");

        WebDriver driver = new ChromeDriver();
    }
}

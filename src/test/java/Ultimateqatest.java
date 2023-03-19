import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class Ultimateqatest {
    String projectLocation = System.getProperty("user.dir");
    String UltimateQAURL = "https://ultimateqa.com/simple-html-elements-for-automation/";

    WebDriver driver;

    @BeforeEach
    public void Setup() {
        System.out.println(projectLocation);
        System.setProperty("webdriver.chrome.driver", projectLocation + "/external resources/chromedriver.exe");

        driver = new ChromeDriver();
        driver.get(UltimateQAURL);
        driver.manage().window().fullscreen();
    }

    @AfterEach
    public void teardown() {
        //driver.close();
    }

    @Test
    public void testOne()
    {
        WebElement button = driver.findElement(By.id("idExample"));
        button.click();

        WebElement buttonSuccess = driver.findElement(By.className("entry-title"));
        assertEquals("Button success", buttonSuccess.getText());
    }
}

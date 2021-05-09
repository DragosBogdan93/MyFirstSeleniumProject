import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class RegisterTest {
    public void newUserRegister() {
        System.setProperty("webdriver.chrome.driver", "resources/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("http://testfasttrackit.info/selenium-test/");
        driver.findElement(By.cssSelector("#header > div > div.skip-links > div > a > span.label")).click();
        driver.findElement(By.cssSelector("#header-account > div > ul > li:nth-child(5) > a")).click();
        driver.findElement(By.id("firstname")).sendKeys("Testul1");
        driver.findElement(By.id("middlename")).sendKeys("Testul1.");
        driver.findElement(By.id("lastname")).sendKeys("NotFound");
        driver.findElement(By.id("email_address")).sendKeys("testtest123@gmail.com");
        driver.findElement(By.id("password")).sendKeys("123456789");
        driver.findElement(By.id("confirmation")).sendKeys("123456789");
        driver.findElement(By.id("is_subscribed")).click();
        driver.findElement(By.cssSelector("#form-validate > div.buttons-set > button")).click();

    }

}

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import static org.junit.Assert.assertTrue;

public class Teste1 {

    private WebDriver driver;

    @Before
    public void startGoogle(){
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\Larissa\\IdeaProjects\\avaliacao-teste\\chromedriver.exe");
        this.driver = new ChromeDriver();
        driver.get("https://google.com/");

        System.out.println(Enum.COD1.getValue());
    }

    @Test
    public void multiply(){
        WebElement box = driver.findElement(By.xpath("//input[@name='q']"));
        box.sendKeys("2*2");
        box.submit();

        assertTrue(driver.findElement(By.xpath("//span[@class='qv3Wpe']")).getText().contains("4"));
    }
}

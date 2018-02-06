package BasicTest;

import static org.junit.Assert.assertTrue;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class BasicSearch {
	@Test
		public void search(){
		System.setProperty("webdriver.chrome.driver", "/Users/tulinakbulut/Documents/libraries/selenium-java-3/chromedriver");

		WebDriver driver=new ChromeDriver();
        String url="https://amazon.com";
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.get(url);
        driver.findElement(By.id("twotabsearchtextbox")).sendKeys("iphone 6s"+Keys.ENTER);
        String element=driver.findElement(By.id("s-result-count")).getText();
        System.out.println(element);
       driver.quit();
       System.out.println("driver closed");
}

}


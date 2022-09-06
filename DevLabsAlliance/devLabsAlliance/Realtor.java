package devLabsAlliance;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Realtor {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		ChromeDriver browser = new ChromeDriver();
		browser.get("https://www.realtor.com/");
		browser.manage().window().maximize();
		browser.findElement(By.xpath("//input[@id = 'searchbox-input']")).sendKeys("ScotsDale", Keys.RETURN);

	}

	public Realtor() {
	}

}

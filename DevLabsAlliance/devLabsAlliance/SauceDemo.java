package devLabsAlliance;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class SauceDemo {

	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		ChromeDriver browser = new ChromeDriver();
		browser.get("https://www.saucedemo.com/");
		browser.manage().window().maximize();
		browser.findElement(By.xpath("//input[@id='user-name']")).sendKeys("standard_user", Keys.TAB);
		browser.findElement(By.xpath("//input[@id='password']")).sendKeys("secret_sauce", Keys.ENTER);
		Thread.sleep(5000);
		browser.findElement(By.xpath("//button[@id='add-to-cart-sauce-labs-bike-light']")).click();
		Thread.sleep(3000);

		browser.findElement(By.xpath("//a[@class='shopping_cart_link']")).click();
		Thread.sleep(3000);
		browser.findElement(By.xpath("//button[@id='checkout']")).click();
		Thread.sleep(3000);
		browser.findElement(By.xpath("//input[@id='first-name']")).sendKeys("tester", Keys.TAB);
		browser.findElement(By.xpath("//input[@id='last-name']")).sendKeys("tester", Keys.TAB);
		browser.findElement(By.xpath("//input[@id='postal-code']")).sendKeys("110096", Keys.TAB);

		browser.findElement(By.xpath("//input[@id='continue']")).click();
		Thread.sleep(3000);
		browser.findElement(By.xpath("//button[@id='finish']")).click();
		Thread.sleep(3000);

		// File file = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		// FileUtils.copyFile(File,
		// new File("image location"
		// + screenshotsaucedemo + ".jpeg"));

		// WebElement frame =
		// browser.findElement(By.xpath("//div[@id='login_credentials']//child::br[2]"));
		// browser.switchTo().frame(frame);

		// String string1 =
		// browser.findElement(By.xpath("//div[@id='login_credentials']//child::br[2]"))
		// .getAttribute(null);
		// browser.findElement(By.xpath("//input[@id ='user-name']")).sendKeys(string1);

		// JavascriptExecutor jse = (JavascriptExecutor) driver;

		// List<WebElement> elements=
		// browser.findElement(By.xpath("//div[@id='login_credentials']"));
		// elements.

	}

	public SauceDemo() {
	}

}

package main;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class main {

	static String userName = "hoangk46b5";
	static String pWord = "hoangpro";

	public static void main(String[] args) {
		System.setProperty("webdriver.gecko.driver", "C:\\Users\\pham.viet.hoang\\Downloads\\Documents\\Automation\\geckodriver.exe");
		WebDriver driver = new FirefoxDriver();

		driver.get("http://demo.guru99.com/test/newtours/register.php");
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}

		WebElement element = driver.findElement(By.xpath(
				"/html/body/div[2]/table/tbody/tr/td[2]/table/tbody/tr[4]/td/table/tbody/tr/td[2]/table/tbody/tr[5]/td/form/table/tbody/tr[2]/td[2]/input"));
		element.sendKeys("Pham");
		driver.findElement(By.name("lastName")).sendKeys("Viet Hoang");
		driver.findElement(By.name("phone")).sendKeys("0968111111");
		driver.findElement(By.id("userName")).sendKeys("hoangk46b522@gmail.com");
		driver.findElement(By.name("address1")).sendKeys("50 Đàm Văn Lễ");
		driver.findElement(By.name("city")).sendKeys("Đà Nẵng");
		driver.findElement(By.name("state")).sendKeys("State NAme");
		driver.findElement(By.name("postalCode")).sendKeys("550000");

		Select s = new Select(driver.findElement(By.name("country")));
		s.selectByVisibleText("VIETNAM");

		driver.findElement(By.name("email")).sendKeys(userName);
		driver.findElement(By.name("password")).sendKeys(pWord);
		driver.findElement(By.name("confirmPassword")).sendKeys(pWord);
		driver.findElement(By.name("submit")).click();

		// Compare
		String expectedResult = "Note: Your user name is " + userName + ".";
		WebElement uName = driver.findElement(By.xpath(
				"/html/body/div[2]/table/tbody/tr/td[2]/table/tbody/tr[4]/td/table/tbody/tr/td[2]/table/tbody/tr[3]/td/p[3]/font/b"));
		uName.getText();
		System.out.println(uName);

		if (uName.equals(expectedResult)) {
			System.out.println("Đúng");
			driver.findElement(By.linkText("sign-in")).click();

		} else {
			System.out.println("Sai");
			driver.findElement(By.linkText("sign-in")).click();

			driver.findElement(By.name("userName")).sendKeys(userName);
			driver.findElement(By.name("password")).sendKeys(pWord);
			driver.findElement(By.name("submit")).click();

		}

		// driver.close();

	}

}

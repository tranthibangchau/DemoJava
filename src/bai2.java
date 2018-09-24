import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class bai2 {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();

		driver.get("http://demo.guru99.com/test/newtours/register.php");

		String firstName = "pham";
		String lastName = "viethoang";
		String phoneUser = "091111111";
		String emailUser = "hihi@gmail.commm";
		String addressUser = "50 Dam van le";
		String cityUser = "Da Nang";
		String stateUser = "None";
		String codeUser = "123456";
		String uName = "viethoang123";
		String pass = "hoanggg";

		WebElement fnAction = driver.findElement(By.name("firstName"));
		Actions actionEnter1 = new Actions(driver);
		actionEnter1.sendKeys(fnAction, firstName).sendKeys(Keys.TAB).sendKeys(lastName).sendKeys(Keys.TAB)
				.sendKeys(phoneUser).sendKeys(Keys.TAB).sendKeys(emailUser).sendKeys(Keys.TAB).sendKeys(addressUser)
				.sendKeys(Keys.TAB).sendKeys(cityUser).sendKeys(Keys.TAB).sendKeys(stateUser).sendKeys(Keys.TAB)
				.sendKeys(codeUser).perform();

		WebElement dropCountry = driver.findElement(By.name("country"));
		Select country = new Select(driver.findElement(By.name("country")));
		Actions selectDrop = new Actions(driver);

		int item = country.getOptions().size();
		selectDrop.sendKeys(dropCountry, Keys.ENTER).perform();
		int i = 0;
		String textCountry;
		while (i < item) {
			textCountry = country.getFirstSelectedOption().getText();
			System.out.println(textCountry);

			if (textCountry.equals("VIETNAM")) {
				break;
			}

			else {
				selectDrop.sendKeys(Keys.DOWN).perform();
				i++;
			}
		}

		WebElement email = driver.findElement(By.name("email"));
		Actions actionEnter2 = new Actions(driver);
		actionEnter2.sendKeys(email, uName).sendKeys(Keys.TAB).sendKeys(pass).sendKeys(Keys.TAB).sendKeys(pass)
				.sendKeys(Keys.TAB).sendKeys(Keys.ENTER).perform();

		WebElement textN = driver.findElement(By.xpath(
				"//html/body/div[2]/table/tbody/tr/td[2]/table/tbody/tr[4]/td/table/tbody/tr/td[2]/table/tbody/tr[3]/td/p[3]/font/b"));
		String textNote = textN.getText();
		System.out.println(textNote);

		if (textNote.equals("Note: Your user name is " + uName + "."))
			System.out.println("Đúng");
		else
			System.out.println("Sai");

		WebElement signinLink = driver.findElement(By.linkText("sign-in"));
		Actions actionClickSigninLink = new Actions(driver);
		actionClickSigninLink.sendKeys(signinLink, Keys.ENTER).perform();

		WebElement signonUser = driver.findElement(By.name("userName"));
		Actions actionSignOn = new Actions(driver);
		actionSignOn.sendKeys(signonUser, uName).sendKeys(Keys.TAB).sendKeys(pass).sendKeys(Keys.TAB)
				.sendKeys(Keys.ENTER).perform();

	}

}
package Sep20_EventKeyboard;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class Sep20_EventKeyboard {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","E:\\selenium\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		String baseURL = "http://demo.guru99.com/test/newtours/register.php";
		driver.get(baseURL);
		
		driver.manage().window().maximize();
		
		String fName = "Hoa";
		String lName = "Do";
		String phoneUser = "01649846682";
		String emailUser = "hd@grr.la";
		
		String addressUser = "16 Ly Thuong Kiet";
		String cityUser = "Da Nang";
		String stateUser = "None";
		String codeUser = "123456";
		
		String uName = "hoado";
		String pass = "12345678";
				
		
		WebElement firstName = driver.findElement(By.name("firstName"));		
		Actions actionEnter1 = new Actions(driver);
		actionEnter1.sendKeys(firstName,fName).sendKeys(Keys.TAB)
		.sendKeys(lName).sendKeys(Keys.TAB)
		.sendKeys(phoneUser).sendKeys(Keys.TAB)
		.sendKeys(emailUser).sendKeys(Keys.TAB)
		.sendKeys(addressUser).sendKeys(Keys.TAB)
		.sendKeys(cityUser).sendKeys(Keys.TAB)
		.sendKeys(stateUser).sendKeys(Keys.TAB)
		.sendKeys(codeUser).perform();
		
//		==========
				
		WebElement dropCountry = driver.findElement(By.name("country"));
		Select country = new Select(driver.findElement(By.name("country")));
		Actions selectDrop = new Actions(driver);
		
		int item = country.getOptions().size();
		selectDrop.sendKeys(dropCountry,Keys.ENTER).perform();
		int i = 0;
		String textCountry;
		while (i < item)
		{
			textCountry = country.getFirstSelectedOption().getText();
			System.out.println(textCountry);

			if (textCountry.equals("BAHAMAS"))
			{
				break;
			}
			
				else 
				{
					selectDrop.sendKeys(Keys.DOWN).perform();
					i++;
				}
		}
		
		WebElement email = driver.findElement(By.name("email"));
		Actions actionEnter2 = new Actions(driver);
		actionEnter2.sendKeys(email,uName).sendKeys(Keys.TAB)
		.sendKeys(pass).sendKeys(Keys.TAB)
		.sendKeys(pass).sendKeys(Keys.TAB)
		.sendKeys(Keys.ENTER).perform();
		
//		==========
		
		WebElement textD = driver.findElement(By.xpath("/html/body/div[2]/table/tbody/tr/td[2]/table/tbody/tr[4]/td/table/tbody/tr/td[2]/table/tbody/tr[3]/td/p[1]/font/b"));
		String textDear = textD.getText();
		System.out.println(textDear);
		
		WebElement textN = driver.findElement(By.xpath("//html/body/div[2]/table/tbody/tr/td[2]/table/tbody/tr[4]/td/table/tbody/tr/td[2]/table/tbody/tr[3]/td/p[3]/font/b"));
		String textNote = textN.getText();
		System.out.println(textNote);
				
		if (textDear.equals("Dear " + fName + " " + lName + ",") && textNote.equals("Note: Your user name is " + uName +"."))
			System.out.println("OK - Great");
		else System.out.println("Not OK");
		
//		==========
		
		WebElement signinLink = driver.findElement(By.linkText("sign-in"));
		Actions actionClickSigninLink= new Actions(driver);
		actionClickSigninLink.sendKeys(signinLink,Keys.ENTER).perform();
		
		WebElement signonUser = driver.findElement(By.name("userName"));
		Actions actionSignOn = new Actions(driver);
		actionSignOn.sendKeys(signonUser,uName).sendKeys(Keys.TAB)
		.sendKeys(pass).sendKeys(Keys.TAB)
		.sendKeys(Keys.ENTER).perform();

	}

}

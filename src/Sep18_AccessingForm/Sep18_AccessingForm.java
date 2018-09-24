package Sep18_AccessingForm;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class Sep18_AccessingForm {

	public static void main(String[] args) {
//    	System.setProperty("webdriver.gecko.driver", "lib/geckodriver");
//		WebDriver driver = new FirefoxDriver();
		//comment the above 2 lines and uncomment below 2 lines to use Chrome
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
		firstName.sendKeys(fName);
		
		WebElement lastName = driver.findElement(By.name("lastName"));
		lastName.sendKeys(lName);
		
		WebElement phone = driver.findElement(By.name("phone"));
		phone.sendKeys(phoneUser);
		
		WebElement userName = driver.findElement(By.id("userName"));
		userName.sendKeys(emailUser);
		
//		==========
		
		WebElement address1 = driver.findElement(By.name("address1"));
		address1.sendKeys(addressUser);
		
		WebElement city = driver.findElement(By.name("city"));
		city.sendKeys(cityUser);
		
		WebElement state = driver.findElement(By.name("state"));
		state.sendKeys(stateUser);
		
		WebElement postalCode = driver.findElement(By.name("postalCode"));
		postalCode.sendKeys(codeUser);
		
		Select country = new Select(driver.findElement(By.name("country")));
		country.selectByVisibleText("VIETNAM");
		
//		==========
		
		WebElement email = driver.findElement(By.name("email"));
		email.sendKeys(uName);
		
		WebElement password = driver.findElement(By.name("password"));
		password.sendKeys(pass);
		
		WebElement confirmPassword = driver.findElement(By.name("confirmPassword"));
		confirmPassword.sendKeys(pass);
		
		WebElement submitBtn1 = driver.findElement(By.name("submit"));
		submitBtn1.click();
	
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
		signinLink.click();
		
		WebElement signonUser = driver.findElement(By.name("userName"));
		signonUser.sendKeys(uName);
		
		WebElement signonPass = driver.findElement(By.name("password"));
		signonPass.sendKeys(pass);
		
		WebElement submitBtn2 = driver.findElement(By.name("submit"));
		submitBtn2.click();
				

	}

}

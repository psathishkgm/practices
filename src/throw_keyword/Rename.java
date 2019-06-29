package throw_keyword;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Rename {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\C5274787\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.freecrm.com/register/");
		boolean b1=driver.findElement(By.id("submitButton")).isDisplayed();
		System.out.println(b1);
		boolean b2= driver.findElement(By.id("submitButton")).isEnabled();
		System.out.println(b2);
		driver.findElement(By.name("agreeTerms")).click();
		if(driver.findElement(By.name("agreeTerms")).isSelected())
		{
			System.out.println("Selected");
		}
		else
		{
			System.out.println("Not selected");
		}
		driver.close();
		
		
		

	}

}

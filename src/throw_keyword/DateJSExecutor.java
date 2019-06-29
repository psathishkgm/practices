package throw_keyword;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class DateJSExecutor 
{
	
		public static void main(String[] args) throws InterruptedException 
		{
		
		String a = "THIS IS SOFTWARE ENGINEERING.";
	    System.out.println(a.charAt(5)+""+a.charAt(6));
	    String c=a.replace('.', '/');
	    System.out.println(c);
	    System.setProperty("webdriver.chrome.driver", "C:\\Users\\C5274787\\chromedriver.exe");
	    WebDriver driver =new ChromeDriver();
	    //driver.manage().deleteAllCookies();
	    driver.get("http://demo.automationtesting.in/Datepicker.html");
	    JavascriptExecutor js = (JavascriptExecutor)driver;
	    Thread.sleep(5000);
	    js.executeScript("document.getElementById('datepicker1').value=('10/21/2018')");
	    driver.close();
	   	}
	    
}

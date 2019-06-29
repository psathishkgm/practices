package throw_keyword;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;
 
public class JavaScriptExecuter {
 
WebDriver driver;
 @Test
 public void javaScriptExeMethod(){
 System.setProperty("webdriver.gecko.driver","C:\\Users\\C5274787\\OneDrive - SAP SE\\Desktop\\geckodriver.exe");
 driver = new FirefoxDriver();
 driver.get("https://www.gmail.com");
 //WebElement loginButton = driver.findElement(By.cssSelector("a[class='gmail-nav__nav-link gmail-nav__nav-link__sign-in']"));
 //loginButton.click();
  /*Syntax:
 JavascriptExecutor js = (JavascriptExecutor) driver;  
 js.executeScript(Script,Arguments);
 script - The JavaScript to execute
 Arguments - The arguments to the script.(Optional)*/
 
                JavascriptExecutor js = (JavascriptExecutor)driver;
                //Uncomment each scenario by using Ctrl + Shift + \ (backslash) and find the solution
 
                //to type text in Selenium WebDriver without using sendKeys() method
                //js.executeScript("document.getElementById('some id').value='someValue';");
                js.executeScript("document.getElementById('identifierId').value='SoftwareTestingMaterial.com';");
 
                /*//to click a button in Selenium WebDriver using JavaScript
                //js.executeScript("arguments[0].click();", loginButton);
                //or
                js.executeScript("document.getElementById('enter your element id').click();");
                js.executeScript("document.getElementById('next').click();");*/
 
                /*//to handle checkbox
                js.executeScript("document.getElementById('enter element id').checked=false;");*/
 
 /*//to generate Alert Pop window in selenium
 js.executeScript("alert('hello world');");*/
 
 /*//to refresh browser window using Javascript 
 js.executeScript("history.go(0)");*/
 
 /*// to get innertext of the entire webpage in Selenium
 String sText =  js.executeScript("return document.documentElement.innerText;").toString();
 System.out.println(sText);*/
 
 /*//to get the Title of our webpage
 String sText =  js.executeScript("return document.title;").toString();
 System.out.println(sText);*/
 
 /*//to get the domain
 String sText =  js.executeScript("return document.domain;").toString();
 System.out.println(sText);*/
 
 /*//to get the URL of our webpage
 String sText =  js.executeScript("return document.URL;").toString();
 System.out.println(sText);*/
 
 /*//to perform Scroll on application using  Selenium
 //Vertical scroll - down by 50  pixels
 js.executeScript("window.scrollBy(0,50)");
 // for scrolling till the bottom of the page we can use the code like
 //js.executeScript("window.scrollBy(0,document.body.scrollHeight)");*/
 
 /* // to click on a SubMenu which is only visible on mouse hover on Menu?
 //Hover on Automation Menu on the MenuBar
         js.executeScript("$('ul.menus.menu-secondary.sf-js-enabled.sub-menu li').hover()");*/
 
 /*//to navigate to different page using Javascript?
         //Navigate to new Page
         js.executeScript("window.location = 'https://www.softwaretestingmaterial.com");*/
//              b[text()='ple india']
               /* Nw123456
                Nw123456*/
 }
}
/*WAP to launch naukri registration page, click on google then close parent tab window*/
package switchcontrol;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class A168_NaukriRegistartion {

	public static void main(String[] args) {
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://www.naukri.com/registration/createAccount?othersrcp=22636");
		driver.manage().window().maximize();
		WebElement e1=	driver.findElement(By.xpath("//span[.='Google']"));
		e1.click();
		
		Set<String> ids=driver.getWindowHandles();
		Iterator<String> id=ids.iterator();
		String parent_id=id.next(); //parent id
		String child_id=id.next(); //1st child id
		driver.switchTo().window(child_id); //move the control from parent to child window
		driver.close();

	}

}

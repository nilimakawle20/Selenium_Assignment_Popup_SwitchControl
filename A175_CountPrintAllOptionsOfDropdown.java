/*WAP to Print all options of dropdown & count all options in dropdown*/
package popup.screenshot.autosugg;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class A175_CountPrintAllOptionsOfDropdown {

	public static void main(String[] args) {
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://www.amazon.in/");
		driver.manage().window().maximize();	
		WebElement e1=driver.findElement(By.id("searchDropdownBox"));
		Select s1=new Select(e1); 
		List<WebElement> e4=s1.getOptions();
		System.out.println(e4.size()); //dropdown count
		for(int i=0;i<e4.size();i++)
		{
		WebElement e5=e4.get(i);  //get index of dropdown
		System.out.println(e5.getText()); //dropdown options text
		}
	}
}

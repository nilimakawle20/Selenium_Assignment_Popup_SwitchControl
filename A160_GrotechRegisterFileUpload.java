/*WAP to handle fileupload  https://grotechminds.com/registration/*/
package popup.screenshot.autosugg;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class A160_GrotechRegisterFileUpload {

	public static void main(String[] args) throws InterruptedException {
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://grotechminds.com/registration/");
		driver.manage().window().maximize();
		WebElement f_name=driver.findElement(By.id("fname")); //Webelement for firstname
		f_name.sendKeys("Maithili");
		WebElement l_name=driver.findElement(By.id("lname")); //Webelement for lastname
		l_name.sendKeys("Sharma");
		
		WebElement email=driver.findElement(By.xpath("//input[@name='email']")); //xpath for email
		email.sendKeys("mailthilisharma@xyz.com");
		WebElement pwd=driver.findElement(By.xpath("//input[@name='password']"));//xpath for password
		pwd.sendKeys("Msharmisa@123");
		
	//	WebElement radio_btn1=driver.findElement(By.xpath("//input[@id='male']"));//xpath for radio button-male
	//	radio_btn1.click();
		
		WebElement radio_btn2=driver.findElement(By.xpath("//input[@id='Female']"));//xpath for radio button-female
		radio_btn2.click();
		Thread.sleep(1000);
		radio_btn2.click();
	//	Select s=new Select(radio_btn2);
	//	boolean sel=radio_btn2.isSelected();
		//System.out.println(sel);
		
		WebElement skills_drpdwn=driver.findElement(By.xpath("//select[@id='Skills']"));
		skills_drpdwn.click();
		Select s1=new Select(skills_drpdwn);
		s1.selectByVisibleText("Technical Skills");
		
		WebElement techskills_drpdwn=driver.findElement(By.xpath("//select[@id='technicalskills']"));
		Select s2=new Select(techskills_drpdwn);
		s2.selectByVisibleText("Python");
		
		WebElement country_drpdwn=driver.findElement(By.xpath("//select[@id='Country']"));
		Select s3=new Select(country_drpdwn);
		s3.selectByVisibleText("India ");
		
		
		WebElement present_add= driver.findElement(By.id("Present-Address"));//WebElement for present address
		present_add.sendKeys("Nagar Colony, Choure ward, Hinganghat-442301");
		
		present_add.sendKeys(Keys.CONTROL+"A"); //Select all text
		present_add.sendKeys(Keys.CONTROL+"C"); //Copy text
		WebElement permanent_add= driver.findElement(By.id("Permanent-Address"));//WebElement for permanent address
		permanent_add.sendKeys(Keys.CONTROL+"V"); //paste present address into permanent address field
		
		WebElement pincode=driver.findElement(By.xpath("//input[@name='Pincode']")); //xpath for pincode
		pincode.sendKeys("442301");
		
		WebElement religion_drpdwn=driver.findElement(By.xpath("//select[@id='Relegion']"));
		Select s4=new Select(religion_drpdwn);
		s4.selectByVisibleText("Hindu");
		
		WebElement up_file=driver.findElement(By.id("file")); //file upload popup handled
		up_file.sendKeys("C:\\Users\\DELL\\OneDrive\\Desktop\\nilima.png");
	
		WebElement reloc_chk=driver.findElement(By.xpath("//input[@id='relocate']")); //xpath for reloc_chk
		reloc_chk.click();
		
		WebElement submit_btn=driver.findElement(By.xpath("//button[@name='Submit']")); //xpath for submit button
		submit_btn.click();
		Thread.sleep(1000);
		driver.switchTo().alert().accept();


	}

}

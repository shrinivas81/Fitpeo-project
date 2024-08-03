import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Fitpeo_001 {
	public static void main(String[] args) {
		System.setProperty("webdriver.chromedriver","./softwares/chromedriver.exe");
		WebDriver driver =new ChromeDriver();
		driver.get("https://www.fitpeo.com");
		WebElement threelinesbutton = driver.findElement(By.id("MuiTouchRipple-root css-w0pj6f"));
		threelinesbutton.click();
		
		//action.moveByOffset(1325, 103);
		WebElement revenuecalculatorlink = driver.findElement(By.linkText("Revenue Calculator"));
		revenuecalculatorlink.click();
			 WebDriverWait slideraction = new WebDriverWait(driver, null, null);
			slideraction.until(ExpectedConditions.visibilityOfElementLocated(By.id("text-field-container")));
			Actions action=new Actions(driver);
			WebElement slider = driver.findElement(By.xpath("//span[@class='MuiSlider-rail css-3ndvyc']"));
			action.dragAndDropBy(slider, 820, 0).perform();
			{
				WebElement textfield = driver.findElement(By.id(":R57alklff9da:"));
				String Textfieldvalue = textfield.getAttribute("value");
				if(!Textfieldvalue.equals("820")) {
					System.out.println("slider value not updated properly");
				}
				textfield.clear();
				textfield.sendKeys("560");
				 WebElement cpt99091Checkbox = driver.findElement(By.xpath("//p[text()='CPT-99091']/..//input[@type=\"checkbox\"]"));
			        WebElement cpt99453Checkbox = driver.findElement(By.xpath("//p[text()='CPT-99453']/..//input[@type=\"checkbox\"]"));
			        WebElement cpt99454Checkbox = driver.findElement(By.id("//p[text()='CPT-99454']/..//input[@type=\"checkbox\"]"));
			        WebElement cpt99474Checkbox = driver.findElement(By.id("//p[text()='CPT-99474']/..//input[@type=\"checkbox\"]"));
			        cpt99091Checkbox.click();
			        cpt99453Checkbox.click();
			        cpt99454Checkbox.click();
			        cpt99474Checkbox.click();
			        WebElement totalReimbursement = driver.findElement(By.id("total-reimbursement")); // Replace with appropriate locator
			        String reimbursementValue = totalReimbursement.getText();
			        if (!reimbursementValue.equals("$110700")) {
			            System.out.println("Total Recurring Reimbursement value is incorrect");
			        }

			        driver.quit();
				
			}
			
		
		
	
	}

}

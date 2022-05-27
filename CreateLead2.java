package week5.day1;

import java.io.IOException;

import org.openqa.selenium.By;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import utility.ReadExcelData;

public class CreateLead2 extends ProjectSpecificMethods {
	@Test(dataProvider = "testData")
	public void runCreateLead(String username, String password, String companyName, String firstName, String lastName) {
		driver.findElement(By.id("username")).sendKeys(username);
		driver.findElement(By.id("password")).sendKeys(password);
		driver.findElement(By.className("decorativeSubmit")).click();
		driver.findElement(By.linkText("CRM/SFA")).click();
		driver.findElement(By.linkText("Leads")).click();
		driver.findElement(By.linkText("Create Lead")).click();
		driver.findElement(By.id("createLeadForm_companyName")).sendKeys(companyName);
		driver.findElement(By.id("createLeadForm_firstName")).sendKeys(firstName);
		driver.findElement(By.id("createLeadForm_lastName")).sendKeys(lastName);
		driver.findElement(By.name("submitButton")).click();
	}

	@DataProvider
	public String[][] testData() throws IOException {
		String[][] data = ReadExcelData.readData("tc001");
		return data;

	}

}

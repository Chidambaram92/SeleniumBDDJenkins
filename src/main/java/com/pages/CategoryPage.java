package com.pages;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class CategoryPage  {
	private WebDriver driver;

	private By categorySections = By.xpath("//div[@id='block_top_menu']/ul/li/a");

	public CategoryPage(WebDriver driver) {
		this.driver = driver;
	}
	public List<String> getCategorySectionsList() {

		List<String> categoryList = new ArrayList<>();
		List<WebElement> sectionHeaderList = driver.findElements(categorySections);

		for (WebElement e : sectionHeaderList) {
			String text = e.getText();
			System.out.println(text);
			categoryList.add(text);
		}

		return categoryList;

	}

}

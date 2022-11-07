package com.test;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class BrokenLinks {

	public static void main(String[] args) throws IOException,
			InterruptedException {
		String url = "";
		HttpURLConnection huc = null;
		int respCode = 200;

		System.setProperty("webdriver.chrome.driver",
				System.getProperty("user.dir") + "\\Driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.javatpoint.com/");
		driver.manage().window().maximize();
		Thread.sleep(5000);
		List<WebElement> links = driver.findElements(By.tagName("a"));
		int size = links.size();
		System.out.println(size);

		// Iterator<WebElement> list = links.iterator();
		try {

			for (WebElement webElement : links) {
				System.out.println(webElement.getText());

				// url = webElement.next().getAttribute("href");
				url = webElement.getAttribute("href");

				System.out.println(url);
				huc = (HttpURLConnection) (new URL(url).openConnection());

				huc.setRequestMethod("HEAD");

				huc.connect();

				respCode = huc.getResponseCode();

				if (respCode >= 400) {
					System.out.println(url + " is a broken link");
				} else {
					System.out.println(url + " is a valid link");
				}

			}

		} catch (Exception e) {
			System.out.println(e.getMessage());
		}

	}
}

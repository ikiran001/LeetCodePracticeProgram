package com.test;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.Iterator;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class BrokenLink {

	private static WebDriver driver = null;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver",
				System.getProperty("user.dir") + "\\Driver\\chromedriver.exe");
		String homePage = "http://www.zlti.com";
		String url = "";
		HttpURLConnection huc = null;
		int respCode = 200;

		driver = new ChromeDriver();

		driver.manage().window().maximize();

		driver.get(homePage);

		List<WebElement> links = driver.findElements(By.tagName("a"));

		Iterator<WebElement> it = links.iterator();

		while (it.hasNext()) {

			url = it.next().getAttribute("href");

			System.out.println(url);

//			if (url == null || url.isEmpty()) {
//				System.out
//						.println("URL is either not configured for anchor tag or it is empty");
//				continue;
//			}
//
//			if (!url.startsWith(homePage)) {
//				System.out
//						.println("URL belongs to another domain, skipping it.");
//				continue;
//			}

			try {
				huc = (HttpURLConnection) (new URL(url).openConnection());

				//huc.setRequestMethod("HEAD");

				huc.connect();

				respCode = huc.getResponseCode();
				System.out.println("respCode : " + respCode);
				if (respCode >= 400) {
					System.out.println(url + " is a broken link");
				} else {
					System.out.println(url + " is a valid link");
				}

			} catch (Exception e) {
				System.out.println(e.getMessage());
				e.printStackTrace();
			}
		}

		driver.quit();

	}
}

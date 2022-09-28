package org.example;

import com.microsoft.playwright.Browser;
import com.microsoft.playwright.BrowserType;
import com.microsoft.playwright.Page;
import com.microsoft.playwright.Playwright;

import java.lang.reflect.Field;

public class Automation {
    public static void main(String[] args) {
        try (Playwright playwright = Playwright.create()) {
            int count = 0;
            XPath xpath = new XPath();
            Browser browser = playwright.chromium().launch(new BrowserType.LaunchOptions().setHeadless(false).setSlowMo(50));
            Page page = browser.newPage();
            //take all the attribute of xpath object into an array
            Field[] fields = xpath.getClass().getDeclaredFields();
            //loop through the arrau
            for (Field field : fields) {
                //get the value of the attribute
                String value = (String) field.get(xpath);
                page.navigate("https://localhost:44369/search");
               if(page.isVisible(value)) {
                   System.out.println("Element is visible");
                   System.out.println(value);
                   count++;
               }
            }
            browser.close();
            System.out.println(count);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}


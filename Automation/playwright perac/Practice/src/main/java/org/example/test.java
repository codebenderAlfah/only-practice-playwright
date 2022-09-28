package org.example;


import com.microsoft.playwright.Browser;
import com.microsoft.playwright.BrowserType;
import com.microsoft.playwright.Page;
import com.microsoft.playwright.Playwright;


public class test {
    public static void main(String[] args) {
        try (Playwright playwright = Playwright.create()) {
            XPath xpath = new XPath();
            Browser browser = playwright.chromium().launch(new BrowserType.LaunchOptions().setHeadless(false).setSlowMo(100));
            Page page = browser.newPage();
            page.navigate("https://localhost:44369");
            page.click(xpath.LoginLinkXpath);
            page.fill(xpath.EmailBoxXpath2, "admin@YourStore.com");
            page.fill(xpath.PasswordBoxXpath, "123456");
            page.click(xpath.LoginButtonXpath);
            page.click("//a[@class = 'administration']");
            page.click("(//a[@class = 'nav-link'])[5]");
            page.click("(//a[@class = 'nav-link'])[6]");
            page.click("//a[@class = 'btn btn-primary']");
            page.click("//label[@class = 'onoffswitch-label']");
            page.fill("//input[@id = 'Name']", "Test Product by Automation");
            page.fill("//textarea[@id = 'ShortDescription']", "Short Description of Test Product by Automation");
            page.fill("//input[@id = 'Sku']", "TPA");
            page.fill("(//input[@class = 'k-formatted-value k-input'])[2]", "100");
            page.click("//input[@id = 'IsFreeShipping']");
            page.click("(//button[@class = 'btn btn-primary'])[1]");
            page.click("(//a[@class = 'nav-link'])[3]");
            page.fill(xpath.SearchBoxXpath, "Test Product by Automation");
            page.click(xpath.SearchButtonXpath);
            System.out.println(page.innerText("//h2[@class = 'product-title']"));
            browser.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}

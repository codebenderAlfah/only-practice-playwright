package org.example;


import com.microsoft.playwright.Browser;
import com.microsoft.playwright.BrowserType;
import com.microsoft.playwright.Page;
import com.microsoft.playwright.Playwright;


public class orderAProduct {
    public static void main(String[] args) {
        try (Playwright playwright = Playwright.create()) {
            XPath xpath = new XPath();
            Browser browser = playwright.chromium().launch(new BrowserType.LaunchOptions().setHeadless(false).setSlowMo(50));
            Page page = browser.newPage();
            page.navigate("https://localhost:44369");
            page.click(xpath.LoginLinkXpath);
            page.fill(xpath.EmailBoxXpath2, "admin@YourStore.com");
            page.fill(xpath.PasswordBoxXpath, "123456");
            page.click(xpath.LoginButtonXpath);
            page.click(xpath.HomeLogoLinkXpath);
            page.click("(//button[@class = 'button-2 product-box-add-to-cart-button'])[3]");
            page.click(xpath.ShoppingCartLinkXpath);
            page.click("//input[@id = 'termsofservice']");
            page.click("//button[@id = 'checkout']");
            page.click("(//button[@class= 'button-1 new-address-next-step-button'])[1]");
            page.click("(//button[@class= 'button-1 shipping-method-next-step-button'])[1]");
            page.click("(//button[@class= 'button-1 payment-method-next-step-button'])[1]");
            page.click("(//button[@class= 'button-1 payment-info-next-step-button'])[1]");
            page.click("(//button[@class= 'button-1 confirm-order-next-step-button'])[1]");
            System.out.println(page.innerText("//div[@class = 'order-number']"));
            page.waitForLoadState();
            browser.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}

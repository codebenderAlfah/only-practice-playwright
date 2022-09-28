package org.example;

public class XPath {
    //create a constructor for the class
    public XPath() {
    }
    //XPaths for Home page
    String RegisterLinkXpath = "//a[@class = 'ico-register']";
    String LoginLinkXpath = "//a[@class = 'ico-login']";
    String WishListLinkXpath = "//a[@class = 'ico-wishlist']";
    String ShoppingCartLinkXpath = "//a[@class = 'ico-cart']";
    String HomeLogoLinkXpath = "//img[@alt = 'Your store name']";
    String HomePageSearchBoxXpath = "//input[@id = 'small-searchterms']";
    String HomePageSearchButtonXpath = "//button[@class = 'button-1 search-box-button']";
    String FeaturedProduct1Xpath = "(//h2[@class='product-title']/a)[1]";
    String FeaturedProduct2Xpath = "(//h2[@class='product-title']/a)[2]";
    String FeaturedProduct3Xpath = "(//h2[@class='product-title']/a)[3]";
    String FeaturedProduct4Xpath = "(//h2[@class='product-title']/a)[4]";
    String News1Xpath = "(//a[@class = 'news-title'])[1]";
    String News2Xpath = "(//a[@class = 'news-title'])[2]";
    String News3Xpath = "(//a[@class = 'news-title'])[3]";
    String News1DetailsXpath = "(//a[@class = 'read-more'])[1]";
    String News2DetailsXpath = "(//a[@class = 'read-more'])[2]";
    String News3DetailsXpath = "(//a[@class = 'read-more'])[3]";
    String NewsArchiveLinkXpath = "//div[@class = 'view-all']/a";
    String PollAnswer1Xpath = "//input[@id = 'pollanswers-1']";
    String PollAnswer2Xpath = "//input[@id = 'pollanswers-2']";
    String PollAnswer3Xpath = "//input[@id = 'pollanswers-3']";
    String PollAnswer4Xpath = "//input[@id = 'pollanswers-4']";
    String PollVoteButtonXpath = "//button[@id = 'vote-poll-1']";
    String SiteMapLinkXpath = "//a[text() = 'Sitemap']";
    String ShippingAndReturnLinkXpath = "//a[text() = 'Shipping & returns']";
    String PrivacyNoticeLinkXpath = "//a[text() = 'Privacy notice']";
    String ConditionsOfUseLinkXpath = "//a[text() = 'Conditions of Use']";
    String ContactUsLinkXpath = "//a[text() = 'Contact us']";
    String AboutUsLinkXpath = "//a[text() = 'About us']";
    String SearchLinkXpath = "//a[text() = 'Search']";
    String NewsLinkXpath = "//a[text() = 'News']";
    String BlogLinkXpath = "//a[text() = 'Blog']";
    String RecentlyViewedProductsLinkXpath = "//a[text() = 'Recently viewed products']";
    String CompareProductsLinkXpath = "//a[text() = 'Compare products list']";
    String NewProductsLinkXpath = "//a[text() = 'New products']";
    String MyAccountLinkXpath = "//a[text() = 'My account']";
    String OrdersLinkXpath = "//a[text() = 'Orders']";
    String AddressesLinkXpath = "//a[text() = 'Addresses']";
    String ShoppingCartLinkXpath2 = "//a[text() = 'Shopping cart']";
    String WishlistLinkXpath2 = "//a[text() = 'Wishlist']";
    String ApplyForVendorAccountLinkXpath = "//a[text() = 'Apply for vendor account']";
    String FollowUsOnFacebookLinkXpath = "//a[text() = 'Facebook']";
    String FollowUsOnTwitterLinkXpath = "//a[text() = 'Twitter']";
    String FollowUsOnYouTubeLinkXpath = "//a[text() = 'YouTube']";
    String FollowUsOnRSSLinkXpath = "//a[text() = 'RSS']";
    String NewsletterEmailBoxXpath = "//input[@id = 'newsletter-email']";
    String NewsletterSubscribeButtonXpath = "//button[@id = 'newsletter-subscribe-button']";

    //XPaths for Register page
    String FirstNameBoxXpath = "//input[@id = 'FirstName']";
    String LastNameBoxXpath = "//input[@id = 'LastName']";
    String EmailBoxXpath = "//input[@id = 'Email']";
    String PasswordBoxXpath = "//input[@id = 'Password']";
    String ConfirmPasswordBoxXpath = "//input[@id = 'ConfirmPassword']";
    String RegisterButtonXpath = "//button[@id = 'register-button']";

    //XPaths for Login page
    String EmailBoxXpath2 = "//input[@id = 'Email']";
    String PasswordBoxXpath2 = "//input[@id = 'Password']";
    String LoginButtonXpath = "//button[text() = 'Log in']";
    String ForgotPasswordLinkXpath = "//span[@class = 'forgot-password']/a";
    String RegisterLinkXpath2 = "//button[text() = 'Register']";

    //XPaths for Search page
    String SearchBoxXpath = "//input[@id='q']";
    String AdvancedSearchCheckBoxXpath = "//input[@id='advs']";
    String CategoryDropDownXpath = "//select[@id='cid']";
    String ManufacturerDropDownXpath = "//select[@id='mid']";
    String SubCategoryCheckBoxXpath = "//input[@id='isc']";
    String ProductDescriptionCheckBoxXpath = "//input[@id='sid']";
    String SearchButtonXpath = "//button[@class='button-1 search-button']";

    //XPaths for Compare Products page
    String Product1RemoveButtonXpath = "(//button[@class = 'button-2 remove-button'])[1]";
    String Product2RemoveButtonXpath = "(//button[@class = 'button-2 remove-button'])[2]";
    String Product3RemoveButtonXpath = "(//button[@class = 'button-2 remove-button'])[3]";
    String Product4RemoveButtonXpath = "(//button[@class = 'button-2 remove-button'])[4]";
    String ClearListButtonXpath = "//a[@class = 'clear-list']";



}

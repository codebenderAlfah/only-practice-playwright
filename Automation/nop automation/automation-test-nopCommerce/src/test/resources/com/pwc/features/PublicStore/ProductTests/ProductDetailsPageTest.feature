Feature: Public store product details page
  A customer should see all the details of product from public store
  Actor:
  2. Customer

  Background:
    Given I am at public store
    When I am logged in as a customer with valid username "customer@yourStore.com" password "customer112"

  Scenario: Customer can see breadcrumb list in top of product details page
    Given I am at product details page
    Then I should see breadcrumb list in product details page

  Scenario: Customer can see product name from product details page
    Given I am at product details page
    And I should see product name in product details page

  Scenario: Customer can navigate to product review page
    Given I am at product details page
    When I click on add your review button from product details page
    Then I should see product review page

  Scenario: Customer can navigate to test product manufacturer page from product details page
    Given I am at product details page
    And I click on manufacturer name link-text from product details page

  Scenario: Customer can see product sku from product details page
    Given I am at product details page
    And I should see product sku from product details page

  Scenario: Customer can see product sku from product details page
    Given I am at product details page
    And I should see product sku from product details page

  Scenario: Customer can see product is free shipping
    Given I am at product details page
    And I should see free shipping showing from product details page

  Scenario: Customer can select product color square checkbox from product details
    Given I am at product details page
    And I should able to select color square from product details page

  Scenario: Customer can select product screen size radio button list
    Given I am at product details page
    And I should able to select screen size radio button from product details page

  Scenario: Customer can see product old price
    Given I am at product details page
    And I should see old price showing from product details page

  Scenario: Customer can see product price
    Given I am at product details page
    And I should see price showing from product details page

  Scenario: Customer can add product in cart with add to cart button from product details page
    Given I am at product details page
    And I click add to cart button on product details page
    And I should see success message "The product has been added to your shopping cart"
    Then I check successfully product added in my cart page

  Scenario: Customer can add product in wishlist with add to wishlist button from product details page
    Given I am at product details page
    And I click add to wishlist button on product details page
    And I should see success message "The product has been added to your wishlist"
    Then I check successfully product added in my wishlist page

  Scenario: Customer can add product in compare list with add to compare list button from product details page
    Given I am at product details page
    And I click add to compare list button on product details page
    And I should see success message "The product has been added to your product comparison"
    Then I check successfully product added in my compare product page

  Scenario: Customer can email this product with email a friend button from product details page
    Given I am at product details page
    And I click email a friend button on product details page
    And I should see product email page
    Then I fill up all details of email form in email product page
    And I click send email button in email product page
    Then I should see success message "Your message has been sent."

  Scenario: Customer can see product long description from product details page
    Given I am at product details page
    And I should see product long description in product details page

  Scenario: Customer can see product specification from product details page
    Given I am at product details page
    And I should see product specification in product details page

  Scenario: Customer can see product tags from product details page
    Given I am at product details page
    And I should see product tags in product details page

  Scenario: Customer can see related product list from product details page
    Given I am at product details page
    And I should see related product showing in product details page
    Then I should see the expected related product showing in product details page

  Scenario: Customer can see related product details from related product box
    Given I am at product details page
    And I should see related product name from related product box in product details page
    And I should see related product price from related product box in product details page

  Scenario: Customer can add product in cart with add to cart button from related product box of product details page
    Given I am at product details page
    And I click add to cart button on related product box of product details page
    And I should see success message "The product has been added to your shopping cart"
    Then I check successfully product added in my cart page

  Scenario: Customer can add product in compare list with add to compare list button from related product box of product details page
    Given I am at product details page
    And I click add to compare list button on related product box of product details page
    And I should see success message "The product has been added to your shopping cart"
    Then I check successfully product added in my cart page

  Scenario: Customer can add product in wishlist with add to wishlist button from related product box of product details page
    Given I am at product details page
    And I click add to wishlist button on related product box of product details page
    And I should see success message "The product has been added to your shopping cart"
    Then I check successfully product added in my cart page
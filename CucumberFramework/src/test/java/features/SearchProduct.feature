Feature: Search and place the order for products
@OfferPage
Scenario Outline: Search experence for product search in both home and offers page
Given User is on greencart landing page 
When User is search with shortname <name> and extract actual name of product
Then User is search for same name <name> in offers page to check if product exist
And  Validate the both the products

Examples:
|name|
|Tom|
|Beet|



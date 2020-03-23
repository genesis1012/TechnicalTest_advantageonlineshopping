#Author: heriberto-hg@hotmail.com
#Keywords Summary : add product to shopping cart

@productToShoppingCart
Feature: Add product to shopping cart
  I want to add a product to the shopping cart

  @tag1
  Scenario: Add product to shopping cart
    Given I am in the TABLETS catalog
    When Buy the product HP Pro Tablet 608 G1 with quantity 2
    Then The product added to the shopping cart must be with the selected quantity and the total value.

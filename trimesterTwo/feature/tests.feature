
Feature: Create a booking

  Scenario: A booking is created provided the information is correct
    Given A user with a login navigates to the booking screen
    When A booking date and hour is entered "2022-02-02 15"
    And The create a booking button is clicked
    Then A message is seen "You have created a booking!"
    
  Scenario: An error is seen when the login is missing
    Given A user without a login navigates to the booking screen
    When A booking date and hour is entered "2022-02-02 15"
    And The create a booking button is clicked
    Then A message is seen "You are not logged in!"
    
  Scenario: An error is seen when the date and hour is missing
    Given A user with a login navigates to the booking screen
    When The create a booking button is clicked
    Then A message is seen "Please enter the date and hour of the session!"
    
  Scenario: An error is seen when the date and hour is invalid
    Given A user with a login navigates to the booking screen
    When A booking date and hour is entered "asdasdadasdasdas"
    And The create a booking button is clicked
    Then A message is seen "Please enter a valid date and hour!"
    
  Scenario: An error is seen when the date and hour is in the past
    Given A user with a login navigates to the booking screen
    When A booking date and hour is entered "2018-02-02 15"
    And The create a booking button is clicked
    Then A message is seen "Please enter a date and hour in the future!"
    
  Scenario: An error is seen when the date and hour is outside the working hours
    Given A user with a login navigates to the booking screen
    When A booking date and hour is entered "2022-02-02 01"
    And The create a booking button is clicked
    Then A message is seen "Please enter a date and hour inside the working time!"
    
  Scenario: An error is seen when the date and hour is already booked
    Given A user with a login navigates to the booking screen
    When A booking date and hour is entered "2022-01-03 10"
    And The create a booking button is clicked
    Then A message is seen "This date and hour has already been booked!"

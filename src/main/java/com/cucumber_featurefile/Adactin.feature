Feature: Hotel Booking In Adactin Application


Scenario: Login Page

Given user Launch the Application
When user Enter The Username In Username Field
And user Enter The Password In Password Field
Then user Click On The Login Button And It Navigate To Search Hotel Page

Scenario: Search Hotel

When user Select The Hotel Location
And user Select The Hotel
And user Select The Room Type
And user Select The Room
And user Select The Check In Date
And user Select The Check Out Date
And user Select The Adults Per Room
And user Select The Child Per Room
Then user Click On The Search Button And It Navigate To Select Hotel Page

Scenario: Select Hotel

When user Click On The Radio Button To Select The Hotel
Then user Click On The Continue Button And It Navigate To Book Hotel

Scenario: Book Hotel

When user Enter The First Name In First Name Field
And user Enter The Last Name In Last Name Field
And user Enter The Address In Billing Address Field
And user Enter The Credit Card Number In Credit Card No. Field
And user Select The Credit Card Type In Credit Card Type Field
And user Select The Month And Year Of The Expiry Date in Expiry Date Field
And user Enter The Cvv Number In The CVV Number Field
Then user Click On The Book Now Button 
Then user Click On My Itinerary And It Navigate To BookedItinerary Page

Scenario: BookedItinerary

Then user Click On LogOut Boutton And Logout Successfully

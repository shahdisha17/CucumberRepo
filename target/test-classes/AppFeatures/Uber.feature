Feature: Uber booking feature

@Smoke
Scenario: Booking cab
Given User wants to select a car "sedan" from the uber app
When User selects car "sedan" and pickup point "Chicago" and drop location "Schaumburg"
Then Driver starts the journey
And Drivers end the journey
Then User pays 100 USD

@Regression @Smoke
Scenario: Booking cab
Given User wants to select a car "SUV" from the uber app
When User selects car "SUV" and pickup point "Chicago" and drop location "Airport"
Then Driver starts the journey
And Drivers end the journey
Then User pays 200 USD

@Smoke
Scenario: Booking cab
Given User wants to select a car "Mini" from the uber app
When User selects car "Mini" and pickup point "Elk Grove" and drop location "Schaumburg"
Then Driver starts the journey
And Drivers end the journey
Then User pays 50 USD
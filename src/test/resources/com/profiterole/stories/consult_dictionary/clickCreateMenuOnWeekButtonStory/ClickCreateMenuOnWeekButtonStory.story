Narrative:: Clicking on Menu on a Week Button
Scenario: Clicking on Menu on a Week Button
Meta:

GivenStories: givenStories/GivenUserIsOnProfiteroleHomePageClicksCreateMenuButton.story
When the user clicks on Menu on a Week Button
Then the user should see the page with seven choices 'Mo', 'Tu','We', 'Th', 'Fr', 'Sa', 'Su'

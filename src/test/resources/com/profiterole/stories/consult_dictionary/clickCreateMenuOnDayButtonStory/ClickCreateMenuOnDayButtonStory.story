Narrative:: Clicking on Menu on a Day Button
Scenario: Clicking on Menu on a Day Button
Meta:

GivenStories: givenStories/GivenUserIsOnProfiteroleHomePageClicksCreateMenuButton.story
When the user clicks on Menu on a Day Button
Then the user should see the page with three choices 'Breakfast', 'Dinner' and 'Supper'
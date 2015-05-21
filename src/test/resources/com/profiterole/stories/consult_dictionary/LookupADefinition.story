!--
!--
!--Lookup a definition
!--Narrative:
!--In order to talk better
!--As an English student
!--I want to look up word definitions

Scenario: Entering Login and Password
Given the user is on Profiterole home page
And the user clicks on Enter Button
When the user enters Login
And the user enters password
And the user click on Enter Button in Entry Window
Then the user should see the page with words 'Wellcome on our site'

Scenario: Clicking on AboutUs Button
Given the user is on Profiterole home page
When the user clicks on AboutUs Button
Then the user should see page with words 'About Us'

!--Scenario: Clicking on Recipes Button
!--Given the user is on Profiterole home page
!--When the user clicks on Recipes Button
!--Then the user should see DropDown List with two elemets 'All recipes' and 'Create recipe'

Scenario: Clicking on All Recipes Button
Given the user is on Profiterole home page
And the user clicks on Recipes Button
When the user clicks on All Recipes Button
Then the user should see all cuisines

Scenario: Clicking on Create Recipe Button
Given the user is on Profiterole home page
And the user clicks on Recipes Button
When the user clicks on Create Recipe Button
Then the user should see the page where he can createhis own recipe

!--Scenario: Clicking on Create Menu Button
!--Given the user is on Profiterole home page
!--When the user clicks on Create Menu Button
!--Then the user should see DropDown Listwith two elements 'Menu on a day' and 'Menu on a week'

Scenario: Clicking on Menu on a Day Button
Given the user is on Profiterole home page
And the user clicks on Create Menu Button
When the user clicks on Menu on a Day Button
Then the user should see the page with three choices 'Breakfast', 'Dinner' and 'Supper'

Scenario: Clicking on Menu on a Week Button
Given the user is on Profiterole home page
And the user clicks on Create Menu Button
When the user clicks on Menu on a Week Button
Then the user should see the page with seven choices 'Mo', 'Tu','We', 'Th', 'Fr', 'Sa', 'Su'

Scenario: Clicking on Breakfast Button in Menu on a Day
Given the user is on Profiterole home page
And the user clicks on Create Menu Button
And the user clicks on Menu on a Day Button
When the user clicks on Breakfast Button
Then the user should see the page where he can create his own menu on a day

Scenario: Clicking on Mo Button in Menu on a Week
Given the user is on Profiterole home page
And the user clicks on Create Menu Button
And the user clicks on Menu on a Week Button
When the user clicks on Mo Button
And the user clicks on Dinner Button
Then the user shoild see the page where he can create his own menu on a week

Scenario: Choosing Ukrainian cuisine in All Recipes Menu
Given the user is on Profiterole home page
And the user clicks on Recipes Button
And the user clicks on All Recipes Button
When the user clicks on Ukrainian cuisine
Then the user should see the page with all Ukrainian dishes

Scenario: Choosing Mexico cuisine in All Recipes Menu
Given the user is on Profiterole home page
And the user clicks on Recipes Button
And the user clicks on All Recipes Button
When the user clicks on Mexico cuisine
Then the user should see the page with all Mexico dishes

Scenario: Choosing French cuisine in All Recipes Menu
Given the user is on Profiterole home page
And the user clicks on Recipes Button
And the user clicks on All Recipes Button
When the user clicks on French cuisine
Then the user should see the page with all French dishes

Scenario: Choosing Закуски in Ukrainian Cuisine
Given the user is on Profiterole home page
And the user clicks on Recipes Button
And the user clicks on All Recipes Button
And the user clicks on Ukrainian cuisine
When the user clicks on 'Закуски'
Then he should see list with Ukrainian recipes
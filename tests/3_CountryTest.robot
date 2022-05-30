*** Settings ***
Library           Selenium2Library
Library           src.keywords.KeywordsCountry
Resource          src/test/robotframework/acceptance/SetUpAndTearDown.robot

Test Setup        Set Up Country
Test Teardown     Teardown Action

*** Variables ***
${URL} =  https://inventory.edu-netcracker.com/login.jsp
${BROWSER}=  chrome
${NAME}=  country26535331

*** Test Cases ***

TС 11.1 Creation new country

    [Tags]    Feature Testing
    Create country
    Input name in country form  ${NAME}
    Input language in country form  Ru
    Select continent in country form  Africa
    Capture Page Screenshot  TС 11.1(1).png
    Save country
    Capture Page Screenshot  TС 11.1(2).png
    Title Should Be  ${NAME}

TС 11.2 Creating an existing country into the system

    [Tags]    Feature Testing
    Create country
    Input name in country form  ${NAME}
    Input language in country form  Ru
    Select continent in country form  Africa
    Capture Page Screenshot  TС 11.2(1).png
    Save country
    Capture Page Screenshot  TС 11.2(2).png
    Check for error after invalid country name  Country with such name already exists.

TC 12.1 Empty value 'Name' textbox

    [Tags]    Feature Testing
    Create country
    Input language in country form  Ru
    Select continent in country form  Africa
    Capture Page Screenshot  TС 12.1(1).png
    Save country
    Capture Page Screenshot  TС 12.1(2).png
    Check for error after invalid country name  'Name' should be not empty.

TC 13.1 Don’t pick 'Continent'

    [Tags]    Feature Testing
    Create country
    Input name in country form  ${NAME}13.1
    Input language in country form  Ru
    Capture Page Screenshot  TС 13.1(1).png
    Save country
    Capture Page Screenshot  TС 13.1(2).png
    Title Should Be   ${NAME}13.1

TC 14.1 Empty value 'Language' textbox

    [Tags]    Feature Testing
    Create country
    Input name in country form  ${NAME}
    Select continent in country form  Africa
    Capture Page Screenshot  TС 14.1(1).png
    Save country
    Capture Page Screenshot  TС 14.1(2).png
    Check for error after invalid country language  'Language' parameter must be not empty.

TC 15.1 Edit country info

    [Tags]    Feature Testing
    Click second country
    Click parameters
    Sleep  2s
    Edit country
    Input name in country form  ${NAME}15.1
    Capture Page Screenshot  TС 15.1(1).png
    Save country
    Capture Page Screenshot  TС 15.1(2).png
    Title Should Be  ${NAME}15.1


TC 16.1 Delete country

    [Tags]    Feature Testing
    Select second country
    Capture Page Screenshot  TС 16.1(1).png
    Delete country
    Capture Page Screenshot  TС 16.1(2).png
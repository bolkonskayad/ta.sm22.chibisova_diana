*** Settings ***
Library           Selenium2Library
Library           src.keywords.KeywordsFloor
Resource          src/test/robotframework/acceptance/SetUpAndTearDown.robot

Test Setup        Set Up Floor
Test Teardown     Teardown Action

*** Variables ***
${URL} =  https://inventory.edu-netcracker.com/login.jsp
${BROWSER}=  chrome
${NUMBER}=  203

*** Test Cases ***


TC 31.1 Creation new floor

    [Tags]    Feature Testing
    Create floor
    Input number in floor form  ${NUMBER}
    Input square in floor form  20
    Capture Page Screenshot  TС 31.1(1).png
    Save floor
    Capture Page Screenshot  TС 31.1(2).png
    Title Should Be  Floor#${NUMBER}

TC 32.1 Text value in floor's number

    [Tags]    Feature Testing
    Create floor
    Input number in floor form  text
    Input square in floor form  20
    Capture Page Screenshot  TС 32.1(1).png
    Save floor
    Capture Page Screenshot  TС 32.1(2).png
    Check for error after invalid floor number  Not a number.

TC 33.1 Text value in floor's square


    [Tags]    Feature Testing
    Create floor
    Input number in floor form  10
    Input square in floor form  text
    Capture Page Screenshot  TС 33.1(1).png
    Save floor
    Capture Page Screenshot  TС 33.1(2).png
    Sleep  3s
    Check for error after invalid floor square  Not a number.


TC 33.2 Empty value in floor's square

    [Tags]    Feature Testing
    Create floor
    Input number in floor form  10
    Capture Page Screenshot  TС 33.2(1).png
    Save floor
    Capture Page Screenshot  TС 33.2(2).png
    Check for error after invalid floor square  Square should be not empty.


TC 33.3 Zero value in floor's square

    [Tags]    Feature Testing
    Create floor
    Input number in floor form  10
    Input square in floor form  0
    Capture Page Screenshot  TС 33.3(1).png
    Save floor
    Capture Page Screenshot  TС 33.3(2).png
    Check for error after invalid floor square  Square should be more than 0.


TC 33.4 Negative value in floor's square

    [Tags]    Feature Testing
    Create floor
    Input number in floor form  10
    Input square in floor form  -10
    Capture Page Screenshot  TС 33.4(1).png
    Save floor
    Capture Page Screenshot  TС 33.4(2).png
    Check for error after invalid floor square  Square should be more than 0.

TC 34.1 Edit floor info

    [Tags]    Feature Testing
    Click second floor
    Click parameters floor
    Sleep  2s
    Edit floor
    Input number in floor form  ${NUMBER}341
    Capture Page Screenshot  TС 34.1(1).png
    Save floor
    Capture Page Screenshot  TС 34.1(2).png
    Title Should Be  Floor#${NUMBER}341

TC 35.1 Delete 1 floor

    [Tags]    Feature Testing
    Select second floor
    Capture Page Screenshot  TС 35.1(1).png
    Delete floor
    Capture Page Screenshot  TС 35.1(2).png

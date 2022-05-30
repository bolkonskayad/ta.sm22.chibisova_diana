*** Settings ***
Library           Selenium2Library
Library           src.keywords.KeywordsLogin
Resource          src/test/robotframework/acceptance/SetUpAndTearDown.robot

Test Setup        Set Up Login
Test Teardown     Teardown Action

*** Variables ***
${URL} =  https://inventory.edu-netcracker.com/login.jsp
${BROWSER}=  chrome

*** Test Cases ***
TС 10.1 Authorization of a registrated user

    [Tags]    Feature Testing
    I am at the login form
    Input username in login form  chibisovad
    Input password in login form  chibisovaD2001!
    Capture Page Screenshot  TС 10.1(1).png
    Click login button
    Capture Page Screenshot  TС 10.1(2).png
    Title Should Be  Top

TС 10.2 Authorization of an unregistrated user

    [Tags]    Feature Testing
    Input username in login form  chibisvad
    Input password in login form  chibisovaD2001
    Capture Page Screenshot  TС 10.2(1).png
    Click login button
    Capture Page Screenshot  TС 10.2(2).png
    Check for error after invalid login   Your login attempt was not successful, try again.\nCaused : Username/Password entered is incorrect.

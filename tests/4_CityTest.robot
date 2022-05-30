*** Settings ***
Library           Selenium2Library
Library           src.keywords.KeywordsCity
Resource          src/test/robotframework/acceptance/SetUpAndTearDown.robot

Test Setup        Set Up City
Test Teardown     Teardown Action

*** Variables ***
${URL} =  https://inventory.edu-netcracker.com/login.jsp
${BROWSER}=  chrome
${NAME}=  city200018

*** Test Cases ***


TС 17.1 Creation new city

    [Tags]    Feature Testing
    Create city
    Input name in city form  ${NAME}
    Input population in city form  10000000
    Select center in city form  Yes
    Save city
    Title Should Be  ${NAME}

TС 18.1 Empty 'Name' textbox

    [Tags]    Feature Testing
    Create city
    Input population in city form  10000000
    Select center in city form  Yes
    Save city
    Check for error after invalid city name  The city's name should not be empty.

TC 19.1 Empty 'Population' textbox

    [Tags]    Feature Testing
    Create city
    Input name in city form  ${NAME}19.1
    Select center in city form  Yes
    Save city
    Check for error after invalid city population  The population should be more than 0.

TC 19.2 Text 'Population' textbox

    [Tags]    Feature Testing
    Create city
    Input name in city form  ${NAME}19.2
    Input population in city form  ${NAME}19.2
    Select center in city form  Yes
    Save city
    Check for error after invalid city population  Not a number.

TC 19.3 Zero value 'Population' textbox

    [Tags]    Feature Testing
    Create city
    Input name in city form  ${NAME}19.3
    Input population in city form  0
    Select center in city form  Yes
    Save city
    Check for error after invalid city population  The population should be more than 0.

TC 19.4 Negative 'Population' textbox

    [Tags]    Feature Testing
    Create city
    Input name in city form  ${NAME}19.4
    Input population in city form  -1000
    Select center in city form  Yes
    Save city
    Check for error after invalid city population  The population should be more than 0.

TC 20.1 Creation new city which is regional center

    [Tags]    Feature Testing
    Create city
    Input name in city form  ${NAME}20.1
    Input population in city form  10000000
    Select center in city form  Yes
    Save city
    Title Should Be  ${NAME}20.1

TC 20.2 Creation new city which is not regional center

    [Tags]    Feature Testing
    Create city
    Input name in city form  ${NAME}20.2
    Input population in city form  10000000
    Select center in city form  No
    Save city
    Title Should Be  ${NAME}20.2

TC 22.1 Edit city info

    [Tags]    Feature Testing
    Click second city
    Click parameters city
    Sleep  2s
    Edit city
    Input name in city form  ${NAME}22.1
    Save city
    Title Should Be  ${NAME}22.1

TC 23.1 Delete 1 city

    [Tags]    Feature Testing
    Select second city
    Delete city

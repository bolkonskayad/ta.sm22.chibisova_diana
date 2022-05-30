*** Settings ***
Library           Selenium2Library
Library           src.keywords.KeywordsRoom
Resource          src/test/robotframework/acceptance/SetUpAndTearDown.robot

Test Setup        Set Up Room
Test Teardown     Teardown Action

*** Variables ***
${URL} =  https://inventory.edu-netcracker.com/login.jsp
${BROWSER}=  chrome
${NAME}=  28408

*** Test Cases ***

TC 36.1 Creation new room

    [Tags]    Feature Testing
    Create room
    Input name in room form  ${NAME}
    Input square in room form  2
    Capture Page Screenshot  TС 36.1(1).png
    Save room
    Capture Page Screenshot  TС 36.1(2).png
    Title Should Be  ${NAME}


TC 37.1 Empty 'Name' textbox

    [Tags]    Feature Testing
    Create room
    Input square in room form  2
    Capture Page Screenshot  TС 37.1(1).png
    Save room
    Capture Page Screenshot  TС 37.1(2).png
    Sleep  2s
    Check for error after invalid room name  'Name' should be not empty.

TC 37.2 Repeat 'Name' textbox

    [Tags]    Feature Testing
    Create room
    Input name in room form  ${NAME}
    Input square in room form  2
    Capture Page Screenshot  TС 37.2(1).png
    Save room
    Capture Page Screenshot  TС 37.2(2).png
    Check for error after invalid room name  Room with such name already exists.

TC 38.1 Text 'Square' textbox

    [Tags]    Feature Testing
    Create room
    Input name in room form  10
    Input square in room form  text
    Capture Page Screenshot  TС 38.1(1).png
    Save room
    Capture Page Screenshot  TС 38.1(2).png
    Sleep  3s
    Check for error after invalid room square  Not a number.

TC 38.2 Empty 'Square' textbox

    [Tags]    Feature Testing
    Create room
    Input name in room form  1
    Capture Page Screenshot  TС 38.2(1).png
    Save room
    Capture Page Screenshot  TС 38.2(2).png
    Check for error after invalid room square  'Square' parameter should be more than 0.

TC 38.3 Zero 'Square' textbox

    [Tags]    Feature Testing
    Create room
    Input name in room form  10
    Input square in room form  0
    Capture Page Screenshot  TС 38.3(1).png
    Save room
    Capture Page Screenshot  TС 38.3(2).png
    Check for error after invalid room square  Square should be more than 0.

TC 38.4 Negative 'Square' textbox

    [Tags]    Feature Testing
    Create room
    Input name in room form  10
    Input square in room form  -10
    Capture Page Screenshot  TС 38.4(1).png
    Save room
    Capture Page Screenshot  TС 38.4(2).png
    Check for error after invalid room square  Square should be more than 0.

TC 38.5 More than available 'Square' textbox

    [Tags]    Feature Testing
    Create room
    Input name in room form  10
    Input square in room form  10000000000000000000
    Capture Page Screenshot  TС 38.5(1).png
    Save room
    Capture Page Screenshot  TС 38.5(2).png
    Check for error after invalid room square  Room square is too large (more than available square of floor).

TC 39.1 Edit room info

    [Tags]    Feature Testing
    Click second room
    Click parameters room
    Sleep  2s
    Edit room
    Input name in room form  ${NAME}341
    Capture Page Screenshot  TС 39.1(1).png
    Save room
    Capture Page Screenshot  TС 39.1(2).png
    Title Should Be  ${NAME}341

TC 40.1 Delete 1 room

    [Tags]    Feature Testing
    Select second room
    Capture Page Screenshot  TС 40.1(1).png
    Delete room
    Capture Page Screenshot  TС 40.1(2).png


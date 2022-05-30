*** Settings ***
Library           Selenium2Library
Library           src.keywords.KeywordsBuilding
Resource          src/test/robotframework/acceptance/SetUpAndTearDown.robot

Test Setup        Set Up Building
Test Teardown     Teardown Action

*** Variables ***
${URL} =  https://inventory.edu-netcracker.com/login.jsp
${BROWSER}=  chrome
${NAME}=  building18408

*** Test Cases ***

TС 24.1 Creation new building

    [Tags]    Feature Testing
    Create building
    Input name in building form  ${NAME}
    Input street name in building form  street
    Select is connected in building form  Lit
    Input number in building form  10
    Input square in building form  10
    Capture Page Screenshot  TС 24.1(1).png
    Save building
    Capture Page Screenshot  TС 24.1(2).png
    Title Should Be  ${NAME}

TС 25.1 Empty 'Name' textbox

    [Tags]    Feature Testing
    Create building
    Input street name in building form  street
    Select is connected in building form  Lit
    Input number in building form  10
    Input square in building form  10
    Capture Page Screenshot  TС 25.1(1).png
    Save building
    Capture Page Screenshot  TС 25.1(2).png
    Check for error after invalid building name  The name of the building should not be empty.


TC 26.1 Empty 'Number' textbox

    [Tags]    Feature Testing
    Create building
    Input name in building form  ${NAME}26.1
    Input street name in building form  street
    Select is connected in building form  Lit
    Input square in building form  10
    Capture Page Screenshot  TС 26.1(1).png
    Save building
    Capture Page Screenshot  TС 26.1(2).png
    Check for error after invalid building number  can't be empty

TC 27.1 Empty 'Square' textbox

    [Tags]    Feature Testing
    Create building
    Input name in building form  ${NAME}27.1
    Input street name in building form  street
    Select is connected in building form  Lit
    Input number in building form  10
    Capture Page Screenshot  TС 27.1(1).png
    Save building
    Capture Page Screenshot  TС 27.1(2).png
    Check for error after invalid building square  'Square' parameter should be more than 0.

TC 27.2 Text 'Square' textbox

    [Tags]    Feature Testing
    Create building
    Input name in building form  ${NAME}27.2
    Input street name in building form  street
    Select is connected in building form  Lit
    Input number in building form  10
    Input square in building form  text
    Capture Page Screenshot  TС 27.2(1).png
    Save building
    Capture Page Screenshot  TС 27.2(2).png
    Check for error after invalid building square  Not a number.

TC 27.3 Zero value 'Square' textbox

    [Tags]    Feature Testing
    Create building
    Input name in building form  ${NAME}27.3
    Input street name in building form  street
    Select is connected in building form  Lit
    Input number in building form  10
    Input square in building form  0
    Capture Page Screenshot  TС 27.3(1).png
    Save building
    Capture Page Screenshot  TС 27.3(2).png
    Check for error after invalid building square  'Square' parameter should be more than 0.

TC 27.4 Negative 'Square' textbox

    [Tags]    Feature Testing
    Create building
    Input name in building form  ${NAME}27.4
    Input street name in building form  street
    Select is connected in building form  Lit
    Input number in building form  10
    Input square in building form  -100
    Capture Page Screenshot  TС 27.4(1).png
    Save building
    Capture Page Screenshot  TС 27.4(2).png
    Check for error after invalid building square  'Square' parameter should be more than 0.

TC 28.1 Drop-down list 'Is connected' Lit

    [Tags]    Feature Testing
    Create building
    Input name in building form  ${NAME}28.1
    Input street name in building form  street
    Select is connected in building form  Lit
    Input number in building form  10
    Input square in building form  100
    Capture Page Screenshot  TС 28.1(1).png
    Save building
    Capture Page Screenshot  TС 28.1(2).png
    Title Should Be  ${NAME}28.1

TC 28.2 Drop-down list 'Is connected' Unlit

    [Tags]    Feature Testing
    Create building
    Input name in building form  ${NAME}28.2
    Input street name in building form  street
    Select is connected in building form  Unlit
    Input number in building form  10
    Input square in building form  100
    Capture Page Screenshot  TС 28.2(1).png
    Save building
    Capture Page Screenshot  TС 28.2(2).png
    Title Should Be  ${NAME}28.2

TC 28.3 Drop-down list 'Is connected' Not Lit

    [Tags]    Feature Testing
    Create building
    Input name in building form  ${NAME}28.3
    Input street name in building form  street
    Select is connected in building form  Not Lit
    Input number in building form  10
    Input square in building form  100
    Capture Page Screenshot  TС 28.3(1).png
    Save building
    Capture Page Screenshot  TС 28.3(2).png
    Title Should Be  ${NAME}28.3

TC 28.4 Empty drop-down list 'Is connected'

    [Tags]    Feature Testing
    Create building
    Input name in building form  ${NAME}28.4
    Input street name in building form  street
    Input number in building form  10
    Input square in building form  100
    Capture Page Screenshot  TС 28.4(1).png
    Save building
    Capture Page Screenshot  TС 28.4(2).png
    Check for error after invalid building connect  can't be empty

TC 29.1 Edit building info

    [Tags]    Feature Testing
    Click second building
    Click parameters building
    Sleep  2s
    Edit building
    Input name in building form  ${NAME}29.1
    Capture Page Screenshot  TС 29.1(1).png
    Save building
    Capture Page Screenshot  TС 29.1(2).png
    Title Should Be  ${NAME}29.1

TC 30.1 Delete 1 building

    [Tags]    Feature Testing
    Select second building
    Capture Page Screenshot  TС 30.1(1).png
    Delete building
    Capture Page Screenshot  TС 30.2(1).png
*** Settings ***
Library           Selenium2Library
Library           src.keywords.KeywordsATM
Resource          src/test/robotframework/acceptance/SetUpAndTearDown.robot

Test Setup        Set Up ATM
Test Teardown     Teardown Action

*** Variables ***
${URL} =  https://inventory.edu-netcracker.com/login.jsp
${BROWSER}=  chrome
${NAME}=  atm23118

*** Test Cases ***

TC 65.1 Creation new ATM

    [Tags]    Feature Testing
    Create ATM
    Input name in ATM form  ${NAME}
    Input extra security in ATM form  security
    Input connection type in ATM form  connection
    Select physical status in ATM form  Planned
    Select location in ATM form
    Capture Page Screenshot  TС 65.1(1).png
    Save ATM
    Capture Page Screenshot  TС 65.1(2).png
    Title Should Be  ${NAME}

TC 66.1 Empty 'Name' textbox

    [Tags]    Feature Testing
    Create ATM
    Input extra security in ATM form  security
    Input connection type in ATM form  connection
    Select physical status in ATM form  Planned
    Select location in ATM form
    Capture Page Screenshot  TС 66.1(1).png
    Save ATM
    Capture Page Screenshot  TС 66.1(2).png
    Check for error after invalid ATM name  'Name' should be not empty.

TC 66.2 Repeat 'Name' textbox

    [Tags]    Feature Testing
    Create ATM
    Input name in ATM form  ${NAME}
    Input extra security in ATM form  security
    Input connection type in ATM form  connection
    Select physical status in ATM form  Planned
    Select location in ATM form
    Capture Page Screenshot  TС 66.2(1).png
    Save ATM
    Capture Page Screenshot  TС 66.2(2).png
    Check for error after invalid ATM name  ATM with such name already exists.

TC 67.1 Planned' drop-down list 'Physical Status'

    [Tags]    Feature Testing
    Create ATM
    Input name in ATM form  ${NAME}67.1
    Input extra security in ATM form  security
    Input connection type in ATM form  connection
    Select physical status in ATM form  Planned
    Select location in ATM form
    Capture Page Screenshot  TС 67.1(1).png
    Save ATM
    Capture Page Screenshot  TС 67.1(2).png
    Title Should Be  ${NAME}67.1

TC 67.2 In Service' drop-down list 'Physical Status'

    [Tags]    Feature Testing
    Create ATM
    Input name in ATM form  ${NAME}67.2
    Input extra security in ATM form  security
    Input connection type in ATM form  connection
    Select physical status in ATM form  In Service
    Select location in ATM form
    Capture Page Screenshot  TС 67.2(1).png
    Save ATM
    Capture Page Screenshot  TС 67.2(2).png
    Title Should Be  ${NAME}67.2

TC 67.3 Unistalled' drop-down list 'Physical Status'

    [Tags]    Feature Testing
    Create ATM
    Input name in ATM form  ${NAME}67.3
    Input extra security in ATM form  security
    Input connection type in ATM form  connection
    Select physical status in ATM form  Unistalled
    Select location in ATM form
    Capture Page Screenshot  TС 67.3(1).png
    Save ATM
    Capture Page Screenshot  TС 67.3(2).png
    Title Should Be  ${NAME}67.3

TC 68.1 Empty 'Located in'

    [Tags]    Feature Testing
    Create ATM
    Input name in ATM form  ${NAME}68.1
    Input extra security in ATM form  security
    Input connection type in ATM form  connection
    Select physical status in ATM form  Planned
    Capture Page Screenshot  TС 68.1(1).png
    Save ATM
    Capture Page Screenshot  TС 68.1(2).png
    Check for error after invalid ATM location  can't be empty

TC 69.1 Edit ATM

    [Tags]    Feature Testing
    Click second ATM
    Click parameters ATM
    Sleep  2s
    Edit ATM
    Input name in ATM form  ${NAME}69.1
    Capture Page Screenshot  TС 69.1(1).png
    Save ATM
    Capture Page Screenshot  TС 69.1(2).png
    Title Should Be  ${NAME}69.1

TC 70.1 Delete 1 ATM

    [Tags]    Feature Testing
    Select second ATM
    Capture Page Screenshot  TС 70.1(1).png
    Delete ATM
    Capture Page Screenshot  TС 70.1(1).png


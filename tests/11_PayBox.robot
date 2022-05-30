*** Settings ***
Library           Selenium2Library
Library           src.keywords.KeywordsPayBox
Resource          src/test/robotframework/acceptance/SetUpAndTearDown.robot

Test Setup        Set Up Pay Box
Test Teardown     Teardown Action

*** Variables ***
${URL} =  https://inventory.edu-netcracker.com/login.jsp
${BROWSER}=  chrome
${NAME}=  paybox1227274


*** Test Cases ***

TC 58.1 Creation new Pay Box

    [Tags]    Feature Testing
    Sleep  2s
    Create Pay Box
    Input name in Pay Box form  ${NAME}
    Input display size in Pay Box form  10
    Input secure protocol in Pay Box form  protocol
    Select location in Pay Box form
    Select physical status in Pay Box form  Planned
    Capture Page Screenshot  TС 58.1(1).png
    Save Pay Box
    Capture Page Screenshot  TС 58.1(2).png
    Title Should Be  ${NAME}

TC 59.1 Empty 'Name' textbox

    [Tags]    Feature Testing
    Sleep  2s
    Create Pay Box
    Input display size in Pay Box form  10
    Input secure protocol in Pay Box form  protocol
    Select location in Pay Box form
    Select physical status in Pay Box form  Planned
    Capture Page Screenshot  TС 59.1(1).png
    Save Pay Box
    Capture Page Screenshot  TС 59.1(2).png
    Check for error after invalid Pay Box name  'Name' should be not empty.

TC 59.2 Repeat 'Name' textbox

    [Tags]    Feature Testing
    Sleep  2s
    Create Pay Box
    Input name in Pay Box form  ${NAME}
    Input display size in Pay Box form  10
    Input secure protocol in Pay Box form  protocol
    Select location in Pay Box form
    Select physical status in Pay Box form  Planned
    Capture Page Screenshot  TС 59.2(1).png
    Save Pay Box
    Capture Page Screenshot  TС 59.2(2).png
    Check for error after invalid Pay Box name  Pay box with such name already exists.

TC 60.1 Text 'Display Size(inches)' textbox

    [Tags]    Feature Testing
    Sleep  2s
    Create Pay Box
    Input name in Pay Box form  ${NAME}60.1
    Input display size in Pay Box form  text
    Input secure protocol in Pay Box form  protocol
    Select location in Pay Box form
    Select physical status in Pay Box form  Planned
    Capture Page Screenshot  TС 60.1(1).png
    Save Pay Box
    Capture Page Screenshot  TС 60.1(2).png
    Check for error after invalid Pay Box display size  Not a number.

TC 60.2 Zero 'Display Size(inches)' textbox

    [Tags]    Feature Testing
    Sleep  2s
    Create Pay Box
    Input name in Pay Box form  ${NAME}60.2
    Input display size in Pay Box form  0
    Input secure protocol in Pay Box form  protocol
    Select location in Pay Box form
    Select physical status in Pay Box form  Planned
    Capture Page Screenshot  TС 60.2(1).png
    Save Pay Box
    Capture Page Screenshot  TС 60.2(2).png
    Check for error after invalid Pay Box display size  Pay Box's display size should be more than 0.

TC 60.3 Negative 'Display Size(inches)' textbox

    [Tags]    Feature Testing
    Sleep  2s
    Create Pay Box
    Input name in Pay Box form  ${NAME}60.3
    Input display size in Pay Box form  -10
    Input secure protocol in Pay Box form  protocol
    Select location in Pay Box form
    Select physical status in Pay Box form  Planned
    Capture Page Screenshot  TС 60.3(1).png
    Save Pay Box
    Capture Page Screenshot  TС 60.3(2).png
    Check for error after invalid Pay Box display size  Pay Box's display size should be more than 0.

TC 61.1 Planned' drop-down list 'Physical Status'

    [Tags]    Feature Testing
    Sleep  2s
    Create Pay Box
    Input name in Pay Box form  ${NAME}61.1
    Input display size in Pay Box form  10
    Input secure protocol in Pay Box form  protocol
    Select location in Pay Box form
    Select physical status in Pay Box form  Planned
    Capture Page Screenshot  TС 61.1(1).png
    Save Pay Box
    Capture Page Screenshot  TС 61.1(2).png
    Title Should Be  ${NAME}61.1

TC 61.2 In Service' drop-down list 'Physical Status'

    [Tags]    Feature Testing
    Sleep  2s
    Create Pay Box
    Input name in Pay Box form  ${NAME}61.2
    Input display size in Pay Box form  10
    Input secure protocol in Pay Box form  protocol
    Select location in Pay Box form
    Select physical status in Pay Box form  In Service
    Capture Page Screenshot  TС 61.2(1).png
    Save Pay Box
    Capture Page Screenshot  TС 61.2(2).png
    Title Should Be  ${NAME}61.2

TC 61.3 Unistalled' drop-down list 'Physical Status'

    [Tags]    Feature Testing
    Sleep  2s
    Create Pay Box
    Input name in Pay Box form  ${NAME}61.3
    Input display size in Pay Box form  10
    Input secure protocol in Pay Box form  protocol
    Select location in Pay Box form
    Select physical status in Pay Box form  Unistalled
    Capture Page Screenshot  TС 61.3(1).png
    Save Pay Box
    Capture Page Screenshot  TС 61.3(2).png
    Title Should Be  ${NAME}61.3

TC 62.1 Empty 'Located in'

    [Tags]    Feature Testing
    Sleep  2s
    Create Pay Box
    Input name in Pay Box form  ${NAME}62.1
    Input display size in Pay Box form  10
    Input secure protocol in Pay Box form  protocol
    Select physical status in Pay Box form  Unistalled
    Capture Page Screenshot  TС 62.1(1).png
    Save Pay Box
    Capture Page Screenshot  TС 62.1(2).png
    Check for error after invalid Pay Box location  can't be empty

TC 63.1 Edit PayBox

    [Tags]    Feature Testing
    Click second Pay Box
    Sleep  2s
    Click parameters Pay Box
    Sleep  2s
    Edit Pay Box
    Input name in Pay Box form  ${NAME}63.1
    Capture Page Screenshot  TС 63.1(1).png
    Save Pay Box
    Capture Page Screenshot  TС 63.1(2).png
    Title Should Be  ${NAME}63.1

TC 64.1 Delete 1 PayBox

    [Tags]    Feature Testing
    Select second Pay Box
    Capture Page Screenshot  TС 64.1(1).png
    Delete Pay Box
    Capture Page Screenshot  TС 64.1(2).png





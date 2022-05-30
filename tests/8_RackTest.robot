*** Settings ***
Library           Selenium2Library
Library           src.keywords.KeywordsRack
Resource          src/test/robotframework/acceptance/SetUpAndTearDown.robot

Test Setup        Set Up Rack
Test Teardown     Teardown Action

*** Variables ***
${URL} =  https://inventory.edu-netcracker.com/login.jsp
${BROWSER}=  chrome
${NAME}=  rack699

*** Test Cases ***


TC 41.1 Creation new rack

    [Tags]    Feature Testing
    Create rack
    Input name in rack form  ${NAME}
    Input height in rack form  20
    Input length in rack form  20
    Input width in rack form  20
    Select physical status in rack form  Planned
    Capture Page Screenshot  TС 41.1(1).png
    Save rack
    Capture Page Screenshot  TС 41.1(2).png
    Title Should Be  ${NAME}

TC 42.1 Empty 'Name' textbox

    [Tags]    Feature Testing
    Create rack
    Input height in rack form  20
    Input length in rack form  20
    Input width in rack form  20
    Select physical status in rack form  Planned
    Capture Page Screenshot  TС 42.1(1).png
    Save rack
    Capture Page Screenshot  TС 42.1(2).png
    Check for error after invalid rack name  Rack name can not be blank.

TC 43.1 Text 'Width' textbox

    [Tags]    Feature Testing
    Create rack
    Input name in rack form  ${NAME}43.1
    Input height in rack form  20
    Input length in rack form  20
    Input width in rack form  text
    Select physical status in rack form  Planned
    Capture Page Screenshot  TС 43.1(1).png
    Save rack
    Capture Page Screenshot  TС 43.1(2).png
    Check for error after invalid rack width  Not a number.

TC 43.2 Empty 'Width' textbox

    [Tags]    Feature Testing
    Create rack
    Input name in rack form  ${NAME}43.2
    Input height in rack form  20
    Input length in rack form  20
    Select physical status in rack form  Planned
    Capture Page Screenshot  TС 43.2(1).png
    Save rack
    Capture Page Screenshot  TС 43.2(2).png
    Check for error after invalid rack width  Rack's width should be more than 0.

TC 43.3 Zero 'Width' textbox

    [Tags]    Feature Testing
    Create rack
    Input name in rack form  ${NAME}43.3
    Input height in rack form  20
    Input length in rack form  20
    Input width in rack form  0
    Select physical status in rack form  Planned
    Capture Page Screenshot  TС 43.3(1).png
    Save rack
    Capture Page Screenshot  TС 43.3(2).png
    Check for error after invalid rack width  Rack's width should be more than 0.

TC 43.4 Negative 'Width' textbox

    [Tags]    Feature Testing
    Create rack
    Input name in rack form  ${NAME}43.4
    Input height in rack form  20
    Input length in rack form  20
    Input width in rack form  -20
    Select physical status in rack form  Planned
    Capture Page Screenshot  TС 43.4(1).png
    Save rack
    Capture Page Screenshot  TС 43.4(2).png
    Check for error after invalid rack width  Rack's width should be more than 0.

TC 44.1 Text 'Length' textbox

    [Tags]    Feature Testing
    Create rack
    Input name in rack form  ${NAME}44.1
    Input height in rack form  20
    Input length in rack form  text
    Input width in rack form  20
    Select physical status in rack form  Planned
    Capture Page Screenshot  TС 44.1(1).png
    Save rack
    Capture Page Screenshot  TС 44.1(2).png
    Check for error after invalid rack length  Not a number.

TC 44.2 Empty 'Length' textbox

    [Tags]    Feature Testing
    Create rack
    Input name in rack form  ${NAME}44.2
    Input height in rack form  20
    Input width in rack form  20
    Select physical status in rack form  Planned
    Capture Page Screenshot  TС 44.2(1).png
    Save rack
    Capture Page Screenshot  TС 44.2(2).png
    Check for error after invalid rack length  Rack's length should be more than 0.

TC 44.3 Zero 'Length' textbox

    [Tags]    Feature Testing
    Create rack
    Input name in rack form  ${NAME}44.3
    Input height in rack form  20
    Input length in rack form  0
    Input width in rack form  20
    Select physical status in rack form  Planned
    Capture Page Screenshot  TС 44.3(1).png
    Save rack
    Capture Page Screenshot  TС 44.3(2).png
    Check for error after invalid rack length  Rack's length should be more than 0.

TC 44.4 Negative 'Length' textbox

    [Tags]    Feature Testing
    Create rack
    Input name in rack form  ${NAME}44.4
    Input height in rack form  20
    Input length in rack form  -20
    Input width in rack form  20
    Select physical status in rack form  Planned
    Capture Page Screenshot  TС 44.4(1).png
    Save rack
    Capture Page Screenshot  TС 44.4(2).png
    Check for error after invalid rack length  Rack's length should be more than 0.

TC 45.1 Text 'Height' textbox

    [Tags]    Feature Testing
    Create rack
    Input name in rack form  ${NAME}45.1
    Input height in rack form  text
    Input length in rack form  20
    Input width in rack form  20
    Select physical status in rack form  Planned
    Capture Page Screenshot  TС 45.1(1).png
    Save rack
    Capture Page Screenshot  TС 45.1(2).png
    Check for error after invalid rack height  Not a number.

TC 45.2 Empty 'Height' textbox

    [Tags]    Feature Testing
    Create rack
    Input name in rack form  ${NAME}45.2
    Input length in rack form  20
    Input width in rack form  20
    Select physical status in rack form  Planned
    Capture Page Screenshot  TС 45.2(1).png
    Save rack
    Capture Page Screenshot  TС 45.2(2).png
    Check for error after invalid rack height  Rack's height should be more than 0.

TC 45.3 Zero 'Height' textbox

    [Tags]    Feature Testing
    Create rack
    Input name in rack form  ${NAME}45.3
    Input height in rack form  0
    Input length in rack form  20
    Input width in rack form  20
    Select physical status in rack form  Planned
    Capture Page Screenshot  TС 45.3(1).png
    Save rack
    Capture Page Screenshot  TС 45.3(2).png
    Check for error after invalid rack height  Rack's height should be more than 0.

TC 45.4 Negative 'Height' textbox

    [Tags]    Feature Testing
    Create rack
    Input name in rack form  ${NAME}45.4
    Input height in rack form  -20
    Input length in rack form  20
    Input width in rack form  20
    Select physical status in rack form  Planned
    Capture Page Screenshot  TС 45.4(1).png
    Save rack
    Capture Page Screenshot  TС 45.4(2).png
    Check for error after invalid rack height  Rack's height should be more than 0.

TC 46.1 'Planned' drop-down list 'Physical Status'

    [Tags]    Feature Testing
    Create rack
    Input name in rack form  ${NAME}46.1
    Input height in rack form  20
    Input length in rack form  20
    Input width in rack form  20
    Select physical status in rack form  Planned
    Capture Page Screenshot  TС 46.1(1).png
    Save rack
    Capture Page Screenshot  TС 46.1(2).png
    Title Should Be  ${NAME}46.1

TC 46.2 'In Service' drop-down list 'Physical Status'

    [Tags]    Feature Testing
    Create rack
    Input name in rack form  ${NAME}46.2
    Input height in rack form  20
    Input length in rack form  20
    Input width in rack form  20
    Select physical status in rack form  In Service
    Capture Page Screenshot  TС 46.2(1).png
    Save rack
    Capture Page Screenshot  TС 46.2(2).png
    Title Should Be  ${NAME}46.2

TC 46.3 'Unistalled' drop-down list 'Physical Status'

    [Tags]    Feature Testing
    Create rack
    Input name in rack form  ${NAME}46.3
    Input height in rack form  20
    Input length in rack form  20
    Input width in rack form  20
    Select physical status in rack form  Unistalled
    Capture Page Screenshot  TС 46.3(1).png
    Save rack
    Capture Page Screenshot  TС 46.3(2).png
    Title Should Be  ${NAME}46.3

TC 47.1 Edit rack

    [Tags]    Feature Testing
    Click second rack
    Click parameters rack
    Sleep  2s
    Edit rack
    Input name in rack form  ${NAME}341
    Capture Page Screenshot  TС 47.1(1).png
    Save rack
    Capture Page Screenshot  TС 47.1(2).png
    Title Should Be  ${NAME}341

TC 48.1 Delete 1 rack

    [Tags]    Feature Testing
    Select second rack
    Capture Page Screenshot  TС 48.1(1).png
    Delete rack
    Capture Page Screenshot  TС 48.1(2).png


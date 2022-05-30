*** Settings ***
Library          Selenium2Library
Library          src.keywords.KeywordsPostTerminal
Resource         src/test/robotframework/acceptance/SetUpAndTearDown.robot

Test Setup      Set Up Post Terminal
Test Teardown   Teardown Action

*** Variables ***
${URL} =    https://inventory.edu-netcracker.com/login.jsp
${BROWSER}=     chrome
${NAME}=    POSTerminal441

*** Test Cases ***

TC 49.1 Creation new POS Terminal

    [Tags]  Feature Testing
    Sleep  2s
    Create Post Terminal
    Input name in Post Terminal form  ${NAME}
    Input height in Post Terminal form  20
    Input length in Post Terminal form  20
    Input width in Post Terminal form  20
    Select physical status in Post Terminal form  Planned
    Select location in Post Terminal form
    Sleep  1s
    Capture Page Screenshot  TС 49.1(1).png
    Save Post Terminal
    Capture Page Screenshot  TС 49.1(2).png
    Title Should Be  ${NAME}

TC 50.1 Empty 'Name' textbox

    [Tags]  Feature Testing
    Sleep  2s
    Create Post Terminal
    Input height in Post Terminal form  20
    Input length in Post Terminal form  20
    Input width in Post Terminal form  20
    Select physical status in Post Terminal form  Planned
    Select location in Post Terminal form
    Sleep  1s
    Capture Page Screenshot  TС 50.1(1).png
    Save Post Terminal
    Capture Page Screenshot  TС 50.1(2).png
    Check for error after invalid Post Terminal name  'Name' should be not empty.

TC 50.2 Repeat 'Name' textbox

    [Tags]  Feature Testing
    Sleep  2s
    Create Post Terminal
    Input name in Post Terminal form  ${NAME}
    Input height in Post Terminal form  20
    Input length in Post Terminal form  20
    Input width in Post Terminal form  20
    Select physical status in Post Terminal form  Planned
    Select location in Post Terminal form
    Sleep  1s
    Capture Page Screenshot  TС 50.2(1).png
    Save Post Terminal
    Capture Page Screenshot  TС 50.2(2).png
    Check for error after invalid Post Terminal name  POS Terminal with such name already exists.

TC 51.1 Text 'Width' textbox

    [Tags]    Feature Testing
    Sleep  2s
    Create Post Terminal
    Input name in Post Terminal form  ${NAME}51.1
    Input height in Post Terminal form  20
    Input length in Post Terminal form  20
    Input width in Post Terminal form  text
    Select physical status in Post Terminal form  Planned
    Select location in Post Terminal form
    Capture Page Screenshot  TС 51.1(1).png
    Save Post Terminal
    Capture Page Screenshot  TС 51.1(2).png
    Check for error after invalid Post Terminal width  Not a number.


TC 51.2 Zero 'Width' textbox

    [Tags]    Feature Testing
    Sleep  2s
    Create Post Terminal
    Input name in Post Terminal form  ${NAME}51.2
    Input height in Post Terminal form  20
    Input length in Post Terminal form  20
    Input width in Post Terminal form  0
    Select physical status in Post Terminal form  Planned
    Select location in Post Terminal form
    Capture Page Screenshot  TС 51.2(1).png
    Save Post Terminal
    Capture Page Screenshot  TС 51.2(2).png
    Check for error after invalid Post Terminal width  POS Terminal's width should be more than 0.

TC 51.3 Negative 'Width' textbox

    [Tags]    Feature Testing
    Create Post Terminal
    Input name in Post Terminal form  ${NAME}51.3
    Input height in Post Terminal form  20
    Input length in Post Terminal form  20
    Input width in Post Terminal form  -20
    Select physical status in Post Terminal form  Planned
    Select location in Post Terminal form
    Capture Page Screenshot  TС 51.3(1).png
    Save Post Terminal
    Capture Page Screenshot  TС 51.3(2).png
    Check for error after invalid Post Terminal width  POS Terminal's width should be more than 0.

TC 52.1 Text 'Height' textbox

    [Tags]    Feature Testing
    Sleep  2s
    Create Post Terminal
    Input name in Post Terminal form  ${NAME}52.1
    Input height in Post Terminal form  text
    Input length in Post Terminal form  20
    Input width in Post Terminal form  20
    Select physical status in Post Terminal form  Planned
    Select location in Post Terminal form
    Capture Page Screenshot  TС 52.1(1).png
    Save Post Terminal
    Capture Page Screenshot  TС 52.1(2).png
    Check for error after invalid Post Terminal height  Not a number.

TC 52.2 Zero 'Height' textbox

    [Tags]    Feature Testing
    Sleep  2s
    Create Post Terminal
    Input name in Post Terminal form  ${NAME}52.2
    Input height in Post Terminal form  0
    Input length in Post Terminal form  20
    Input width in Post Terminal form  20
    Select physical status in Post Terminal form  Planned
    Select location in Post Terminal form
    Capture Page Screenshot  TС 52.2(1).png
    Save Post Terminal
    Capture Page Screenshot  TС 52.2(2).png
    Check for error after invalid Post Terminal height  POS Terminal's height should be more than 0.

TC 52.3 Negative 'Height' textbox

    [Tags]    Feature Testing
    Sleep  2s
    Create Post Terminal
    Input name in Post Terminal form  ${NAME}52.3
    Input height in Post Terminal form  -20
    Input length in Post Terminal form  20
    Input width in Post Terminal form  20
    Select physical status in Post Terminal form  Planned
    Select location in Post Terminal form
    Capture Page Screenshot  TС 52.3(1).png
    Save Post Terminal
    Capture Page Screenshot  TС 52.3(2).png
    Check for error after invalid Post Terminal height  POS Terminal's height should be more than 0.


TC 53.1 Text 'Lenght' textbox

    [Tags]    Feature Testing
    Sleep  2s
    Create Post Terminal
    Input name in Post Terminal form  ${NAME}53.1
    Input height in Post Terminal form  20
    Input length in Post Terminal form  text
    Input width in Post Terminal form  20
    Select physical status in Post Terminal form  Planned
    Select location in Post Terminal form
    Capture Page Screenshot  TС 53.1(1).png
    Save Post Terminal
    Capture Page Screenshot  TС 53.1(2).png
    Check for error after invalid Post Terminal length  Not a number.

TC 53.2 Zero 'Lenght' textbox

    [Tags]    Feature Testing
    Sleep  2s
    Create Post Terminal
    Input name in Post Terminal form  ${NAME}53.2
    Input height in Post Terminal form  20
    Input length in Post Terminal form  0
    Input width in Post Terminal form  20
    Select physical status in Post Terminal form  Planned
    Select location in Post Terminal form
    Capture Page Screenshot  TС 53.2(1).png
    Save Post Terminal
    Capture Page Screenshot  TС 53.2(2).png
    Check for error after invalid Post Terminal length  POS Terminal's length should be more than 0.

TC 53.3 Negative 'Lenght' textbox

    [Tags]    Feature Testing
    Sleep  2s
    Create Post Terminal
    Input name in Post Terminal form  ${NAME}53.3
    Input height in Post Terminal form  20
    Input length in Post Terminal form  -20
    Input width in Post Terminal form  20
    Select physical status in Post Terminal form  Planned
    Select location in Post Terminal form
    Capture Page Screenshot  TС 53.3(1).png
    Save Post Terminal
    Capture Page Screenshot  TС 53.3(2).png
    Check for error after invalid Post Terminal length  POS Terminal's length should be more than 0.

TC 54.1 Planned' drop-down list 'Physical Status'

    [Tags]  Feature Testing
    Sleep  2s
    Create Post Terminal
    Input name in Post Terminal form  ${NAME}54.1
    Input height in Post Terminal form  20
    Input length in Post Terminal form  20
    Input width in Post Terminal form  20
    Select physical status in Post Terminal form  Planned
    Select location in Post Terminal form
    Sleep  1s
    Capture Page Screenshot  TС 54.1(1).png
    Save Post Terminal
    Capture Page Screenshot  TС 54.1(2).png
    Title Should Be  ${NAME}54.1

TC 54.2 In Service' drop-down list 'Physical Status'

    [Tags]  Feature Testing
    Sleep  2s
    Create Post Terminal
    Input name in Post Terminal form  ${NAME}54.2
    Input height in Post Terminal form  20
    Input length in Post Terminal form  20
    Input width in Post Terminal form  20
    Select physical status in Post Terminal form  In Service
    Select location in Post Terminal form
    Sleep  1s
    Capture Page Screenshot  TС 54.2(1).png
    Save Post Terminal
    Capture Page Screenshot  TС 54.2(2).png
    Title Should Be  ${NAME}54.2

TC 54.3 Unistalled' drop-down list 'Physical Status'

    [Tags]  Feature Testing
    Sleep  2s
    Create Post Terminal
    Input name in Post Terminal form  ${NAME}54.3
    Input height in Post Terminal form  20
    Input length in Post Terminal form  20
    Input width in Post Terminal form  20
    Select physical status in Post Terminal form  Unistalled
    Select location in Post Terminal form
    Sleep  1s
    Capture Page Screenshot  TС 54.3(1).png
    Save Post Terminal
    Capture Page Screenshot  TС 54.3(2).png
    Title Should Be  ${NAME}54.3

TC 54.4 Empty drop-down list 'Physical Status'

    [Tags]  Feature Testing
    Sleep  2s
    Create Post Terminal
    Input name in Post Terminal form  ${NAME}55.1
    Input height in Post Terminal form  20
    Input length in Post Terminal form  20
    Input width in Post Terminal form  20
    Select location in Post Terminal form
    Sleep  1s
    Capture Page Screenshot  TС 54.4(1).png
    Save Post Terminal
    Capture Page Screenshot  TС 54.4(2).png
    Check for error after invalid Post Terminal physical status  can't be empty

TC 55.1 Empty 'Located in'

    [Tags]  Feature Testing
    Sleep  2s
    Create Post Terminal
    Input name in Post Terminal form  ${NAME}55.1
    Input height in Post Terminal form  20
    Input length in Post Terminal form  20
    Input width in Post Terminal form  20
    Select physical status in Post Terminal form  Planned
    Sleep  1s
    Capture Page Screenshot  TС 55.1(1).png
    Save Post Terminal
    Capture Page Screenshot  TС 55.1(2).png
    Check for error after invalid Post Terminal location  can't be empty

TC 56.1 Edit POS Terminal

    [Tags]    Feature Testing
    Click second Post Terminal
    Click parameters Post Terminal
    Sleep  2s
    Edit Post Terminal
    Input name in Post Terminal form  ${NAME}56.1
    Capture Page Screenshot  TС 56.1(1).png
    Save Post Terminal
    Capture Page Screenshot  TС 56.1(2).png
    Title Should Be  ${NAME}56.1

TC 57.1 Delete 1 POS Terminal 

    [Tags]    Feature Testing
    Select second Post Terminal
    Capture Page Screenshot  TС 57.1(1).png
    Delete post terminal
    Capture Page Screenshot  TС 57.1(2).png

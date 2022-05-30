*** Settings ***
Library           Selenium2Library
Library           src.keywords.KeywordsDevice
Resource          src/test/robotframework/acceptance/SetUpAndTearDown.robot

Test Setup        Set Up Device
Test Teardown     Teardown Action

*** Variables ***
${URL} =  https://inventory.edu-netcracker.com/login.jsp
${BROWSER}=  chrome
${NAME}=  device1729

*** Test Cases ***

TC 71.1 Creation new Device

    [Tags]    Feature Testing
    Create device
    Input name in device form  ${NAME}
    Input ip address in device form  77.238.135.10
    Input mac address in device form  00:00:5e:00:53:af
    Input cpu in device form  intel
    Input ram in device form  32
    Input height in device form  10
    Input length in device form  10
    Input width in device form  10
    Select location in device form
    Select physical status in device form  Planned
    Select network element in device form
    Capture Page Screenshot  TС 71.1(1).png
    Save device
    Capture Page Screenshot  TС 71.2(2).png
    Title Should Be  ${NAME}

TC 72.1 Empty 'Name' textbox

    [Tags]    Feature Testing
    Create device
    Input ip address in device form  77.238.135.10
    Input mac address in device form  00:00:5e:00:53:af
    Input cpu in device form  intel
    Input ram in device form  32
    Input height in device form  10
    Input length in device form  10
    Input width in device form  10
    Select location in device form
    Select physical status in device form  Planned
    Select network element in device form
    Capture Page Screenshot  TС 72.1(1).png
    Save device
    Capture Page Screenshot  TС 72.1(2).png
    Check for error after invalid device name  'Name' should be not empty.

TC 72.2 Repeat 'Name' textbox

    [Tags]    Feature Testing
    Create device
    Input name in device form  ${NAME}
    Input ip address in device form  77.238.135.10
    Input mac address in device form  00:00:5e:00:53:af
    Input cpu in device form  intel
    Input ram in device form  32
    Input height in device form  10
    Input length in device form  10
    Input width in device form  10
    Select location in device form
    Select physical status in device form  Planned
    Select network element in device form
    Capture Page Screenshot  TС 72.2(1).png
    Save device
    Capture Page Screenshot  TС 72.2(2).png
    Check for error after invalid device name  Device with such name already exists.

TC 73.1 Invalid 'MAC Address' textbox

    [Tags]    Feature Testing
    Create device
    Input name in device form  ${NAME}73.1
    Input ip address in device form  77.238.135.10
    Input mac address in device form  invalid
    Input cpu in device form  intel
    Input ram in device form  32
    Input height in device form  10
    Input length in device form  10
    Input width in device form  10
    Select location in device form
    Select physical status in device form  Planned
    Select network element in device form
    Capture Page Screenshot  TС 73.1(1).png
    Save device
    Capture Page Screenshot  TС 73.1(2).png
    Check for error after invalid device mac address  The standard (IEEE 802) format for printing MAC-48 addresses in human-friendly form is six groups of two hexadecimal digits, separated by hyphens - or colons :


TC 74.1 Text 'RAM(Gb)' textbox

    [Tags]    Feature Testing
    Create device
    Input name in device form  ${NAME}74.1
    Input ip address in device form  77.238.135.10
    Input mac address in device form  00:00:5e:00:53:af
    Input cpu in device form  intel
    Input ram in device form  text
    Input height in device form  10
    Input length in device form  10
    Input width in device form  10
    Select location in device form
    Select physical status in device form  Planned
    Select network element in device form
    Capture Page Screenshot  TС 74.1(1).png
    Save device
    Capture Page Screenshot  TС 74.1(2).png
    Check for error after invalid device Ram  Not a number.

TC 74.2 Zero 'RAM(Gb)' textbox

    [Tags]    Feature Testing
    Create device
    Input name in device form  ${NAME}74.2
    Input ip address in device form  77.238.135.10
    Input mac address in device form  00:00:5e:00:53:af
    Input cpu in device form  intel
    Input ram in device form  0
    Input height in device form  10
    Input length in device form  10
    Input width in device form  10
    Select location in device form
    Select physical status in device form  Planned
    Select network element in device form
    Capture Page Screenshot  TС 74.2(1).png
    Save device
    Capture Page Screenshot  TС 74.2(2).png
    Check for error after invalid device Ram  Device's ram should be more than 0.

TC 74.3 Negative 'RAM(Gb)' textbox

    [Tags]    Feature Testing
    Create device
    Input name in device form  ${NAME}74.3
    Input ip address in device form  77.238.135.10
    Input mac address in device form  00:00:5e:00:53:af
    Input cpu in device form  intel
    Input ram in device form  -10
    Input height in device form  10
    Input length in device form  10
    Input width in device form  10
    Select location in device form
    Select physical status in device form  Planned
    Select network element in device form
    Capture Page Screenshot  TС 74.3(1).png
    Save device
    Capture Page Screenshot  TС 74.3(2).png
    Check for error after invalid device Ram  Device's ram should be more than 0.


TC 75.1 Invalid 'IP Address' textbox

    [Tags]    Feature Testing
    Create device
    Input name in device form  ${NAME}75.1
    Input ip address in device form  text
    Input mac address in device form  00:00:5e:00:53:af
    Input cpu in device form  intel
    Input ram in device form  32
    Input height in device form  10
    Input length in device form  10
    Input width in device form  10
    Select location in device form
    Select physical status in device form  Planned
    Select network element in device form
    Capture Page Screenshot  TС 75.1(1).png
    Save device
    Capture Page Screenshot  TС 75.1(2).png
    Check for error after invalid device Ip address  IP Address is incorrect.

TC 76.1 Planned' drop-down list 'Physical Status'

    [Tags]    Feature Testing
    Create device
    Input name in device form  ${NAME}76.1
    Input ip address in device form  77.238.135.10
    Input mac address in device form  00:00:5e:00:53:af
    Input cpu in device form  intel
    Input ram in device form  32
    Input height in device form  10
    Input length in device form  10
    Input width in device form  10
    Select location in device form
    Select physical status in device form  Planned
    Select network element in device form
    Capture Page Screenshot  TС 76.1(1).png
    Save device
    Capture Page Screenshot  TС 76.1(2).png
    Title Should Be  ${NAME}76.1

TC 76.2 In Service' drop-down list 'Physical Status'

    [Tags]    Feature Testing
    Create device
    Input name in device form  ${NAME}76.2
    Input ip address in device form  77.238.135.10
    Input mac address in device form  00:00:5e:00:53:af
    Input cpu in device form  intel
    Input ram in device form  32
    Input height in device form  10
    Input length in device form  10
    Input width in device form  10
    Select location in device form
    Select physical status in device form  In Service
    Select network element in device form
    Capture Page Screenshot  TС 76.2(1).png
    Save device
    Capture Page Screenshot  TС 76.2(2).png
    Title Should Be  ${NAME}76.2

TC 76.3 Unistalled' drop-down list 'Physical Status'

    [Tags]    Feature Testing
    Create device
    Input name in device form  ${NAME}76.3
    Input ip address in device form  77.238.135.10
    Input mac address in device form  00:00:5e:00:53:af
    Input cpu in device form  intel
    Input ram in device form  32
    Input height in device form  10
    Input length in device form  10
    Input width in device form  10
    Select location in device form
    Select physical status in device form  Unistalled
    Select network element in device form
    Capture Page Screenshot  TС 76.3(1).png
    Save device
    Capture Page Screenshot  TС 76.3(2).png
    Title Should Be  ${NAME}76.3

TC 77.1 Text 'Width' textbox

    [Tags]    Feature Testing
    Create device
    Input name in device form  ${NAME}77.1
    Input ip address in device form  77.238.135.10
    Input mac address in device form  00:00:5e:00:53:af
    Input cpu in device form  intel
    Input ram in device form  32
    Input height in device form  10
    Input length in device form  10
    Input width in device form  text
    Select location in device form
    Select physical status in device form  Planned
    Select network element in device form
    Capture Page Screenshot  TС 77.1(1).png
    Save device
    Capture Page Screenshot  TС 77.1(2).png
    Check for error after invalid device width  Not a number.

TC 77.2 Zero 'Width' textbox

    [Tags]    Feature Testing
    Create device
    Input name in device form  ${NAME}77.2
    Input ip address in device form  77.238.135.10
    Input mac address in device form  00:00:5e:00:53:af
    Input cpu in device form  intel
    Input ram in device form  32
    Input height in device form  10
    Input length in device form  10
    Input width in device form  0
    Select location in device form
    Select physical status in device form  Planned
    Select network element in device form
    Capture Page Screenshot  TС 77.2(1).png
    Save device
    Capture Page Screenshot  TС 77.2(2).png
    Check for error after invalid device width  Device's width should be more than 0.

TC 77.3 Negative 'Width' textbox

    [Tags]    Feature Testing
    Create device
    Input name in device form  ${NAME}77.3
    Input ip address in device form  77.238.135.10
    Input mac address in device form  00:00:5e:00:53:af
    Input cpu in device form  intel
    Input ram in device form  32
    Input height in device form  10
    Input length in device form  10
    Input width in device form  -10
    Select location in device form
    Select physical status in device form  Planned
    Select network element in device form
    Capture Page Screenshot  TС 77.3(1).png
    Save device
    Capture Page Screenshot  TС 77.3(2).png
    Check for error after invalid device width  Device's width should be more than 0.

TC 78.1 Text 'Length' textbox

    [Tags]    Feature Testing
    Create device
    Input name in device form  ${NAME}78.1
    Input ip address in device form  77.238.135.10
    Input mac address in device form  00:00:5e:00:53:af
    Input cpu in device form  intel
    Input ram in device form  32
    Input height in device form  10
    Input length in device form  text
    Input width in device form  10
    Select location in device form
    Select physical status in device form  Planned
    Select network element in device form
    Capture Page Screenshot  TС 78.1(1).png
    Save device
    Capture Page Screenshot  TС 78.1(2).png
    Check for error after invalid device length  Not a number.

TC 78.2 Zero 'Length' textbox

    [Tags]    Feature Testing
    Create device
    Input name in device form  ${NAME}78.2
    Input ip address in device form  77.238.135.10
    Input mac address in device form  00:00:5e:00:53:af
    Input cpu in device form  intel
    Input ram in device form  32
    Input height in device form  10
    Input length in device form  0
    Input width in device form  10
    Select location in device form
    Select physical status in device form  Planned
    Select network element in device form
    Capture Page Screenshot  TС 78.2(1).png
    Save device
    Capture Page Screenshot  TС 78.2(2).png
    Check for error after invalid device length  Device's length should be more than 0.

TC 78.3 Negative 'Length' textbox

    [Tags]    Feature Testing
    Create device
    Input name in device form  ${NAME}78.3
    Input ip address in device form  77.238.135.10
    Input mac address in device form  00:00:5e:00:53:af
    Input cpu in device form  intel
    Input ram in device form  32
    Input height in device form  10
    Input length in device form  -10
    Input width in device form  10
    Select location in device form
    Select physical status in device form  Planned
    Select network element in device form
    Capture Page Screenshot  TС 78.3(1).png
    Save device
    Capture Page Screenshot  TС 78.3(2).png
    Check for error after invalid device length  Device's length should be more than 0.

TC 79.1 Text 'Height' textbox

    [Tags]    Feature Testing
    Create device
    Input name in device form  ${NAME}79.1
    Input ip address in device form  77.238.135.10
    Input mac address in device form  00:00:5e:00:53:af
    Input cpu in device form  intel
    Input ram in device form  32
    Input height in device form  text
    Input length in device form  10
    Input width in device form  10
    Select location in device form
    Select physical status in device form  Planned
    Select network element in device form
    Capture Page Screenshot  TС 79.1(1).png
    Save device
    Capture Page Screenshot  TС 79.1(2).png
    Check for error after invalid device height  Not a number.

TC 79.2 Zero 'Height' textbox

    [Tags]    Feature Testing
    Create device
    Input name in device form  ${NAME}79.2
    Input ip address in device form  77.238.135.10
    Input mac address in device form  00:00:5e:00:53:af
    Input cpu in device form  intel
    Input ram in device form  32
    Input height in device form  0
    Input length in device form  10
    Input width in device form  10
    Select location in device form
    Select physical status in device form  Planned
    Select network element in device form
    Capture Page Screenshot  TС 79.2(1).png
    Save device
    Capture Page Screenshot  TС 79.2(2).png
    Check for error after invalid device height  Device's height should be more than 0.

TC 79.3 Negative 'Height' textbox

    [Tags]    Feature Testing
    Create device
    Input name in device form  ${NAME}79.3
    Input ip address in device form  77.238.135.10
    Input mac address in device form  00:00:5e:00:53:af
    Input cpu in device form  intel
    Input ram in device form  32
    Input height in device form  -10
    Input length in device form  10
    Input width in device form  10
    Select location in device form
    Select physical status in device form  Planned
    Select network element in device form
    Capture Page Screenshot  TС 79.3(1).png
    Save device
    Capture Page Screenshot  TС 79.3(2).png
    Check for error after invalid device height  Device's height should be more than 0.

TC 80.1 Empty 'Located in'

    [Tags]    Feature Testing
    Create device
    Input name in device form  ${NAME}80.1
    Input ip address in device form  77.238.135.10
    Input mac address in device form  00:00:5e:00:53:af
    Input cpu in device form  intel
    Input ram in device form  32
    Input height in device form  10
    Input length in device form  10
    Input width in device form  10
    Select physical status in device form  Planned
    Select network element in device form
    Capture Page Screenshot  TС 80.1(1).png
    Save device
    Capture Page Screenshot  TС 80.1(2).png
    Check for error after invalid device location  can't be empty

TC 80.2 Empty 'Network Element'

    [Tags]    Feature Testing
    Create device
    Input name in device form  ${NAME}80.2
    Input ip address in device form  77.238.135.10
    Input mac address in device form  00:00:5e:00:53:af
    Input cpu in device form  intel
    Input ram in device form  32
    Input height in device form  10
    Input length in device form  10
    Input width in device form  10
    Select location in device form
    Select physical status in device form  Planned
    Capture Page Screenshot  TС 80.2(1).png
    Save device
    Capture Page Screenshot  TС 80.2(2).png
    Check for error after invalid device network element  can't be empty

TC 81.1 Edit Device

    [Tags]    Feature Testing
    Click second device
    Click parameters device
    Sleep  2s
    Edit device
    Input name in device form  ${NAME}81.1
    Capture Page Screenshot  TС 81.1(1).png
    Save device
    Capture Page Screenshot  TС 81.1(2).png
    Title Should Be  ${NAME}81.1

TC 82.1 Delete 1 Device

    [Tags]    Feature Testing
    Select second device
    Capture Page Screenshot  TС 82.1(1).png
    Delete device
    Capture Page Screenshot  TС 82.1(2).png




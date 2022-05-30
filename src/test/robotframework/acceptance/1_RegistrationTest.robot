*** Settings ***
Library           Selenium2Library
Library           src.keywords.KeywordsRegistration

Test Setup        Set up
Test Teardown     Tear Down

*** Variables ***
${URL} =  https://inventory.edu-netcracker.com/pages/registration.xhtml
${BROWSER}=  chrome
${NAME}=  diana016220

*** Test Cases ***


TС 1.1 Valid registration with admin role

    [Tags]    Feature Testing
    I am at the registration form   ${URL}
    Input username in registration form     ${NAME}
    Input password in registration form    1q2w3e4r5tD!
    Input confirm in registration form    1q2w3e4r5tD!
    Input email in registration form    diana@mail.ru
    Select role in registration form    Admin
    Click register button
    Check for message of success registration    You have successfully registered\nUse your credentials to login

TС 1.2 Valid registration with Read Only role

    [Tags]    Feature Testing
    I am at the registration form   ${URL}
    Input username in registration form     ${NAME}15
    Input password in registration form     1q2w3e4r5tD!
    Input confirm in registration form     1q2w3e4r5tD!
    Input email in registration form    diana@mail.ru
    Select role in registration form    RO
    Click register button
    Check for message of success registration    You have successfully registered\nUse your credentials to login

TС 1.3 Valid registration with Read / Write role

    [Tags]    Feature Testing
    I am at the registration form   ${URL}
    Input username in registration form     ${NAME}15
    Input password in registration form     1q2w3e4r5tD!
    Input confirm in registration form    1q2w3e4r5tD!
    Input email in registration form    diana@mail.ru
    Select role in registration form    RW
    Click register button
    Check for message of success registration    You have successfully registered\nUse your credentials to login

TС 2.1 Valid username

    [Tags]    Feature Testing
    I am at the registration form   ${URL}
    Input username in registration form     ${NAME}15
    Input password in registration form     1q2w3e4r5tD!
    Input confirm in registration form    1q2w3e4r5tD!
    Input email in registration form    diana@mail.ru
    Select role in registration form    Admin
    Click register button
    Check for message of success registration    You have successfully registered\nUse your credentials to login

TС 2.2 Repeat registration

    [Tags]    Feature Testing
    I am at the registration form   ${URL}
    Input non uniq username in registration form    chibisovad
    Input password in registration form     1q2w3e4r5tD!
    Input confirm in registration form    1q2w3e4r5tD!
    Input email in registration form    diana@mail.ru
    Select role in registration form    Admin
    Click register button
    Check for error after invalid username    User with such login already exists.

TС 2.3 Invalid username less symbols

    [Tags]    Feature Testing
    I am at the registration form   ${URL}
    Input non uniq username in registration form      dia5
    Input password in registration form     1q2w3e4r5tD!
    Input confirm in registration form    1q2w3e4r5tD!
    Input email in registration form    diana@mail.ru
    Select role in registration form    Admin
    Click register button
    Check for error after invalid username    Login must be alphanumeric string with length => 6 and <= 50.

TС 2.4 Invalid username more symbols

    [Tags]    Feature Testing
    I am at the registration form   ${URL}
    Input username in registration form     ${NAME}151111111111111111111111111111111111111111111111111111111111111111111
    Input password in registration form     1q2w3e4r5tD!
    Input confirm in registration form    1q2w3e4r5tD!
    Input email in registration form    diana@mail.ru
    Select role in registration form    Admin
    Click register button
    Check for error after invalid username    Login must be alphanumeric string with length => 6 and <= 50.

TС 2.5 Invalid username with non-alphanumeric symbol

    [Tags]    Feature Testing
    I am at the registration form   ${URL}
    Input username in registration form     ${NAME}15+
    Input password in registration form     1q2w3e4r5tD!
    Input confirm in registration form    1q2w3e4r5tD!
    Input email in registration form    diana@mail.ru
    Select role in registration form    Admin
    Click register button
    Check for error after invalid username    Login must be alphanumeric string with length => 6 and <= 50.

TС 2.6 Empty username

    [Tags]    Feature Testing
    I am at the registration form   ${URL}
    Input password in registration form     1q2w3e4r5tD!
    Input confirm in registration form    1q2w3e4r5tD!
    Input email in registration form    diana@mail.ru
    Select role in registration form    Admin
    Click register button
    Check for error after invalid username    Login must not be empty.

TС 3.1 Invalid password less length

    [Tags]    Feature Testing
    I am at the registration form   ${URL}
    Input password in registration form     1qD!
    Input username in registration form     ${NAME}3.1
    Select role in registration form    Admin
    Input email in registration form    diana@mail.ru
    Click register button
    Check for error after invalid password    Password length must me >= 8 and <= 50.


TС 3.2 Invalid password more length

    [Tags]    Feature Testing
    I am at the registration form   ${URL}
    Input password in registration form      1q2w3e4r5tD!qqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqq
    Input username in registration form     ${NAME}3.2
    Select role in registration form    Admin
    Input email in registration form    diana@mail.ru
    Click register button
    Check for error after invalid password    Password length must me >= 8 and <= 50.


TС 3.3 Invalid password no number

    [Tags]    Feature Testing
    I am at the registration form   ${URL}
    Input password in registration form      qwertyD!!
    Input username in registration form     ${NAME}3.3
    Select role in registration form    Admin
    Input email in registration form    diana@mail.ru
    Click register button
    Check for error after invalid password    At least one digit must be in password

TС 3.4 Invalid password no upper symbol

    [Tags]    Feature Testing
    I am at the registration form   ${URL}
    Input password in registration form      1q2w3e4r5t!
    Input username in registration form     ${NAME}3.4
    Select role in registration form    Admin
    Input email in registration form    diana@mail.ru
    Click register button
    Check for error after invalid password    At least one upper letter must be in password

TС 3.5 Invalid password no non-alphanumeric symbols

    [Tags]    Feature Testing
    I am at the registration form   ${URL}
    Input password in registration form     1q2w3e4r5tD
    Input username in registration form     ${NAME}3.5
    Select role in registration form    Admin
    Input email in registration form    diana@mail.ru
    Click register button
    Check for error after invalid password    At least one non alpha numeric symbol must be in password

TС 3.6 Empty password

    [Tags]    Feature Testing
    I am at the registration form   ${URL}
    Input username in registration form     ${NAME}3.6
    Select role in registration form    Admin
    Input email in registration form    diana@mail.ru
    Click register button
    Check for error after invalid password    Please enter password.

TС 4.1 Invalid e-mail no '@'

    [Tags]    Feature Testing
    I am at the registration form   ${URL}
    Input email in registration form    dianamail.ru
    Input username in registration form     ${NAME}4.1
    Select role in registration form    Admin
    Input password in registration form     1q2w3e4r5tD!
    Input confirm in registration form      1q2w3e4r5tD!
    Click register button
    Check for error after invalid email    Email address is incorrect.

TС 4.2 Invalid e-mail no @

    [Tags]    Feature Testing
    I am at the registration form   ${URL}
    Input email in registration form    diana@mailru
    Input username in registration form     ${NAME}4.2
    Select role in registration form    Admin
    Input password in registration form     1q2w3e4r5tD!
    Input confirm in registration form      1q2w3e4r5tD!
    Click register button
    Check for error after invalid email    Email address is incorrect.

TС 4.3 Empty e-mail

    [Tags]    Feature Testing
    I am at the registration form   ${URL}
    Input username in registration form     ${NAME}4.3
    Select role in registration form    Admin
    Input password in registration form     1q2w3e4r5tD!
    Input confirm in registration form      1q2w3e4r5tD!
    Click register button
    Check for error after invalid email    email field can't be empty

TС 5.1 Don't pick pole

    [Tags]    Feature Testing
    I am at the registration form   ${URL}
    Input username in registration form     ${NAME}15
    Input password in registration form     1q2w3e4r5tD!
    Input confirm in registration form    1q2w3e4r5tD!
    Input email in registration form    diana@mail.ru
    Click register button
    Check for message of success registration    You have successfully registered\nUse your credentials to login

TC 8.1 Empty confirm password

    [Tags]    Feature Testing
    I am at the registration form   ${URL}
    Input username in registration form     ${NAME}8.1
    Input password in registration form    1q2w3e4r5tD!
    Input email in registration form    diana@mail.ru
    Select role in registration form    Admin
    Click register button
    Check for error after invalid password    Password must match confirm password.

TC 8.2 Non-repeatable confirm password

    [Tags]    Feature Testing
    I am at the registration form   ${URL}
    Input username in registration form     ${NAME}8.2
    Input email in registration form    diana@mail.ru
    Select role in registration form    Admin
    Input password in registration form     1q2w3e4r5tD!
    Input confirm in registration form      1q2w3e4r5tD
    Click register button
    Check for error after invalid password    Password must match confirm password.











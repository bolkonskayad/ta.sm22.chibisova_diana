*** Settings ***
Library           src.keywords.KeywordsLogin
Library           src.keywords.KeywordsCountry
Library           src.keywords.KeywordsCity
Library           src.keywords.KeywordsBuilding
Library           src.keywords.KeywordsDevice
Library           src.keywords.KeywordsRoom
Library           src.keywords.KeywordsRack
Library           src.keywords.KeywordsPayBox
Library           src.keywords.KeywordsPostTerminal
Library           src.keywords.KeywordsFloor
Library           src.keywords.KeywordsATM

*** Keywords ***
Teardown Action
    Close All Browsers

Set Up Login
    Open Browser  ${URL}  ${BROWSER}
    I am at the login form

Set Up Country
    Open Browser  ${URL}  ${BROWSER}
    I am at the login form
    Input username in login form  chibisovad
    Input password in login form  chibisovaD2001!
    Click login button
    I am at the country form

Set Up City
    Set Up Country
    Click second country
    I am at the city form

Set Up Building
    Set Up City
    Click second city
    I am at the building form

Set Up Floor
    Set Up Building
    Click second building
    I am at the floor form

Set Up Room
    Set Up Floor
    Click second Floor
    I am at the room form

Set Up Rack
    Set Up Room
    Click second Room
    I am at the rack form

Set Up Device
    Set Up Building
    Click second building
    I am at the device form
    Sleep  2s

Set Up ATM
    Set Up Building
    Click second building
    I am at the ATM form
    Sleep  2s

Set Up Post Terminal
    Set Up Building
    Click second building
    I am at the Post Terminal form

Set Up Pay Box
    Set Up Building
    Click second building
    I am at the Pay Box form
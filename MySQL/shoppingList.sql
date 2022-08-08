CREATE DATABASE IF NOT EXISTS shoppingListApp;
USE shoppingListApp;

CREATE TABLE IF NOT EXISTS user(
    userID      int             PRIMARY KEY auto_increment,
    userName    varchar(50)  
);
CREATE TABLE IF NOT EXISTS item(
    itemID      int             PRIMARY KEY auto_increment,
    itemName    varchar(50)    
);

CREATE TABLE IF NOT EXISTS shoppingList(
    listID      int             PRIMARY KEY auto_increment,
    CONSTRAINT  FK_userID       FOREIGN KEY (userID) REFERENCES user(userID),
    listName    varchar(50),
    CONSTRAINT  FK_listName      FOREIGN KEY (itemName) REFERENCES item(itemName),
    quantity    int,
    checkbox    bool
);

show tables;

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
    CONSTRAINT  FK_itemName      FOREIGN KEY (itemName) REFERENCES item(itemName),
    quantity    int,
    checkbox    bool
);


-- #user
-- insert into user (userName) values ('Sufyaan Seedat');
-- insert into user (userName) values ('John Walker');

-- #item
-- insert into item (itemName) values ('Bread');

-- #shoppingList
-- insert into shoppingList (listName, quantity, checkbox) values ('Wednesday list', 2, True);
        
#select * FROM shoppingList;



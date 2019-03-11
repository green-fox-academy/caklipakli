CREATE DATABASE todo;

use todo;

CREATE TABLE todos (
	id INT auto_increment PRIMARY KEY NOT NULL,
    title VARCHAR(20) not null,
    urgent boolean,
    done boolean
    );
    
INSERT INTO todos VALUE (1, 'Sg to do', true, false);
INSERT INTO todos VALUE (2, 'Sg else to do', true, true);
INSERT INTO todos VALUE (3, 'Sg similar to do', false, false);

select * from todos;
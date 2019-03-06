CREATE DATABASE to_Do_App;
SET SQL_SAFE_UPDATES = 0;

CREATE TABLE tasks (
	idTask INT auto_increment PRIMARY KEY NOT NULL,
    task VARCHAR(20) not null,
    description VARCHAR(60)
    );
    
INSERT INTO tasks VALUE (null, 'Walk the dog', 'At list 30 minnutes in the wood');
INSERT INTO tasks VALUE (null, 'Buy milk', '2 litres from ALDI');
INSERT INTO tasks VALUE (null, 'Do homework', 'Check every subject, dedicate time for practice');
INSERT INTO tasks VALUE (null, 'Wash the dishes', 'Use the dishwaser except woodden cutlery');
INSERT INTO tasks VALUE (null, 'Empty trash', 'Do not forget about the selected trash');
INSERT INTO tasks VALUE (null, 'Prepare the dinner', 'Two dishes, and it has to contain some vegetables.');

CREATE TABLE familyMembers (
	idMember INT auto_increment PRIMARY KEY NOT NULL,
    name VARCHAR(20) NOT NULL,
    role ENUM('father', 'mother','child', 'relative', 'other')
    );
    
INSERT INTO familyMembers VALUE (null, "Jakab", "child");
INSERT INTO familyMembers VALUE (null, "Samu", "child");
INSERT INTO familyMembers VALUE (null, "Vendel", "child");
INSERT INTO familyMembers VALUE (null, "Lujzi", "child");
INSERT INTO familyMembers VALUE (null, "Ildi", "mother");
INSERT INTO familyMembers VALUE (null, "Dani", "father");
    
CREATE TABLE familyTodos(
	idToDo INT auto_increment PRIMARY KEY NOT NULL,
    task INT,
    assignedTo INT,
    statToDo ENUM('todo', 'doing', 'review', 'done'),
    day ENUM('Monday','Thuesday', 'Wednesday', 'Thursday', 'Friday', 'Saturday','Sunday'),
    FOREIGN KEY (task) REFERENCES tasks (idTask),
    FOREIGN KEY (assignedTo) REFERENCES familyMembers(idMember)
    );
    
INSERT INTO familyTodos VALUE (null, 1, 1, 'todo','Monday');
INSERT INTO familyTodos VALUE (null, 2, 2, 'todo','Monday');
INSERT INTO familyTodos VALUE (null, 3, 3, 'todo','Monday');
INSERT INTO familyTodos VALUE (null, 4, 4, 'todo','Monday');
INSERT INTO familyTodos VALUE (null, 5, 5, 'todo','Monday');
INSERT INTO familyTodos VALUE (null, 6, 6, 'todo','Monday');
INSERT INTO familyTodos VALUE (null, 1, 2, 'todo','Thuesday');
INSERT INTO familyTodos VALUE (null, 2, 3, 'todo','Thuesday');
INSERT INTO familyTodos VALUE (null, 3, 4, 'todo','Thuesday');
INSERT INTO familyTodos VALUE (null, 4, 6, 'todo','Thuesday');
INSERT INTO familyTodos VALUE (null, 1, 4, 'todo','Wednesday');

SELECT Tasks.task AS 'Todos on Monday', familyMembers.name AS 'Assigned to', familyTodos.statTodo AS 'Status'
	FROM tasks JOIN familyTodos
		ON tasks.idTask = familyTodos.task 
        JOIN familyMembers 
			ON familyTodos.assignedTo = familyMembers.idMember
				WHERE familyTodos.day = 'Monday';
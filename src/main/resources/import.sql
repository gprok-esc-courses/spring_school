INSERT INTO majors (name) VALUES ("Software Development");
INSERT INTO majors (name) VALUES ("Security");
INSERT INTO majors (name) VALUES ("Data Science");
INSERT INTO majors (name) VALUES ("Computer Science");

INSERT INTO students (name, birthdate, majors_id) VALUES ("John Doe", "2001-10-09", 1);
INSERT INTO students (name, birthdate, majors_id) VALUES ("Mary Doe", "2004-08-19", 1);
INSERT INTO students (name, birthdate, majors_id) VALUES ("Bob Ross", "2003-01-09", 2);
INSERT INTO students (name, birthdate, majors_id) VALUES ("Mary Ross", "2006-11-11", 3);

INSERT INTO users (username, password, role) VALUES ("admin", "111", "ROLE_ADMIN");
INSERT INTO users (username, password, role) VALUES ("stud", "111", "ROLE_STUDENT");
INSERT INTO users (username, password, role) VALUES ("rec", "111", "ROLE_RECORDS");
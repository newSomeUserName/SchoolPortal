
CREATE TYPE userRole AS ENUM('teacher', 'student');

CREATE TABLE users
(
    UserGuid uuid PRIMARY KEY,
    UserNumber varchar(15) NOT NULL,
    Name varchar(50) NOT NULL,
    Surname varchar(50) NOT NULL,
    UserRole userRole NOT NULL,
    Email varchar(100) NOT NULL
)
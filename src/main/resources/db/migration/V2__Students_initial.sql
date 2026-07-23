CREATE TABLE students
(
    user_guid UUID NOT NULL,
    CONSTRAINT pk_students PRIMARY KEY (user_guid)
);

ALTER TABLE students
    ADD CONSTRAINT FK_STUDENTS_ON_USER_GUID FOREIGN KEY (user_guid) REFERENCES users (user_guid);
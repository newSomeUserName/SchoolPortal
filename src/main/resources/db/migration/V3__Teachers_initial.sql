CREATE TABLE teachers
(
    user_guid UUID NOT NULL,
    CONSTRAINT pk_teachers PRIMARY KEY (user_guid)
);

ALTER TABLE teachers
    ADD CONSTRAINT FK_TEACHERS_ON_USER_GUID FOREIGN KEY (user_guid) REFERENCES users (user_guid);
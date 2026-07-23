CREATE TABLE lessons
(
    id         UUID         NOT NULL,
    name       VARCHAR(100) NOT NULL,
    frequency  SMALLINT,
    teacher_id UUID         NOT NULL,
    CONSTRAINT pk_lessons PRIMARY KEY (id)
);

ALTER TABLE lessons
    ADD CONSTRAINT FK_LESSONS_TEACHER FOREIGN KEY (teacher_id) REFERENCES teachers (user_guid);
CREATE TABLE enrollments
(
    id         UUID NOT NULL,
    student_id UUID NOT NULL,
    lesson_id  UUID NOT NULL,
    CONSTRAINT pk_enrollments PRIMARY KEY (id)
);

ALTER TABLE enrollments
    ADD CONSTRAINT uq_enrollment UNIQUE (lesson_id);

ALTER TABLE enrollments
    ADD CONSTRAINT FK_ENROLL_LESSON FOREIGN KEY (lesson_id) REFERENCES lessons (id);

ALTER TABLE enrollments
    ADD CONSTRAINT FK_ENROLL_STUDENT FOREIGN KEY (student_id) REFERENCES students (user_guid);
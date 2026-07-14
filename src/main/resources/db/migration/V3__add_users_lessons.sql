CREATE TABLE enrollments(
    user_id uuid REFERENCES users(user_guid),
    lesson_id uuid REFERENCES lessons(id),
    PRIMARY KEY (user_id, lesson_id)
)
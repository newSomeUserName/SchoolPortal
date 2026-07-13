CREATE TABLE lessons
(
    id        UUID NOT NULL,
    name      VARCHAR(100),
    frequency SMALLINT,
    CONSTRAINT pk_lessons PRIMARY KEY (id)
);
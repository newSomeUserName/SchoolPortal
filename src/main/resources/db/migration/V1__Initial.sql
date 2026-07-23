CREATE TABLE users
(
    user_guid   UUID         NOT NULL,
    user_number VARCHAR(15),
    name        VARCHAR(50)  NOT NULL,
    surname     VARCHAR(50)  NOT NULL,
    email       VARCHAR(100) NOT NULL,
    user_role   SMALLINT     NOT NULL,
    password_hash VARCHAR(72) NOT NULL ,
    CONSTRAINT pk_users PRIMARY KEY (user_guid)
);
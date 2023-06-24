CREATE TABLE IF NOT EXISTS "user"
(
    id bigserial NOT NULL PRIMARY KEY,
    name varchar(20),
    email varchar(50)
);

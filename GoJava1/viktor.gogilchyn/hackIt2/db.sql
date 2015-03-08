CREATE SEQUENCE actor_seq;
CREATE SEQUENCE skills_seq;
CREATE SEQUENCE attributes_seq;
CREATE TABLE actors (
	id 		INT NOT NULL DEFAULT NEXTVAL('actor_seq') PRIMARY KEY,
	actor_name	VARCHAR(25) NOT NULL
);
ALTER SEQUENCE actor_seq OWNED BY actors.id;
CREATE TABLE skills (
	id 		INT NOT NULL DEFAULT NEXTVAL('skills_seq') PRIMARY KEY,
	owner	INT REFERENCES actors(id),
    name    VARCHAR(20),
    value	INT
);
ALTER SEQUENCE skills_seq OWNED BY skills.id;
CREATE TABLE attributes (
	id 		INT NOT NULL DEFAULT NEXTVAL('attributes_seq') PRIMARY KEY,
	owner	INT REFERENCES actors(id),
	name	VARCHAR(100),
	value	VARCHAR(100)
);
ALTER SEQUENCE attributes_seq OWNED BY attributes.id;

INSERT INTO 'actors' (actor_name) VALUES (?) RETURNING actors.id;
INSERT INTO 'skills' (owner, name, value) VALUES (?, ?, ?);
INSERT INTO 'attributes' (owner, name, value) VALUES (?, ?, ?);
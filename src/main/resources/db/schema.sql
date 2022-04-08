CREATE TABLE IF NOT EXISTS Users
(
    id       INTEGER GENERATED BY DEFAULT AS IDENTITY NOT NULL,
    username VARCHAR(255),
    city     VARCHAR(255),

    CONSTRAINT pk_users PRIMARY KEY (id)
);
CREATE TABLE  IF NOT EXISTS Clothes
(
    id            BIGINT GENERATED BY DEFAULT AS IDENTITY NOT NULL,
    name          VARCHAR(255),
    size          VARCHAR(255),
    material_type VARCHAR(255),
    CONSTRAINT pk_clothes PRIMARY KEY (id)
);
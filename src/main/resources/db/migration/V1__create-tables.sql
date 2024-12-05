CREATE TABLE artistas (
    id SERIAL PRIMARY KEY,
    nome TEXT NOT NULL,
    generoMusical TEXT NOT NULL
);

CREATE TABLE discos (
    id SERIAL PRIMARY KEY,
    titulo TEXT NOT NULL,
    anoDeLancamento INTEGER NOT NULL
);

CREATE TABLE faixas (
    id SERIAL PRIMARY KEY,
    titulo TEXT NOT NULL,
    disco_id INTEGER REFERENCES discos(id),
    artista_id INTEGER NOT NULL REFERENCES artistas(id)
);

INSERT INTO artistas (nome, generoMusical)
VALUES
    ('The Beatles', 'Rock'),
    ('Queen', 'Rock'),
    ('Metallica', 'Rock');

INSERT INTO discos (titulo, anoDeLancamento)
VALUES
    ('Abbey Road', 1969),
    ('A Night at the Opera', 1975),
    ('Master of Puppets', 1986);

INSERT INTO faixas (titulo, disco_id, artista_id)
VALUES
    ('Come Together', 1, 1),
    ('Bohemian Rhapsody', 2, 2),
    ('Master of Puppets', 3, 3);

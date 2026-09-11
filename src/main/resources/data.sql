INSERT INTO platzy_play (titulo, duracion, genero, clasificacion, fecha_estreno, estado)
VALUES ('Shrek', 90, 'ANIMADA', NULL, '2024-06-01', 'D')
    ON CONFLICT (titulo) DO NOTHING;

INSERT INTO platzy_play (titulo, duracion, genero, clasificacion, fecha_estreno, estado)
VALUES ('Inception', 148, 'CIENCIA FICCION', NULL, '2010-07-16', 'D')
    ON CONFLICT (titulo) DO NOTHING;

INSERT INTO platzy_play (titulo, duracion, genero, clasificacion, fecha_estreno, estado)
VALUES ('Titanic', 195, 'DRAMA', 4.8, '1997-12-19', 'D')
    ON CONFLICT (titulo) DO NOTHING;

INSERT INTO platzy_play (titulo, duracion, genero, clasificacion, fecha_estreno, estado)
VALUES ('John Wick', 101, 'ACCION', NULL, '2014-10-24', 'D')
    ON CONFLICT (titulo) DO NOTHING;

INSERT INTO platzy_play (titulo, duracion, genero, clasificacion, fecha_estreno, estado)
VALUES ('El Conjuro', 112, 'TERROR', 3.8, '2013-07-19', 'D')
    ON CONFLICT (titulo) DO NOTHING;

INSERT INTO platzy_play (titulo, duracion, genero, clasificacion, fecha_estreno, estado)
VALUES ('Coco', 105, 'ANIMADA', 4.7, '2017-10-27', 'D')
    ON CONFLICT (titulo) DO NOTHING;

INSERT INTO platzy_play (titulo, duracion, genero, clasificacion, fecha_estreno, estado)
VALUES ('Interstellar', 169, 'CIENCIA FICCION', 5.0, '2014-11-07', 'D')
    ON CONFLICT (titulo) DO NOTHING;

INSERT INTO platzy_play (titulo, duracion, genero, clasificacion, fecha_estreno, estado)
VALUES ('Mayday', 179, 'COMEDIA', 7.5, '2026-06-07', 'D')
    ON CONFLICT (titulo) DO NOTHING;
CREATE TABLE movies
(
  moviename         TEXT,
  lead_actor        TEXT,
  actress           TEXT,
  year_of_release    INT,
  director_name     TEXT
);
INSERT INTO movies VALUES ('Bajrangi Bhaijaan','Salman','Kareena',2012,'UZAIR');
INSERT INTO movies VALUES ('phir hera pheri','Akshay','Shilpa',2011,'VINAMRA');
INSERT INTO movies VALUES ('golmaal','Ajay','kiara',2013,'SUHAS');
INSERT INTO movies VALUES ('chup chup ke','Shahid','malaika',2015,'SONAL');
INSERT INTO movies VALUES ('hulchul','Shahrukh','preeti',2016,'VANDHANA');

SELECT * FROM movies;
SELECT * FROM movies where lead_actor='Salman';

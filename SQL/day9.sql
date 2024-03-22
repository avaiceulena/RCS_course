CREATE TABLE Owners(
    id INTEGER PRIMARY KEY,
    name TEXT(30),
);

CREATE TABLE Pets(
    id INTEGER PRIMARY KEY, 
    name TEXT(30) NOT NULL,
    type TEXT(20),
    ownerId INTEGER,
    FOREIGN KEY(ownerId) REFERENCES Owners(id)
);

DROP TABLE Pets;

INSERT INTO Pets(id, name, type)
VALUES(1, "Muris", "Kaķis");

INSERT INTO Pets(id, name, type)
VALUES(2, "Rada", "Suns");

INSERT INTO Pets(id, name, type)
VALUES (3, "Poga", "Suns"),
      (4, "Miks", "Kaķis");
  
SELECT * FROM Pets;

SELECT name, type FROM Pets;
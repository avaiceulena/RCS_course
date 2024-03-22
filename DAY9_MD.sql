CREATE TABLE Authors(
    id INTEGER PRIMARY KEY,
    authorName TEXT(20) NOT NULL,
    authorSurname TEXT(20) NOT NULL,
    authorBirthName DATE
);


CREATE TABLE Books(
    id INTEGER PRIMARY KEY,
    bookName TEXT NOT NULL,
    bookYear DATE,
    authorId INTEGER,
    FOREIGN KEY(authorId) REFERENCES Authors(id)
);

INSERT INTO Authors(id, authorName, authorSurname, authorBirthName)
VALUES (1, "John Michael", "Green", "1977-08-24");

INSERT INTO Authors(id, authorName, authorSurname, authorBirthName)
VALUES (2, "Yuval Noah", "Harari", "1976-02-24");

INSERT INTO Authors(id, authorName, authorSurname, authorBirthName)
VALUES (3, "Jordan Bernt", "Peterson", "1962-06-12");

INSERT INTO Books(id, bookName, bookYear, authorId)
VALUES (1, "12 Rules for Life: An Antidote to Chaos", "2018", 3);

INSERT INTO Books(id, bookName, bookYear, authorId)
VALUES (2, "21 Lessons for the 21st Century", "2018", 2);

INSERT INTO Books(id, bookName, bookYear, authorId)
VALUES (3, "Sapiens: A Brief History of Humankind", "2015", 2);

INSERT INTO Books(id, bookName, bookYear, authorId)
VALUES (4, "The Fault in Our Stars", "2012", 1);

INSERT INTO Books(id, bookName, bookYear, authorId)
VALUES (5, "Paper Towns", "2008", 1);

SELECT * FROM Authors;
SELECT * FROM Books;

SELECT Authors.authorName, Authors.authorSurname, Authors.authorBirthName, Books.bookName, Books.bookYear
FROM Authors, Books
WHERE Books.authorId = Authors.id;
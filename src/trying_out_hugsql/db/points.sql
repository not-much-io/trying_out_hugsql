-- :name create-points-table :!
CREATE TABLE points (
  id INTEGER PRIMARY KEY,
  x INTEGER,
  y INTEGER
);

-- :name insert-point :! :n
INSERT INTO points (x, y)
VALUES (:x, :y);

-- :name delete-point-with-id :! :n
DELETE FROM points WHERE id = :id;

-- :name drop-points-table :!
DROP TABLE IF EXISTS points;

-- :name get-points
SELECT * FROM points;

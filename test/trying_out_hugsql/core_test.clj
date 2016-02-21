(ns trying-out-hugsql.core-test
  (:require [clojure.test :refer :all]
            [trying-out-hugsql.core :refer :all]
            [trying-out-hugsql.db :as db]))

(deftest test-points-table
  (testing "General points table manipulation."

    "Dropping points table if it exists."
    (db/drop-points-table db/db-spec)

    "Creating a new points table, checking that result is [0] - No rows affected."
    (is (= (db/create-points-table db/db-spec)
           [0]))

    "Inserting a new point into table, checking that 1 row was affected."
    (is (= (db/insert-point db/db-spec {:x 0 :y 0})
           1))

    "Checking if point was added."
    (is (= (db/get-points db/db-spec)
           [{:id 1 :x 0 :y 0}]))

    "Inserting another point."
    (db/insert-point db/db-spec {:x 1 :y 1})

    "Checking if both points are present."
    (is (= (db/get-points db/db-spec)
           [{:id 1 :x 0 :y 0}
            {:id 2 :x 1 :y 1}]))

    "Deleting point with id 1, checking affected rows is 1."
    (is (= (db/delete-point-with-id db/db-spec {:id 1})
           1))

    "Checking that only point with id 2 is still there."
    (is (= (db/get-points db/db-spec)
           [{:id 2 :x 1 :y 1}]))

    (is (= (db/drop-points-table db/db-spec)
           [0]))))

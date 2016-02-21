(ns trying-out-hugsql.db
  (:require [hugsql.core :as hugsql]))

(def db-spec {:classname "org.sqlite.JDBC"
              :subprotocol "SQLite"
              :subname "/home/not-much-io/Projects/trying_out_hugsql/resources/trying_out_hugsql.db"})

(hugsql/def-db-fns "trying_out_hugsql/db/points.sql")

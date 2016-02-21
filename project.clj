(defproject trying_out_hugsql "0.1.0-SNAPSHOT"
  :description "FIXME: write description"
  :url "http://example.com/FIXME"
  :license {:name "Eclipse Public License"
            :url "http://www.eclipse.org/legal/epl-v10.html"}
  :dependencies [[org.clojure/clojure "1.8.0"]
                 [org.xerial/sqlite-jdbc "3.7.2"]
                 [com.layerware/hugsql "0.4.0"]]
  :plugins [[lein-auto "0.1.2"]]
  :auto {"test" {:file-pattern #"\.(clj|sql)$"}}
  :main ^:skip-aot trying-out-hugsql.core
  :target-path "target/%s"
  :profiles {:uberjar {:aot :all}})

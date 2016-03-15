(ns user
  (:require [mount.core :as mount]
            [portfolio-clojure.figwheel :refer [start-fw stop-fw cljs]]
            portfolio-clojure.core))

(defn start []
  (mount/start-without #'portfolio-clojure.core/repl-server))

(defn stop []
  (mount/stop-except #'portfolio-clojure.core/repl-server))

(defn restart []
  (stop)
  (start))



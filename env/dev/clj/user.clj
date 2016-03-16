(ns user
  (:require [mount.core :as mount]
            [portfolio.figwheel :refer [start-fw stop-fw cljs]]
            portfolio.core))

(defn start []
  (mount/start-without #'portfolio.core/repl-server))

(defn stop []
  (mount/stop-except #'portfolio.core/repl-server))

(defn restart []
  (stop)
  (start))



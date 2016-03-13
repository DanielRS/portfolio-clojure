(ns user
  (:require [mount.core :as mount]
            portfolio-clojure.core))

(defn start []
  (mount/start-without #'portfolio-clojure.core/repl-server))

(defn stop []
  (mount/stop-except #'portfolio-clojure.core/repl-server))

(defn restart []
  (stop)
  (start))



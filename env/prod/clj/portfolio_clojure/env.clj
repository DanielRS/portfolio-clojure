(ns portfolio-clojure.env
  (:require [clojure.tools.logging :as log]))

(def defaults
  {:init
   (fn []
     (log/info "\n-=[portfolio-clojure started successfully]=-"))
   :middleware identity})

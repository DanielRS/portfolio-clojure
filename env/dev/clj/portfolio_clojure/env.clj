(ns portfolio-clojure.env
  (:require [selmer.parser :as parser]
            [clojure.tools.logging :as log]
            [portfolio-clojure.dev-middleware :refer [wrap-dev]]))

(def defaults
  {:init
   (fn []
     (parser/cache-off!)
     (log/info "\n-=[portfolio-clojure started successfully using the development profile]=-"))
   :middleware wrap-dev})

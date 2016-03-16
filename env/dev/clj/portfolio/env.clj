(ns portfolio.env
  (:require [selmer.parser :as parser]
            [clojure.tools.logging :as log]
            [portfolio.dev-middleware :refer [wrap-dev]]))

(def defaults
  {:init
   (fn []
     (parser/cache-off!)
     (log/info "\n-=[portfolio started successfully using the development profile]=-"))
   :middleware wrap-dev})

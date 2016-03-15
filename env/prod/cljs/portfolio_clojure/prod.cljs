(ns portfolio-clojure.app
  (:require [portfolio-clojure.core :as core]))

;;ignore println statements in prod
(set! *print-fn* (fn [& _]))

(core/init!)

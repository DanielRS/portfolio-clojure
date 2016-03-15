(ns portfolio-clojure.footer
  (:require [garden.def :refer [defstyles]]
            [garden.units :refer [em rem px]]))

(defstyles screen
  [:#footer {:padding (em 2)
             :background "#888"}])

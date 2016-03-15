(ns portfolio-clojure.styles.imports
  (:require [garden.def :refer [defstyles defcssfn]]
            [garden.stylesheet :refer [at-import]]))

(defcssfn url)

(defstyles screen
  (at-import (url "https://fonts.googleapis.com/css?family=Open+Sans:400,400italic,700|Josefin+Slab:400,700|Inconsolata:400,700")))

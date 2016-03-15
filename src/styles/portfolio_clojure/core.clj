(ns portfolio-clojure.core
  (:require [garden.def :refer [defstyles]]
            ;; Other styles
            [portfolio-clojure.imports :as imports]
            [portfolio-clojure.header :as header]
            [portfolio-clojure.footer :as footer]
            [portfolio-clojure.general :as general]
            [portfolio-clojure.text :as text]
            [portfolio-clojure.blog :as blog]))

(defstyles screen
  imports/screen
  header/screen
  footer/screen
  general/screen
  text/screen
  blog/screen)

(ns portfolio-clojure.styles.core
  (:require [garden.def :refer [defstyles]]
            ;; Other styles
            [portfolio-clojure.styles.imports :as imports]
            [portfolio-clojure.styles.header :as header]
            [portfolio-clojure.styles.footer :as footer]
            [portfolio-clojure.styles.general :as general]
            [portfolio-clojure.styles.text :as text]
            [portfolio-clojure.styles.blog :as blog]))

(defstyles screen
  imports/screen
  header/screen
  footer/screen
  general/screen
  text/screen
  blog/screen)

(ns portfolio.core
  (:require [garden.def :refer [defstyles]]
            ;; Other styles
            [portfolio.imports :as imports]
            [portfolio.header :as header]
            [portfolio.footer :as footer]
            [portfolio.general :as general]
            [portfolio.text :as text]
            [portfolio.blog :as blog]))

(defstyles screen
  imports/screen
  header/screen
  footer/screen
  general/screen
  text/screen
  blog/screen)

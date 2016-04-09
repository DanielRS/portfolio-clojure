(ns portfolio.core
  (:refer-clojure :exclude [rem])
  (:require [garden.def :refer [defcssfn defstyles]]
            [garden.units :refer [em rem px]]
            [garden.stylesheet :refer [at-import]]
            [portfolio.settings :as settings]
            ;; General styles
            [portfolio.general :as general]
            ;; Common styles
            [portfolio.header :as header]
            [portfolio.footer :as footer]
            ;; Page styles
            [portfolio.projects :as projects]
            [portfolio.blog :as blog]))

(defstyles screen
  ;; General stuff
  general/screen

  ;; Common styles
  header/screen
  footer/screen

  ;; Page styles
  projects/screen
  blog/screen)

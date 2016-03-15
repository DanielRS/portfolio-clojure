(ns portfolio-clojure.styles.text
  (:require [garden.def :refer [defstyles]]
            [garden.units :refer [em rem]]
            [garden.stylesheet :refer [at-import]]))

(defstyles screen
  [:html {:font-size (rem 1.125) :font-family ["Open Sans" "sans-serif"]}]
  [:code {:font-family ["Inconsolata" "monospace"]}]
  [:h1 :h2 {:font-family ["Josefin Slab", "serif"]}]

  [:a {:color "#888"}])

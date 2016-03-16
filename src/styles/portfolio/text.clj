(ns portfolio.text
  (:require [garden.def :refer [defstyles]]
            [garden.units :refer [em rem]]
            [garden.stylesheet :refer [at-import]]
            [portfolio.settings :as settings]))

(defstyles screen
  [:html {:font-size (rem 1.125) :font-family ["Open Sans" "sans-serif"]}]
  [:body {:color settings/color-body}]
  [:code {:font-family ["Inconsolata" "monospace"]}]
  [:h1 :h2 {:font-family ["Josefin Slab", "serif"]}]

  [:a {:color settings/color-dark-gray}
   [:&:hover {:color settings/color-black}]])

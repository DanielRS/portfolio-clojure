(ns portfolio.general
  (:refer-clojure :exclude [rem])
  (:require [garden.def :refer [defcssfn defstyles]]
            [garden.units :refer [em rem px]]
            [garden.stylesheet :refer [at-import]]
            [portfolio.settings :as settings]))

(defcssfn url)

(defstyles imports
  (at-import (url "https://fonts.googleapis.com/css?family=Inconsolata:400,700|Josefin+Slab:400,700|Montserrat:400,700|Open+Sans:400,400italic,700")))

(defstyles text
  [:html {:font-family ["Open Sans" "sans-serif"]}]
  [:body {:color settings/color-body}]
  [:code {:font-family ["Inconsolata" "monospace"]}]
  [:h1 :h2 :h3 :h4{:color settings/color-gray-7
                   :font-family ["Montserrat" "sans-serif"]
                   :font-weight "normal"}]

  [:a {:color settings/color-link :text-decoration "none"}
   [:&:visited {:color settings/color-link-visited}]
   [:&:hover {:color settings/color-link-hover :text-decoration "underline"}]])

(defstyles layout
  [:body {:margin 0 :padding 0}
   [:#content {:padding-top (em 4) :padding-bottom (em 2)}
    [:&.content__home {:padding-top (em 0)}]]

   [:.container {:max-width settings/break-l
                 :margin "auto"
                 :padding "0 2em"}]

   [:.section {:padding "2em 0"}]])

(defstyles lists
  [:ul {:list-style "none" :padding 0}])

(defstyles multiple-bg
  [:.multiple-bg {:position "relative"}
   [:.multiple-bg__layer {:position "absolute"
                          :top 0
                          :bottom 0
                          :left 0
                          :right 0}]])

(defstyles screen
  imports
  text
  layout
  lists
  multiple-bg)

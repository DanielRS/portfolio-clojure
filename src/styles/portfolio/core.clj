(ns portfolio.core
  (:refer-clojure :exclude [rem])
  (:require [garden.def :refer [defstyles]]
            [garden.units :refer [em rem px]]
            [portfolio.settings :as settings]
            ;; Common styles
            [portfolio.imports :as imports]
            [portfolio.header :as header]
            [portfolio.footer :as footer]
            ;; Page styles
            [portfolio.projects :as projects]
            [portfolio.blog :as blog]))

(defstyles text
  [:html {:font-size (rem 1.125) :font-family ["Open Sans" "sans-serif"]}]
  [:body {:color settings/color-body}]
  [:code {:font-family ["Inconsolata" "monospace"]}]
  [:h1 :h2 {:color settings/color-1 :font-family ["Josefin Slab", "serif"]}]

  [:a {:color settings/gray-5}
   [:&:visited {:color settings/gray-3}]
   [:&:hover {:color settings/gray-7}]])

(defstyles general
  [:body {:margin 0 :padding 0}
   [:#content {:padding-top (em 4) :padding-bottom (em 2)}
    [:&.content__home {:padding-top (em 0)}]]

   [:.container {:max-width settings/break-l
                 :margin "auto"}]

   [:.section {:padding (em 2)}]])

(defstyles lists
  [:ul {:list-style "none" :padding 0}])

(defstyles screen
  imports/screen
  text
  general
  lists

  ;; Common styles
  header/screen
  footer/screen

  ;; Page styles
  projects/screen
  blog/screen)

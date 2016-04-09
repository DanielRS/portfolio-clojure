(ns portfolio.projects
  (:require [garden.def :refer [defstyles]]
            [garden.units :refer [em rem px]]
            [greenhouse.grid :refer [column stack]]
            [portfolio.settings :as settings]
            [portfolio.util :refer :all]))

(defstyles screen
  [:.project-list
   clearfix

   [:&:hover [:.project {:opacity ".5"}]]

   [:.project {:box-sizing "border-box"
               :padding (em 1.5)
               :border "1px solid transparent"
               :text-align "center"
               :transition "box-shadow .25s, opacity .25s"}

    [:&:hover {:opacity 1
               :border-color settings/color-gray-4
               :box-shadow "0 0 24px rgba(0, 0, 0, .25)"}]

    (at-screen-m [:& (column :ratio 1/2 :cycle 2 :gutter 0)])
    (at-screen-l [:& (column :ratio 1/3 :cycle 3 :gutter 0)])

    [:h1 {:font-size (em 1.5)}]

    [:figure {:text-align "center"}]]])

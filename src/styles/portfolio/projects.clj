(ns portfolio.projects
  (:require [garden.def :refer [defstyles]]
            [garden.units :refer [em rem px]]
            [greenhouse.grid :refer [column stack]]
            [portfolio.util :refer :all]))

(defstyles screen
  [:.project-list
   clearfix

   [:&:hover [:.project {:opacity ".5"}]]
   [:.project {:box-sizing "border-box"
               :padding (em 1.5)
               :transition "box-shadow .25s, opacity .25s"}

    (at-screen-m [:& (column :ratio 1/2 :cycle 2 :gutter 0)])
    (at-screen-l [:& (column :ratio 1/3 :cycle 3 :gutter 0)])

    [:&:hover {:opacity 1 :box-shadow "0 0 24px rgba(0, 0, 0, .25)"}]]])

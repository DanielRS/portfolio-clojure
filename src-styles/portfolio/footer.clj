(ns portfolio.footer
  (:require [garden.def :refer [defstyles]]
            [garden.units :refer [em rem px]]
            [greenhouse.grid :refer [column *layout-direction*]]
            [portfolio.settings :as settings]
            [portfolio.util :refer :all]))

(defstyles screen
  (binding [*layout-direction* :right->left]
    [:#footer {:padding-top (em 1)
               :padding-bottom (em 2)
               :border-top "1px solid transparent"
               :border-color settings/color-gray-1}
     clearfix

     [:#copyright {:text-align "center"}]

     (between-screen-s-m [:#copyright (column :ratio 1 :cycle 1)]
                         [:#navbar--footer :#social (column :ratio 1/2 :cycle 2)])

     (at-screen-m [:#copyright {:text-align "left"} (column :ratio 2/4 :cycle 0)]
                  [:#navbar--footer :#social (column :ratio 1/4 :cycle 0)])]))

(ns portfolio.footer
  (:require [garden.def :refer [defstyles]]
            [garden.units :refer [em rem px]]
            [greenhouse.grid :refer [column]]
            [portfolio.settings :as settings]
            [portfolio.util :refer :all]))

(defstyles screen
  [:#footer {:padding-top (em 1)
             :padding-bottom (em 2)
             :border-top "1px solid transparent"
             :border-color settings/gray-1}
   clearfix

   (at-screen-m [:#copyright {:font-family "Josefin Slab"} (column :ratio 2/4)]
                [:#navbar--footer (column :ratio 1/4)]
                [:#social (column :ratio 1/4)])])

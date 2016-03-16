(ns portfolio.footer
  (:require [garden.def :refer [defstyles]]
            [garden.units :refer [em rem px]]
            [portfolio.settings :as settings]))

(defstyles screen
  [:#footer {:padding (em 2)
             :background settings/color-black}])

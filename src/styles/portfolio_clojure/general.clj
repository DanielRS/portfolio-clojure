(ns portfolio-clojure.general
  (:require [garden.def :refer [defstyles]]
            [garden.units :refer [em, rem, px]]
            [portfolio-clojure.util :refer :all]
            [portfolio-clojure.settings :as settings]))

(defstyles screen
  [:body {:margin 0 :padding 0}

   [:#content {:padding-top (em 4) :padding-bottom (em 2)}
    [:&.content__home {:padding-top (em 0)}]]

   [:.container {:max-width settings/break-l
                 :margin "auto"}]

   [:.section {:padding (em 2)}]])

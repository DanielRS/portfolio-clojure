(ns portfolio.blog
  (:require [garden.def :refer [defstyles]]
            [garden.stylesheet :refer [at-media]]
            [garden.units :refer [em rem px]]
            [greenhouse.grid :refer [column]]
            [portfolio.settings :as settings]
            [portfolio.util :refer [clearfix]]))

(defstyles screen
  [:.blog-entries

   [:article.post {:margin-bottom (em 2)}

    [:h1 {:display "inline-block"
          :font-family ["Open Sans" "sans-serif"]
          :font-size (em 1.25)
          :font-weight "normal"}
     [:a {:color settings/color-2 :text-decoration "none"}]]

    [:h1 :p {:margin 0 :padding 0}]

    [:.post__metadata {:display "inline-block"
                       :margin-bottom (em 0.5)
                       :color settings/color-gray}]]])

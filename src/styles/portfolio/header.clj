(ns portfolio.header
  (:require [garden.def :refer [defstyles]]
            [garden.stylesheet :refer [at-media]]
            [garden.units :refer [em rem px]]
            [portfolio.settings :as settings]
            [portfolio.util :refer :all]))

(defstyles header-text
  {:text-decoration "none"
   :font-weight "bold"
   :color "white"})

(defstyles mega-brand
  [:#mega-brand {:position "relative"
                 :box-sizing "border-box"
                 :min-height "468px"
                 :height "100vh"
                 :padding "6em 1em 2em"
                 :overflow "hidden"
                 :background "repeat url(../img/footer_lodyas.png) transparent"
                 :background-color settings/color-black}

   [:.mega-brand__content {:position "absolute"
                           :top "50%"
                           :left "50%"
                           :color "white"
                           :text-align "left"
                           :transform "translate(-50%, -50%)"}

    [:.mega-brand__header {:font-size (em 0.5) :text-align "center"}

     (at-screen-s [:& {:font-size (em 0.75)}])
     (at-screen-m [:& {:font-size (em 1)}])

     [:h1 {:margin 0
           :font-size (em 6)
           :font-weight "normal"}]
     [:#tagline {:font-size (em 3)}]]]])


(defstyles screen
  ;; Mobile first
  [:#navbar {:position "fixed"
             :z-index 100
             :top 0
             :left 0
             :right 0
             :background settings/color-black
             :transition "background .125s"}
   clearfix

   [:.navbar__toggler {:float "left"
                       :margin 0
                       :padding (rem 1)
                       :background "transparent"
                       :border "none"
                       :font-size (rem 2)
                       :line-height (rem 2)
                       :cursor "pointer"} header-text]

   [:.navbar__brand {:display "inline-block"
                     :float "left"
                     :margin-left (em 0.5)
                     :vertical-align "middle"
                     :font-family ["Josefin Slab" "serif"]
                     :font-size (rem 2)
                     :line-height (rem 4)
                     :text-decoration "none"
                     :color "white"}
    [:* {:word-wrap "break-word"}]]

   [:.navbar__wrapper {:display "none"
                       :float "right"
                       :vertical-align "middle"}]

   [:ul.navbar__nav {:display "inline-block"
                     :margin 0
                     :padding 0
                     :list-style "none"}

    [:li {:display "inline-block"
          :margin 0}

     [:a
      {:display "block"
       :font-size (rem 1)
       :line-height (rem 2)
       :padding (rem 1)}

      header-text

      [:&.navbar__active {:border-bottom "2px solid white"}]
      [:&:hover {:text-decoration "underline"}]

      ]]]]

  mega-brand

  ;; Medium screen size
  (at-media {:screen true :min-width settings/break-m}
    [:#navbar
     [:.navbar__toggler {:display "none"}]
     [:.navbar__wrapper {:display "inline-block"}]]))

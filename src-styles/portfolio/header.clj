(ns portfolio.header
  (:require [garden.def :refer [defstyles]]
            [garden.stylesheet :refer [at-media]]
            [garden.units :refer [em rem px percent]]
            [portfolio.settings :as settings]
            [portfolio.util :refer :all]))

(defstyles mega-brand
  [:#mega-brand {:position "relative"
                 :box-sizing "border-box"
                 :min-height "468px"
                 :height "100vh"
                 :padding "6em 1em 2em"
                 :overflow "hidden"
                 :background "linear-gradient(to bottom, transparent 0%,  transparent 90%, rgba(0, 0, 0, .125) 100%)"}

   [:.mega-brand__content {:position "absolute"
                           :top "50%"
                           :left "50%"
                           :text-align "left"
                           :transform "translate(-50%, -50%)"}

    [:.mega-brand__header {:font-size (em 0.5)
                           :text-align "center"}

     (at-screen-s [:& {:font-size (em 0.75)}])
     (at-screen-m [:& {:font-size (em 1)}])

     [:h1 {:margin 0
           :font-family ["Josefin Slab" "serif"]
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
             :background settings/color-white
             :box-shadow "0 0 2px rgba(0, 0, 0, .125)"
             :transition "background .125s, box-shadow .125s"}

   [:&.navbar--home {:background "transparent"
                     :box-shadow "none"}]

   [:.container {:padding 0} clearfix
    (at-screen-m [:& {:padding "0 1rem"}])]

   [:.navbar__toggler {:float "left"
                       :margin 0
                       :padding (rem 1)
                       :background "transparent"
                       :border "none"
                       :font-size (rem 2)
                       :line-height (rem 2)
                       :cursor "pointer"
                       :transition "background .125s"}
    [:&:hover {:background settings/color-gray-8}]]

   [:.navbar__brand {:display "inline-block"
                     :float "left"
                     :margin-left (em 0.5)
                     :vertical-align "middle"
                     :font-family ["Josefin Slab" "serif"]
                     :font-size (rem 2)
                     :line-height (rem 4)
                     :text-decoration "none"
                     :color settings/color-body}
    [:* {:word-wrap "break-word"}]]

   [:.navbar__wrapper {:display "block"
                       :clear "both"
                       :height 0
                       :vertical-align "middle"
                       :background "inherit"
                       :transition "height 2s"
                       :overflow "hidden"}
    [:&.navbar__wrapper--show {:height "auto"}]]

   [:ul.navbar__nav {:display "block"
                     :margin 0
                     :padding 0
                     :list-style "none"}

    [:li {:display "block" :margin 0 :text-align "center"}

     [:a
      {:display "block"
       :font-family ["Montserrat" "sans-serif"]
       :font-size (rem 1)
       :line-height (rem 2)
       :padding (rem 1)
       :color settings/color-body}

      [:&.navbar__active {:background settings/color-gray-8}]
      [:&:hover {:text-decoration "underline"}]

      ]]]]

  mega-brand

  ;; Medium screen size
  (at-screen-m
    [:#navbar
     [:.navbar__toggler {:display "none"}]
     [:.navbar__wrapper {:display "inline-block"
                         :clear "none"
                         :height "auto"
                         :position "relative"
                         :float "right"
                         :background "transparent"}]
     [:ul.navbar__nav {:display "inline-block"}
      [:li {:display "inline-block"}
       [:a.navbar__active {:background "transparent"
                           :border-bottom "2px solid transparent"
                           :border-color settings/color-body}]]]]))

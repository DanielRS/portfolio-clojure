(ns portfolio.settings
  (:require [garden.color :as color]
            [garden.units :refer [px]]))

;; Holds common settings between Clojure and ClojureScript, mostly theming
;; preferences

(def break-s (px 468))
(def break-m (px 720))
(def break-l (px 1024))
(def break-xl (px 1280))

;; Common colors
(def color-white (color/hex->rgb "#ffffff"))
(def color-light-gray (color/darken color-white 20))
(def color-gray (color/darken color-white 40))
(def color-dark-gray (color/darken color-white 50))
(def color-black (color/darken color-white 60))

(def color-body color-gray)

;; Colorscheme, see: https://color.adobe.com/Salmon-on-Ice-color-theme-2291686/
(def color-1 (color/hex->rgb "#3e454c"))
(def color-2 (color/hex->rgb "#2185c5"))
(def color-3 (color/hex->rgb "#7ecefd"))
(def color-4 (color/hex->rgb "#fff6e5"))
(def color-5 (color/hex->rgb "#ff7f66"))

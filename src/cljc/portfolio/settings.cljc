(ns portfolio.settings
  (:require [garden.color :as color]
            [garden.units :refer [px]]))

;; Holds common settings between Clojure and ClojureScript, mostly theming
;; preferences

(def break-s (px 468))
(def break-m (px 720))
(def break-l (px 1024))
(def break-xl (px 1280))

;; Colorscheme, see: https://color.adobe.com/Salmon-on-Ice-color-theme-2291686/
(def color-1 (color/hex->rgb "#3e454c"))
(def color-2 (color/hex->rgb "#2185c5"))
(def color-3 (color/hex->rgb "#7ecefd"))
(def color-4 (color/hex->rgb "#fff6e5"))
(def color-5 (color/hex->rgb "#ff7f66"))

;; Gray
(def color-white (color/hex->rgb "#ffffff"))
(def gray-0 (color/darken color-white 0))
(def gray-1 (color/darken color-white 10))
(def gray-2 (color/darken color-white 20))
(def gray-3 (color/darken color-white 30))
(def gray-4 (color/darken color-white 40))
(def gray-5 (color/darken color-white 50))
(def gray-6 (color/darken color-white 60))
(def gray-7 (color/darken color-white 70))
(def gray-8 (color/darken color-white 80))
(def gray-9 (color/darken color-white 90))
(def gray-10 (color/darken color-white 100))

(def color-body gray-6)

(ns portfolio.settings
  (:require [garden.color :as color]
            [garden.units :refer [px]]))

;; Holds common settings between Clojure and ClojureScript, mostly theming
;; preferences

(def break-s (px 468))
(def break-m (px 720))
(def break-l (px 1024))
(def break-xl (px 1280))

;; Gray
(def color-white (color/hex->rgb "#ffffff"))
(def color-gray-0 (color/darken color-white 0))
(def color-gray-1 (color/darken color-white 10))
(def color-gray-2 (color/darken color-white 20))
(def color-gray-3 (color/darken color-white 30))
(def color-gray-4 (color/darken color-white 40))
(def color-gray-5 (color/darken color-white 50))
(def color-gray-6 (color/darken color-white 60))
(def color-gray-7 (color/darken color-white 70))
(def color-gray-8 (color/darken color-white 80))
(def color-gray-9 (color/darken color-white 90))
(def color-gray-10 (color/darken color-white 100))

;; Links
(def color-link (color/hex->rgb "#4078c0"))
(def color-link-hover color-link)
(def color-link-visited (color/lighten color-link 10))

;; Other
(def color-body color-gray-6)

(ns portfolio.util
  (:refer-clojure :exclude [-])
  (:require [garden.arithmetic :refer [-]]
            [garden.def :refer [defstyles]]
            [garden.stylesheet :refer [at-media]]
            [portfolio.settings :as settings]))

(def clearfix
  "micro-clearfix, see: http://stackoverflow.com/questions/211383/which-method-of-clearfix-is-best"
  [:&:after {:content "\"\""
             :display "block"
             :clear "both"}])

(defn at-screen-fn [breakpoint & content]
  (at-media {:screen true :min-width breakpoint} content))

(defn between-screen-fn [breakpoint-start breakpoint-end & content]
 (at-media {:screen true :min-width breakpoint-start :max-width (- breakpoint-end 1)} content))

(defn at-screen-s [& content] (apply at-screen-fn (cons settings/break-s content)))
(defn at-screen-m [& content] (apply at-screen-fn (cons settings/break-m content)))
(defn at-screen-l [& content] (apply at-screen-fn (cons settings/break-l content)))
(defn at-screen-xl [& content] (apply at-screen-fn (cons settings/break-xl content)))

(defn between-screen-s-m [& content] (apply between-screen-fn (concat [settings/break-s settings/break-m] content)))
(defn between-screen-m-l [& content] (apply between-screen-fn (concat [settings/break-m settings/break-l] content)))
(defn between-screen-l-xl [& content] (apply between-screen-fn (concat [settings/break-l settings/break-xl] content)))

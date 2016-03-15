(ns portfolio-clojure.util
  (:require [garden.def :refer [defstyles]]
            [garden.stylesheet :refer [at-media]]
            [portfolio-clojure.settings :as settings]))

(def clearfix
  "micro-clearfix, see: http://stackoverflow.com/questions/211383/which-method-of-clearfix-is-best"
  [:&:after {:content "\"\""
             :display "block"
             :clear "both"}])

(defn at-screen-fn [breakpoint & content]
  (at-media {:screen true :min-width breakpoint} content))

(defn at-screen-s [& content] (apply at-screen-fn (cons settings/break-s content)))
(defn at-screen-m [& content] (apply at-screen-fn (cons settings/break-m content)))
(defn at-screen-l [& content] (apply at-screen-fn (cons settings/break-l content)))
(defn at-screen-xl [& content] (apply at-screen-fn (cons settings/break-xl content)))

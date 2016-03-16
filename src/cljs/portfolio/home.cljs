(ns portfolio.home
  (:require [cljs.core.async :refer [<!]]
            [goog.dom :as dom]
            [goog.events :as events]
            [garden.color :refer [as-hex]]
            [portfolio.util :refer [event->chan]]
            [portfolio.settings :as settings])
  (:require-macros [cljs.core.async.macros :refer [go go-loop]]))

(def nav (dom/getElement "navbar"))

(defn set-background! [el color]
  (set! (.-background (.-style el)) color))

(defn background-change! []
  (let [scroll-y (.-y (dom/getDocumentScroll))]
    (if (> scroll-y 0)
      (set-background! nav (as-hex settings/color-black))
      (set-background! nav "transparent"))))

(defn scroll-handler! []
  (let [c (event->chan js/window "scroll")]
    (go-loop []
      (let [_ (<! c)]
        (background-change!))
      (recur))))

(defn ^:export init! []
  (background-change!)
  (scroll-handler!))

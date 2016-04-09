(ns portfolio.home
  (:require [cljs.core.async :refer [<! chan close!]]
            [goog.dom :as dom]
            [goog.dom.classes :as classes]
            [goog.events :as events]
            [garden.color :refer [as-hex]]
            [portfolio.util :refer [event->chan]]
            [portfolio.settings :as settings])
  (:require-macros [cljs.core.async.macros :refer [go go-loop]]))

(defn timeout [ms]
  (let [c (chan)]
    (js/setTimeout (fn [] (close! c)) ms)
    c))

(def nav (dom/getElement "navbar"))
(def text-bg (dom/getElementByClass "mega-brand__text"))

(defn background-change! []
  (let [scroll-y (.-y (dom/getDocumentScroll))]
    (if (> scroll-y 0)
      (classes/remove nav "navbar--home")
      (classes/add nav "navbar--home"))))

(defn scroll-handler! []
  (let [c (event->chan js/window "scroll")]
    (go-loop []
      (let [_ (<! c)]
        (background-change!))
      (recur))))

(defn ^:export init! []
  (background-change!)
  (scroll-handler!)
  (.typing (js/$ "#tagline") (clj->js {:sentences ["Hello!"
                                                  "I'm Daniel"
                                                  "I'm Daniel, and.."
                                                  "I'm a programmer"]})))

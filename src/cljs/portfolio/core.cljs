(ns portfolio.core
  (:require [cljs.core.async :refer [<!]]
            [goog.dom :as dom]
            [goog.events :as events]
            [portfolio.util :refer [event->chan]]
            ;; Other requires that won't get deleted by optimizer
            [portfolio.home :as home])
  (:require-macros [cljs.core.async.macros :refer [go go-loop]]))

(def parallax-elements (dom/getElementsByClass "parallax-bg"))

(defn parallax-scroll! []
  (let [scroll-y (.-y (dom/getDocumentScroll))]
    (doseq [el parallax-elements]
      (set! (.-backgroundPosition (.-style el))
            (str "0% " (str (* scroll-y 0.5) "px"))))))

(defn scroll-handler! []
  (let [c (event->chan js/window "scroll")]
    (go-loop []
      (let [_ (<! c)]
        (parallax-scroll!))
      (recur))))

(defn init! []
  (parallax-scroll!)
  (scroll-handler!))

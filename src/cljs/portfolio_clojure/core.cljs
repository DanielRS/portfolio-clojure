(ns portfolio-clojure.core
  (:require [cljs.core.async :refer [put! <! chan]]
            [goog.dom :as dom]
            [goog.events :as events])
  (:require-macros [cljs.core.async.macros :refer [go go-loop]]))

(extend-type js/NodeList
  ISeqable
  (-seq [array] (array-seq array 0)))

(defn event->chan [el event-type]
  (let [c (chan)]
    (events/listen el event-type #(put! c %))
    c))

(defn scroll-handler! []
  (let [c (event->chan js/window "scroll")
        bg (dom/getElementByClass "parallax-bg")
        bgs (dom/getElementsByClass "parallax-bg")]
    (go-loop []
      (let [_ (<! c)
            scroll-y (.-y (dom/getDocumentScroll))]
        (doseq [bg bgs]
          (set! (.-backgroundPosition (.-style bg))
                (str "0% " (str (* scroll-y 0.5) "px")))))
      (recur))))

(defn init! []
  (scroll-handler!))

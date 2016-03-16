(ns portfolio.util
  (:require [goog.events :as events]
            [cljs.core.async :refer [chan put!]]))

(extend-type js/NodeList
  ISeqable
  (-seq [array] (array-seq array 0)))

(defn event->chan [el event-type]
  (let [c (chan)]
    (events/listen el event-type #(put! c %))
    c))


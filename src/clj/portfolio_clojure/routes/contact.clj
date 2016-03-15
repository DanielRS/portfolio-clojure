(ns portfolio-clojure.routes.contact
  (:require [portfolio-clojure.layout :as layout]
            [compojure.core :refer [defroutes GET]]
            [ring.util.http-response :as response]
            [clojure.java.io :as io]))

(defn contact-page []
  (layout/render "contact.html"))

(defroutes contact-routes
  (GET "/contact" [] (contact-page)))

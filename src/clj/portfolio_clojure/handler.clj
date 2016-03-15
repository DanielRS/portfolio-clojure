(ns portfolio-clojure.handler
  (:require [compojure.core :refer [routes wrap-routes]]
            [portfolio-clojure.layout :refer [error-page]]
            ;; Routes
            [portfolio-clojure.routes.home :refer [home-routes]]
            [portfolio-clojure.routes.projects :refer [project-routes]]
            [portfolio-clojure.routes.contact :refer [contact-routes]]
            [portfolio-clojure.routes.blog :refer [blog-routes]]
            ;; Middleware
            [compojure.route :as route]
            [portfolio-clojure.middleware :as middleware]))

(def app-routes
  (routes
    (wrap-routes #'blog-routes middleware/wrap-csrf)
    (wrap-routes #'contact-routes middleware/wrap-csrf)
    (wrap-routes #'project-routes middleware/wrap-csrf)
    (wrap-routes #'home-routes middleware/wrap-csrf)
    (route/not-found
      (:body
        (error-page {:status 404
                     :title "page not found"})))))

(def app (middleware/wrap-base #'app-routes))

(ns portfolio.handler
  (:require [compojure.core :refer [routes wrap-routes]]
            [portfolio.layout :refer [error-page]]
            ;; Routes
            [portfolio.routes.home :refer [home-routes]]
            [portfolio.routes.projects :refer [project-routes]]
            [portfolio.routes.contact :refer [contact-routes]]
            [portfolio.routes.blog :refer [blog-routes]]
            ;; Middleware
            [compojure.route :as route]
            [portfolio.middleware :as middleware]))

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

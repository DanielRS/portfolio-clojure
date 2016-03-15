(ns portfolio-clojure.routes.blog
  (:require [portfolio-clojure.layout :as layout]
            [compojure.core :refer [defroutes GET]]
            [ring.util.http-response :as response]
            [clojure.java.io :as io]))

(defn blog-page []
  (layout/render "blog.html"))

(defroutes blog-routes
  (GET "/blog" [] (blog-page)))

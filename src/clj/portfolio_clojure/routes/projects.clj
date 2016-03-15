(ns portfolio-clojure.routes.projects
  (:require [portfolio-clojure.layout :as layout]
            [compojure.core :refer [defroutes GET]]
            [ring.util.http-response :as response]
            [clojure.java.io :as io]))

(defn projects-page
  ([]
   (layout/render "projects/projects.html" ))

  ([id]
   (layout/render "projects/project-detail.html")))

(defroutes project-routes
  (GET "/projects" [] (projects-page))
  (GET "/projects/:id" [id] (projects-page id)))

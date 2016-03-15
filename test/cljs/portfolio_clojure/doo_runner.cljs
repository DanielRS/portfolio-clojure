(ns portfolio-clojure.doo-runner
  (:require [doo.runner :refer-macros [doo-tests]]
            [portfolio-clojure.core-test]))

(doo-tests 'portfolio-clojure.core-test)


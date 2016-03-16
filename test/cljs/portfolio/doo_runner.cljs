(ns portfolio.doo-runner
  (:require [doo.runner :refer-macros [doo-tests]]
            [portfolio.core-test]))

(doo-tests 'portfolio.core-test)


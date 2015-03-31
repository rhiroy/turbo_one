(ns turbo-one.prod
  (:require [turbo-one.core :as core]))

;;ignore println statements in prod
(set! *print-fn* (fn [& _]))

(core/init!)

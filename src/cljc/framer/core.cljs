(ns framer.core
  (:require
    ["framer-motion" :refer [motion]]))

(defn get-motion [type]
  (aget motion type))

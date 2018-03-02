(ns nmf.core
  (:use [nmf nmf data]
        [clojure.math numeric-tower])
  (:gen-class))

(def X
  [[2 0 1 2 0] [0 2 1 0 1] [1 0 0 2 2] [2 1 0 0 1]])


(defn run-nmf
  [matrix]
  (let [[W H] (nmf matrix 50 20)]
    (println "X: " matrix)
    (println "W: " W)
    (println "H: " H)
    (println "WH: " (matr-mult W H))
    (println "WH(rounded): " (matr-map round (matr-mult W H)))))

(defn -main
  []
  (run-nmf mirror-image-gen2))

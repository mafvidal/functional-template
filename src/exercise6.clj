(ns exercise6)

(defn faverage [x]
  
  (/ (reduce + 0 x) (count x) ))
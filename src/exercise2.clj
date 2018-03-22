(ns exercise2)


(defn greater-than-five [x]
  (> x 5))


(defn only-greater-than-five [x]
  (filter greater-than-five x))

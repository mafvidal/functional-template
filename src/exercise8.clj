(ns exercise8)

(defn fderive [f x]
  #(/ (- (f (+ % x)) (f (- % x))) (* 2 x))
)
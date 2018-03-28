(ns exercise10)

(defn squear [x]
  (
    * x x
   )
)

(defn fesperance [x]

	(/ (reduce + 0 x) (count x))
)

(defn fvariance [x]
	(- (fesperance (map squear x)) (squear (fesperance x)))
)
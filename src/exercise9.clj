(ns exercise9)

(defn things [x]
	(def soy "Soy un ")
	(if (map? x) (str soy "Map") 
	(if (vector? x) (str soy "Vector") 
	(if (string? x) (str soy "String") (str soy "default"))))
)
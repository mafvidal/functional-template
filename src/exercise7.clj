(ns exercise7)

(defn fmap [f x]

	( if (map? x)
		(zipmap (keys x) (map f (vals x)))
		(map f x)		
	)  

)
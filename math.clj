(def math_expression "5 + 5")

(defn parse_expression [s] (clojure.string/split s #" "))

(defn evaluate_expression [v]
    (cond
        (= (get v 1) "+") (+ (Double/parseDouble (get v 0)) (Double/parseDouble (get v 2)))
        (= (get v 1) "-") (- (Double/parseDouble (get v 0)) (Double/parseDouble (get v 2)))
        (= (get v 1) "/") (/ (Double/parseDouble (get v 0)) (Double/parseDouble (get v 2)))
        (= (get v 1) "*") (* (Double/parseDouble (get v 0)) (Double/parseDouble (get v 2)))
        :else nil
    )
)

(println (evaluate_expression (parse_expression math_expression)))

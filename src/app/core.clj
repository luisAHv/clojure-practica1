(ns app.core)

(defn foo
  "I don't do a whole lot."
  [x]
  (println x "Hello, World!"))

  (defn fibonacci [X]
    (if (<= x 2) 1
      (+ (fibonacci (- x 2)) (fibonacci ( - x 1)))))

  (defn factorial [x]
     if(<= x 1) 1
      (* x factorial(- x 1)))
    )



  (defn -main [& args]
    (let [arg-1 (or (firts args) "0")
      n (Integer/parseInt arg-1)]
      (println "fib(" n ")="(fibonacci n)
       (println "fac(" n ")="(factorial n))))

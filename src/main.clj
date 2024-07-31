(ns main)

(def num-threads 100000)
(def c (atom 0))

;; Virtual Threads
(defn v-start [_]
  (-> (Thread/ofVirtual) (.start #(swap! c inc))))

(def vstart (System/currentTimeMillis))

(def v-threads (map v-start (vec (repeat num-threads nil))))

(run! #(.join %) v-threads)

(def vend (System/currentTimeMillis))

(println "count: " @c)
(println "virtual start time (ms): " vstart)
(println "virtual end time (ms): " vend)
(println "virtual elapsed time (ms): " (- vend vstart))

(reset! c 0)

;; Real Threads
(defn r-start [_] (Thread. #(swap! c inc)))

(def rstart (System/currentTimeMillis))

(def r-threads (map r-start (vec (repeat num-threads nil))))


(run! #(.start %) r-threads)

(def rend (System/currentTimeMillis))

(println "count: " @c)
(println "real start time (ms): " rstart)
(println "real end time (ms): " rend)
(println "real elapsed time (ms): " (- rend rstart))

(ns main)

(def c (atom 0))


(defn v-start [_]
  (-> (Thread/ofVirtual) (.start #(swap! c inc))))

(def tstart (System/currentTimeMillis))

(def v-threads (map v-start (vec (repeat 100000 nil))))

(run! #(.join %) v-threads)

(def tend (System/currentTimeMillis))

(println "count: " @c)
(println "virtual start time (ms): " tstart)
(println "virtual end time (ms): " tend)
(println "virtual elapsed time (ms): " (- tend tstart))

(reset! c 0)


(defn r-start [_] (Thread. #(swap! c inc)))

(def rstart (System/currentTimeMillis))

(def r-threads (map r-start (vec (repeat 100000 nil))))


(run! #(.start %) r-threads)

(def rend (System/currentTimeMillis))

(println "count: " @c)
(println "real start time (ms): " rstart)
(println "real end time (ms): " rend)
(println "real elapsed time (ms): " (- rend rstart))

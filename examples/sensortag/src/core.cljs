(ns harald.examples.sensortag
  (:require [cljs.nodejs :as nodejs]))

(defn -main [& args]
  (println "Hello SensorTag"))

(nodejs/enable-util-print!)
(set! *main-cli-fn* -main)

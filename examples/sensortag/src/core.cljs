(ns harald.examples.sensortag
  (:require [cljs.nodejs :as nodejs]))

(def bluetooth (nodejs/require "bleno"))

(defn -main [& args]
  (println "Hello SensorTag"))

(nodejs/enable-util-print!)
(set! *main-cli-fn* -main)

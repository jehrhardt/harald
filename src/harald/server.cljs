(ns harald.server
  (:require [cljs.nodejs :as nodejs]))

(defn greeting []
  (str "Hello " "from " "harald!"))

(defn -main [& args]
  (println (greeting)))

(nodejs/enable-util-print!)
(set! *main-cli-fn* -main)

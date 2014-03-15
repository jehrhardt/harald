(ns harald.server
  (:require [cljs.nodejs :as nodejs]))

(def restify (nodejs/require "restify"))

(defn greeting []
  (str "Hello " "from " "harald!"))

(defn respond [request, response, next]
  (.send response (greeting)))

(defn run-server [port]
  (let [server (.createServer restify)]
    (.get server "/" respond)
    (.listen server port #(println (str "Harald is running on port " port)))))

(defn -main [& args]
  (println (run-server 8080)))

(nodejs/enable-util-print!)
(set! *main-cli-fn* -main)

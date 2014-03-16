(ns harald.server
  (:require [cljs.nodejs :as nodejs]
            [harald.routes :as routes]))

(defn add-routes [server]
  (routes/index server))

(defn run-server [port]
  (let [restify (nodejs/require "restify")
        server (.createServer restify)]
    (add-routes server)
    (.listen server port)
    (println (str "Harald is running on port " port))))

(defn -main [& args]
  (run-server 8080))

(nodejs/enable-util-print!)
(set! *main-cli-fn* -main)

(ns harald.server
  (:require [cljs.nodejs :as nodejs]
            [harald.routes :as routes]))

(defn add-routes [server]
  (routes/index server)
  (routes/advertising server)
  (routes/services server)
  (routes/service server)
  (routes/characteristics server)
  (routes/characteristic server))

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

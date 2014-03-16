(ns harald.routes)

(defn default-response [result]
  (fn [req res next]
    (.send res (str "This will request should return: " result))))

(defn index [server]
  (.get server "/" (default-response "device information")))

(ns harald.routes)

(defn- default-response [result]
  (fn [req res next]
    (.send res (str "This will request should return: " result))))

(defn index [server]
  (.get server "/"
    (default-response "device information")))

(defn advertising [server]
  (.get server "/advertising"
    (default-response "the currently advertised data")))

(defn services [server]
  (.get server "/services"
    (default-response "list of services")))

(defn service [server]
  (.get server "/services/:serviceUuid"
    (default-response "details of a service")))

(defn characteristics [server]
  (.get server "/services/:serviceUuid/characteristics"
    (default-response "list of characteristcs")))

(defn characteristic [server]
  (.get server "/services/:serviceUuid/characteristics/:characteristicUuid"
    (default-response "details of a characteristic")))

(defproject harald "0.1.0"
  :description "The Bluetooth Low Energy device simulator"
  :url "https://github.com/jehrhardt/harald"

  :license {:name "Eclipse Public License"
            :url "http://www.eclipse.org/legal/epl-v10.html"}

  :dependencies [[org.clojure/clojure "1.5.1"]
                 [org.clojure/clojurescript "0.0-2173"]]

  :node-dependencies [[bleno "0.1.3"]
                      [restify "2.6.3"]]

  :plugins [[org.bodil/lein-noderepl "0.1.11"]
            [lein-npm "0.3.0"]
            [lein-cljsbuild "1.0.2"]]

  :cljsbuild {:builds [{:source-paths ["src"]
                        :compiler {:output-to "harald.js"
                                   :pretty-print true
                                   :optimizations :simple
                                   :target :nodejs}}]})

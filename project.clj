(defproject harald "0.1.0-SNAPSHOT"
  :description "ClojureScript library for Bluetooth Low Energy"
  :url "https://github.com/jehrhardt/harald"

  :license {:name "Eclipse Public License"
            :url "http://www.eclipse.org/legal/epl-v10.html"}

  :dependencies [[org.clojure/clojure "1.5.1"]
                 [org.clojure/clojurescript "0.0-2173" :scope "provided"]]

  :profiles {:dev {:node-dependencies [[bleno "0.1.3"]]
                   :plugins [[org.bodil/lein-noderepl "0.1.11"]
                             [lein-npm "0.3.0"]
                             [lein-cljsbuild "1.0.2"]]}}

  :cljsbuild {:builds [{:id "sensortag"
                        :source-paths ["src" "examples/sensortag/src"]
                        :compiler {:output-to "examples/sensortag/main.js"
                                   :output-dir "examples/sensortag/out"
                                   :optimizations :simple
                                   :target :nodejs}}]})

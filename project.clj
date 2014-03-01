(defproject quines "0.0.1"
  :description "Translating miniKanren quines relational interpreter to clojure core.logic... in the browser."
  :url "http://github.com/Oregu/cljs-quines"

  :source-paths ["src/clj/"]
  :resource-paths ["res"]

  :dependencies [[org.clojure/clojure "1.5.1"]
                 [org.clojure/core.logic "0.8.7"]
                 [org.clojure/clojurescript "0.0-2173"]
                 [compojure "1.1.6"]]

  :plugins [[lein-cljsbuild "1.0.1"]
            [lein-ring "0.8.8"]
            [lein-ancient "0.5.5-SNAPSHOT"]]

  :cljsbuild {
    :builds [{
      :source-paths ["src/cljs/"]
      :compiler {
        :output-dir "target/cljs"
        :output-to "res/public/js/hello.js"
        :optimizations :whitespace ; :whitespace, :simple, :advanced
        :pretty-print true}}]}

  :ring {:handler quines.http.server/handler})

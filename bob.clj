(ns bob
  (:use [clojure.string :only [trim upper-case]]))

(defn response-for [message]
  (cond
    (empty? (trim message))          "Fine. Be that way."
    (= message (upper-case message)) "Woah, chill out!"
    (= (last message) \?)            "Sure."
    :else                            "Whatever."))

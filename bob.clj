(ns bob
  (:use [clojure.string :only [trim upper-case]]))

(defn- silence? [message]
  (empty? (trim message)))

(defn- shout? [message]
  (= message (upper-case message)))

(defn- question? [message]
  (= (last message) \?))

(defn response-for [message]
  (cond
    (silence?  message) "Fine. Be that way."
    (shout?    message) "Woah, chill out!"
    (question? message) "Sure."
    :else               "Whatever."))

(ns turbo-one.core
    (:require [reagent.core :as reagent :refer [atom]]
              [reagent.session :as session]
              [secretary.core :as secretary :include-macros true]
              [goog.events :as events]
              [goog.history.EventType :as EventType]
              [cljsjs.react :as react])
    (:import goog.History))

;; -------------------------
;; Views

(defn home-page []
  [:div
   [:h1 "Welcome to turbo-one"]
   [:p "OMG I think Rhiannon will dominate this"]
   [:ul
    [:li "she'll learn all the HTML - yep"]
    [:li "here is my awesome new change!"]
    [:li "and CSS"]
    [:li "and Clojure"]
    [:li "and webdev in general"]]
   [:div [:a {:href "#/about"} "go to about page"]]])

(defn about-page []
  [:div
   [:h2 "About turbo-one"]
   [:ul [:h4 "Stuff accomplished today"]
    [:li "Set up Git"]
    [:li "Set up Github"]
    [:li "Set up Brew"]
    [:li "Set up leiningen"]
    [:li "Set up Light Table"]
    [:li "Learn about Clojure project structure"]
    [:li "Debug initial run"]
    [:li "Find basic web form to use"]]
   [:div [:a {:href "#/"} "go to the home page"]]])

(defn current-page []
  [:div [(session/get :current-page)]])

;; -------------------------
;; Routes
(secretary/set-config! :prefix "#")

(secretary/defroute "/" []
  (session/put! :current-page #'home-page))

(secretary/defroute "/about" []
  (session/put! :current-page #'about-page))

;; -------------------------
;; History
;; must be called after routes have been defined
(defn hook-browser-navigation! []
  (doto (History.)
    (events/listen
     EventType/NAVIGATE
     (fn [event]
       (secretary/dispatch! (.-token event))))
    (.setEnabled true)))

;; -------------------------
;; Initialize app
(defn mount-root []
  (reagent/render [current-page] (.getElementById js/document "app")))

(defn init! []
  (hook-browser-navigation!)
  (mount-root))

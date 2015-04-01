(ns turbo-one.firstform
      (:require [reagent.core :as reagent :refer [atom]]))


(def yourname (atom "Your name here"))
(def landlordname (atom "Your landlord's name here"))
(def landlord-address (atom "Your landlord's address here"))

(def your-signature (atom "Your signature"))
(def your-printed-name (atom "Your printed name"))
(def your-address (atom "Your address"))
(def city-state (atom "Your City, State, Zip"))
(def your-phone (atom "Your Phone Number"))

(def the-facts (atom "Just the facts, ma'am"))

(def empty-precinct (atom ""))
(def empty-place (atom ""))
(def your-county (atom "Your county here"))


(defn atom-input [value]
  [:input {:type "text"
           :value @value
           :on-change #(reset! value (-> % .-target .-value))}])

(defn wide-text-box [value]
  [:input {:type "text"
           :value @value
           :size 40
           :on-change #(reset! value (-> % .-target .-value))}])

(defn small-text-box [value]
  [:input {:type "text"
           :value @value
           :size 2
           :on-change #(reset! value (-> % .-target .-value))}])


(defn text-area-input [value]
  [:textarea.notes {:rows 4 
                    :cols 70 
                    :value @value
                    :on-change #(reset! value (-> % .-target .-value))}])


(defn header []
  [:div
   [:h4.center-children "NO. _________________"]
   [:table.center
    [:tr
     [:td [wide-text-box yourname]]
     [:td ")"]
     [:td.center-children "IN THE JUSTICE COURT"]]
    [:tr
     [:td.center-children "PLAINTIFF,"]
     [:td ")"]
     [:td ""]]
    [:tr
     [:td ""]
     [:td ")"]
     [:td ""]]
    [:tr
     [:td.center-children "vs."]
     [:td ")"]
     [:td.center-children 
      "PRECINCT" [small-text-box empty-precinct]
      ", PLACE" [small-text-box empty-place]]]
    [:tr
     [:td ""]
     [:td ")"]
     [:td ""]]
    [:tr
     [:td [wide-text-box landlordname]]
     [:td ")"]
     [:td.center-children [atom-input your-county] "COUNTY, TEXAS"]]
    [:tr
     [:td.center-chldren "DEFENDANT."]
     [:td ")"]
     [:td ""]]]])



(defn firstform []
  [:div
   [header]
   [:p.center-children [:strong [:ins "PLAINTIFF'S ORIGINAL PETITION"]]]
   [:p "TO THE HONORABLE JUDGE OF THE COURT:"]
   [:p "     Plaintiff files this original petition in the the above-styled and numbered cause, and in support, shows the Court as follows:"]

   [:p.center-children [:b "I. DISCOVERY"]]
   [:ol
    [:li "Plaintiff intends to conduct discovery under Level 1."]]
    [:p.center-children [:b "II. PARTIES"]]
   [:ol {:start 2}

    [:li 
     [atom-input yourname]
     ", Plaintiff, is a resident of the county of this Court, within Texas."]

    [:li 
     [atom-input landlordname]
     ", Defendant, may be served at the following address:" 
     [atom-input landlord-address]]]

   [:p.center-children [:b "III. JURISDICTION AND VENUE"]]
   [:ol {:start 4}
    [:li "The amount in controversy is within the jurisdictional limits of of this Court, and venue is proper as the cause of action arose in the county of this Court within Texas."]]
   [:p.center-children [:b "IV. FACTS AND CAUSES OF ACTION"]]
   [:ol {:start 5}
    [:li "Plaintiff is a tenant and leases premises from Defendant."]
    [:li "The following events occurred in violation of the law: " 

     [text-area-input the-facts]]]

   [:p.center-children [:b "V. REQUEST FOR RELIEF"]]
   [:p "Plaintiff requests this Court grant the following relief: "]
   [:ol {:type "a"}
    [:li "actual damages;"]
    [:li "civil penalties if available under law;"]
    [:li "court costs; and"]
    [:li "any other relief to which Plaintiff is entitled."]]


   [:div.right 
    [:p"Respectfully submitted,"] 
    [atom-input your-signature]
    [atom-input your-printed-name]
    [atom-input your-address]
    [atom-input city-state]
    [atom-input your-phone]]])



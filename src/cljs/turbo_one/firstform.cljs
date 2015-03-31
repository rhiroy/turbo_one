(ns turbo-one.firstform)


(defn firstform []
  [:div
   [:h4.center-children "NO. _________________"]
   [:table.center
    [:tr
     [:td [:input {:type "text" :value "Your name here"}]]
     [:td ")"]
     [:td "IN THE JUSTICE COURT"]]
    [:tr
     [:td "PLAINTIFF,"]
     [:td ")"]
     [:td ""]]
    [:tr
     [:td ""]
     [:td ")"]
     [:td ""]]
    [:tr
     [:td "vs."]
     [:td ")"]
     [:td "PRECINCT" [:input {:type "text" :value "" :size 2}] ", PLACE" [:input {:type "text" :value "" :size 2}] ]]
    [:tr
     [:td ""]
     [:td ")"]
     [:td ""]]
    [:tr
     [:td [:input {:type "text" :value "Your landlord's name here"}]]
     [:td ")"]
     [:td "IN THE JUSTICE COURT"]]
    [:tr
     [:td "DEFENDANT."]
     [:td ")"]
     [:td ""]]]

   [:p.center-children [:strong [:ins "PLAINTIFF'S ORIGINAL PETITION"]]]
   [:p "TO THE HONORABLE JUDGE OF THE COURT:"]
   [:p "     Plaintiff files this original petition in the the above-styled and numbered cause, and in support, shows the Court as follows:"]
   [:p.center-children [:b "I. DISCOVERY"]] 
   [:ol 
    [:li "Plaintiff intends to conduct discovery under Level 1."]
    [:li [:input {:type "text" :value "Your name here"}] ", Plaintiff, is a resident of the county of this Court, within Texas."]
    [:li [:input {:type "text" :value "Your landlord's name here"}] ", Defendant, may be served at the following address:" [:input {:type "text" :value "Your landlord's address here"}]]
    [:li "The amount in controversy is within the jurisdictional limits of of this Court, and venue is proper as the cause of action arose in the county of this Court within Texas."]]
   ])

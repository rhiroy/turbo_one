(ns turbo-one.firstform)


(defn header []
  [:div
<<<<<<< HEAD
   [:h4.center-children "NO. _________________"]
=======
  [:h4.center-children "NO. _________________"]
>>>>>>> 76aefe9224845d59d48b5d2cbab77035c778408f
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
    [:li [:input {:type "text" :value "Your name here"}] ", Plaintiff, is a resident of the county of this Court, within Texas."]
    [:li [:input {:type "text" :value "Your landlord's name here"}] ", Defendant, may be served at the following address:" [:input {:type "text" :value "Your landlord's address here"}]]]
   [:p.center-children [:b "III. JURISDICTION AND VENUE"]]
   [:ol {:start 4}
    [:li "The amount in controversy is within the jurisdictional limits of of this Court, and venue is proper as the cause of action arose in the county of this Court within Texas."]]
   [:p.center-children [:b "IV. FACTS AND CAUSES OF ACTION"]]
   [:ol {:start 5}
    [:li "Plaintiff is a tenant and leases premises from Defendant."]
    [:li "The following events occurred in violation of the law: " [:textarea.notes {:rows 4 :cols 70 :value "Just the facts, ma'am"}]]]
   [:p.center-children [:b "V. REQUEST FOR RELIEF"]]
   [:p "Plaintiff requests this Court grant the following relief: "]
   [:ol {:type "a"}
    [:li "actual damages;"]
    [:li "civil penalties if available under law;"]
    [:li "court costs; and"]
    [:li "any other relief to which Plaintiff is entitled."]]
   [:div.right [:p"Respectfully submitted,"] [:input {:type "text" :value "Your signature"}] [:input {:type "text" :value "Your printed name"}] [:input {:type "text" :value "Your address"}] [:input {:type "text" :value "Your City, State, Zip"}] [:input {:type "text" :value "Your Phone Number"}]]
   ])

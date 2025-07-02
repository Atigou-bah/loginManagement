UML 

@startuml

class Utilisateur {
  - nom: String
  - prenom: String
  - mail: String
  - motDePasse: String
  - statut: String
}

class CreationCompte {
  - utilisateur: Utilisateur
  - dateCreation: Date
}

class Connexion {
  - identifiant: String
  - motDePasse: String
  - dateConnexion: Date
}

class DataBase {
  - utilisateurs: List<CreationCompte>
  - ajouterUtilisateur(u: Utilisateur, date: Date)
}

class UpdatePassword {
  - identifiant: String
  - ancienMDP: String
  - nouveauMDP: String
  - dateModification: Date
}

CreationCompte --> Utilisateur
DataBase --> CreationCompte
Connexion --> Utilisateur : utilise identifiant
UpdatePassword --> Utilisateur : utilise identifiant

@enduml

	
	


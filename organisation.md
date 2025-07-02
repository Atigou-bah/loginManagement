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
  - connexionMySQL: Connection
  + ajouterUtilisateur(u: Utilisateur, date: Date)
  + chercherUtilisateur(mail: String): Utilisateur
  + verifierConnexion(identifiant: String, mdp: String): boolean
}

class UpdatePassword {
  - identifiant: String
  - ancienMDP: String
  - nouveauMDP: String
  - dateModification: Date
}

CreationCompte --> Utilisateur
DataBase --> CreationCompte : gère via MySQL
Connexion --> Utilisateur : utilise identifiant
UpdatePassword --> Utilisateur : utilise identifiant

@enduml

	
	


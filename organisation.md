UML 
@startuml
skinparam classAttributeIconSize 0

' ==== Modèles (données) ====
class Utilisateur {
  - email: String
  - hashMotDePasse: String
  - statut: String
  - tentatives: int
  - dateCreation: Date
  - dernierLogin: Date
}

' ==== Requêtes (DTO – données temporaires) ====
class RegisterRequest {
  - email: String
  - motDePasse: String
}

class LoginRequest {
  - email: String
  - motDePasse: String
}

class UpdatePasswordRequest {
  - email: String
  - ancienMotDePasse: String
  - nouveauMotDePasse: String
}

' ==== Services (logique métier) ====
class RegisterService {
  + inscrire(req: RegisterRequest): Utilisateur
}

class AuthService {
  + connecter(req: LoginRequest): Token
}

class PasswordService {
  + changerMotDePasse(req: UpdatePasswordRequest): void
}

' ==== Token (authentification) ====
class Token {
  - jwt: String
  - expiration: Date
}

class JWTService {
  + genererToken(u: Utilisateur): Token
  + verifierToken(token: String): boolean
}

' ==== Repository (accès aux données) ====
class UtilisateurRepository {
  + findByEmail(email): Utilisateur
  + save(u: Utilisateur): void
}

' ==== Relations ====
RegisterService --> RegisterRequest : utilise
RegisterService --> Utilisateur : crée
RegisterService --> UtilisateurRepository : sauvegarde

AuthService --> LoginRequest : utilise
AuthService --> JWTService : génère
AuthService --> UtilisateurRepository : lit/modifie
AuthService --> Utilisateur : modifie statut/tentatives

PasswordService --> UpdatePasswordRequest : utilise
PasswordService --> UtilisateurRepository : met à jour

JWTService --> Token
UtilisateurRepository --> Utilisateur : stocke

@enduml
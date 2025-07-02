public class Utilisateur {
    private String nom; 
    private String prenom; 
    private String mail; 
    private String password; 
    private Boolean status; 

    public Utilisateur(String nom, String prenom, String mail, String password, Boolean status) {
        this.nom = nom; 
        this.prenom = prenom; 
        this.mail = mail; 
        this.password = password; 
        this.status = status; 
    }

    // Getters
    public String getNom() {
        return nom;
    }

    public String getPrenom() {
        return prenom;
    }

    public String getMail() {
        return mail;
    }

    public String getPassword() {
        return password;
    }

    public Boolean getStatus() {
        return status;
    }

    // Setters
    public void setNom(String nom) {
        this.nom = nom;
    }

    public void setPrenom(String prenom) {
        this.prenom = prenom;
    }

    public void setMail(String mail) {
        this.mail = mail;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public void setStatus(Boolean status) {
        this.status = status;
    }

    public String toString() {
        return "Utilisateur {" +
               "nom='" + nom + '\'' +
               ", prenom='" + prenom + '\'' +
               ", mail='" + mail + '\'' +
               ", password='" + password + '\'' +
               ", status=" + status +
               '}';
    }
}

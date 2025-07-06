import java.time.LocalDate;

public class Utilisateur {
    private String mail; 
    private String password; 
    private String statut; 
    private int tentative; 
    private LocalDate dateCreation; 
    private LocalDate dernierLogin = LocalDate.now(); 

    public Utilisateur(String mail, String password, String statut, int tentative, LocalDate creation) {
        this.mail = mail; 
        this.password = password; 
        this.statut = statut;
        this.tentative = tentative; 
        this.dateCreation = creation; 
    }

    // Getters

    public int getTentative(){
        return tentative; 
    }
    public LocalDate getDateCreation(){
        return dateCreation; 
    }

    public LocalDate getDernierLogin(){
        return dernierLogin; 
    }

    public String getMail() {
        return mail;
    }

    public String getPassword() {
        return password;
    }

    public String getStatus() {
        return statut;
    }

    // Setters

    public void setTentative(int tent){
        this.tentative = tent; 

    }

    public void setDernierLogin(LocalDate login){
        this.dernierLogin = login;
    }
    public void setMail(String mail) {
        this.mail = mail;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public void setStatus(String statut) {
        this.statut = statut;
    }

    public String toString() {
        return "Utilisateur {" +
               "mail='" + mail + '\'' +
               ", tentative='" + tentative + '\'' +
               ", date de creation ='" + dateCreation + '\'' +
               ", dernier Login='" + dernierLogin + '\'' +
               ", password='" + password + '\'' +
               ", status=" + statut +
               '}';
    }
}

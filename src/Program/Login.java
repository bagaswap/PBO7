package Program;

public class Login {
    //deklarasi
    private String username,password;
    
    //konstruktor pertama
    public Login(){
        this.username="admin";
        this.password="12345";
    }
    
    //konstruktor kedua
    public Login(String username, String password){
        this.username=username;
        this.password=password;
    }
    
    //setter
    public void setPassword(String password) {
        this.password = password;
    }

    public void setUsername(String username) {
        this.username = username;
    }
    
    //getter
    public String getPassword() {
        return password;
    }

    public String getUsername() {
        return username;
    }
    
}

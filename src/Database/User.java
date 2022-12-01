package Database;

public class User {
    private String nama;
    private String username;
    private String password;
    private String email;
    public User(){

    }
    public User(String nama, String username, String email, String password){
        this.email=email;
        this.nama=nama;
        this.username=username;
        this.password=password;
    }

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}

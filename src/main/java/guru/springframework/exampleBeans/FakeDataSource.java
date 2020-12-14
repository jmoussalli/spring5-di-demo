package guru.springframework.exampleBeans;

/**
 * Package :  guru.springframework.exampleBeans
 * Created by jerom on 12/12/2020 at 16:50
 */
public class FakeDataSource {
    private String user;
    private String password;
    private String url;

    public String getUser() {
        return user;
    }

    public void setUser(String user) {
        this.user = user;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }
}

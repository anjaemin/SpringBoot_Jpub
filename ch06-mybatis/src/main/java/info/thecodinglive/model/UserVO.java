package info.thecodinglive.model;

import java.io.Serializable;

public class UserVO implements Serializable {
    private String id;
    private String username;
    private String password;

    public UserVO() {}

    public UserVO(String id, String username, String password) {
        this.id = id;
        this.username = username;
        this.password = password;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
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
}

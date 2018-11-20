package info.thecodinglive.model;

import javax.validation.constraints.NotNull;
import java.io.Serializable;

public class UserVO implements Serializable {
    private String id;
    @NotNull(message = "userName 필드가 null입니다.")
    private String username;
    private String email;

    public UserVO() {}

    public UserVO(String id, String username, String email) {
        this.id = id;
        this.username = username;
        this.email = email;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getUserName() {
        return username;
    }

    public void setUserName(String userName) {
        this.username = userName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Override
    public String toString() {
        return "UserVO{" +
                "id='" + id + '\'' +
                ", userName='" + username + '\'' +
                ", email='" + email + '\'' +
                '}';
    }
}

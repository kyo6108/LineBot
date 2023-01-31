package vo;

import java.io.Serializable;

public class User implements Serializable, Cloneable {

    private String userId;

    private String passward;

    private Boolean isAlive;

    private Boolean isSuperUser;

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public String getPassward() {
        return passward;
    }

    public void setPassward(String passward) {
        this.passward = passward;
    }

    public Boolean getAlive() {
        return isAlive;
    }

    public void setAlive(Boolean alive) {
        isAlive = alive;
    }

    public Boolean getSuperUser() {
        return isSuperUser;
    }

    public void setSuperUser(Boolean superUser) {
        isSuperUser = superUser;
    }
}

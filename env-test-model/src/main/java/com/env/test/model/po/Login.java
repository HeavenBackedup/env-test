package com.env.test.model.po;

/**
 * Created by shj on 16-9-26.
 */
public class Login {
    private Integer id;
    private String account;
    private String password;
    private Integer isDelete;

    @Override
    public String toString() {
        return "Login{" +
                "id=" + id +
                ", account='" + account + '\'' +
                ", password='" + password + '\'' +
                ", isDelete=" + isDelete +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Login login = (Login) o;

        if (id != null ? !id.equals(login.id) : login.id != null) return false;
        if (account != null ? !account.equals(login.account) : login.account != null) return false;
        if (password != null ? !password.equals(login.password) : login.password != null) return false;
        return isDelete != null ? isDelete.equals(login.isDelete) : login.isDelete == null;

    }

    @Override
    public int hashCode() {
        int result = id != null ? id.hashCode() : 0;
        result = 31 * result + (account != null ? account.hashCode() : 0);
        result = 31 * result + (password != null ? password.hashCode() : 0);
        result = 31 * result + (isDelete != null ? isDelete.hashCode() : 0);
        return result;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getAccount() {
        return account;
    }

    public void setAccount(String account) {
        this.account = account;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public Integer getIsDelete() {
        return isDelete;
    }

    public void setIsDelete(Integer isDelete) {
        this.isDelete = isDelete;
    }
}

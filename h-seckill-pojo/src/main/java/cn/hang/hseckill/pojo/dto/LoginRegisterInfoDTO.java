package cn.hang.hseckill.pojo.dto;

import lombok.Getter;
import lombok.Setter;

/**
 * @author lihang15
 * @description
 * @create 2018-12-15 22:34
 **/
@Getter
@Setter
public class LoginRegisterInfoDTO {
    private String username;
    private String password;
    private String challenge;
    private String validate;
    private String seccode;

    @Override
    public String toString() {
        return "LoginRegisterInfoDTO(username=" + this.getUsername() + ", password=" + this.getPassword() + ", challenge=" + this.getChallenge() + ", validate=" + this.getValidate() + ", seccode=" + this.getSeccode() + ")";
    }
}

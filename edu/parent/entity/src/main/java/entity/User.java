package entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import java.util.Date;
import java.io.Serializable;

/**
 * (User)实体类
 *
 * @author heying
 * @since 2022-11-18 00:14:13
 */

@Data
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class User implements Serializable {
    private static final long serialVersionUID = 926049905122148486L;
    
    private Integer id;
    
    private String name;
    
    private String portrait;
    
    private String phone;
    
    private String password;
    
    private String regIp;
    
    private Integer accountNonExpired;
    
    private Integer credentialsNonExpired;
    
    private Integer accountNonLocked;
    
    private String status;
    
    private Integer isDel;
    
    private Date createTime;
    
    private Date updateTime;

}


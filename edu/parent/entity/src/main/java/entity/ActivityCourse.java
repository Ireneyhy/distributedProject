package entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import java.util.Date;
import java.io.Serializable;

/**
 * (ActivityCourse)实体类
 *
 * @author heying
 * @since 2022-11-20 20:18:47
 */

@Data
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class ActivityCourse implements Serializable {
    private static final long serialVersionUID = 516830504903576040L;
    
    private Integer id;
    
    private Integer courseId;
    
    private Date beginTime;
    
    private Date endTime;
    
    private Integer amount;
    
    private Integer stock;
    
    private Integer status;
    
    private Integer isDel;
    
    private String remark;
    
    private Date createTime;
    
    private String createUser;
    
    private Date updateTime;
    
    private String updateUser;

}


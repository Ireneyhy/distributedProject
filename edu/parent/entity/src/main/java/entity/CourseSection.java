package entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import java.util.Date;
import java.io.Serializable;
import java.util.List;

/**
 * (CourseSection)实体类
 *
 * @author heying
 * @since 2022-11-19 19:36:05
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class CourseSection implements Serializable {

    private List<CourseLesson> courseLessons;

    private static final long serialVersionUID = 427485031005552623L;
    
    private Integer id;
    
    private Integer courseId;
    
    private String sectionName;
    
    private String description;
    
    private String lastOperator;
    
    private Date createTime;
    
    private Date updateTime;
    
    private Integer isVisible;
    
    private Integer isDel;
    
    private Integer orderNum;
    
    private Integer lastOperatorId;
    
    private Integer status;


}


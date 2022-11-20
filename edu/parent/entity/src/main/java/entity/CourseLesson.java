package entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import java.util.Date;
import java.io.Serializable;

/**
 * (CourseLesson)实体类
 *
 * @author heying
 * @since 2022-11-19 19:35:48
 */

@Data
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class CourseLesson implements Serializable {

    private CourseMedia courseMedia;

    private static final long serialVersionUID = 472753607843671347L;
    
    private Integer id;
    
    private Integer courseId;
    
    private Integer sectionId;
    
    private String theme;
    
    private Integer duration;
    
    private Integer isFree;
    
    private Date createTime;
    
    private Date updateTime;
    
    private Integer isDel;
    
    private Integer orderNum;
    
    private Integer status;

}


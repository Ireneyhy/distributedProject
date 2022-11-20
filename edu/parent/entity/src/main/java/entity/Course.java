package entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import java.util.Date;
import java.io.Serializable;
import java.util.List;

/**
 * (Course)实体类
 *
 * @author heying
 * @since 2022-11-19 19:35:20
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class Course implements Serializable {

    private Teacher teacher;
    private List<CourseSection> courseSections;
    private ActivityCourse activityCourse;

    private static final long serialVersionUID = -88326711622756835L;
    
    private Integer id;
    
    private String courseName;
    
    private String brief;
    
    private Integer price;
    
    private String priceTag;
    
    private Integer discounts;
    
    private String discountsTag;
    
    private String courseDescriptionMarkDown;
    
    private String courseImgUrl;
    
    private Date createTime;
    
    private Date updateTime;
    
    private String courseListImg;
    
    private Integer sortNum;
    
    private String previewFirstField;
    
    private String previewSecondField;
    
    private Integer sales;
    
    private Integer status;

}


package entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import java.util.Date;
import java.io.Serializable;

/**
 * (CourseMedia)实体类
 *
 * @author heying
 * @since 2022-11-19 19:45:02
 */

@Data
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class CourseMedia implements Serializable {

    private static final long serialVersionUID = 672152213897963867L;
    
    private Integer id;
    
    private Integer courseId;
    
    private Integer sectionId;
    
    private Integer lessonId;
    
    private Integer channel;
    
    private Integer mediaType;
    
    private String coverImageUrl;
    
    private String duration;
    
    private String fileId;
    
    private String fileUrl;
    
    private String fileEdk;
    
    private Integer fileSize;
    
    private String fileName;
    
    private String fileDk;
    
    private Date createTime;
    
    private Date updateTime;
    
    private Integer status;
    
    private Integer isDel;
    
    private Integer lastOperatorId;
    
    private Integer durationNum;
}


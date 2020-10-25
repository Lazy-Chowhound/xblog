package szp.blog.xblog.entity;

import com.baomidou.mybatisplus.annotation.TableName;
import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import java.time.LocalDateTime;
import com.baomidou.mybatisplus.annotation.TableField;
import java.io.Serializable;
import lombok.Data;
import lombok.EqualsAndHashCode;

/**
 * <p>
 * 
 * </p>
 *
 * @author szp
 * @since 2020-10-24
 */
@Data
@EqualsAndHashCode(callSuper = false)
@TableName("m_user")
public class User implements Serializable {

    private static final long serialVersionUID = 1L;

    @TableId(value = "id", type = IdType.AUTO)
    private Long id;

    @TableField("username")
    private String username;

    @TableField("avatar")
    private String avatar;

    @TableField("email")
    private String email;

    @TableField("password")
    private String password;

    @TableField("status")
    private Integer status;

    @TableField("created")
    private LocalDateTime created;

    @TableField("last_login")
    private LocalDateTime lastLogin;


}

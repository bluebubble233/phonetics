package org.phonetics.entity.user;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import java.io.Serializable;
import lombok.Data;
import lombok.EqualsAndHashCode;
import org.phonetics.entity.BaseEntity;

/**
 * <p>
 * 
 * </p>
 *
 * @author zzz
 * @since 2023-10-24
 */
@Data
@EqualsAndHashCode(callSuper = false)
public class UserRole   implements Serializable {

    private static final long serialVersionUID = 1L;

    @TableId(value = "id", type = IdType.AUTO)
    private Long id;

    private Long roleId;

    private Long userId;


}

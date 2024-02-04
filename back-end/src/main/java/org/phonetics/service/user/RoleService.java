package org.phonetics.service.user;

import org.phonetics.entity.user.Role;
import com.baomidou.mybatisplus.extension.service.IService;
import org.phonetics.entity.user.Tree;
import org.phonetics.entity.vo.AssignRoleVO;
import org.phonetics.entity.vo.AuthorityVO;
import org.phonetics.util.R;

import java.util.List;

/**
 * <p>
 *  服务类
 * </p>
 *
 * @author zzz
 * @since 2023-10-24
 */
public interface RoleService extends IService<Role> {

    List<Tree> tree();

    R removeRole(String id);

    R gavePermission(AuthorityVO authorityVO);

    R gaveRole(AssignRoleVO assignRoleVO);

}

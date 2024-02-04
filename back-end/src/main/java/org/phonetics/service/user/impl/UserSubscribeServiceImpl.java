package org.phonetics.service.user.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.phonetics.entity.user.UserRole;
import org.phonetics.entity.user.UserSubscribe;
import org.phonetics.mapper.user.UserRoleMapper;
import org.phonetics.mapper.user.UserSubscribeMapper;
import org.phonetics.service.user.UserRoleService;
import org.phonetics.service.user.UserSubscribeService;
import org.springframework.stereotype.Service;

/**
 * @description:
 * @Author: zzz
 * @CreateTime: 2023-11-01 15:05
 */
@Service
public class UserSubscribeServiceImpl  extends ServiceImpl<UserSubscribeMapper, UserSubscribe> implements UserSubscribeService {
}

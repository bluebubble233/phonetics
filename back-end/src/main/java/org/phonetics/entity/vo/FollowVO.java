package org.phonetics.entity.vo;

import lombok.Data;
import org.phonetics.entity.user.Follow;

/**
 * @description:
 * @Author: zzz
 * @CreateTime: 2023-10-25 18:03
 */
@Data
public class FollowVO extends Follow {

    private String nickName;
}

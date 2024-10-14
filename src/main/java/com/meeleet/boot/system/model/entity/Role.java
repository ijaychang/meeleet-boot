package com.meeleet.boot.system.model.entity;

import com.baomidou.mybatisplus.annotation.TableName;
import com.meeleet.boot.common.base.BaseEntity;
import lombok.Getter;
import lombok.Setter;

/**
 * 角色实体
 *
 * @author Ray
 * @since 2024/6/23
 */
@TableName("sys_role")
@Getter
@Setter
public class Role extends BaseEntity {

    /**
     * 角色名称
     */
    private String name;

    /**
     * 角色编码
     */
    private String code;

    /**
     * 显示顺序
     */
    private Integer sort;

    /**
     * 角色状态(1-正常 0-停用)
     */
    private Integer status;

    /**
     * 数据权限
     */
    private Integer dataScope;

    /**
     * 创建人 ID
     */
    private Long createBy;

    /**
     * 更新人 ID
     */
    private Long updateBy;
}
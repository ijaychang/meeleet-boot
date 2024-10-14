package com.meeleet.boot.system.model.entity;

import com.baomidou.mybatisplus.annotation.TableLogic;
import com.baomidou.mybatisplus.annotation.TableName;
import com.meeleet.boot.common.base.BaseEntity;
import lombok.Getter;
import lombok.Setter;

/**
 * 部门实体
 *
 * @author Ray
 * @since 2024/06/23
 */
@TableName("sys_dept")
@Getter
@Setter
public class Dept extends BaseEntity {

    /**
     * 部门名称
     */
    private String name;

    /**
     * 部门编码
     */
    private String code;

    /**
     * 父节点id
     */
    private Long parentId;

    /**
     * 父节点id路径
     */
    private String treePath;

    /**
     * 显示顺序
     */
    private Integer sort;

    /**
     * 状态(1-正常 0-禁用)
     */
    private Integer status;

    /**
     * 创建人 ID
     */
    private Long createBy;

    /**
     * 更新人 ID
     */
    private Long updateBy;

    /**
     * 逻辑删除标识(0-未删除 1-已删除)
     */
    @TableLogic(value = "0", delval = "1")
    private Integer isDeleted;

}
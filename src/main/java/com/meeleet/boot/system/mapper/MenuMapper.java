package com.meeleet.boot.system.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.meeleet.boot.system.model.bo.RouteBO;
import com.meeleet.boot.system.model.entity.Menu;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;
import java.util.Set;

/**
 * 菜单访问层
 *
 * @author Ray
 * @since 2022/1/24
 */

@Mapper
public interface MenuMapper extends BaseMapper<Menu> {

    /**
     * 获取菜单路由列表
     */
    List<RouteBO> listRoutes(Set<String> roles);

}

package com.ruoyi.project.desk.user.mapper;

import com.ruoyi.project.desk.user.domain.DeskUser;

import java.util.List;

/**
 * 用户管理Mapper接口
 * 
 * @author zxt
 * @date 2021-10-11
 */
public interface DeskUserMapper 
{
    /**
     * 查询用户管理
     * 
     * @param id 用户管理主键
     * @return 用户管理
     */
    public DeskUser selectDeskUserById(Long id);

    /**
     * 查询用户管理列表
     * 
     * @param deskUser 用户管理
     * @return 用户管理集合
     */
    public List<DeskUser> selectDeskUserList(DeskUser deskUser);

    /**
     * 新增用户管理
     * 
     * @param deskUser 用户管理
     * @return 结果
     */
    public int insertDeskUser(DeskUser deskUser);

    /**
     * 修改用户管理
     * 
     * @param deskUser 用户管理
     * @return 结果
     */
    public int updateDeskUser(DeskUser deskUser);

    /**
     * 删除用户管理
     * 
     * @param id 用户管理主键
     * @return 结果
     */
    public int deleteDeskUserById(Long id);

    /**
     * 批量删除用户管理
     * 
     * @param ids 需要删除的数据主键集合
     * @return 结果
     */
    public int deleteDeskUserByIds(String[] ids);
}

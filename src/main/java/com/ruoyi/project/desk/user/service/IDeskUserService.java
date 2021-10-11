package com.ruoyi.project.desk.user.service;

import com.ruoyi.project.desk.user.domain.DeskUser;

import java.util.List;

/**
 * 用户管理Service接口
 * 
 * @author zxt
 * @date 2021-10-11
 */
public interface IDeskUserService 
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
     * 批量删除用户管理
     * 
     * @param ids 需要删除的用户管理主键集合
     * @return 结果
     */
    public int deleteDeskUserByIds(String ids);

    /**
     * 删除用户管理信息
     * 
     * @param id 用户管理主键
     * @return 结果
     */
    public int deleteDeskUserById(Long id);
}

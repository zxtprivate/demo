package com.ruoyi.project.desk.user.service.impl;

import com.ruoyi.common.utils.DateUtils;
import com.ruoyi.common.utils.text.Convert;
import com.ruoyi.project.desk.user.domain.DeskUser;
import com.ruoyi.project.desk.user.mapper.DeskUserMapper;
import com.ruoyi.project.desk.user.service.IDeskUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * 用户管理Service业务层处理
 * 
 * @author zxt
 * @date 2021-10-11
 */
@Service
public class DeskUserServiceImpl implements IDeskUserService
{
    @Autowired
    private DeskUserMapper deskUserMapper;

    /**
     * 查询用户管理
     * 
     * @param id 用户管理主键
     * @return 用户管理
     */
    @Override
    public DeskUser selectDeskUserById(Long id)
    {
        return deskUserMapper.selectDeskUserById(id);
    }

    /**
     * 查询用户管理列表
     * 
     * @param deskUser 用户管理
     * @return 用户管理
     */
    @Override
    public List<DeskUser> selectDeskUserList(DeskUser deskUser)
    {
        return deskUserMapper.selectDeskUserList(deskUser);
    }

    /**
     * 新增用户管理
     * 
     * @param deskUser 用户管理
     * @return 结果
     */
    @Override
    public int insertDeskUser(DeskUser deskUser)
    {
        deskUser.setCreateTime(DateUtils.getNowDate());
        return deskUserMapper.insertDeskUser(deskUser);
    }

    /**
     * 修改用户管理
     * 
     * @param deskUser 用户管理
     * @return 结果
     */
    @Override
    public int updateDeskUser(DeskUser deskUser)
    {
        deskUser.setUpdateTime(DateUtils.getNowDate());
        return deskUserMapper.updateDeskUser(deskUser);
    }

    /**
     * 批量删除用户管理
     * 
     * @param ids 需要删除的用户管理主键
     * @return 结果
     */
    @Override
    public int deleteDeskUserByIds(String ids)
    {
        return deskUserMapper.deleteDeskUserByIds(Convert.toStrArray(ids));
    }

    /**
     * 删除用户管理信息
     * 
     * @param id 用户管理主键
     * @return 结果
     */
    @Override
    public int deleteDeskUserById(Long id)
    {
        return deskUserMapper.deleteDeskUserById(id);
    }
}

package com.ruoyi.project.desk.user.controller;

import com.ruoyi.common.utils.poi.ExcelUtil;
import com.ruoyi.framework.aspectj.lang.annotation.Log;
import com.ruoyi.framework.aspectj.lang.enums.BusinessType;
import com.ruoyi.framework.web.controller.BaseController;
import com.ruoyi.framework.web.domain.AjaxResult;
import com.ruoyi.framework.web.page.TableDataInfo;
import com.ruoyi.project.desk.user.domain.DeskUser;
import com.ruoyi.project.desk.user.service.IDeskUserService;
import org.apache.shiro.authz.annotation.RequiresPermissions;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * 用户管理Controller
 * 
 * @author zxt
 * @date 2021-10-11
 */
@Controller
@RequestMapping("/port/user")
public class DeskUserController extends BaseController
{
    private String prefix = "desk/user";

    @Autowired
    private IDeskUserService deskUserService;

    @GetMapping()
    public String user()
    {
        return prefix + "/index";
    }

    @GetMapping("/list")
    public String pageList(){
        return prefix + "/list";
    }
    /**
     * 查询用户管理列表
     */
    @PostMapping("/list")
    @ResponseBody
    public List<DeskUser> list(DeskUser deskUser)
    {
        List<DeskUser> list = deskUserService.selectDeskUserList(deskUser);
        return list;
    }

    /**
     * 导出用户管理列表
     */
    @Log(title = "用户管理", businessType = BusinessType.EXPORT)
    @PostMapping("/export")
    @ResponseBody
    public AjaxResult export(DeskUser deskUser)
    {
        List<DeskUser> list = deskUserService.selectDeskUserList(deskUser);
        ExcelUtil<DeskUser> util = new ExcelUtil<DeskUser>(DeskUser.class);
        return util.exportExcel(list, "用户管理数据");
    }

    /**
     * 新增用户管理
     */
    @GetMapping("/add")
    public String add()
    {
        return prefix + "/add";
    }

    /**
     * 新增保存用户管理
     */
    @Log(title = "用户管理", businessType = BusinessType.INSERT)
    @PostMapping("/add")
    @ResponseBody
    public AjaxResult addSave(DeskUser deskUser)
    {
        return toAjax(deskUserService.insertDeskUser(deskUser));
    }

    /**
     * 修改用户管理
     */
    @GetMapping("/edit/{id}")
    public String edit(@PathVariable("id") Long id, ModelMap mmap)
    {
        DeskUser deskUser = deskUserService.selectDeskUserById(id);
        mmap.put("deskUser", deskUser);
        return prefix + "/edit";
    }

    /**
     * 修改保存用户管理
     */
    @Log(title = "用户管理", businessType = BusinessType.UPDATE)
    @PostMapping("/edit")
    @ResponseBody
    public AjaxResult editSave(DeskUser deskUser)
    {
        return toAjax(deskUserService.updateDeskUser(deskUser));
    }

    /**
     * 删除用户管理
     */
    @Log(title = "用户管理", businessType = BusinessType.DELETE)
    @PostMapping( "/remove")
    @ResponseBody
    public AjaxResult remove(String ids)
    {
        return toAjax(deskUserService.deleteDeskUserByIds(ids));
    }
}

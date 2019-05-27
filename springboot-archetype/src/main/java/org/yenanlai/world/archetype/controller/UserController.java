package org.yenanlai.world.archetype.controller;

import javax.annotation.Resource;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.yenanlai.world.archetype.core.Result;
import org.yenanlai.world.archetype.domain.model.User;
import org.yenanlai.world.archetype.service.UserService;

import com.github.pagehelper.PageInfo;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiParam;

@Api(tags = "用户", description = "information about user")
@RestController
@RequestMapping("/api")
public class UserController {

    @Resource
    private UserService userService;

    @ApiOperation(value = "用户：分页查询")
    @GetMapping("/users")
    public Result<PageInfo<User>> get(
            @ApiParam("页码") @RequestParam(value = "pageNum", required = false, defaultValue = "1") int pageNum,
            @ApiParam("每页条目") @RequestParam(value = "pageSize", required = false, defaultValue = "10") int pageSize) {
        return Result.ok(new PageInfo<>(userService.get(pageNum, pageSize)));
    }

}

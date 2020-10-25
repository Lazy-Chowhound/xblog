package szp.blog.xblog.controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import org.springframework.web.bind.annotation.RestController;
import szp.blog.xblog.service.UserService;

/**
 * <p>
 * 前端控制器
 * </p>
 *
 * @author szp
 * @since 2020-10-24
 */
@RestController
@RequestMapping("/user")
public class UserController {
    @Autowired
    UserService userService;

    @GetMapping("/{id}")
    public Object test(@PathVariable("id") Long id) {
        return userService.getById(id);
    }
}

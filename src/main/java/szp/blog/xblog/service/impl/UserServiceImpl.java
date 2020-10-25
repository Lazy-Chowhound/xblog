package szp.blog.xblog.service.impl;

import szp.blog.xblog.entity.User;
import szp.blog.xblog.mapper.UserMapper;
import szp.blog.xblog.service.UserService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 *  服务实现类
 * </p>
 *
 * @author szp
 * @since 2020-10-24
 */
@Service
public class UserServiceImpl extends ServiceImpl<UserMapper, User> implements UserService {

}

package szp.blog.xblog.service.impl;

import szp.blog.xblog.entity.Blog;
import szp.blog.xblog.mapper.BlogMapper;
import szp.blog.xblog.service.BlogService;
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
public class BlogServiceImpl extends ServiceImpl<BlogMapper, Blog> implements BlogService {

}

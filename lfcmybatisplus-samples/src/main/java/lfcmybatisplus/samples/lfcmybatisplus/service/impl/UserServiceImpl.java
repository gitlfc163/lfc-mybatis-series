package lfcmybatisplus.samples.lfcmybatisplus.service.impl;

import lfcmybatisplus.samples.lfcmybatisplus.entity.User;
import lfcmybatisplus.samples.lfcmybatisplus.mapper.UserMapper;
import lfcmybatisplus.samples.lfcmybatisplus.service.UserService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 * 用户表 服务实现类
 * </p>
 *
 * @author longfc
 * @since 2023-07-07
 */
@Service
public class UserServiceImpl extends ServiceImpl<UserMapper, User> implements UserService {

}

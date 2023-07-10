package lfcmybatisplus.samples2.lfcmybatisplus.mapper;

import lfcmybatisplus.samples2.lfcmybatisplus.entity.User;

import org.apache.ibatis.annotations.Mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;

/**
 * <p>
 * 用户表 Mapper 接口
 * </p>
 *
 * @author longfc
 * @since 2023-07-07
 */
@Mapper
public interface UserMapper extends BaseMapper<User> {

}

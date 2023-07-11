package lfcmybatisplus.samples2.lfcmybatisplus;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import lfcmybatisplus.samples2.lfcmybatisplus.entity.User;
import lfcmybatisplus.samples2.lfcmybatisplus.mapper.UserMapper;
import lombok.extern.slf4j.Slf4j;

import java.util.List;

@SpringBootTest
@Slf4j
public class UserMapperTest {

    @Autowired
    private UserMapper userMapper;

    @Test
    public void TestUserMapperSelect() {
        System.out.println(("----- selectAll method test ------"));
        log.info("----- selectAll method test ------");
        List<User> userList = userMapper.selectList(null);
        userList.forEach(System.out::println);

    }

}

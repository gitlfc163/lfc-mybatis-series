package lfcmybatisplus.samples.lfcmybatisplus;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import lfcmybatisplus.samples.lfcmybatisplus.entity.User;
import lfcmybatisplus.samples.lfcmybatisplus.mapper.UserMapper;
import lfcmybatisplus.samples.lfcmybatisplus.service.UserService;
import lombok.extern.slf4j.Slf4j;

import java.util.List;

@SpringBootTest
@Slf4j
public class UserMapperTest {

    @Autowired
    private UserMapper userMapper;

    @Autowired
    private UserService userService;

    @Test
    public void TestUserMapperSelect() {
        System.out.println(("----- selectAll method test ------"));
        List<User> userList = userMapper.selectList(null);
        log.info("TestUserMapperSelect:");
        userList.forEach(System.out::println);

    }

    @Test
    public void TstUserServiceList() {
        System.out.println(("----- selectAll method test ------"));
        List<User> userList = userService.list(null);
        log.info("TstUserServiceList:");
        // Assert.assertEquals(5, userList.size());
        userList.forEach(System.out::println);

    }

}

package lfcmybatisplus.samples.lfcmybatisplus;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import lfcmybatisplus.samples.lfcmybatisplus.entity.User;
import lfcmybatisplus.samples.lfcmybatisplus.mapper.UserMapper;
import java.util.List;

@SpringBootTest
public class UserMapperTest {

    @Autowired
    private UserMapper userMapper;

    @Test
    public void testSelect() {
        System.out.println(("----- selectAll method test ------"));
        List<User> userList = userMapper.selectList(null);
        // Assert.assertEquals(5, userList.size());
        userList.forEach(System.out::println);

    }

}

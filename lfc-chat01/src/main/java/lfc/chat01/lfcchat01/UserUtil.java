package lfc.chat01.lfcchat01;

import java.io.IOException;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import lombok.extern.slf4j.Slf4j;

@Slf4j
/**
 * UserUtil类用以调用mybatis的方法
 */
public class UserUtil {
    private static SqlSessionFactory sqlSessionFactory = build();

    public static SqlSessionFactory build() {
        try {
            // 加载mybatis-config.xml
            return new SqlSessionFactoryBuilder().build(Resources.getResourceAsStream("mybatis-config.xml"));
        } catch (IOException e) {
            log.error(e.getMessage(), e);
            throw new RuntimeException(e);
        }
    }

    @FunctionalInterface
    public interface SessionCall<O> {
        O call(SqlSession session) throws Exception;
    }

    @FunctionalInterface
    public interface MapperCall<T, O> {
        O call(T mapper) throws Exception;
    }

    public static <T, O> O callMapper(Class<T> tClass, MapperCall<T, O> mapper) throws Exception {
        return call(session -> mapper.call(session.getMapper(tClass)));
    }

    public static <O> O call(SessionCall<O> sessionCall) throws Exception {
        try (SqlSession session = sqlSessionFactory.openSession(true);) {
            return sessionCall.call(session);
        }
    }
}
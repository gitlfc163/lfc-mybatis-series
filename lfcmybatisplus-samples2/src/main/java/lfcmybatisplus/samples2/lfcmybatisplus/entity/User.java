package lfcmybatisplus.samples2.lfcmybatisplus.entity;

import lombok.Data;

/**
 * <p>
 * 用户表
 * </p>
 *
 * @author longfc
 * @since 2023-07-07
 */
@Data
public class User {
    private Long id;
    private String name;
    private Integer age;
    private String email;
}
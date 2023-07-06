package lfc.chat01.lfcchat01.chat01;

import lombok.*;

/**
 * UserModel类
 */
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
@ToString
public class UserModel {
    private Long id;
    private String name;
    private Integer age;
    private Double salary;
}
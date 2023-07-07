package lfc.chat02.lfcchat02;

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
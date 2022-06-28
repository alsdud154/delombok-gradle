package delombok.dto;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Member {
    // 이름
    private String name;
    // 나이
    private Integer age;

    private Team team;
}

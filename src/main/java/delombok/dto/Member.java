package delombok.dto;

import lombok.Getter;
import lombok.NonNull;
import lombok.Setter;

@Getter
@Setter
public class Member {
    // 이름
    @NonNull
    private String name;
    // 나이
    private Integer age;

    private Team team;
}

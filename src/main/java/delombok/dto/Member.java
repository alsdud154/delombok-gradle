package delombok.dto;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Member {
    private String name;
    private Integer age;

    public static void main(String[] args) {
        System.out.println("args = " + args);
    }
}

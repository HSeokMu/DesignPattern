package Structural.Adapter;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;

@AllArgsConstructor
@Data
@Builder
public class NaverUser {
    private String email;
    private String password;
    private String name;
    public static final String NAVER_SECRET = "NAV_SECRET";

    public String login() {
        System.out.println("네이버 로그인 성공");
        return email + NAVER_SECRET + name;
    }
}

package Structural.Adapter;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;

@AllArgsConstructor
@Data
@Builder
public class KakaoUser {
    private String id;
    private String password;
    private String username;
    private String email;
    public static final String KAKAO_SECRET = "KKO_SECRET";

    public String login() {
        System.out.println("카카오 로그인 성공");
        return id + KAKAO_SECRET + email;
    }
}

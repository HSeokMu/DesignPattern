package Structural.Adapter;

import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
public class KaKaoUserAdapter implements SocialNetworkAuthTarget {
    private final KakaoUser kakaoUser;

    @Override
    public String getServiceName() {
        return "KAKAO";
    }

    @Override
    public String getUserName() {
        return kakaoUser.getUsername();
    }

    @Override
    public String getSecret() {
        return KakaoUser.KAKAO_SECRET;
    }

    @Override
    public String getToken() {
        return kakaoUser.login();
    }
}

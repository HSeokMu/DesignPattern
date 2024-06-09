package Structural.Adapter;

import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
public class NaverUserAdapter implements SocialNetworkAuthTarget {
    private final NaverUser naverUser;

    @Override
    public String getServiceName() {
        return "NAVER";
    }

    @Override
    public String getUserName() {
        return naverUser.getName();
    }

    @Override
    public String getSecret() {
        return NaverUser.NAVER_SECRET;
    }

    @Override
    public String getToken() {
        return naverUser.login();
    }
}

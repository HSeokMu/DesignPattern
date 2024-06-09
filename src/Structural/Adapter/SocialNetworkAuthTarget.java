package Structural.Adapter;

public interface SocialNetworkAuthTarget {
    String getServiceName();
    String getUserName();
    String getSecret();
    String getToken();
}

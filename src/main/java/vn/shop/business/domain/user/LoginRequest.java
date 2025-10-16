package vn.shop.business.domain.user;

import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Builder(toBuilder = true)
public class LoginRequest {
    private String username;
    private String password;
}

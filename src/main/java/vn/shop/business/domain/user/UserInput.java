package vn.shop.business.domain.user;

import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Builder(toBuilder = true)
public class UserInput {
	private Long id;
    private String username;
    private String password;
    private String email;
    private String role; // ADMIN, STAFF, USER
    private boolean locked;
}

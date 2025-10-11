package vn.shop.business.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.CorsRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@Configuration
public class WebConfig implements WebMvcConfigurer {
	@Override
	public void addCorsMappings(CorsRegistry registry) {
		registry.addMapping("/api/**") // Áp dụng cho tất cả các endpoint bắt đầu bằng /api
				.allowedOrigins("http://localhost:3000") // Cho phép request từ địa chỉ này
				.allowedMethods("GET", "POST", "PUT", "DELETE", "OPTIONS") // Cho phép các phương thức HTTP này
				.allowedHeaders("*") // Cho phép tất cả các header
				.allowCredentials(true);
	}
}

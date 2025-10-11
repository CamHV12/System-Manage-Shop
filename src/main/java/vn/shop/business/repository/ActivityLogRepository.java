package vn.shop.business.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import vn.shop.business.entity.ActivityLog;

public interface ActivityLogRepository extends JpaRepository<ActivityLog, Long> {}
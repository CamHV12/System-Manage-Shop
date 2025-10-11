package vn.shop.business.service;

import vn.shop.business.entity.ActivityLog;
import vn.shop.business.repository.ActivityLogRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class ActivityLogService {
    @Autowired
    private ActivityLogRepository activityLogRepository;

    public List<ActivityLog> getAllLogs() { return activityLogRepository.findAll(); }
    public ActivityLog saveLog(ActivityLog log) { return activityLogRepository.save(log); }
}
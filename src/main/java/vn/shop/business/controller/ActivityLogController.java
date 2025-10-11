package vn.shop.business.controller;

import vn.shop.business.service.ActivityLogService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class ActivityLogController {
    @Autowired
    private ActivityLogService activityLogService;

    @GetMapping("/activity-logs")
    public String listLogs(Model model) {
        model.addAttribute("logs", activityLogService.getAllLogs());
        return "activitylog/list";
    }
}
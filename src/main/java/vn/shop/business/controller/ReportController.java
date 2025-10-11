package vn.shop.business.controller;

import vn.shop.business.service.ReportService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class ReportController {
    @Autowired
    private ReportService reportService;

    @GetMapping("/reports")
    public String showReports(Model model) {
        model.addAttribute("revenue", reportService.getRevenue());
        model.addAttribute("userCount", reportService.getUserCount());
        model.addAttribute("orderCount", reportService.getOrderCount());
        model.addAttribute("inventory", reportService.getInventory());
        model.addAttribute("employeePerformance", reportService.getEmployeePerformance());
        return "report/list";
    }
}
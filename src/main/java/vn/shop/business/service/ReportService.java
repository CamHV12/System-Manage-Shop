package vn.shop.business.service;

import org.springframework.stereotype.Service;

@Service
public class ReportService {
    public double getRevenue() { return 1000000; } // demo
    public int getUserCount() { return 100; }
    public int getOrderCount() { return 50; }
    public int getInventory() { return 200; }
    public int getEmployeePerformance() { return 80; }
}
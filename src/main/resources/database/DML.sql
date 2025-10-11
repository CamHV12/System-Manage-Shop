-- Dữ liệu mẫu
INSERT INTO users (username, password, email, role, locked) VALUES
('admin', 'hashed_password_1', 'admin@shop.com', 'ADMIN', false),
('staff1', 'hashed_password_2', 'staff1@shop.com', 'STAFF', false),
('customer1', 'hashed_password_3', 'customer1@gmail.com', 'USER', false),
('customer2', 'hashed_password_4', 'customer2@gmail.com', 'USER', true);

-- Dữ liệu mẫu
INSERT INTO department (name) VALUES
('Phòng Kinh Doanh'),
('Phòng Kỹ Thuật'),
('Phòng Nhân Sự');

-- Dữ liệu mẫu
INSERT INTO employee (name, position, salary, department_id) VALUES
('Nguyễn Văn A', 'Trưởng phòng', 50000000, 1),
('Trần Thị B', 'Lập trình viên', 30000000, 2),
('Lê Văn C', 'Nhân viên tuyển dụng', 25000000, 3);

-- Dữ liệu mẫu
INSERT INTO category (name) VALUES
('Điện thoại'),
('Laptop'),
('Phụ kiện');

-- Dữ liệu mẫu
INSERT INTO brand (name) VALUES
('Apple'),
('Samsung'),
('Dell');

-- Dữ liệu mẫu
INSERT INTO product (name, description, price, stock, image_url, category_id, brand_id) VALUES
('iPhone 15 Pro Max', 'Điện thoại cao cấp nhất của Apple', 34000000, 100, '/images/iphone15.jpg', 1, 1),
('Samsung Galaxy S23 Ultra', 'Điện thoại Android hàng đầu', 28000000, 80, '/images/s23ultra.jpg', 1, 2),
('Dell XPS 15', 'Laptop mạnh mẽ cho công việc', 45000000, 50, '/images/dellxps15.jpg', 2, 3);

-- Dữ liệu mẫu
INSERT INTO orders (order_date, status, total, customer_id) VALUES
('2025-10-10 10:30:00', 'Đã giao', 34000000, 3),
('2025-10-11 14:00:00', 'Đang xử lý', 45000000, 3);


-- Dữ liệu mẫu
INSERT INTO post (title, content, type) VALUES
('Chương trình khuyến mãi tháng 10', 'Nội dung chi tiết về chương trình...', 'notification'),
('Đánh giá iPhone 15', 'Nội dung bài đánh giá...', 'blog');

-- Dữ liệu mẫu
INSERT INTO banner (image_url, link, type) VALUES
('/banners/top-banner.jpg', '/khuyen-mai-thang-10', 'banner'),
('/popups/welcome.jpg', '/dang-ky', 'popup');

-- Dữ liệu mẫu
INSERT INTO system_config ("key", "value") VALUES
('website_name', 'Cửa Hàng ABC'),
('hotline', '19001234'),
('admin_email', 'admin@shop.com');

-- Dữ liệu mẫu
INSERT INTO contact_message (name, email, message, replied) VALUES
('Khách hàng A', 'khachhanga@email.com', 'Sản phẩm này có tốt không?', false),
('Khách hàng B', 'khachhangb@email.com', 'Cảm ơn shop đã hỗ trợ.', true);

-- Dữ liệu mẫu
INSERT INTO activity_log (username, action, timestamp) VALUES
('admin', 'Đăng nhập vào hệ thống', '2025-10-11 09:00:00'),
('staff1', 'Cập nhật sản phẩm ID 2', '2025-10-11 09:15:00');
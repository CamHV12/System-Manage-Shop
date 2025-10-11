-- Tạo bảng users
CREATE TABLE users (
    id BIGSERIAL PRIMARY KEY,
    username VARCHAR(255) NOT NULL UNIQUE,
    password VARCHAR(255) NOT NULL,
    email VARCHAR(255) NOT NULL UNIQUE,
    role VARCHAR(50),
    locked BOOLEAN DEFAULT FALSE
);

-- Tạo bảng department
CREATE TABLE department (
    id BIGSERIAL PRIMARY KEY,
    name VARCHAR(255) NOT NULL
);

-- Tạo bảng employee
CREATE TABLE employee (
    id BIGSERIAL PRIMARY KEY,
    name VARCHAR(255) NOT NULL,
    position VARCHAR(255),
    salary DOUBLE PRECISION,
    department_id BIGINT,
    FOREIGN KEY (department_id) REFERENCES department(id)
);

-- Tạo bảng category
CREATE TABLE category (
    id BIGSERIAL PRIMARY KEY,
    name VARCHAR(255) NOT NULL
);

-- Tạo bảng brand
CREATE TABLE brand (
    id BIGSERIAL PRIMARY KEY,
    name VARCHAR(255) NOT NULL
);

-- Tạo bảng product
CREATE TABLE product (
    id BIGSERIAL PRIMARY KEY,
    name VARCHAR(255) NOT NULL,
    description TEXT,
    price DOUBLE PRECISION NOT NULL,
    stock INTEGER NOT NULL,
    image_url VARCHAR(255),
    category_id BIGINT,
    brand_id BIGINT,
    FOREIGN KEY (category_id) REFERENCES category(id),
    FOREIGN KEY (brand_id) REFERENCES brand(id)
);

-- Tạo bảng orders
CREATE TABLE orders (
    id BIGSERIAL PRIMARY KEY,
    order_date TIMESTAMP,
    status VARCHAR(255),
    total DOUBLE PRECISION,
    customer_id BIGINT,
    FOREIGN KEY (customer_id) REFERENCES users(id)
);

-- Tạo bảng post
CREATE TABLE post (
    id BIGSERIAL PRIMARY KEY,
    title VARCHAR(255) NOT NULL,
    content TEXT,
    type VARCHAR(100) -- news, blog, notification
);


-- Tạo bảng banner
CREATE TABLE banner (
    id BIGSERIAL PRIMARY KEY,
    image_url VARCHAR(255),
    link VARCHAR(255),
    type VARCHAR(100) -- banner, popup, ad
);

-- Tạo bảng system_config
CREATE TABLE system_config (
    id BIGSERIAL PRIMARY KEY,
    "key" VARCHAR(255) NOT NULL UNIQUE,
    "value" TEXT
);

-- Tạo bảng contact_message
CREATE TABLE contact_message (
    id BIGSERIAL PRIMARY KEY,
    name VARCHAR(255),
    email VARCHAR(255),
    message TEXT,
    replied BOOLEAN DEFAULT FALSE
);

-- Tạo bảng activity_log
CREATE TABLE activity_log (
    id BIGSERIAL PRIMARY KEY,
    username VARCHAR(255),
    action VARCHAR(255),
    timestamp TIMESTAMP
);
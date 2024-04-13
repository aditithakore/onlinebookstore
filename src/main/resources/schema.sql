CREATE DATABASE online_book_store;
use online_book_store;
-- Create Publishers table
CREATE TABLE Publishers (
    publisher_id INT PRIMARY KEY,
    name VARCHAR(255),
    location VARCHAR(255)
);

-- Create Users table
CREATE TABLE Users (
    user_id INT PRIMARY KEY,
    username VARCHAR(255),
    email VARCHAR(255) UNIQUE,
    password VARCHAR(255),
    first_name VARCHAR(255),
    last_name VARCHAR(255),
    shipping_address TEXT,
    billing_address TEXT,
    role ENUM('customer', 'admin')
);

-- Create Authors table
CREATE TABLE Authors (
    author_id INT PRIMARY KEY,
    name VARCHAR(255),
    biography TEXT
);

-- Create Categories table
CREATE TABLE Categories (
    category_id INT PRIMARY KEY,
    name VARCHAR(255)
);

-- Create Books table
CREATE TABLE Books (
    book_id INT PRIMARY KEY,
    title VARCHAR(255),
    author_id INT,
    isbn VARCHAR(255) UNIQUE,
    publisher_id INT,
    category_id INT,
    description TEXT,
    price DECIMAL(10, 2),
    stock INT,
    publication_date DATE,
    cover_image VARCHAR(255),
    FOREIGN KEY (author_id) REFERENCES Authors(author_id),
    FOREIGN KEY (publisher_id) REFERENCES Publishers(publisher_id),
    FOREIGN KEY (category_id) REFERENCES Categories(category_id)
);

-- Create Orders table
CREATE TABLE Orders (
    order_id INT PRIMARY KEY,
    user_id INT,
    order_date DATETIME,
    total_price DECIMAL(10, 2),
    order_status ENUM('placed', 'shipped', 'delivered'),
    FOREIGN KEY (user_id) REFERENCES Users(user_id)
);

-- Create Order_Items table
CREATE TABLE Order_Items (
    order_item_id INT PRIMARY KEY,
    order_id INT,
    book_id INT,
    quantity INT,
    price DECIMAL(10, 2),
    FOREIGN KEY (order_id) REFERENCES Orders(order_id),
    FOREIGN KEY (book_id) REFERENCES Books(book_id)
);

-- Additional Tables (Optional)

-- Reviews table
CREATE TABLE Reviews (
    review_id INT PRIMARY KEY,
    user_id INT,
    book_id INT,
    rating INT,
    comment TEXT,
    FOREIGN KEY (user_id) REFERENCES Users(user_id),
    FOREIGN KEY (book_id) REFERENCES Books(book_id)
);

-- Wishlists table
CREATE TABLE Wishlists (
    wishlist_id INT PRIMARY KEY,
    user_id INT,
    book_id INT,
    FOREIGN KEY (user_id) REFERENCES Users(user_id),
    FOREIGN KEY (book_id) REFERENCES Books(book_id)
);

-- Payments table
CREATE TABLE Payments (
    payment_id INT PRIMARY KEY,
    user_id INT,
    payment_info TEXT,
    FOREIGN KEY (user_id) REFERENCES Users(user_id)
);

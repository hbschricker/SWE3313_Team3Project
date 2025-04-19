|Entity        | Property          | Data Type        | Default             | Nullable | Relationships                             | Note         |
|--------------|-------------------|------------------|---------------------|----------|-------------------------------------------|--------------|
| Users        | user_id           | INT              | AUTO_INCREMENT      | NO       | Primary Key                               |  Unique user identifier            |
|              | user_name         | NVARCHAR(50)     | NULL                | NO       |                                           |   Must be unique           |
|              | password_hash     | NVARCHAR(255)    | NULL                | NO       |                                           |   Stored as hash           |
|              | email             | NVARCHAR(100)    | NULL                | NO       |                                           |  Valid email format         |
|              | is_admin          | BIT              | 0                   | NO       |                                           |  1 = admin, 0 = regular user |
| Products     | product_id        | INT              | AUTO_INCREMENT      | NO       | Primary Key                               |Unique product identifier   |
|              | name              | NVARCHAR(100)    | NULL                | NO       |                                           | Product name shown          |
|              | description       | NVARCHAR(500)    | NULL                | NO       |                                           |              |
|              | price             | DECIMAL(10,2)    | 0.00                | NO       |                                           |              |
|              | is_sold           | BIT              | 0                   | NO       |                                           | Hides item when sold        |
| Cart_items   | cart_item_id      | INT              | AUTO_INCREMENT      | NO       | Primary Key                               |Unique ID for each cart line|
|              | user_id           | INT              | NULL                | NO       | Foreign Key → Users(user_id)              | Owner of the cart           |
|              | product_id        | INT              | NULL                | NO       | Foreign Key → Products(product_id)        | Item in cart            |  |              | quantity          | INT              | 1                   | NO       |                                           | How many of the item added|
| Orders       | order_id          | INT              | AUTO_INCREMENT      | NO       | Primary Key                               | Unique order number       |
|              | user_id           | INT              | NULL                | NO       | Foreign Key → Users(user_id)              | Who placed the order       |
|              | order_date        | DATETIME         | CURRENT_TIMESTAMP   | NO       |                                           | When the order was made  |
|              | shipping_address  | NVARCHAR(255)    | NULL                | NO       |                                           |Full delivery address       |
|              | shipping_speed    | NVARCHAR(20)     | Ground              | NO       |                                           |Overnight,'Day', or 'Ground'|
|              | subtotal          | DECIMAL(10,2)    | 0.00                | NO       |                                           | Total of all item prices   |
|              | tax               | DECIMAL(10,2)    | 0.00                | NO       |                                           |6% of subtotal            |
|              | shipping_cost     | DECIMAL(10,2)    | 0.00                | NO       |                                           |Based on shipping speed     |
|              | total             | DECIMAL(10,2)    | 0.00                | NO       |                                           |subtotal + tax + shipping   |
| Order_Items  | order_item_id     | INT              | AUTO_INCREMENT      | NO       | Primary Key                               |Unique line item in an order|
|              | order_id          | INT              | NULL                | NO       | Foreign Key → Orders(order_id)            | Belongs to a specific order|
|              | product_id        | INT              | NULL                | NO       | Foreign Key → Products(product_id)        |What product was purchased  |
|              | quantity          | INT              | 1                   | NO       |                                           |Quantity purchased          |
|              | price_each        | DECIMAL(10,2)    | 0.00                | NO       |                                           |              |
| Payment      | payment_id        | INT              | AUTO_INCREMENT      | NO       | Primary Key                               |Unique transaction ID       |
|              | order_id          | INT              | NULL                | NO       | Foreign Key → Orders(order_id)            |            |
|              | user_id           | INT              | NULL                | NO       | Foreign Key → Users(user_id)              |Who made the payment        |
|              | payment_date      | DATETIME         | CURRENT_TIMESTAMP   | NO       |                                           |Timestamp of successful payment|

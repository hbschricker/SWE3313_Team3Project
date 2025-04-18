| Entity       | Property          | Value                                       |
|--------------|-------------------|---------------------------------------------|
| Users        | user_id           | 1                                           |
|              | user_name         | Bray29                                      |
|              | password_hash     | $2a$10$3vxyD2rQAbc1234                      |
|              | email             | bray29@example.com                          |
|              | is_admin          | 0                                           |
| Users        | user_id           | 2                                           |
|              | user_name         | sandralee3                                  |
|              | password_hash     | $2a$10$7ghuH8MnKlm5678                      |
|              | email             | sandra@example.com                          |
|              | is_admin          | 1                                           |
| Users        | user_id           | 3                                           |
|              | user_name         | GabeA67                                     |
|              | password_hash     | $2a$10$4ijkT9WxZop9012                      |
|              | email             | gabe@example.com                            |
|              | is_admin          | 0                                           |
| Products     | product_id        | 1                                           |
|              | name              | Steeze Skater Ring                          |
|              | description       | Crafted from recycled skateboard            |
|              | price             | 19.99                                       |
|              | is_sold           | 0                                           |
| Products     | product_id        | 2                                           |
|              | name              | Under the Sea Bracelet                      |
|              | description       | Handcrafted from recycled glass             |
|              | price             | 24.50                                       |
|              | is_sold           | 0                                           |
| Products     | product_id        | 3                                           |
|              | name              | Rainbow Shell Bracelet                      |
|              | description       | Made out of recycled paper                  |
|              | price             | 24.99                                       |
|              | is_sold           | 1                                           |
| Cart_Items   | cart_item_id      | 1                                           |
|              | user_id           | 1                                           |
|              | product_id        | 1                                           |
|              | quantity          | 1                                           |
| Cart_Items   | cart_item_id      | 2                                           |
|              | user_id           | 1                                           |
|              | product_id        | 2                                           |
|              | quantity          | 2                                           |
| Cart_Items   | cart_item_id      | 3                                           |
|              | user_id           | 3                                           |
|              | product_id        | 1                                           |
|              | quantity          | 1                                           |
| Orders       | order_id          | 1                                           |
|              | user_id           | 1                                           |
|              | order_date        | 2025-04-12 14:23:00                         |
|              | shipping_address  | 123 Green St, Eco City                      |
|              | shipping_speed    | Overnight                                   |
|              | subtotal          | 68.99                                       |
|              | tax               | 4.14                                        |
|              | shipping_cost     | 29.00                                       |
|              | total             | 102.13                                      |
| Orders       | order_id          | 2                                           |
|              | user_id           | 3                                           |
|              | order_date        | 2025-04-13 10:15:20                         |
|              | shipping_address  | 789 Upcycle Blvd, Reuse                     |
|              | shipping_speed    | Ground                                      |
|              | subtotal          | 19.99                                       |
|              | tax               | 1.20                                        |
|              | shipping_cost     | 0.00                                        |
|              | total             | 21.19                                       |
| Orders       | order_id          | 3                                           |
|              | user_id           | 2                                           |
|              | order_date        | 2025-04-15 17:30:00                         |
|              | shipping_address  | 456 Loop Rd, Repurpose City                |
|              | shipping_speed    | Two-Day                                     |
|              | subtotal          | 49.99                                       |
|              | tax               | 3.00                                        |
|              | shipping_cost     | 10.00                                       |
|              | total             | 62.99                                       |
| Order_Items  | order_item_id     | 1                                           |
|              | order_id          | 1                                           |
|              | product_id        | 1                                           |
|              | quantity          | 1                                           |
|              | price_each        | 19.99                                       |
| Order_Items  | order_item_id     | 2                                           |
|              | order_id          | 1                                           |
|              | product_id        | 2                                           |
|              | quantity          | 2                                           |
|              | price_each        | 24.50                                       |
| Order_Items  | order_item_id     | 3                                           |
|              | order_id          | 2                                           |
|              | product_id        | 1                                           |
|              | quantity          | 1                                           |
|              | price_each        | 19.99                                       |
| Payment      | payment_id        | 1                                           |
|              | order_id          | 1                                           |
|              | user_id           | 1                                           |
|              | payment_date      | 2025-04-12 14:24:05                         |
|              | last4_card        | 1234                                        |
| Payment      | payment_id        | 2                                           |
|              | order_id          | 2                                           |
|              | user_id           | 3                                           |
|              | payment_date      | 2025-04-13 10:16:30                         |
|              | last4_card        | 9876                                        |
| Payment      | payment_id        | 3                                           |
|              | order_id          | 3                                           |
|              | user_id           | 2                                           |
|              | payment_date      | 2025-04-15 17:31:00                         |
|              | last4_card        | 5555                                        |

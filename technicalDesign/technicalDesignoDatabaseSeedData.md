| Entity    | Attribute       | Data Example                      | Description                            |
|----------------|----------------------|-----------------------------------------|----------------------------------------------|
|  Product    | product_id         | 1                                     | Unique product identifier                    |
|                | name               | Rainbow Shell Bracelet               | Product name                                 |
|                | description        | Made out of recycled paper            | Product description                          |
|                | price              | 24.99                                 | Price of the product                         |                                     
|                | status             | available                             | Product status (available)                   |
| Inventory  | inventory_id       | 1                                     | Inventory record identifier                  |
|                | product_id         | 1                                     | Reference to the product in inventory        |
|                | quantity_available | 1                                     | Quantity available for this product          |
| Order      | order_id           | 10001                                 | Unique order identifier                      |
|                | user_id            | Bray29                               | User who placed the order                    |
|                | total_price        | 24.99                                 | Total order cost                             |
|                | status            | completed                             | Order status (completed)                     |
|                | payment_status     | paid    









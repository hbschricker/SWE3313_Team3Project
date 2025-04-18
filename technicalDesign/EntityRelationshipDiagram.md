```mermaid

USERS ||--o{ ORDERS : places
    USERS ||--o{ CART_ITEMS : has
    USERS ||--o{ PAYMENTS : makes
    USERS ||--o{ ROLES : assigned
    ROLES ||--o{ USERS : includes

    PRODUCTS ||--o{ CART_ITEMS : contains
    PRODUCTS ||--o{ ORDER_ITEMS : part_of
    ORDERS ||--o{ ORDER_ITEMS : contains
    ORDERS ||--|| PAYMENTS : includes

    USERS {
        int user_id PK
        string username
        string password_hash
        string email
    }

    ROLES {
        int role_id PK
        string role_name
    }

    PRODUCTS {
        int product_id PK
        string name
        string description
        decimal price
        string image_url
        boolean is_sold
    }

    CART_ITEMS {
        int cart_item_id PK
        int user_id FK
        int product_id FK
        int quantity
    }

    ORDERS {
        int order_id PK
        int user_id FK
        date order_date
        string shipping_address
        string shipping_speed
        decimal subtotal
        decimal tax
        decimal shipping_cost
        decimal total
    }

    ORDER_ITEMS {
        int order_item_id PK
        int order_id FK
        int product_id FK
        int quantity
        decimal price_each
    }

    PAYMENTS {
        int payment_id PK
        int user_id FK
        int order_id FK
        string last4_card
        date payment_date
    }
```

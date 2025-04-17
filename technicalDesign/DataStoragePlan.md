# Data Storage Plan

### Data Storage Format:
  - SQL (using a local SQLite database for simplicity and portability)

### Why SQL?
  - Reliable and persistent data storage
  - Easily integrates with Java using JDBC
  - Supports complex queries for managing products, customers, orders, etc.
  - Maintains data between application restarts

### Technology Stack:
  - Programming Language: Java
  - Database: SQLite
  - Database Access: JDBC (Java Database Connectivity)
  - Library: SQLite JDBC driver (sqlite-jdbc from Xerial)

### Steps for Data Access and Persistence:

1. Include the SQLite JDBC driver in the project (via Maven, Gradle, or direct JAR).
2. On application startup:
    - Connect to the SQLite database using JDBC.
    - If tables do not exist (e.g., products, customers, orders), create them.
3. When users perform actions (add to cart, make a purchase, update inventory, etc.):
    - Execute INSERT, UPDATE, or DELETE SQL queries to reflect changes in the database.
4. When the app needs to display or load data:
    - Use SELECT queries to fetch current product listings, order history, etc.
5. On application close:
    - Ensure all database connections are closed cleanly to avoid locking issues.

### Database File Location:
- Stored locally in the project directory as store.db or similar, to ensure easy access and persistence.

### Example Use Case:
- A user purchases a necklace → The order is inserted into the orders table → Inventory is updated in the products table → Data is saved in the SQLite file → When the app restarts, the order history and updated inventory are still available.

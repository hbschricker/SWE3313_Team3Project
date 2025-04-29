| Condition/Rule  | User Action  | Admin Action | System outcome  |
|-----------|-----------|-----------|-----------|
| Self_register |True |True | Allows The user to self-register|
| Unique Username | True | True | Ensures the username is unique |
| Password length(≥6)| True| True | Checks if password length is 6 or more|
| Promote to Admin| False | True| Admin promotes a user to admin |
| Run sales reports | False | True | Admin can run sales reports|
| Add inventory | False| True | Admin can add to inventory |
| Main screen shows inventory  | True | True| Main screen shows inventory sorted by price, excluding sold items |
| Add to cart|True |True| User or Admin can add items to the cart|
| Checkout | True | True |User or Admin can proceed to checkout if the cart is not empty  |
| PaymentInformation | True | False | User can enter payment details at checkout|
| Can complete order |True | False | User can complete an order|
| Can revisit checkout/payment screen | False | False | User or admin cannot revisit these screens after completing the order |
| Purchased items removed from inventory| True  | True|Purchased items are removed from the inventory list|

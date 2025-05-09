## Version 1:
### (T3E-1) User Authentication and Registration:

- #### (T3S-1) Users must be able to self-register and login.
    - Priority: Must Have
    - Estimated Effort: 2-3 days
    - Functional
    - Users must be able to create an account and sign into that account.

- #### (T3S-2) Users must have a username and password.
    - Priority: Must Have
    - Estimated Effort: 6 hours
    - Functional
    - Users must have a unique username and a password with at least 6 characters.

- #### (T3S-3) Administrators must not be able to self register.
    - Priority: Must Have
    - Estimated Effort: 6 hours
    - Functional
	- Users must not be able to register an administrator account nor register as an administrator.

### (T3E-2) Administrator Functionalities:

- #### (T3S-4) Administrators must be able to promote user accounts to administrator accounts.
    - Priority: Must Have
    - Estimated Effort: 2 days
    - Functional
    - Existing administrators must be able to provide admin roles and control to user accounts.

- #### (T3S-5) Administrators must be able to run a sales report.
    - Priority: Must Have
    - Estimated Effort: 2 days
    - Functional
    -  Administrators must be able to view sales reports, which contains information on purchases and transactions.

- #### (T3S-6) The sales reports must show all purchases.
    - Priority: Must Have
    - Estimated Effort: 8 hours
    - Functional
	- Sales reports will show all purchased items as well as who bought the items.

### (T3E-3) Main Screen:

- #### (T3S-7) The main screen must display the inventory from highest to lowest price.
    - Priority: Must Have
    - Estimated Effort: 1-2 days
    - Functional
    - The inventory should be shown in descending order.

- #### (T3S-8) The main screen must not show any sold items.
    - Priority: Must Have
    - Estimated Effort: 6 hours
    - Functional
    - Users must not see sold items and should be completely removed from the page.

- #### (T3S-9) The main screen must have a checkout button.
    - Priority: Must Have
    - Estimated Effort: 8 hours
    - Functional
	- The checkout button must direct the user to checkout their purchases.

### (T3E-4) Inventory Display and Management:

- #### (T3S-10) Inventory must have a description and button for each item
    - Priority: Must Have
    - Estimated Effort: 1 day
    - Functional
    - Each item must have a short name, one picture, price, brief description, and a 'Add to Cart' button.

- #### (T3S-11) Prices must be in the correct currency and format.
    - Priority: Must Have
    - Estimated Effort: 8 hours
    - Functional
    - The prices should be in United States dollars with a dollar sign, comma's, and decimal point. It must also be using a base-10 format.

- #### (T3S-12) Purchased inventory items must be removed from inventory.
    - Priority: Must Have
    - Estimated Effort: 10 hours
    - Functional
	- Sold items must be moved out of the inventory list after a user completes a purchase to assure no other users purchase it.

### (T3E-5) Shopping Cart and Checkout Process:

- #### (T3S-13) Users must be able to add items to the cart.
    - Priority: Must Have
    - Estimated Effort: 1-2 days
    - Functional
    - Each item has a button, and clicking that button should add that item to the user's cart.

- #### (T3S-14) Users must be able to add multiple items to the cart.
    - Priority: Must Have
    - Estimated Effort: 1 day
    - Functional
    - The user's must be able to add more than one item to their cart for purchase.

- #### (T3S-15) Users must be able to check out after pressing the checkout button.
    - Priority: Must Have
    - Estimated Effort: 8 hours
    - Functional
	- Users must be taken to the CheckoutScreen once they have items in their cart and click the checkout button.

- #### (T3S-16) Users must not be able to click the checkout button with an empty cart.
    - Priority: Must Have
    - Estimated Effort: 6 hours
    - Functional
	- Users cannot checkout if they don't have anything for purchase in their cart.

- #### (T3S-17) Shopping cart must save items for future screens.
    - Priority: Must Have
    - Estimated Effort: 2 days
    - Functional
	- The items in the user's cart must be saved for displaying on later screens and cannot be erased by going to a different screen.

- #### (T3S-18) Payment screen must capture user's information
    - Priority: Must Have
    - Estimated Effort: 1-2 days
    - Functional
	- User's information, such as their credit card and address, must be collected to ensure the payment is authentic.

### (T3E-6) CheckoutScreen:

- #### (T3S-19) The CheckoutScreen must display the cart items and subtotal.
    - Priority: Must Have
    - Estimated Effort: 2 days
    - Functional
    - The screen must show each item's picture, name, description, and a subtotal of all prices.

- #### (T3S-20) Users must be able to go to a payment screen from the CheckoutScreen.
    - Priority: Must Have
    - Estimated Effort: 12 hours - 1 day
    - Functional
    - There must be a 'Pay Now' button that will take the user to the Payment Screen.

- #### (T3S-21) Users must not be able to revisit the CheckoutScreen after purchase.
    - Priority: Must Have
    - Estimated Effort: 6 hours
    - Functional
	- After the user's transaction is completed, they cannot go back to the CheckoutScreen.

### (T3E-7) Payment Screen:

- #### (T3S-22) The payment screen must display empty information fields.
    - Priority: Must Have
    - Estimated Effort: 1-2 days
    - Functional
    - The user's must be able to fill their information in these fields. The fields are shipping address, credit card number, phone number, and shipping speed.

- #### (T3S-23) The information field screen must display the different shipping speeds and prices.
    - Priority: Must Have
    - Estimated Effort: 8 hours
    - Functional
	    - There are three different shipping speeds the user can pick for their item. Overnight shipping costs $29, 3-Day costs $19, and Ground costs $0.

- #### (T3S-24) The information field must correct credit card number information.
    - Priority: Must Have
    - Estimated Effort: 10 hours
    - Functional
	- The credit card number field includes the expiration month, year, and CVV security code, and this information must be legitimate.

- #### (T3S-25) Users must fill the information field.
    - Priority: Must Have
    - Estimated Effort: 6 hours
    - Functional
	- Users cannot complete their purchase until they have filled all the empty fields in the information field.

- #### (T3S-26) Payment screen must capture user's information
    - Priority: Must Have
    - Estimated Effort: 1-2 days
    - Functional
	- User's information, such as their credit card and address, must be collected to ensure the payment is authentic.

- #### (T3S-27) User's must be able to complete their purchase.
    - Priority: Must Have
    - Estimated Effort: 1-2 days
    - Functional
		- The payment screen must have a 'ConfirmOrder' button that the user's can click. This button will take the users to the Order Confirmation Screen.

- #### (T3S-28) Users must not be able to revisit the Payment Screen after purchase.
    - Priority: Must Have
    - Estimated Effort: 6 hours
    - Functional
	- After the user's transaction is completed, they cannot go back to the payment screen.
 
### (T3E-8) Order Confirmation Screen:

- #### (T3S-29) The Order Confirmation Screen must display the purchase information.
    - Priority: Must Have
    - Estimated Effort: 10 hours
    - Functional
    - The information includes the name and price of the items, the subtotal, the tax, shipping speed cost, and the grand total. The tax is 6% of the subtotal.

- #### (T3S-30) Users must be able to confirm their order.
    - Priority: Must Have
    - Estimated Effort: 1 day
    - Functional
	    - The Order Confirmation screen must have a 'Complete Order' button that the user can click. Pressing it will take them to the Order Completion screen.

- #### (T3S-31) Users must not be able to revisit the Order Confirmation Screen after purchase.
    - Priority: Must Have
    - Estimated Effort: 6 hours
    - Functional
	- After the user's transaction is completed, they cannot go back to the order confirmation screen.

### (T3E-9) Order Completion Screen:

- #### (T3S-32) The Order Completion Screen must display the order's receipt.
    - Priority: Must Have
    - Estimated Effort: 1-2 days
    - Functional
    - The receipt must contain the last four digits of the user's credit card and their shipping address.

- #### (T3S-33) Users must be able to exit out of the receipt.
    - Priority: Must Have
    - Estimated Effort: 1 day
    - Functional
	- The receipt must have an 'OK' button that the users can click. Clicking the button will take the user back to the main screen.

### (T3E-10) Order Completion Screen:

- #### (T3S-34) The Databaes must make a high-fidelity mockup.
    - Priority: Must Have
    - Estimated Effort: 3-4 days
    - Functional
    - The mockup must show how the screens and applications flow into each other.

- #### (T3S-35) The Databaes must present the mockup to the customer.
    - Priority: Must Have
    - Estimated Effort: 1-2 day
    - Functional
	- The Databaes must rehearse and practice before presenting to the customer. Coding can only start after the customer is pleased with the mockup.

## Version 2:
### (T3E-11) Admin Account Promotion:

- #### (T3S-36) Assignment Requisite.
	- Priority: Need to Have
	- Estimated Effort: 2 days 
	- Functional 
	- Admin users have the ability to assign a registered account as an admin. A non-admin account cannot assign itself to be an admin.
 
### (T3E-12) Administrator Inventory Management:

- #### (T3S-37) Administrators can add and remove items from  the inventory database.
	- Priority: Need to Have
	- Estimated Effort: 3 days
	- Functional
	- Administrators can directly add items and an image to the inventory database. They can also remove inventory from the database.

### (T3E-13) Admin Sales Report Functionality:

- #### (T3S-38) Sales Report Requisite.
	- Priority: Need to Have
	- Estimated Effort: 2 days
	- Functional
	- Admins are able to export the sales report to CSV, which allows for better data analysis.

### (T3E-14) Inventory Search Box:

- #### (T3S-39) Search Requisite.
	- Priority: Need to Have
	- Estimated Effort: 3 days
	- Functional 
	- The user has the ability to search inventory via the product name or the product description (keywords like color, type of jewelry, etc.)

### (T3E-15) Update Cart Functionality:

- #### (T3S-40) Cart Functions.
	- Priority: Need to Have
	- Estimated Effort: 1 day
	- Functional
	- The User has the ability to back up to the checkout page or the main page.
 
## Version 3:
 ### (T3-E16) Administrator Account Management Interface:
- #### (T3S-41) The Interface can promote a user to an administrator
	- Priority: Want to Have
	- Estimated Effort: 3-4 days
	- Functional
	- The interface will allow an existing administrator to pick a user and change their access level.
- #### (T3S-42) Administrators can search for a specific user.
	- Priority: Want to Have
	- Estimated Effort: 2-3 days
	- Functional
	- Existing administrators can use a search box to search through a list of usernames. Once they find the user they want, they can select their username.
- #### (T3S-43) Administrators can change a user's access level.
	- Priority: Want to Have
	- Estimated Effort: 1-2 days
	- Functional
	- Existing administrators can click on a button called 'Promote' to change the user's access level from User to Administrator. 
- #### (T3S-44) Administrators can confirm to change a user's account.
	- Priority: Want to Have
	- Estimated Effort: 3-4 days
	- Functional
	- Existing administrators can click on a button called 'Confirm' to commit any changes.

### (T3-E17) Administrator Inventory Management Interface:
- #### (T3S-45) The Interface will have a form to add items to the inventory database.
	- Priority: Want to Have
	- Estimated Effort: 4-5 days
	- Functional
	- The interface will provide administrators a form to fill out an item's information to the inventory database without directly typing in the database.

- #### (T3S-46) Administrators can upload an image to the interface.
	- Priority: Want to Have
	- Estimated Effort: 2 days
	- Functional
	- The interface will allow administrators to upload an image from their device onto the form.

- #### (T3S-47) The Interface will be able to add multiple pictures for an item.
	- Priority: Want to Have
	- Estimated Effort: 1-2 days
	- Functional
	- The interface will allow administrators to add multiple images to one single item.

### (T3-E18) Sales Report Receipts:
- #### (T3S-48) Administrators can view receipts in sales report
	- Priority: Want to Have
	- Estimated Effort: 1-2 days
	- Functional
	- In the sales report, viewing an item will also show any receipts that are related to that item.

### (T3-E19) Automatic Receipt Mailing:
- #### (T3S-49) An order receipt will be mailed to the user's email
	- Priority: Want to Have
	- Estimated Effort: 1 day
	- Functional
	- After a user confirms an order, the receipt they view on the Order Completion page will be sent to their email automatically.

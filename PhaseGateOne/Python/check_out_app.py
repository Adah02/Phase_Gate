def sub_total(price_of_product, quantity_of_product):
	total_amount = 0
	for index in range(len(price_of_product)):
		total_amount += price_of_product[index] * quantity_of_product[index]

	return total_amount;

def tax_to_pay(price_of_product, quantity_of_product):
	#To calculate the total tax amount to be paid.
	total = 0
	for index in range(len(price_of_product)):
		total += price_of_product[index] * quantity_of_product[index]

	PERCENTAGE =100
	tax_percentage = 7.5

	tax_amount = (total / PERCENTAGE) * tax_percentage;
	return tax_amount;

def payment_amount(tax_to_pay, sub_total, purchase_discount):
	#To determine the total payment amount by customer

	amount_to_pay = (tax_to_pay, + sub_total, - purchase_discount)
	return amount_to_pay;

def purchase_discount(price_of_product, quantity_of_product):
	#To calculate discount for purchase amount.
	totalAmount = 0
	for index in range(len(price_of_product)):
		totalAmount += price_of_product[index] * quantity_of_product[index]

	PERCENTAGE =100
	discount_percentage = 3.8
	
	discount_amount = (totalAmount / PERCENTAGE) * discount_percentage;
	return discount_amount;

def customers_balance(bill, amount_paid):
	balance = amount_paid - bill

	return balance;

def store_details():
	#To hold store details
	StoreDetails = """
	SEMICOLON STORES
	MAIN BRANCH
	LOCATION: 312, HERBERT MACAULAY WAY, SABO YABA, LAGOS.
	TEL: 03293828343
	"""
	return StoreDetails;

	




available_products = """
===================================
    Welcome to Semicolon Stores
===================================
    press the respective number
        to purchase product.
===================================
             Press:-
   1. Rice         2. Ice-Scream
   3. Bread        4. Yogurt
   5. Pringles     6. Vegetable-Oil
   7. Eggs         8. Mash-mallow
   9. Sadin        10. Table-water
  11. Peak Milk    12. Snackers
===================================
"""

products = ["Rice", "Ice-Scream", "Bread", "Yogurt", "Pringles", "Vegetable-Oil", "Eggs", "Mash-mallow", "Sadin", "Table-water", "Peak Milk", "Snackers"]
prices = [40000, 2500, 1600, 4500, 3750, 6000, 1500, 3000, 1000, 1900, 7400, 2500]

purchases = []
price_of_product = []
quantity_of_product = []

print(available_products)


while True:
	purchase = int(input('Enter product to purchase: '))
	purchases.append(products[purchase - 1])
	price_of_product.append(prices[purchase - 1])

	product_count = int(input('How many do you want? : '))
	quantity_of_product.append(product_count)
	
	users_choice = int(input('Would you like to add more? Press \"1\"  > Yes or \"0\" > No:'))
	match users_choice:
		case 0:
			purchase = False
			break;
		case 1:
			purchase = True
			break;
		case _:
			purchase = True
			break;




print(sub_total(price_of_product, quantity_of_product))
print(tax_to_pay(price_of_product, quantity_of_product))

amount_paid = input('How much did the customer pay: ')
print(payment_amount(tax_to_pay, sub_total, purchase_discount))





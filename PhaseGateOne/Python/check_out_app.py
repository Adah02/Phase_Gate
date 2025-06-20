
def sub_total(price_of_product, quantity_of_product):
	total_amount = 0
	for index in range(len(price_of_product)):
		total_amount += price_of_product[index] * quantity_of_product[index]

	return total_amount;


def value_added_tax(price_of_product, quantity_of_product):
	#To calculate the total tax amount to be paid.
	total = 0
	for index in range(len(price_of_product)):
		total += price_of_product[index] * quantity_of_product[index]

	PERCENTAGE =100
	tax_percentage = 7.5

	tax_amount = (total / PERCENTAGE) * tax_percentage;
	return tax_amount;

def payment_amount(price_of_product, quantity_of_product):
	#To determine the total payment amount by customer
	
	total_amount = 0
	for index in range(len(price_of_product)):
		total_amount += price_of_product[index] * quantity_of_product[index]

	PERCENTAGE =100
	discount_percentage = 3.8
	tax_percentage = 7.5

	discount_amount = (total_amount / PERCENTAGE) * discount_percentage;
	tax_amount = (total_amount / PERCENTAGE) * tax_percentage;

	amount_to_pay = (tax_amount + total_amount) - discount_amount
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

	balance = (amount_paid - bill)

	return balance;

def header():
	headings = "	ITEM \t QTY \t PRICE \t TOTAL"
	
	return headings

def lines():
	#Printing lines in receipt
	line = "=" * 55
	
	return line;


def store_details():
	#To hold store details
	StoreDetails = """SEMICOLON STORES 
MAIN BRANCH
LOCATION: 312, HERBERT MACAULAY WAY, SABO YABA, LAGOS.
TEL: 03293828343
"""
	return StoreDetails;


products = []
price_of_product = []
quantity_of_product = []	

customers_name = str(input("Enter customer's name: "))

trade = True
while trade == True:
	product = input('\nEnter name of product: ')
	products.append(product )

	price = float(input("\nEnter price of product: "))
	price_of_product.append(price)

	product_count = int(input('\nHow many did the customer buy? : '))
	quantity_of_product.append(product_count)
	
	users_choice = int(input('\nWould you like to add more? \nPress \"1\" > Yes or \"0\" > No: '))

	if users_choice == 1:
		trade = True
	else:
		trade = False




cashiers_name = str(input("\n Enter cashier's name: "))
bill = float(payment_amount(price_of_product, quantity_of_product))

product_total_price = []
for index in range(len(price_of_product)):
	product_total_price.append(price_of_product[index] * quantity_of_product[index])


print(lines())
print(store_details())

print("Customer's name: ",customers_name)
print(f"Cashier's name: {cashiers_name} \n{lines()}")

print(f'{header()} \n{lines()}')

for item in range(len(products)):
	print(f'\t {products[item]}  \t {quantity_of_product[item]:} \t {price_of_product[item]:.2f} \t{product_total_price[item]:.2f}')

print(lines())

print(f" \t Sub-total: {sub_total(price_of_product, quantity_of_product):.2f} \n \t Discount: { purchase_discount(price_of_product, quantity_of_product):.2f}")
print(f" \t VAX @7.5% : {value_added_tax(price_of_product, quantity_of_product):.2f}\n{lines()}") 
print(f"\t Bill Total: {payment_amount(price_of_product, quantity_of_product):.2f} \n{lines()}")
print(f" THIS IS NOT A RECEIPT, KINDLY PAY {payment_amount(price_of_product, quantity_of_product):.2f} \n{lines()}")

amount_paid = float(input('\nHow much did the customer pay: '))

balance = customers_balance(bill, amount_paid)

print(f'{lines()} \n{header()} \n{lines()}')

for item in range(len(products)):
	print(f'\t {products[item]}  \t {quantity_of_product[item]:} \t {price_of_product[item]:.2f} \t{product_total_price[item]:.2f}')

print(lines())

print(f" \t Sub-total: {sub_total(price_of_product, quantity_of_product):.2f} \n \t Discount: { purchase_discount(price_of_product, quantity_of_product):.2f}")
print(f" \t VAX @7.5% : {value_added_tax(price_of_product, quantity_of_product):.2f}\n{lines()}") 
print(f"\t Bill Total: {payment_amount(price_of_product, quantity_of_product):.2f} \n  \tAmount Paid:  {amount_paid:.2f} \n \tBalance: {balance:.2f}\n")

if balance < 0:
	print(f"\tYou still owe {abs(balance):.2f}, Please pay up")

print(f"{lines()}\n \t THANKS FOR YOUR PATRONAGE \n{lines()}")




def sub_total(quantity_of_product):
	(price_of_product, quantity_of_product)
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

purchase = int(input('Enter product to purchase: '))
purchases.append(products[purchase - 1])
price_of_product.append(prices[purchase - 1])

product_count = int(input('How many do you want? : '))
quantity_of_product.append(product_count)
	
users_choice = int(input('Would you like to add more? Press \"1\"  > Yes or \"0\" > No:'))


print(sub_total(quantity_of_product))
print(tax_to_pay(price_of_product, quantity_of_product))



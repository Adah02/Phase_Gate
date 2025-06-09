def cardValidity(myCardNumber):
	cardNumber = myCardNumber.replace(" ", "");
	cardValid = false
	if cardNumber[0] > '2' & cardNumber[0] < '7':
		if len(cardNumber) >= '13' & len(cardNumber) <= '16':
			if cardNumber[0] == '3' & cardNumber[1] != '7':
				cardValid = false;
			else:
				cardValid = true;
		else:	
			cardValid = false;
	else:
		cardValid = false;
	validity = ""
	if cardValid == True:
		validity = "Valid"
	else:
		validity = "Invalid"
	return validity;

def cardNumberVerifier(myCardNumber):
	myNumber = myCardNumber.replace(" ", "");
	return myNumber

def cardNumberLength(myCardNumber):
	cardNumber = myCardNumber.replace(" ", "")

	digitLength = len(cardNumber)

	return digitLength;


def creditCardType(myCardNumber):
	cardType = "";
	cardNumber = myCardNumber.replace(" ", "");

	if len(cardNumber) >= 13 & len(cardNumber) <= 16:
		if cardNumber[0] == '4':
			cardType = "VisaCard";
		elif cardNumber[0] == '5':
			cardType = "MasterCard"
		elif cardNumber[0] == '6':
			cardType = "DiscoverCard"
		elif cardNumber[0] == '3' & cardNumber[1] == '7':
			cardType = "AmericanExpressCard";
		else:
			cardType = "Invalid Card"
	else:
		cardType = "Invalid Card"
	return cardType;


def validityStatus(myCardNumber):
	sum = 0;  
	sumOdd = 0;
	cardNumber = myCardNumber.replace(" ", "");
	
	for index in range(len(cardNumber)-1, -1, -2):
		sumOdd += int(cardNumber[index]);
	for index in range(len(cardNumber)-2, -1, -2):
		integerValue = int(cardNumber[index]) * 2;
		if integerValue > 9:
			firstDigit = integerValue // 10
			secondDigit =  integerValue % 10;
			sum += (firstDigit + secondDigit)
		else:
			sum += integerValue;
	total = sum + sumOdd;
	validator = ""
	if total % 10 == 0:
		validator = "Valid"
	else:
		validator = "Invalid"
	return validator



myCardNumber = input("Enter card number: ");

stars = "";
for index in range(42):
	stars += "*"
print(stars)
print("** Credit Card Type: ", creditCardType(myCardNumber))
print("** Credit Card Number: ", cardNumberVerifier(myCardNumber))
print("** Credit Card Digit Length: ", cardNumberLength(myCardNumber))
print("** Credit Card Validity Status: ", validityStatus(myCardNumber))
print(stars)







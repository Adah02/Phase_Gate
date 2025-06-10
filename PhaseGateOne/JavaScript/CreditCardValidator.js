const prompt = require("prompt-sync")()

function cardValidity(cardNumber){
	let cardValid = false;
		if (cardNumber.charAt(0) > '2' && cardNumber.charAt(0) < '7'){
			if (cardNumber.length >= 13 && cardNumber.length <= 16){
				if (cardNumber.charAt(0) == '3' && cardNumber.charAt(1) != '7'){
				cardValid = false;
				}else {
				cardValid = true;
				};
			}else {
				cardValid = false;
				};
		} else {
			cardValid = false;
			};
	let validity = (cardValid) ? "Valid" : "Invalid";
	return validity;
	};

function cardNumberVerifier(myCardNumber){
	let myNumber = myCardNumber.replaceAll(" ", "");

	if (myNumber.length <13 || myNumber.length > 16) myNumber = "Invalid";
	for (let index = 0; index < myNumber.length; index++){
		if (myNumber.charAt(index) < '0' || myNumber.charAt(index) > '9' &&  myNumber.charAt(index) != ' '){
			myNumber = "Invalid";
		} 
		if (myNumber == "Invalid") break;
	}
	return myNumber
	};

function cardNumberLength(myCardNumber){
	let cardNumber = myCardNumber.replaceAll(" ", "");

	let digitLength = cardNumber.length;

	return digitLength;
	};
	

function creditCardType(myCardNumber){
	let cardType = "";
	let cardNumber = myCardNumber.replaceAll(" ", "");

	for (let index = 0; index < cardNumber.length; index++){
		if (cardNumber.charAt(index) < '0' || cardNumber.charAt(index) > '9' &&  cardNumber.charAt(index) != ' '){
			cardType = "Invalid";
			break;
			}
		}
	if (cardNumber.length >= 13 && cardNumber.length <= 16 && cardType != "Invalid"){
		if (cardNumber.charAt(0) == '4'){
			cardType = "VisaCard";
		} else if (cardNumber.charAt(0) == '5'){
			cardType = "MasterCard";
		} else if (cardNumber.charAt(0) == '6'){
			cardType = "DiscoverCard";
		} else if (cardNumber.charAt(0) == '3' && cardNumber.charAt(1) == '7'){
			cardType = "AmericanExpressCard";
		} else { cardType = "Invalid Card"; };
	} else { 
		cardType = "Invalid Card";
	};
	return cardType;
	};

function validityStatus(myCardNumber){
	let sum = 0;  let sumOdd = 0;
	let cardNumber = myCardNumber.replaceAll(" ", "");

	for (let index = cardNumber.length - 1; index >= 0; index--){
		sumOdd += Number(cardNumber.charAt(index));
	
		if (index > 0){ index -= 1; } else { break; };
		let integerValue = Number(cardNumber.charAt(index)) * 2;
			if (integerValue > 9){
				let firstDigit = Math.floor(integerValue / 10);  let secondDigit =  integerValue % 10;
				sum += (firstDigit + secondDigit);	
			} else{
				sum += integerValue;
			};
		};
	let total = sum + sumOdd;
	let validator = (total % 10 == 0) ? "Valid" : "Invalid";
	return validator;
	};



myCardNumber = prompt("Enter card number: ");

let stars = "";
for (let index = 0; index < 42; index++){  stars += "*"};
	console.log(stars)
	console.log("** Credit Card Type: ", creditCardType(myCardNumber));
	console.log("** Credit Card Number: ", cardNumberVerifier(myCardNumber));
	console.log("** Credit Card Digit Length: ", cardNumberLength(myCardNumber));
	console.log("** Credit Card Validity Status: ", validityStatus(myCardNumber));
	console.log(stars)







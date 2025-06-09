const {LocalDate} = require ('js-joda')
const prompt = require ("prompt-sync")()
const today = new Date();

function nextFlowDate(monthOfFlow, dayOfFlow, flowLength, nextFlow){
	const menstDate = LocalDate.of(2025, monthOfFlow, dayOfFlow);
	let monthLength = menstDate.lengthOfMonth();
	let remainingDaysOfMonth = monthLength - dayOfFlow;

	if (nextFlow > remainingDaysOfMonth){
		nextFlow -= remainingDaysOfMonth; monthOfFlow += 1;
	} else{
		nextFlow += dayOfFlow;
		}
	console.log("Next menstruation is", nextFlow, "of", monthOfFlow)
	return monthLength;
};

function ovulationPeriod(monthOfFlow, dayOfFlow){
	const menstDate = LocalDate.of(2025, monthOfFlow, dayOfFlow);
	let ovulation = dayOfFlow + 14;
	let daysLeft = menstDate.lengthOfMonth() - dayOfFlow;
	if (ovulation > daysLeft){
		ovulation = 14 - daysLeft;
		monthOfFlow += 1;
		console.log("Ovulation is due on ", ovulation , " of ", monthOfFlow)
		}
	return ovulation;
};



let monthOfFlow = prompt("Enter month of last flow: ")
let dayOfFlow = prompt("Enter day of last flow: ")
let flowLength = prompt("Enter length of last flow: ")
let nextFlow = prompt("Enter of days until next flow: ")

console.log(nextFlowDate(monthOfFlow, dayOfFlow, flowLength, nextFlow))
console.log(ovulationPeriod(monthOfFlow, dayOfFlow))
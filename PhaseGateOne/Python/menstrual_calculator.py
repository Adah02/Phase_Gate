from datetime import date
todaysDate = date.today()

def nextFlow(day_of_flow, flow_month, flow_length):
	#To calculate the next menstrual flow.
	
	flow_date = date()

	print(todaysDate)
	
	return todaysDate



flow_month = int(input("Enter month of previous flow: "))
day_of_flow = int(input("Enter day of previous flow: "))
flow_length = int(input("Enter length previous flow: "))
cycle_length = int(input("Enter length menstrual cycle: "))
print(nextFlow(prevDay, prevMonth))
def  employee_pay_roll(employee_name, work_hours, pay_rate, federal_tax_rate, state_tax_rate):
	#To calculate and prepare employee's payroll.
	gross_pay = pay_rate * work_hours;
	PERCENTAGE = 100;
	federal_withholding = ((gross_pay / PERCENTAGE) * federal_tax_rate)
	state_withholding = ((gross_pay / PERCENTAGE) * state_tax_rate)
	total_deduction = federal_withholding + state_withholding;
	net_pay = (gross_pay  - total_deduction)
	payrolls[counter] += (employee_name, work_hours, pay_rate, gross_pay, federal_withholding)
	return payrolls
		


payrolls = []

payroll = """
			Welcome to Semicolon Pay-roll
			press;-
			1. Add employee's pay-roll.
			2. View employee's pay-roll.
			3. Update employee's pay-roll.
				4. Exit.
			"""
pay_roll_view = True
while pay_roll_view == True:
	print(payroll)
	selection = int(input("Enter selection: "));
	match selection:
		case 1: 
			add_payroll = True;
			while add_payroll == True:
				employee_name = str(input("Enter employee's name: "))
				workingHour = True
				while workingHour == True:
					work_hours = float(input("Number of work hours per week: "))
					if work_hours < 0 or work_hours > 100:
						print('Enter a valid work hours...')
						workingHour = True
					else:
						workingHour = False;
				pay_rate = float(input("Enter payrate: "))
				federal_tax_rate = float(input("Enter federal tax rate: "))
				state_tax_rate = float(input("Enter state tax rate: "))
				print('Employee Pay-roll added =============>')
				feedback = int(input('Enter "0" > Back or "1" to continue: '))
				if feedback == 0:
					add_payroll = False;
				elif feedback == 1:
					add_payroll = True;
				else:
					add_payroll = False;
		case 2: 
			view_payroll = True
			while view_payroll == True:
				employee_name =input("Enter employee's name: ")
				for index in range(len(payrolls)):
					for item in range(len(payrolls[index])):
						if employee_name == item:
							print(payrolls)
							pay_roll_view = True
				back = int(input('Enter "0" > Back: '))
				if back == 0:		
					view_payroll = False	
		case 3:
			update_payroll = True
			while update_payroll == True:
				for index in range(len(payrolls)):
					for item in range(len(payrolls[index])):
						if employee_name == payrolls[index][item]:
							print(payrolls[index])
							back = int(input('Enter "0" > Back: ' ))
							if back == 0:
								update_payroll = False
		case 4: 
			print("Good-Bye...")
			pay_roll_view = false
			break
		case _: 
			print("Enter a valid option");
			pay_roll_view = True;
				

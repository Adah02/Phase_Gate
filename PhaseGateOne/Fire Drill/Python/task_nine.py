sum = 0
for index in range(1, 11):
	if index % 4 == 0:
		for count in range(1, 6):
			if (index % 4 == 0):
				sum += (index)**count;
print(sum**2)
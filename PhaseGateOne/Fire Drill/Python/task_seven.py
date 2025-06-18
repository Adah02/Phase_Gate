sum1 = 0
sum2 = 0
for index in range(1, 11):
	if index % 4 == 0:
		for count in range(1, 6):
			if (index % 4 == 0):
				if (index == 4):
					sum1 += (index)**count;
				elif index == 8:
					sum2 += (index)**count;

print(sum1 + " " + sum2)
	
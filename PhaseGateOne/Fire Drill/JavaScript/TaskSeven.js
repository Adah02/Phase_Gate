sum1 = 0;
sum2 = 0;

for (let index = 1; index <= 10; index++){
	if (index % 4 == 0){
		if (index == 4){
			for (let count = 1; count <= 5; count++){
			sum1 += Math.pow(index, count);
			}
		} else {
			for (let count = 1; count <= 5; count++){
			sum2 = Math.pow(index, count);
			}
		};
	}
	};

console.log(sum1, " ", sum2)
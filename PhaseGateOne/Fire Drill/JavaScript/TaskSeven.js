sum = 0;

for (let index = 1; index <= 10; index++){
	if (index % 4 == 0){
			for (let count = 1; count <= 5; count++){
			sum += Math.pow(index, count);
		};
	console.log(sum, " ")
	}
	};


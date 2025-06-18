public class TaskSix {

	public static void main(String[] args){

	int sumOfPower1 = 0;
	int sumOfPower2 = 0;

	for (int index = 1; index <= 10; index++){
		if (index % 4 == 0){
			if (index == 4){
				for (int count = 1; count <= 5; count++){
				sumOfPower1 += Math.pow(index, count);
				}
			} else {
				for (int count = 1; count <= 5; count++){
				sumOfPower2 += Math.pow(index, count);
				}
			}
	
		}
	}
	System.out.printf(sumOfPower1 + " " + sumOfPower2);

	}

}
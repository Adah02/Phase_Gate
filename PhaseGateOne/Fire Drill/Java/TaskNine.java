public class TaskNine {

	public static void main(String[] args){

	int sum = 0;

	for (int index = 1; index <= 10; index++){
		if (index % 4 == 0){
			for (int count = 1; count <= 5; count++){
			sum += Math.pow(index, count);
			}
		}
	}
	System.out.printf("%.2f",Math.sqrt(sum));
	}
}
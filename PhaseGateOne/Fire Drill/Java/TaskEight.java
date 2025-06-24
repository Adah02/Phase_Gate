public class TaskSeven {

	public static void main(String[] args){

	int sum = 0;

	for (int index = 1; index <= 10; index++){
		if (index % 4 == 0){
			if (index == 4){
				for (int count = 1; count <= 5; count++){
				sum += Math.pow(index, count);
				}
			} else {
				for (int count = 1; count <= 5; count++){
				sum += Math.pow(index, count);
				}
			}
		}
	}
	System.out.print(sum);
	}
}
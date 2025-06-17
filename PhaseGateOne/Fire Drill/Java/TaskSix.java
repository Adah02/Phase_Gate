public class TaskSix {

	public static void main(String[] args){

	for (int index = 1; index <= 10; index++){
		if (index % 4 == 0){
			if (index == 4){
				for (int count = 1; count <= 5; count++){
				System.out.printf("%.0f ", (Math.pow(index, count)));
				}
			} else {
				for (int count = 1; count <= 5; count++){
				System.out.printf("%.0f  ", (Math.pow(index, count)));
				}
			}
	
		}
	}

	}

}
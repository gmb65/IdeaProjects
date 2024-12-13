public class LoopExercise {
    
    public static void main(String[] args){
    	int i;
     
   	 int[] numbers = new int[] { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };
   	 
   	for (i = 0;i < 10;i++){
   		System.out.println(numbers[i]);
   	}
   	
   	i = 0;
   	while(i < 10){
   		System.out.println(numbers[i]);
   		i++;
   	}
   	
   	i = 0;
   	do {
   		System.out.println(numbers[i]);
   		i++;
   	} while(i < 10);
    }
}
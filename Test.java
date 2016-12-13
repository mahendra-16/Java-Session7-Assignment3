package Session7;

public class Test {

	public static void selectionSort(int[] array){
		
		int i,j, index;
		
		for(i = 0; i < array.length-1; i++){
			
			index = i;
			
			for(j = i + 1; j < array.length; j++){
				if(array[j] < array[index]){
					index = j;
				}
			}
			
			int smallNumber = array[index];
			array[index] = array[i];
			array[i] = smallNumber;
						
		}
		
		
	}	
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] arrayOne = {63, 75, 90, 12, 27};
		
		System.out.println("Before Selection Sorting..");
		for(int before : arrayOne){
			System.out.print(before+" ");
		}
		
		System.out.println();
		
		selectionSort(arrayOne);
		
		System.out.println("After Selection Sorting..");
		
		for(int after : arrayOne){
			System.out.print(after+" ");
		}
		
		
		
	}

}

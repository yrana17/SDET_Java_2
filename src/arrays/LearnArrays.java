package arrays;

public class LearnArrays {

	public static void main(String[] args) {

		/**
		 * Declaration and initialisation
		 */
		int arr[] = {1,2,3,4,5,6,7};
		System.out.println(arr.length);
		
		int[] arr1= {8,9,10,11};
		System.out.println(arr1.length);
		
		int arr2[] = new int[5];
		System.out.println(arr2.length);
		arr2[0]=15;
		arr2[1]=16;
		arr2[2]=17;
		arr2[3]=18;
		arr2[4]=19;
		//arr2[5]=20; array out of bound index
		
		System.out.println(arr2.length);
		
		for(int i=0;i<arr2.length;i++)
			System.out.println(arr2[i]);
		
		
		
		
		
		
		
		
		
		
		
	}

}

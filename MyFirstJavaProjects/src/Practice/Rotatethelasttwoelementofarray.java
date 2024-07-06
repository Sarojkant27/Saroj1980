 package Practice;

public class Rotatethelasttwoelementofarray {

	public static void main(String[] args)
	{
		 //Initialize array   
		int[] arr = {1, 2, 3, 4, 5};//51234 
		 //n determine the number of times an array should be rotated  
		int n = 3;  
		System.out.println("Original array: ");  
		for (int i=0;i<arr.length;i++)
			{
		    System.out.println(arr[i]+ " ");//arr[0]
			}
		//Rotate the given array by n times toward left  
		 for(int i = 0; i < n; i++){  
	            int j, first;  
	            //Stores the first element of the array  
	            first = arr[0];  
	          
	            for(j = 0; j < arr.length-1; j++){  //{{3,4,5,1,2}
	                //Shift element of array by one  
	                arr[j] = arr[j+1];  
	            }  
	            //First element of array will be added to the end  
	            arr[j] = first;  
	        }  
	          
	        System.out.println();  
	        System.out.println("Array after left rotation: ");  
	        for(int i = 0; i< arr.length; i++){  
	            System.out.print(arr[i] + " ");  
	        }  
	    }  
		

	}



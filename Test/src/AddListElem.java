class AddListElem
{
	public static void main(String[] args)
	{
	int[] arr = {1,2,3, 4,5,6,7,8,9};
	int prev = 0;
	int temp =0;
		for(int j =1 ; j < arr.length; j++)
		{ 	
			prev = prev + j;
			int sum = 0;
			if(prev > arr.length)
				break;
			for(int k = 0 ; k < prev-temp ; k ++)
				sum = sum + arr[temp + k];
			System.out.println("Sum  " + sum);
			temp = prev;
		}
		for(int z = temp ; z<arr.length ; z++)
			System.out.println(arr[z]);
	}
}
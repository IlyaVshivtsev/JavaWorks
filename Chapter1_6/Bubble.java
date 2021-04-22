class Bubble {
	public static void main(String[ ] args) {
		int nums[] = { 5, 6, 3, 1, 10, 1 };
		int size = nums.length;
		int temp;
		int i, j;

		for (i = 1; i < size; i++)
			for (j = size-1; j >= i; j--) {
				if (nums[j-1] > nums[j]) {
					temp = nums[j-1];
					nums[j-1] = nums[j];
					nums[j]	= temp;
				}
			}

		for (i = 0; i < size; i++)
			System.out.println(nums[i]);
	}
}

package algorithms.experiment;

public class Sort {

	public static void main(String[] args) {
		int[] array = { 2, 69, 45, 23, 79, 22, 77, 8, 3, 9, 44, 76, 2 };

		int[] result = {};
		result = bubble4(array);
		for (int i = 0; i < result.length; i++) {
			System.out.println(result[i]);
		}
	}

	/**
	 * 
	 * 冒泡排序，自己的实现
	 * 
	 * @return
	 */
	public static int[] bubble1(int[] array) {
		for (int i = 0; i < array.length; i++) {
			for (int j = i + 1; j < array.length; j++) {
				if (array[i] < array[j]) {
					int temp = array[i];
					array[i] = array[j];
					array[j] = temp;
				}
			}
		}
		return array;
	}

	/**
	 * 
	 * @param array
	 * @return
	 */
	public static int[] bubble2(int[] array) {
		for (int i = 0; i < array.length - 1; i++) {
			for (int j = 0; j < array.length - i - 1; j++) {
				if (array[j] > array[j + 1]) {
					int temp = array[j];
					array[j] = array[j + 1];
					array[j + 1] = temp;
				}
			}
		}
		return array;
	}

	public static int[] bubble3(int[] array) {
		int i = array.length - 1; // 初始时,最后位置保持不变
		while (i > 0) {
			int pos = 0; // 每趟开始时,无记录交换
			for (int j = 0; j < i; j++)
				if (array[j] > array[j + 1]) {
					pos = j; // 记录交换的位置
					int tmp = array[j];
					array[j] = array[j + 1];
					array[j + 1] = tmp;
				}
			i = pos; // 为下一趟排序作准备
		}
		return array;
	}
	
	public static int[] bubble4(int[] array) {
		int low = 0;
		int high = array.length - 1;
		while (low < high) {
			for (int j = low; j < high; j++) {
				if (array[j] > array[j + 1]) {
					int temp = array[j];
					array[j] = array[j + 1];
					array[j + 1] = temp;
				}
			}
			--high;
			
			for (int j = high; j > low; j--) {
				if (array[j - 1] > array[j]) {
					int temp = array[j - 1];
					array[j - 1] = array[j];
					array[j] = temp;
				}
			}
			++low;
		}
		
		return array;
	}
}

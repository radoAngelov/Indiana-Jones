
public class IndianaBag {

	static int[][] knapsack(int capacity, Item[] items) {

		//Creates an array in which every row is a mini knapsack
		int[][] ValueArray = new int[items.length + 1][capacity + 1];
		for (int itemIndex = 0; itemIndex <= items.length; itemIndex++) {
			for (int key = 0; key <= capacity; key++) {
				//Sets all columns at row 0 to 0 if
				//there are no items to take or
				//the capacity of the bag is not enough
				if (itemIndex == 0 || key == 0) {
					ValueArray[itemIndex][key] = 0;
					continue;
				}
				//Checks if we can accommodate the current element
				if (items[itemIndex - 1].getKey() <= key) {
					ValueArray[itemIndex][key] = Math.max(items[itemIndex - 1].getVal()
									+ ValueArray[itemIndex - 1][key - items[itemIndex - 1].getKey()],
							ValueArray[itemIndex - 1][key]);
				} else {
					ValueArray[itemIndex][key] = ValueArray[itemIndex - 1][key];
				}
			}
		}
		return ValueArray;
	}

	public static void main(String[] args) {
		
		Item[] items = { new Item("ring", 1, 100),
				new Item("hat", 3, 40), 
				new Item("necklace", 2, 400),
				new Item("boots", 9, 50) };
		int filled_bag[][] = knapsack(7, items);
		for(int i=0;i<filled_bag.length;i++){
			for(int j=0;j<filled_bag[0].length;j++){
				System.out.format("%5d",filled_bag[i][j]);
			}
			System.out.println();
		}
		System.out.println(filled_bag[filled_bag.length-1][filled_bag[0].length-1]);
	}
}

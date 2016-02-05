
public class Item {
	private String name;
	private int key;
	private int val;
	
	public Item(String name, int key, int val) {
		if(name!=null)
		this.name = name;
		if(key>=0)
		this.key = key;
		if(val>=0)
		this.val = val;
	}

	@Override
	public String toString() {
		return "Item [name=" + name + ", key=" + key + ", val=" + val + "]";
	}

	public int getKey() {
		return key;
	}

	public void setKey(int key) {
		if(key>0)
		this.key = key;
	}

	public int getVal() {
		return val;
	}

	public void setVal(int val) {
		if(val>0)
		this.val = val;
	}
	
}
package fileManagement;

public class File {
	
	public String name;
	public int size;
	public int indexOfFirstBlock;
	
	File(){
		name = "";
		size=0;
		indexOfFirstBlock = 0;
	}
	
	File(String name, int size, int indexOfFirstBlock){
		this.name=name;
		this.size = size;
		this.indexOfFirstBlock= indexOfFirstBlock;
	}
	

	public static void main(String[] args) {
		System.out.print("C:");
	}

}
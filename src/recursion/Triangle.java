package recursion;
//We have triangle made of blocks. The topmost row has 1 block, the next row down has 2 blocks, the next row has 3 blocks, and so on.
//Compute recursively (no loops or multiplication) the total number of blocks in such a triangle with the given number of rows.
//triangle(0) = 0
//triangle(1) = 1
//triangle(2) = 3

public class Triangle {
	public static void main(String[] args){
		System.out.println("triangle(0) = " + triangle(0));
		System.out.println("triangle(1) = " + triangle(1));
		System.out.println("triangle(2) = " + triangle(2));
		System.out.println("triangle(3) = " + triangle(3));
		
	}
	
	public static int triangle(int rows){
		if(rows == 0){
			return 0;
		}else if(rows == 1){
			return 1;
		}else{
			return rows + triangle(rows - 1);
		}
	}

}
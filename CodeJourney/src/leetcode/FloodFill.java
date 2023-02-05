package leetcode;

public class FloodFill {

	public static void main(String[] args) {
		int[][] image= {{1,1,1},{1,1,0},{1,0,1}};
		int sr=1;
		int sc=1;
		int color=2;
		
		int pre_color= image[sr][sc];

		if(pre_color != color) {
			fill(image, sr,sc,pre_color,color);
		}
		
		for(int i=0;i<image.length;i++) {
			for(int j=0;j<image[0].length;j++) {
				System.out.print(image[i][j]+" ");
			}
			System.out.println();
		}
	}

	public static void fill(int[][] image, int sr,int sc,int pcolor,int color) {
		
		if(sr<0 || sr>=image.length || sc<0 || sc>=image[0].length || image[sr][sc] != pcolor) {
			return;
		}
		
		image[sr][sc]=color;
		fill(image, sr+1,sc,pcolor,color);
		fill(image, sr-1,sc,pcolor,color);
		fill(image, sr, sc+1,pcolor,color);
		fill(image, sr, sc-1,pcolor,color);
		
	}
}

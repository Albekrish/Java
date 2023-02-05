package leetcode;

public class BattleShip {

	public static void main(String[] args) {
		char[][] board= {{'X','.','.','X'},{'.','.','.','X'},{'.','.','.','X'}};
		int count=0;
        for(int i=0;i<board.length;i++){
            for(int j=0;j<board[0].length;j++){                                
                if(board[i][j]=='X'){
                    count++;
                    fill(board, i, j+1);
                    fill(board, i+1,j);
                }
            }
        }
    System.out.println(count);
    }
    public static void fill(char[][] board, int i,int j) {
		
		if(i<0 || i>=board.length || j<0 || j>=board[0].length || board[i][j] == '.') {
			return;
		}
		
		board[i][j]='.';
		fill(board, i+1,j);		
		fill(board, i, j+1);

	}

}

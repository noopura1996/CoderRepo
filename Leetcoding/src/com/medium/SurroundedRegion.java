package com.medium;
//O -> X for all surrounded ones. If any O in border or touches anither O in border do
// not convert it to X';
//wrong answer
public class SurroundedRegion {
	static String[][] board = {{"X","X","X","X"},{"X","O","O","X"},{"X","X","O","X"},{"X","O","X","X"}};
	static int m = board.length;
	static int n = board[0].length;
	static String[][] output = new String[m][n];
	public static void main(String[] args) {		
		solution(board);
		for(int i=0;i<m;++i) {
			for(int j=0;j<n;++j) {
				System.out.print(output[i][j]);
			}
			System.out.println();
		}
	}

	public static void solution(String[][] board) {
		output = board;
		
		//top and bottom rows
		for(int i=0;i<m;++i) {
			if(board[0][i] == "O")
				dfs(0,i);
		}
		for(int i=0;i<m;++i) {
			if(board[m-1][i] == "O")
				dfs(m-1,i);
		}
		
		//for first and last columns
		for(int i=0;i<n;++i) {
			if(board[i][0] == "O")
				dfs(i,0);
		}
		for(int i=0;i<n;++i) {
			if(board[i][n-1] == "O")
				dfs(i,n-1);
		}
		
		//convert O -> X and 1 -> O
			for(int i=0;i<m;++i) {
				for(int j=0;j<n;++j) {
					if(board[i][n-1] == "O")
						board[i][j] = "X";
					if(board[i][j] == "1")
						board[i][j] = "O";
			}
		}
			
	}

	public static void dfs( int i, int j) {
		if(i<0 || i >= m)
			return;
		if(j<0 || j >= n)
			return;
		if(output[i][j] == "X" || output[i][j] == "1")
			return;
		output[i][j] = "1";
		dfs(i,j+1);
		dfs(i,j-1);
		dfs(i+1,j);
		dfs(i-1,j);
		
		
	}
}

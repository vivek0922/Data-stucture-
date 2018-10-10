public class Main {
	public static int board[][] = new int[8][8];
	public static int[] move_x = {1,1,2,2,-1,-1,-2,-2};
	public static int[] move_y = {-2,2,1,-1,2,-2,1,-1};
	
	public static void main(String[] args)
	{
	    for (int i = 0; i < 8; i++)
	    {
	        for (int c = 0; c < 8; c++)
	        {
	            board[i][c] = -1; // starting point 
	        }
	    }
		solve(1, 7, 7);
	}

	public static boolean solve(int move, int x, int y)
	{
	    board[x][y] = move;
	    if(move == 64)
	    {
	        for(int i = 0; i < 8; i++)
	        {
	            for(int c = 0; c < 8; c++)
	            {
	                System.out.printf("%3d", board[i][c]);
	            }
	            System.out.println("\n");
	        }
	        return true;
	    }
	    else
	    {
	        for(int i = 0; i < 8; i++)
	        {
	            if((x + move_x[i]) >= 0 && (x + move_x[i]) < 8
	                    && (y + move_y[i]) >= 0
	                    && (y + move_y[i]) < 8 && (board[x + move_x[i]][y + move_y[i]] == -1)
	                    && (solve(move + 1, (x + move_x[i]), (y + move_y[i]))))
	            {
	                return true;
	            }
	        }
	        board[x][y] = -1;
	        return false;
	    }
	}

}

/* A Backtracking program in  
Java to solve Sudoku problem */
class sudo 
{ 
public static boolean testValue(int[][] board,  
                             int row, int col,  
                             int num)  
{ 
    // row has the unique (row-clash) 
    for (int d = 0; d < board.length; d++)  
    { 
        // if the number we are trying to  
        // place is already present in  
        // that row, return false; 
        if (board[row][d] == num)  
        { 
            return false; 
        } 
    } 
      
    // column has the unique numbers (column-clash) 
    for (int r = 0; r < board.length; r++) 
    { 
        // if the number we are trying to 
        // place is already present in 
        // that column, return false; 
  
        if (board[r][col] == num) 
        { 
            return false; 
        } 
    } 
  
    // corresponding square has 
    // unique number (box-clash) 
    int sqrt = (int) Math.sqrt(board.length); 
    int boxRowStart = row - row % sqrt; 
    int boxColStart = col - col % sqrt; 
  
    for (int r = boxRowStart; 
             r < boxRowStart + sqrt; r++)  
    { 
        for (int d = boxColStart;  
                 d < boxColStart + sqrt; d++)  
        { 
            if (board[r][d] == num)  
            { 
                return false; 
            } 
        } 
    } 
  
        // if there is no clash, it's safe 
    return true; 
} 
  
public static boolean remplitSudoku(int[][] board, int n)  
{ 
    int row = -1; 
    int col = -1; 
    boolean isEmpty = true; 
    for (int i = 0; i < n; i++) 
    { 
        for (int j = 0; j < n; j++)  
        { 
            if (board[i][j] == 0)  
            { 
                row = i; 
                col = j; 
                  
                // we still have some remaining 
                // missing values in Sudoku 
                isEmpty = false;  
                //System.out.println("before break");
                break; 
            } 
        } 
        if (!isEmpty) 
        { 
            break; 
        } 
    } 
    //System.out.println("out between");
    // no empty space left 
    if (isEmpty)  
    { 
        return true; 
    } 
  
    // else for each-row backtrack 
    for (int num = 1; num <= n; num++) 
    { 
        if (testValue(board, row, col, num)) 
        { 
            board[row][col] = num; 
            if (remplitSudoku(board, n))  
            { 
                // print(board, n); 
                return true; 
            }  
            else
            { 
                board[row][col] = 0; // replace it 
            } 
        } 
    } 
    return false; 
} 
  
public static void affiche(int[][] board, int N) 
{ 
    // we got the answer, just print it 
    for (int r = 0; r < N; r++) 
    { 
        for (int d = 0; d < N; d++) 
        { 
            System.out.print(board[r][d]); 
            System.out.print(" "); 
        } 
        System.out.print("\n"); 
          
        if ((r + 1) % (int) Math.sqrt(N) == 0)  
        { 
            System.out.print(""); 
        } 
    } 
} 
  
// Driver Code 
public static void main(String args[]) 
{ 
  
    // int[][] board = new int[][] 
    // { 
    //         {3, 0, 6, 5, 0, 8, 4, 0, 0}, 
    //         {5, 2, 0, 0, 0, 0, 0, 0, 0}, 
    //         {0, 8, 7, 0, 0, 0, 0, 3, 1}, 
    //         {0, 0, 3, 0, 1, 0, 0, 8, 0}, 
    //         {9, 0, 0, 8, 6, 3, 0, 0, 5}, 
    //         {0, 5, 0, 0, 9, 0, 6, 0, 0}, 
    //         {1, 3, 0, 0, 0, 0, 2, 5, 0}, 
    //         {0, 0, 0, 0, 0, 0, 0, 7, 4}, 
    //         {0, 0, 5, 2, 0, 6, 3, 0, 0} 
    // }; 
    int[][] board = {
        {3,0,0,0,5,0,0,0,2}
       ,{0,6,0,0,1,7,4,3,0}
       ,{0,2,0,0,0,3,7,0,0}
       ,{0,0,0,0,6,5,0,7,0}
       ,{5,0,0,0,0,0,0,0,8}
       ,{0,8,0,1,3,0,0,0,0}
       ,{0,0,2,3,0,0,0,1,0}
       ,{0,7,8,9,2,0,0,6,0}
       ,{1,0,0,0,7,0,0,0,4}

   };

    int N = board.length; 
  
    if (remplitSudoku(board, N)) 
    { 
        affiche(board, N); // print solution 
    }  
    else
    { 
        System.out.println("No solution"); 
    } 
} 
} 
  
// This code is contributed  
// by MohanDas 
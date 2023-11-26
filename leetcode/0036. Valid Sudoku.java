class Solution {
    public boolean isValidSudoku(char[][] board) {
        /* bitmasking 將 0 ~ 9 編碼為 10 bit
           0 => 0000000000 1 => 0000000001 2 => 0000000010 etc.
           如此若列、行、方塊中數字不重複時 做位元 and 運算即為必定要為 0
           做位元 or 運算把 bit 加入

           定位方塊位置 row/3 * 3(colLen) + col / 3
           索引範圍：
           0~2 => 第一個方塊 /3 = 0 3~5 => 第二個方塊 /3 = 1 
           6~8 => 第三個方塊 /3 = 2
           當作 1d array 做拉平 i * 3 + j => row/3 * 3 + col / 3
        */
        
        int[] seenInRow = new int[9]; // 9 為列、行、方塊大小
        int[] seenInCol = new int[9];
        int[] seenInBlock = new int[9];

        for(int row = 0 ; row < 9; row++){
            for(int col = 0 ; col < 9; col++){
                if(board[row][col] == '.') continue;
                int num = board[row][col] - 48; //ascii 0=48
                int bit = 1 << num;
                int blockInx = row/3 * 3 + col/3;

                if((seenInRow[row] & bit) > 0 ||
                   (seenInCol[col] & bit) > 0 ||
                   (seenInBlock[blockInx] & bit) > 0)
                   return false; 
                
                seenInRow[row] |= bit;
                seenInCol[col] |= bit;
                seenInBlock[blockInx] |= bit;
            }
        }
        
        return true;
    }
}
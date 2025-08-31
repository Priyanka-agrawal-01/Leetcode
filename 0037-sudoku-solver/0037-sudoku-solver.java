class Solution {
    private int[] row = new int[9], col = new int[9], box = new int[9];

    public void solveSudoku(char[][] board) {
        for (int r = 0; r < 9; r++) {
            for (int c = 0; c < 9; c++) {
                char ch = board[r][c];
                if (ch != '.') {
                    int d = ch - '1';
                    int b = (r / 3) * 3 + (c / 3);
                    int bit = 1 << d;
                    row[r] |= bit;
                    col[c] |= bit;
                    box[b] |= bit;
                }
            }
        }
        dfs(board);
    }

    private boolean dfs(char[][] board) {
        int bestR = -1, bestC = -1, bestMask = 0, bestCount = 10;

        for (int r = 0; r < 9; r++) {
            for (int c = 0; c < 9; c++) {
                if (board[r][c] != '.') continue;
                int b = (r / 3) * 3 + (c / 3);
                int mask = ~(row[r] | col[c] | box[b]) & 0x1FF; 
                int cnt = Integer.bitCount(mask);
                if (cnt == 0) return false;          
                if (cnt < bestCount) {               
                    bestCount = cnt;
                    bestMask = mask;
                    bestR = r; bestC = c;
                    if (cnt == 1) break;            
                }
            }
            if (bestCount == 1) break;
        }

        if (bestR == -1) return true; 

        int r = bestR, c = bestC, b = (r / 3) * 3 + (c / 3);
        for (int m = bestMask; m != 0; m &= (m - 1)) {
            int bit = m & -m;                        
            int d = Integer.numberOfTrailingZeros(bit); 
            place(board, r, c, b, d, bit);
            if (dfs(board)) return true;
            remove(board, r, c, b, d, bit);
        }
        return false;
    }

    private void place(char[][] board, int r, int c, int b, int d, int bit) {
        board[r][c] = (char)('1' + d);
        row[r] |= bit;
        col[c] |= bit;
        box[b] |= bit;
    }

    private void remove(char[][] board, int r, int c, int b, int d, int bit) {
        board[r][c] = '.';
        row[r] ^= bit;
        col[c] ^= bit;
        box[b] ^= bit;
    }
}

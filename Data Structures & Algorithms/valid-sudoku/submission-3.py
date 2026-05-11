class Solution:
    def isValidSudoku(self, board: List[List[str]]) -> bool:
        rows = defaultdict(set)
        cols = defaultdict(set)
        square = defaultdict(set)

        for r in range(9):
            for c in range(9):
                val = board[r][c]
                if val == '.':
                    continue

                sq_key = (r//3 , c//3)

                if(
                    val in rows[r] or
                    val in cols[c] or
                    val in square[sq_key]
                ) :
                    return False
                cols[c].add(board[r][c])
                rows[r].add(board[r][c])
                square[sq_key].add(board[r][c])

        return True
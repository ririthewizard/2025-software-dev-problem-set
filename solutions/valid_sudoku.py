from collections import defaultdict

class Solution:
    board = [["8","3",".",".","7",".",".",".","."]
,["6",".",".","1","9","5",".",".","."]
,[".","9","8",".",".",".",".","6","."]
,["8",".",".",".","6",".",".",".","3"]
,["4",".",".","8",".","3",".",".","1"]
,["7",".",".",".","2",".",".",".","6"]
,[".","6",".",".",".",".","2","8","."]
,[".",".",".","4","1","9",".",".","5"]
,[".",".",".",".","8",".",".","7","9"]]

    def is_valid_sudoku(board: list[list[str]]) -> bool:
        s = set()

        for row in range(9):
            for col in range(9):
                if board[row][col] != ".":
                    check_against = board[row][col]

                    key = f"{check_against} in row {row}"

                    if key in s:
                        return False
                    else:
                        s.add(key)

                    key = f"{check_against} in col {col}"

                    if key in s:
                        return False
                    else:
                        s.add(key)

                    box_index = (row // 3) * 3 + (col//3)
                    key = f"{check_against} in box {box_index}"
                    if key in s:
                        return False
                    else:
                        s.add(key)

        return True
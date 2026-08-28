class Solution {
    public boolean isValidSudoku(char[][] board) {
        Map<Integer, Set<Character>> rowMap = new HashMap<>();
        Map<Integer, Set<Character>> colMap = new HashMap<>();
        Map<Integer, Set<Character>> squresMap = new HashMap<>();

        for(int i=0;i<9;i++){
            for(int j=0;j<9;j++){
                if(board[i][j] == '.'){
                    continue;
                }
                if(rowMap.getOrDefault(i, new HashSet<>()).contains(board[i][j]) ||
                   colMap.getOrDefault(j, new HashSet<>()).contains(board[i][j]) ||
                   squresMap.getOrDefault(((i/3)*3 + j/3), new HashSet<>()).contains(board[i][j])){
                    return false;
                }
                rowMap.computeIfAbsent(i, k -> new HashSet<>()).add(board[i][j]);
                colMap.computeIfAbsent(j, k -> new HashSet<>()).add(board[i][j]);
                squresMap.computeIfAbsent(((i/3)*3 + j/3), k-> new HashSet<>()).add(board[i][j]);
            }
        }
        return true;
    }
}

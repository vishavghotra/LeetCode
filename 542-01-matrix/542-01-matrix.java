class Solution {
    public int[][] updateMatrix(int[][] mat){
     Queue<int[]> queue = new LinkedList<>();
        for (int i = 0; i < mat.length; i++) {
            for (int j = 0; j < mat[0].length; j++) {
                if (mat[i][j] == 0)
                    queue.add(new int[] { i, j });
                else
                    mat[i][j] = -1;

            }
        }
        int[][] directions = new int[][] { { 1, 0 }, { 0, 1 }, { -1, 0 }, { 0, -1 } };
        while (!queue.isEmpty()) {
            int[] poll = queue.poll();
            for (int[] dir : directions) {
                int a = poll[0] + dir[0];
                int b = poll[1] + dir[1];
                if (a < 0 || a >= mat.length || b < 0 || b >= mat[0].length || mat[a][b] != -1)
                    continue;
                mat[a][b] = mat[poll[0]][poll[1]] + 1;
                queue.add(new int[] { a, b });
            }

        }
        return mat;
}
}
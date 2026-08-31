class Solution {
    public int numIslands(char[][] grid) {
        int row = grid.length;
        int col = grid[0].length;

        int count = 0;
        int[][] visited = new int[row][col];

        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                if (grid[i][j] == '1' && visited[i][j] == 0) {
                    System.out.println(i + " " + j);
                    bfs(grid, i, j, visited);
                    count += 1;
                }
            }
        }

        return count;
    }

    public void bfs(char[][] grid, int x, int y, int[][] visited) {
        int[] xDirection = {0, 0, -1, 1};
        int[] yDirection = {-1, 1, 0, 0};

        Queue<Pair<Integer, Integer>> queue = new LinkedList<>();
        visited[x][y] = 1;
        queue.add(new Pair(x, y));

        while(!queue.isEmpty()) {
            Pair<Integer, Integer> curr = queue.poll();
            int currX = curr.getKey();
            int currY = curr.getValue();

            for (int i = 0; i < xDirection.length; i++) {
                int newX = currX + xDirection[i];
                int newY = currY + yDirection[i];

                if (newX >= grid.length || newY >= grid[0].length) continue;
                if (newX < 0 || newY < 0) continue;

                if (grid[newX][newY] == '1' && visited[newX][newY] == 0) {
                    queue.add(new Pair(newX, newY));
                    visited[newX][newY] = 1;
                }
            }
        }
    }
}

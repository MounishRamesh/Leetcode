class Solution {
    public int findCircleNum(int[][] isConnected) {
        boolean[] visited = new boolean[isConnected.length];
        int provinces = 0;

        for (int i = 0; i < isConnected.length; i++) {
            if (!visited[i]) {
                dfs(isConnected, visited, i);
                provinces++; // one complete province found
            }
        }
        return provinces;
    }

    private void dfs(int[][] graph, boolean[] visited, int city) {
        visited[city] = true;
        for (int j = 0; j < graph.length; j++) {
            if (graph[city][j] == 1 && !visited[j]) {
                dfs(graph, visited, j);
            }
        }
    }
}

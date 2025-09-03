// Last updated: 03/09/2025, 10:07:31
import java.util.Arrays;

class Solution {

    int minDistance(int[] dist, boolean[] visited, int nodes) {
        int min = Integer.MAX_VALUE, minIndex = -1;
        for (int v = 1; v <= nodes; v++) {
            if (!visited[v] && dist[v] < min) { 
                min = dist[v];
                minIndex = v;
            }
        }
        return minIndex;
    }

    int[][] makeAdjMat(int[][] edges, int nodes) {
        int[][] adjMat = new int[nodes + 1][nodes + 1];
        for (int i = 1; i <= nodes; i++) {
            Arrays.fill(adjMat[i], Integer.MAX_VALUE);
        }
        for (int[] time : edges) { 
            adjMat[time[0]][time[1]] = time[2];
        }
        return adjMat;
    }

    public int networkDelayTime(int[][] edges, int nodes, int currNode) {
        int[][] adjMat = makeAdjMat(edges, nodes); 
        boolean[] visited = new boolean[nodes + 1]; 
        int[] distance = new int[nodes + 1];       

        Arrays.fill(distance, Integer.MAX_VALUE);
        distance[currNode] = 0;

        for (int count = 1; count <= nodes; count++) {
            int u = minDistance(distance, visited, nodes); 
            if (u == -1) break;
            visited[u] = true;

            for (int v = 1; v <= nodes; v++) {
                if (adjMat[u][v] != Integer.MAX_VALUE && !visited[v]) {
                    if (distance[v] > distance[u] + adjMat[u][v]) {
                        distance[v] = distance[u] + adjMat[u][v];
                    }
                }
            }
        }

        int maxTime = 0;
        for (int i = 1; i <= nodes; i++) { // fixed for loop syntax
            if (distance[i] == Integer.MAX_VALUE)
                return -1;
            maxTime = Math.max(maxTime, distance[i]);
        }
        return maxTime;
    }
}
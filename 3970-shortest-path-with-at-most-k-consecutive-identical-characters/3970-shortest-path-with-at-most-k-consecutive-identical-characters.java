import java.util.*;

class Solution {
public int shortestPath(int n, int[][] edges, String labels, int k) {
List<int[]>[] graph = new ArrayList[n];


    for (int i = 0; i < n; i++) {
        graph[i] = new ArrayList<>();
    }

    for (int[] edge : edges) {
        graph[edge[0]].add(new int[]{edge[1], edge[2]});
    }

    long[][] dist = new long[n][k + 1];

    for (long[] row : dist) {
        Arrays.fill(row, Long.MAX_VALUE);
    }

    PriorityQueue<long[]> pq = new PriorityQueue<>(
        (a, b) -> Long.compare(a[2], b[2])
    );

    dist[0][1] = 0;
    pq.offer(new long[]{0, 1, 0});

    while (!pq.isEmpty()) {
        long[] curr = pq.poll();

        int node = (int) curr[0];
        int count = (int) curr[1];
        long cost = curr[2];

        if (cost != dist[node][count]) {
            continue;
        }

        if (node == n - 1) {
            return (int) cost;
        }

        for (int[] next : graph[node]) {
            int v = next[0];
            int weight = next[1];

            int nextCount;

            if (labels.charAt(node) == labels.charAt(v)) {
                nextCount = count + 1;
            } else {
                nextCount = 1;
            }

            if (nextCount > k) {
                continue;
            }

            long newCost = cost + weight;

            if (newCost < dist[v][nextCount]) {
                dist[v][nextCount] = newCost;
                pq.offer(new long[]{v, nextCount, newCost});
            }
        }
    }

    return -1;
}

}

import java.util.*;

public class DijkstraShortestPath {

    //Network time delay problem

    /**
     *      [[2,1,1]
     *      [2,3,1]
     *      [3,4,1]]
     *
     * @param times
     * @param n
     * @param k
     * @return
     */

    static int getNetworkDelay(int [][] times , int n, int k){

        Map<Integer, List<int[]>> adjList = new HashMap<>();
        for(int [] time : times){
            adjList.computeIfAbsent(time[0],x-> new ArrayList<>()).add(new int[]{time[1],time[2]});
        }
        Map<Integer,Integer> dist = new HashMap<>();
        PriorityQueue<int[]> priorityQueue = new PriorityQueue<>((edge1 ,edge2)->{
            return edge1[1] -edge2[1];
        });

        priorityQueue.offer(new int[]{k,0});

        while(!priorityQueue.isEmpty()){
            int[] curr = priorityQueue.poll();

            if(dist.containsKey(curr[0]))
                continue;
            dist.put(curr[0],curr[1]);
            if(adjList.containsKey(curr[0])){
                for(int[] edge : adjList.get(curr[0])){
                    priorityQueue.offer(new int[]{edge[0],edge[1]+curr[1]});
                }
            }
        }

        if (dist.size() != n) return -1;

        int result = Integer.MIN_VALUE;
        for (int a :dist.keySet()){
            result = Math.max(dist.get(a),result);
        }
        return result;

    }// method

    public static void main(String[] args) {
        // [[2,1,1],[2,3,1],[3,4,1]], N = 4, K = 2

        System.out.println(getNetworkDelay(new int[][]{{2,1,1},{2,3,1},{3,4,1}}, 4,  2));

    }


}

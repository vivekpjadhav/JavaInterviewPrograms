import java.util.PriorityQueue;

public class StreamingMedian {


    public static void main(String[] args) {

    }


    static double[] median(int[] arr) {
    PriorityQueue<Integer> minHeap = new PriorityQueue<>();
        PriorityQueue<Integer> maxHeap = new PriorityQueue<>((a,b)->{ return b-a;});
        double [] median = new double[arr.length];

        for (int i = 0; i < arr.length ; i++) {
            if(maxHeap.size() ==0 || arr[i] < maxHeap.peek())
                maxHeap.add(arr[i]);
            else minHeap.add(arr[i]);

            if(minHeap.size() != maxHeap.size() ){
                rebalence(minHeap,maxHeap);
            }
            median[i] = getMedian(minHeap,maxHeap);
        }

        return median;
    }

    private static void rebalence(PriorityQueue<Integer> minHeap, PriorityQueue<Integer> maxHeap) {
        PriorityQueue<Integer> bigger = (minHeap.size() > maxHeap.size())?minHeap:maxHeap;
        PriorityQueue<Integer> smaller = (minHeap.size() < maxHeap.size())?minHeap:maxHeap;
        if(bigger.size() - smaller.size()>1 ){
            smaller.add(bigger.poll());
        }
    }

    static double getMedian(PriorityQueue<Integer> lower, PriorityQueue<Integer> higher) {
        if (lower.size() == higher.size())
            return ((double) lower.peek() +  higher.peek()) / 2;
        PriorityQueue<Integer> biggerHeap = (lower.size() > higher.size()) ? lower : higher;


        return biggerHeap.peek();
    }
}

class Solution {
    public boolean carPooling(int[][] trips, int capacity) {
        Arrays.sort(trips , Comparator.comparingInt(a -> a[1]) );

        Queue<int[]> minHeap = new PriorityQueue<>(
            Comparator.comparingInt(a -> a[0]));

        int curPas = 0;

        for(int[] trip : trips) {
            int numPas = trip[0] , start = trip[1] , end = trip[2];

            while(!minHeap.isEmpty() && minHeap.peek()[0] <= start ) {
                curPas -= minHeap.poll()[1];
            }

            curPas +=numPas;
            if(curPas > capacity) {
                return false;
            }

            minHeap.offer(new int[]{end , curPas});

        }
        return true;
    }
}
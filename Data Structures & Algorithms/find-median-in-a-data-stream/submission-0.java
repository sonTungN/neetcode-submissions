class MedianFinder {
    private Queue<Integer> smallHeap;
    private Queue<Integer> bigHeap;

    public MedianFinder() {
        smallHeap = new PriorityQueue<Integer>(new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                return o2.compareTo(o1);
            }
        });

        bigHeap = new PriorityQueue<Integer>(new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                return o1.compareTo(o2);
            }
        });
    }

    public void addNum(int num) {
        smallHeap.add(num);
        if (smallHeap.size() - bigHeap.size() > 1
            || (!bigHeap.isEmpty() && bigHeap.peek() < smallHeap.peek())) {
            bigHeap.add(smallHeap.poll());
        }

        if (bigHeap.size() - smallHeap.size() > 1) {
            smallHeap.add(bigHeap.poll());
        }
    }

    public double findMedian() {
        if (smallHeap.size() == bigHeap.size()) {
            return (smallHeap.peek() + bigHeap.peek()) / 2.0;
        }

        return smallHeap.size() > bigHeap.size() ? smallHeap.peek() : bigHeap.peek();
    }
}

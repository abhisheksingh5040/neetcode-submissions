class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        Map<Integer, Integer> map = new HashMap<>();

        for (int num : nums){
            map.put(num,map.getOrDefault(num,0) + 1);
        }

        PriorityQueue<Map.Entry<Integer, Integer>> pq =
        new PriorityQueue<>(
                Map.Entry.<Integer, Integer>comparingByValue()
                        .reversed()
        );

        pq.addAll(map.entrySet());

        int[] res = new int[k];
        int count = 0;
        while (count < k && !pq.isEmpty()) {
            Map.Entry<Integer, Integer> entry = pq.poll();
            res[count++] = entry.getKey();
        }

        return res;
    }
}

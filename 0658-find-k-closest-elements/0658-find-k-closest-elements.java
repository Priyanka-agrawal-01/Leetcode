class Solution {
    public List<Integer> findClosestElements(int[] arr, int k, int x) {

        List<Integer> temp = new ArrayList<>();

        for (int num : arr) {
            temp.add(num);
        }

        while (temp.size() > k) {

            int leftDiff = Math.abs(temp.get(0) - x);
            int rightDiff = Math.abs(temp.get(temp.size() - 1) - x);

            if (leftDiff > rightDiff) {
                temp.remove(0);
            } else {
                temp.remove(temp.size() - 1);
            }
        }

        return temp;
    }
}
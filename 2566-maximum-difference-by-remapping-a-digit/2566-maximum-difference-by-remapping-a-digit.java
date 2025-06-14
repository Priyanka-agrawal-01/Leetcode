class Solution {
    public int minMaxDifference(int num) {
        ArrayList<Integer> al = new ArrayList<>();
        int temp = num;
        while (temp != 0) {
            al.add(temp % 10);
            temp /= 10;
        }
        int replaceMax = -1;
        for (int i = al.size() - 1; i >= 0; i--) {
            if (al.get(i) != 9) {
                replaceMax = al.get(i);
                break;
            }
        }
        int num1 = 0;
        for (int i = al.size() - 1; i >= 0; i--) {
            int digit = al.get(i);
            if (digit == replaceMax) {
                num1 = num1 * 10 + 9;
            } else {
                num1 = num1 * 10 + digit;
            }
        }

        int replaceMin = -1;
        for (int i = al.size() - 1; i >= 0; i--) {
            if (al.get(i) != 0) {
                replaceMin = al.get(i);
                break;
            }
        }

        int num2 = 0;
        for (int i = al.size() - 1; i >= 0; i--) {
            int digit = al.get(i);
            if (digit == replaceMin) {
                num2 = num2 * 10 + 0;
            } else {
                num2 = num2 * 10 + digit;
            }
        }

        return num1 - num2;
    }
}

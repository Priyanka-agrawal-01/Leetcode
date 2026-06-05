class Solution {
    public int totalWaviness(int num1, int num2) {

        int ans = 0;

        for (int i = num1; i <= num2; i++) {

            long temp = i;

            int count = 0;
            long x = temp;

            while (x > 0) {
                count++;
                x /= 10;
            }

            if (count < 3) continue;

            int arr[] = new int[count];

            int idx = count - 1;
            while (temp > 0) {
                arr[idx--] = (int)(temp % 10);
                temp /= 10;
            }

            for (int j = 0; j <= count - 3; j++) {
                if (wave(arr[j], arr[j + 1], arr[j + 2])) {
                    ans++;
                }
            }
        }

        return ans;
    }

    public boolean wave(int a, int b, int c) {
        return (b > a && b > c) || (b < a && b < c);
    }
}
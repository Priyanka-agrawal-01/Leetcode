class Solution {
    public int countDaysTogether(String arriveAlice, String leaveAlice, String arriveBob, String leaveBob) {
        int[] months = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};

        int alicemonth = Integer.parseInt(arriveAlice.substring(0, 2));
        int aliceday = Integer.parseInt(arriveAlice.substring(3, 5));

        int bobmonth = Integer.parseInt(arriveBob.substring(0, 2));
        int bobday = Integer.parseInt(arriveBob.substring(3, 5));

        int aliceLeaveMonth = Integer.parseInt(leaveAlice.substring(0, 2));
        int aliceLeaveDay = Integer.parseInt(leaveAlice.substring(3, 5));

        int bobLeaveMonth = Integer.parseInt(leaveBob.substring(0, 2));
        int bobLeaveDay = Integer.parseInt(leaveBob.substring(3, 5));

        int aliceStart = aliceday;
        int aliceEnd = aliceLeaveDay;
        int bobStart = bobday;
        int bobEnd = bobLeaveDay;

        for (int i = 0; i < alicemonth - 1; i++) {
            aliceStart += months[i];
        }

        for (int i = 0; i < aliceLeaveMonth - 1; i++) {
            aliceEnd += months[i];
        }

        for (int i = 0; i < bobmonth - 1; i++) {
            bobStart += months[i];
        }

        for (int i = 0; i < bobLeaveMonth - 1; i++) {
            bobEnd += months[i];
        }

        int start = Math.max(aliceStart, bobStart);
        int end = Math.min(aliceEnd, bobEnd);

        return Math.max(0, end - start + 1);
    }
}
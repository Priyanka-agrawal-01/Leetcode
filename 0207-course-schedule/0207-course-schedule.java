class Solution {
    public boolean canFinish(int numCourses, int[][] prerequisites) {
        int indegree[] = new int[numCourses];
        for(int i = 0; i < prerequisites.length; i++) {
            int course = prerequisites[i][0];

            indegree[course]++;
        }
        Queue<Integer> q = new LinkedList<>();
        for(int i =0;i<numCourses;i++){
            if(indegree[i]==0){
                q.add(i);
            }
        }
        int count=0;
        while(!q.isEmpty()) {
            int node = q.peek();
            q.remove();

            count++;

            for(int i = 0; i < prerequisites.length; i++) {
                if(prerequisites[i][1] == node) {
                    int course = prerequisites[i][0];

                    indegree[course]--;

                    if(indegree[course] == 0) {
                        q.add(course);
                    }
                }
            }
        }
        return count == numCourses;

    }
}
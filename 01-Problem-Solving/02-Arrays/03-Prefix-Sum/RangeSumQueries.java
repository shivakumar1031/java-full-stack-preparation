/*
Problem Statement

Given an integer array and multiple queries,
find the sum of elements between the given indices (inclusive).

    Input
    int[] arr = {2,4,6,8,10};

    int[][] queries = {
        {1,3},
        {0,4},
        {2,2}
    };

    Output
    18
    30
    6

Approach:
Prefix Sum

Time Complexity:
Preprocessing: O(n)
Each Query: O(1)

Space Complexity: O(n)
*/


public class RangeSumQueries {
    public static void main(String[] args) {
        int[] arr = {2,4,6,8,10};

        int[][] queries = {
            {1,3},
            {0,4},
            {2,2}
        };

        for(int i=0;i<queries.length;i++){
            int left=queries[i][0];
            int right=queries[i][1];
            int sum=0;
            while(left<=right){
                sum+=arr[left];
                left++;
            }
            System.out.println(sum);
        }
    }
}

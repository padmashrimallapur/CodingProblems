package com.company.sep21;

public class ValidMountainArraySolution {

    public boolean validMountainArray(int[] A) {
        if (A.length < 2) {
            return false;
        }

        int maxValueIndex = 0;

        while (maxValueIndex + 1 < A.length && A[maxValueIndex] < A[maxValueIndex + 1]) {
            maxValueIndex++;

            if (maxValueIndex == 0 || maxValueIndex == A.length - 1) return false;

            for (int m = maxValueIndex; m < A.length - 1; m++) {
                if (A[m] <= A[m + 1])
                    return false;
            }

            for (int n = 0; n < maxValueIndex - 1; n++) {
                if (A[n] >= A[n + 1]) {
                    return false;
                }
            }
        }
        return true;
    }
}


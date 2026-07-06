class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int[] nums3 = new int[nums1.length + nums2.length];
        int index = 0;
        for (int i = 0; i < nums1.length; i++) {
            nums3[index] = nums1[i];
            index++;
        }

        for (int j = 0; j < nums2.length; j++) {
            nums3[index] = nums2[j];
            index++;
        }

        // for (int i = 0; i < nums3.length - 1; i++) {
        //     for (int j = 0; j < nums3.length - i - 1; j++) {
        //         if (nums3[j] > nums3[j + 1]) {
        //             int temp = nums3[j];
        //             nums3[j] = nums3[j + 1];
        //             nums3[j + 1] = temp;
        //         }
        //     }
        // }

        Arrays.sort(nums3);

        int len = nums3.length;
        double res = 0;
        if (len % 2 != 0) {
            res = (nums3[len / 2]);
        } else {
            res = ((nums3[len / 2] + nums3[len / 2 - 1]) / 2.0);

        }

        return res;

    }

}
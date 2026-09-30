class Solution {
    public int search(int[] nums, int target) {
        int pivot = findPivot(nums);

        int first = binarySearch(nums, target, 0, pivot - 1);

        if (first != -1) {
            return first;
        }

        return binarySearch(nums, target, pivot, nums.length - 1);
    }

    int findPivot(int[] nums) {
        int start = 0;
        int end = nums.length - 1;

        while (start < end) {
            int mid = start + (end - start) / 2;

            if (nums[mid] > nums[end]) {
                // Minimum is on the right
                start = mid + 1;
            } else {
                // Minimum is at mid or on the left
                end = mid;
            }
        }

        return start;
    }

    int binarySearch(int[] arr, int target, int start, int end) {
        while (start <= end) {
            int mid = start + (end - start) / 2;

            if (arr[mid] == target) {
                return mid;
            } else if (arr[mid] < target) {
                start = mid + 1;
            } else {
                end = mid - 1;
            }
        }

        return -1;
    }
}

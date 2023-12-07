class Solution {
    public String[] sortPeople(String[] names, int[] heights) {
        int len = names.length;
        for (int i = 0; i < len; ++i) {
            for (int j = i + 1; j < len; ++j) {
                if (heights[i] < heights[j]) {
                    swap(names, i, j);
                    swap(heights, i, j);
                }
            }
        }
        return names;
    }

    private void swap(String[] arr, int i, int j) {
        String tmp = arr[i];
        arr[i] = arr[j];
        arr[j] = tmp;
    }

    private void swap(int[] arr, int i, int j) {
        int tmp = arr[i];
        arr[i] = arr[j];
        arr[j] = tmp;
    }
}
class Solution {
    public int[][] merge(int[][] intervals) {
        quickSort(intervals, 0, intervals.length - 1);

        List<int[]> tmp = new ArrayList();

        for (int[] cur : intervals) {
            if (tmp.isEmpty()) {
                tmp.add(cur);
                continue;
            }
            int[] prev = tmp.get(tmp.size() - 1);
            if (prev[1] >= cur[0] && prev[1] < cur[1]) {
                tmp.remove(tmp.size() - 1);
                tmp.add(new int[] { prev[0], cur[1] });
            } else if (prev[1] >= cur[0] && prev[1] >= cur[1]) {
                continue;
            } else {
                tmp.add(cur);
            }
        }

        int[][] ans = new int[tmp.size()][2];
        tmp.toArray(ans);
        return ans;
    }

    private void quickSort(int[][] arr, int l, int r) {
        if (l >= r)
            return;

        int pivot = l, i = l;
        for (int j = l + 1; j <= r; j++) {
            if (arr[j][0] < arr[pivot][0]) {
                i++;
                swap(arr, i, j);
            }
        }
        swap(arr, i, pivot);

        quickSort(arr, l, i - 1);
        quickSort(arr, i + 1, r);
    }

    private void swap(int[][] arr, int a, int b) {
        int[] tmp = arr[a];
        arr[a] = arr[b];
        arr[b] = tmp;
    }
}
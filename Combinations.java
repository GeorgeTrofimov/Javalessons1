package Lesson_2;

public class Combinations {
    public List<List<Integer>> combine(int n, int k) {
        List<List<Integer>> ans = new ArrayList<>();
        solve(ans, new ArrayList<>(), n, k, 1);
        return ans;
    }

    void solve(List<List<Integer>> ans, List<Integer> tempList, int n, int k, int index) {
        if (k == 0) {
            ans.add(new ArrayList<>(tempList));
            return;
        }
        for (int i = index; i <= n - k + 1; i++) {
            tempList.add(i);
            solve(ans, tempList, n, k - 1, i + 1);
            tempList.remove(tempList.size() - 1);
        }
    }
}
import java.util.ArrayList;
import java.util.List;

public class CombinationSum {
    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        List<List<Integer>> result = new ArrayList<>();
        backtrack(candidates, target, 0, new ArrayList<>(), result);
        return result;
    }

    private void backtrack(int[] candidates, int target, int start, List<Integer> combination, List<List<Integer>> result) {
        if (target < 0) {
            return; // Base case: if target becomes negative, no solution
        }

        if (target == 0) {
            result.add(new ArrayList<>(combination)); // Add the current combination to the result
            return;
        }

        for (int i = start; i < candidates.length; i++) {
            combination.add(candidates[i]); // Choose the candidate
            backtrack(candidates, target - candidates[i], i, combination, result); // Explore with the reduced target
            combination.remove(combination.size() - 1); // Undo the choice (backtrack)
        }
    }

    public static void main(String[] args) {
        CombinationSum cs = new CombinationSum();

        // Example 1
        int[] candidates1 = {2, 3, 6, 7};
        int target1 = 7;
        System.out.println(cs.combinationSum(candidates1, target1)); // Output: [[2, 2, 3], [7]]

        // Example 2
        int[] candidates2 = {2, 3, 5};
        int target2 = 8;
        System.out.println(cs.combinationSum(candidates2, target2)); // Output: [[2, 2, 2, 2], [2, 3, 3], [3, 5]]

        // Example 3
        int[] candidates3 = {2};
        int target3 = 1;
        System.out.println(cs.combinationSum(candidates3, target3)); // Output: []
    }
}

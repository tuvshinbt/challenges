package bt.pre.algo.problems.top.easy;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class _047_PascalTriangle {
	public List<List<Integer>> generate(int numRows) {
		List<List<Integer>> result = new ArrayList<List<Integer>>();
		int[][] arr = new int[numRows][numRows];
		for (int i = 0; i < numRows; i++) {
			if (i == 0) {
				arr[i][0] = 1;
				result.add(Arrays.asList(1));
			} else {
				List<Integer> item = new ArrayList<Integer>();
				for (int j = 0; j <= i; j++) {
					if (j == 0) {
						arr[i][j] = 1;
						item.add(1);
					} else {
						arr[i][j] = arr[i - 1][j - 1] + arr[i - 1][j];
						item.add(arr[i][j]);
					}
				}
				result.add(item);
			}
		}
		System.out.println(arr);
		System.out.println(result);
		return result;
	}

	public List<List<Integer>> generateSolution(int numRows) {
		List<List<Integer>> lists = new ArrayList<>();
		List<Integer> line = new ArrayList<>();
		for (int i = 0; i < numRows; i++) {
			line.add(0, 1);
			for (int j = 1; j < i; j++) {
				line.set(j, line.get(j) + line.get(j + 1));
			}
			lists.add(new ArrayList<>(line));
		}
		return lists;
	}
}

package bt.pre.algo.problems.top.easy;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class _006_IntersectionTwoArraysII {
	public int[] intersect(int[] nums1, int[] nums2) {

		if (nums1 == null || nums2 == null)
			return new int[] {};

		List<Integer> nums1List, nums2List;

		if (nums1.length >= nums2.length) {
			nums1List = arrayToList(nums1);
			nums2List = arrayToList(nums2);
		} else {
			nums1List = arrayToList(nums2);
			nums2List = arrayToList(nums1);
		}

		Map<Integer, Integer> nums1Cnt = new HashMap<Integer, Integer>();
		Map<Integer, Integer> nums2Cnt = new HashMap<Integer, Integer>();
		for (Integer num : nums1List) {
			nums1Cnt.put(num, nums1Cnt.getOrDefault(num, 0) + 1);
		}
		for (Integer num : nums2List) {
			nums2Cnt.put(num, nums2Cnt.getOrDefault(num, 0) + 1);
		}

		List<Integer> xList = new ArrayList<>();
		for (Integer num : nums2List) {
			if (nums1Cnt.containsKey(num) && nums2Cnt.containsKey(num)) {
				xList.add(num);
				if (nums1Cnt.get(num) > 1) {
					nums1Cnt.compute(num, (k, v) -> v - 1);
				} else {
					nums1Cnt.remove(num);
				}
				if (nums2Cnt.get(num) > 1) {
					nums2Cnt.compute(num, (k, v) -> v - 1);
				} else {
					nums2Cnt.remove(num);
				}
			}
		}

		int intersection[] = new int[xList.size()];
		for (int i = 0; i < xList.size(); i++) {
			intersection[i] = xList.get(i);
		}

		return intersection;
	}

	private List<Integer> arrayToList(int[] nums) {
		return Arrays.stream(nums).boxed().collect(Collectors.toList());
	}

}

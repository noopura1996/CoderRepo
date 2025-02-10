package com.easy;
import java.util.*;
import java.util.stream.IntStream;
import java.util.stream.Stream;
public class MergeArraysDiffMethods {

	public static void main(String[] args) {
		int[] arr1 = {1,2,3,4,5};
		int[] arr2 = {6,7,8,9,10};
		//int[] mergeArray = solution1(arr1,arr2);//mergeArrayUsingArrayCopy
		//int[] mergeArray = solution2(arr1,arr2);//mergeArrayUsingThirdArray
		//int[] mergeArray = solution3(arr1,arr2);//mergeArrayUsingArrayList
		Object[] mergeArrayObject = solution4(arr1,arr2);//mergeArrayUsingFlatMap
		int[] mergeArray = solution5(arr1,arr2);//mergeArrayUsingStream concat
		for(int i=0;i<arr1.length+arr2.length;i++) {
			System.out.print(mergeArray[i]+" ");
		}
		System.out.println(Arrays.toString(mergeArrayObject));
	}

	private static Object[] solution4(int[] arr1, int[] arr2) {
		return Stream.of(arr1,arr2).flatMap(Stream::of).toArray();
	}

	private static int[] solution5(int[] arr1, int[] arr2) {
		// TODO Auto-generated method stub
		return IntStream.concat(Arrays.stream(arr1),Arrays.stream(arr2)).toArray();
		
	}

	private static int[] solution3(int[] arr1, int[] arr2) {
		List<Integer> list = new ArrayList<>();
		for(int num : arr1)
			list.add(num);
		for(int num: arr2)
			list.add(num);
		return list.stream().mapToInt(Integer::intValue).toArray();
	}

	private static int[] solution2(int[] arr1, int[] arr2) {
		int[] result = new int[arr1.length+arr2.length];
		int k=0;
		for(int i=0;i<arr1.length;i++)
			result[k++] = arr1[i];
		for(int i=0;i<arr2.length;i++)
			result[k++] = arr2[i];
		return result;
	}

	private static int[] solution1(int[] arr1, int[] arr2) {
		int[] result = new int[arr1.length+arr2.length];
		System.arraycopy(arr1, 0, result, 0, arr1.length);
		System.arraycopy(arr2, 0, result, arr1.length, arr2.length);
		return result;
	}

}

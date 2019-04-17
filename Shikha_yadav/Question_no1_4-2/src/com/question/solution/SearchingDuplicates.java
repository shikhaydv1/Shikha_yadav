package com.question.solution;

import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class SearchingDuplicates {

	@SuppressWarnings("unchecked")
	public static void main(String[] args) {

		String text = readFiles("input_sentense.txt");

		List<String> list = Arrays.asList(text.split(" "));

		Set<String> uniqueWords = new HashSet<String>(list);
		for (String word : uniqueWords) {
			System.out.println(word + ": " + Collections.frequency(list, word));
		}
	}

	private static String readFiles(String file) {

		return null;
	}

}

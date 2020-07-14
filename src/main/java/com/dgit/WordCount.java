package com.dgit;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class WordCount {
	/**
	 * read every line in the given file, split every line with an array of words in
	 * the line. remove duplicate words from the file. if the business rules change
	 * just update the wordCount method
	 */
	public static void main(String[] args) {
		int wordCount = 0;
		int size = 0;
		String line;
		BufferedReader br;

		List<String> words = new ArrayList<String>();

		try {

			File newFile = new File("string.txt");
			if (newFile.length() != 0) {
				br = new BufferedReader(new FileReader("string.txt"));

				while ((line = br.readLine()) != null) { 
					String[] lines = line.split(" ");
					for (String stringWord : lines) {
						if (words.indexOf(stringWord) < 0) {
							words.add(stringWord);
						}

					}

				}
				wordCount = wordCount + wordCount(words).get(0);
				size = size + wordCount(words).get(1); 

			} else {
				throw new Exception("Empty file uploaded please upload another file");
			}
		} catch (IOException e) {
			e.printStackTrace();
			System.out.println("File Does Not Exist Please Upload Another file");
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			System.out.println("Number of words starting with either 'm' or 'M' is: " + wordCount);
			System.out.println("Number of words with length greater than 5 are shown above with size: " + size);
		}

	}

	/**
	 * replacing all special characters from string - line 73
	 * checking for index out of bound exception - line 67, 75
	 */

	public static ArrayList<Integer> wordCount(final List<String> words) {

		ArrayList<Integer> list = new ArrayList<Integer>();

		int count = 0;
		int length = 0;

		for (String word : words) {
			if (word.length() > 0) {
				if (word.toLowerCase().charAt(0) == 'm') {
					count++;

				}
			}
			word = word.replaceAll("[^a-zA-Z]", "");

			if (word.length() > 0) {
				if (word.length() > 5) {
					length++;
				}
			}
		}

		list.add(count);
		list.add(length);

		return list;

	}

	
}

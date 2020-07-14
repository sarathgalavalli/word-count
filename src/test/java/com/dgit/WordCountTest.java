package com.dgit;

import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.List;

import org.junit.Test;

public class WordCountTest {
	
	

	@Test
	public void test() {
		List<String> words = new ArrayList<String>();
		
		words.add("hello");
		words.add("m'ello");
		words.add("me,llo0");
		words.add("hellooo.");
		words.add("hello@how");
		words.add("hellooo");
		words.add("hello.");
		
		ArrayList<Integer> list = WordCount.wordCount(words);
		
		assertEquals(3, (int)list.get(1));
		
	}
	

	@Test
	public void test2() {
		List<String> words = new ArrayList<String>();
		
		words.add("hello");
		words.add("mello");
		words.add("9mello0");
		words.add("hellooo");
		words.add("hello@how");
		words.add("hellohow");
		
		ArrayList<Integer> list = WordCount.wordCount(words);
		
		assertEquals(1, (int)list.get(0));
		
	}

}

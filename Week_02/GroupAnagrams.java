package com.guolin.study;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class GroupAnagrams {
	
	public static void main(String[] args) {
		String[] strs = { "eat","tea","tan","ate","nat","bat"};
		GroupAnagrams tmp = new GroupAnagrams();
		tmp.groupAnagrams(strs);

	}
	
	public List<List<String>> groupAnagrams(String[] strs) {

		List<List<String>> result = new ArrayList<List<String>>();
		Map<String,List<String>> map = new HashMap<String,List<String>>();
		for (String s : strs) {
			char[] tmp = s.toCharArray();
			Arrays.sort(tmp);
			String tmpKey = String.valueOf(tmp);
			List<String> tmpList = null;
			if ( map.containsKey(tmpKey)) {
				tmpList = map.get(tmpKey);
				tmpList.add(s);
			} else {
				
				tmpList = new ArrayList<String>();
				tmpList.add(s);
				map.put(tmpKey, tmpList);
				result.add(tmpList);
			}
			
		}
				
		return result;

	}

}

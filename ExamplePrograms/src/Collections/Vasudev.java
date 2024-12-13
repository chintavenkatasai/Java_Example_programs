package Collections;

import java.io.*;
import java.util.*;

public class Vasudev {
	public static void main(String[] args) throws Exception {
		FileReader fr = new FileReader("./naidu.txt");
		BufferedReader br = new BufferedReader(fr);
		HashMap<String, Integer> hm = new HashMap<>();
		String l;
		while ((l = br.readLine()) != null) {
			String w[] = l.split(" ");
			for (String words : w) {
				hm.put(words, hm.getOrDefault(words, 0) + 1);
			}
		}
		for (Map.Entry<String, Integer> na : hm.entrySet()) {
			System.out.println(na.getKey() + " " + na.getValue());
		}
	}
}

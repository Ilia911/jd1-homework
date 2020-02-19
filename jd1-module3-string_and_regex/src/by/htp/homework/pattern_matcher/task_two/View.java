package by.htp.homework.pattern_matcher.task_two;

import java.util.ArrayList;

public class View {

	public static void print(ArrayList<TagAndType> list) {
		for (TagAndType tag : list) {
			System.out.println(tag.getTag() + " - " + tag.getType());
		}
	}
}

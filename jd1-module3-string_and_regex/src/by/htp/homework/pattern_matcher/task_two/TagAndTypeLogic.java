package by.htp.homework.pattern_matcher.task_two;

import java.util.ArrayList;
import java.util.regex.Pattern;

public class TagAndTypeLogic {

	public static ArrayList<TagAndType> tagAndType(String str) {
		ArrayList<TagAndType> listTagAndType = new ArrayList<TagAndType>();
		ArrayList<String> list = new ArrayList<String>();
		String temp;

		list = divideText(str);

		Pattern patClose = Pattern.compile("</.+?>");
		Pattern patEmpty = Pattern.compile("<.+?/>");
		Pattern patOpen = Pattern.compile("<.+?>");

		for (int i = 0; i < list.size(); i++) {
			temp = list.get(i);
			TagAndType tempTagAndType = new TagAndType(temp);

			if (patClose.matcher(temp).find()) {
				tempTagAndType.setType("Closing tag");
			} else if (patEmpty.matcher(temp).find()) {
				tempTagAndType.setType("Empty tag");
			} else if (patOpen.matcher(temp).find()) {
				tempTagAndType.setType("Opening tag");
			} else {
				tempTagAndType.setType("Content tag");
			}
			listTagAndType.add(tempTagAndType);

		}

		return listTagAndType;
	}

	private static ArrayList<String> divideText(String str) {
		ArrayList<String> list = new ArrayList<String>();
		String tempStr = "";

		for (int i = 0; i < str.length(); i++) {
			if (str.charAt(i) == '<' && tempStr != "") {
				list.add(tempStr);
				tempStr = "";
			}

			tempStr = tempStr + str.charAt(i);

			if (str.charAt(i) == '>') {
				list.add(tempStr);
				tempStr = "";
			}
		}
		return list;
	}

}

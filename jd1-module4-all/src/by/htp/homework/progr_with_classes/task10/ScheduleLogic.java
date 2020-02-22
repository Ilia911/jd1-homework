package by.htp.homework.progr_with_classes.task10;

public class ScheduleLogic {

	Schedule destinitionSelection(Schedule list, String destinition) {

		Schedule selectedList = new Schedule();

		for (Airline airline : list.getList()) {
			if (airline.getDestinition().equals(destinition)) {
				selectedList.add(airline);
			}
		}
		return selectedList;
	}

	Schedule weekDaySelection(Schedule list, String weekDay) {

		Schedule selectedList = new Schedule();

		for (Airline airline : list.getList()) {
			if (airline.getWeekDay().equals(weekDay)) {
				selectedList.add(airline);
			}
		}
		return selectedList;
	}

	Schedule depatureTimeSelection(Schedule list, String time) {

		Schedule selectedList = new Schedule();

		for (Airline airline : list.getList()) {
			if (minAlphabetSequence(airline.getDepatureTime(), time)) {
				selectedList.add(airline);
			}
		}
		return selectedList;
	}

	private static boolean minAlphabetSequence(String word1, String word2) {
		String tempWord1;
		String tempWord2;
		int minNum;
		int tempNumWord1;
		int tempNumWord2;

		tempWord1 = word1.toLowerCase();
		tempWord2 = word2.toLowerCase();
		minNum = Math.min(word1.length(), word2.length());

		for (int i = 0; i < minNum; i++) {
			tempNumWord1 = tempWord1.charAt(i);
			tempNumWord2 = tempWord2.charAt(i);

			if (tempNumWord1 < tempNumWord2) {
				return false;
			} else if (tempNumWord1 > tempNumWord2) {
				return true;
			}
		}

		return false;
	}

}
// airline.getDepatureTime().equals(time)

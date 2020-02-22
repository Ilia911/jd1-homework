package by.htp.homework.progr_with_classes.task4;

import java.util.Comparator;

public class TrainSortDestinishionAndTime implements Comparator<Train> {

	@Override
	public int compare(Train tr1, Train tr2) {
		// TODO Auto-generated method stub
		int flag = tr1.getDestination().compareTo(tr2.getDestination());
		
		if (flag == 0) {
			flag = tr1.getDepartuelTime().compareTo(tr2.getDepartuelTime());
		}
		return flag;
	}
	

}

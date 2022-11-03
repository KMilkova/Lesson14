package It.com.project.logic;

import java.util.Collections;
import java.util.Comparator;
import java.util.List;

import It.com.project.bean.Depo;
import It.com.project.bean.Train;

public class TrainLogic {

	public Depo sortByDeparturePlace(Depo depo) {
		Collections.sort(depo.getTrains(), new Comparator<Train>() {
			@Override
			public int compare(Train tr1, Train tr2) {
				if (tr1.getDepaturePlace() == tr2.getDepaturePlace()) {
					return tr1.getDepatureTime().compareTo(tr2.getDepatureTime());
				} else {
					return tr1.getDepaturePlace().compareTo(tr2.getDepaturePlace());
				}
			}
		});
		return depo;
	}

	public Depo sortByTrainNumber(Depo depo) {
		Collections.sort(depo.getTrains(), new Comparator<Train>() {
			@Override
			public int compare(Train tr1, Train tr2) {
				return tr1.getNumber() - tr2.getNumber();
			}
		});
		return depo;
	}

	public Train find(int number, Depo depo) {
		for (Train tr : depo.getTrains()) {
			if (tr.getNumber() == number) {
				return tr;
			}
		}
		return null;
	}

}

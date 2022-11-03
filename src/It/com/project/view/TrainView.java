package It.com.project.view;

import It.com.project.bean.Depo;
import It.com.project.bean.Train;

public class TrainView {
	public void printTrains(Depo depo) {
		for (Train tr : depo.getTrains()) {
			System.out.println(tr.toString());
		}
		System.out.println();
	}

	public void printTrain(Train tr) {
		System.out.print(tr.toString());
	}
}

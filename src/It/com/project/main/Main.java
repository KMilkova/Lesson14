package It.com.project.main;

import java.util.Date;
import java.text.SimpleDateFormat;

import It.com.project.bean.Depo;
import It.com.project.bean.Train;
import It.com.project.logic.TrainLogic;
import It.com.project.view.TrainView;

public class Main {

	public static void main(String[] args) {
		Depo depo = new Depo();


		depo.add(new Train(15, "Minsk", new Date(2022-1900, 1, 1, 15, 56)));
		depo.add(new Train(2, "Pinsk", new Date(2022-1900,1,22,22,2)));
		depo.add(new Train(7, "Pinsk", new Date(2022-1900,1,22,22,1)));
		depo.add(new Train(4, "Riga", new Date(2022-1900,1,22,11,11)));

		TrainLogic trLogic = new TrainLogic();
		TrainView trView = new TrainView();

		trView.printTrains(depo);
		trView.printTrains(trLogic.sortByDeparturePlace(depo));
		trView.printTrains(trLogic.sortByTrainNumber(depo));

		trView.printTrain(trLogic.find(15, depo));

	}

}

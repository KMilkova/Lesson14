package It.com.project.bean;

import java.util.Date;
import java.text.SimpleDateFormat;
import java.util.Objects;

public class Train {

	private int number;
	private String depaturePlace;
	private Date depatureTime;

	public Train() {
		super();
	}

	public Train(int number, String depaturePlace, Date depatureTime) {
		this.number = number;
		this.depaturePlace = depaturePlace;
		this.depatureTime = depatureTime;
	}

	public int getNumber() {
		return number;
	}

	public void setNumber(int number) {
		this.number = number;
	}

	public String getDepaturePlace() {
		return depaturePlace;
	}

	public void setDepaturePlace(String depaturePlace) {
		this.depaturePlace = depaturePlace;
	}

	public Date getDepatureTime() {
		return depatureTime;
	}

	public void setDepatureTime(Date depatureTime) {
		this.depatureTime = depatureTime;
	}

	@Override
	public String toString() {
		SimpleDateFormat f = new SimpleDateFormat("HH:mm");
		return "Train [number=" + number + ", depaturePlace=" + depaturePlace + ", depatureTime="
				+ f.format(depatureTime) + "]";
	}

	@Override
	public int hashCode() {
		return Objects.hash(depaturePlace, depatureTime, number);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Train other = (Train) obj;
		return Objects.equals(depaturePlace, other.depaturePlace) && Objects.equals(depatureTime, other.depatureTime)
				&& number == other.number;
	}

}

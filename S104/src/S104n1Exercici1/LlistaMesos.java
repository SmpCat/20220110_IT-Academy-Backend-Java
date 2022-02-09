package S104n1Exercici1;

import java.util.ArrayList;
import java.util.List;

public class LlistaMesos {
	
	private List<String> mesos = new ArrayList<String>();
	
	public LlistaMesos() {
		
	}	
	
	public List<String> getMesos() {
		return mesos;
	}

	public void setMesos(List<String> mesos) {
		this.mesos = mesos;
	}

	public void omplirLlistaMesos() {
		String[] nameMonths= {"Gener", "Febrer", "Març", "Abril", "Maig", "Juny", "Juliol", "Agost",
                "Setembre", "Octubre", "Novembre", "Desembre"};

		for(byte x = 0; x < 12; x++) {
			mesos.add(nameMonths[x]);
		}

		System.out.println("Els mesos són: ");
		System.out.println(mesos);
	}
	
	public int numeroElements() {
		return this.mesos.size();
	}
	
	public String valorPosicio(int posicio) {
		return mesos.get(posicio-1);
	}
}

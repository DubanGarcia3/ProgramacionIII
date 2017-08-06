package model;

import java.util.Arrays;

public class ManagerExcercises {
	
	private Excercise[] excercisesList;
	
	public ManagerExcercises() {
		this.excercisesList = new Excercise[0];
	}
	
	public ManagerExcercises(Excercise[] listExcercises) {
		this.excercisesList = listExcercises;
	}

	public ManagerExcercises(ManagerExcercises newlistExcercises){
		this.excercisesList = newlistExcercises.getList();
	}

	private Excercise[] getList() {
		return excercisesList;
	}
	
	public void add(Excercise newExcercise){
		Excercise [] auxList = new Excercise[this.excercisesList.length+1];
		for (int i = 0; i < excercisesList.length; i++) {
			auxList[i] = this.excercisesList[i]; 
		}
		auxList[auxList.length -1] = newExcercise;
		this.excercisesList =auxList;
	}

	public void add2(Excercise[] listExcercise2) {
		Excercise[] auxList = excercisesList;
		for (int i = excercisesList.length; i < listExcercise2.length; i++) {
			if (!isFull(auxList)) {
				auxList[i] = excercisesList[i];				
			}
		}
	}
	
	public void editExcercise(int id, Excercise excercise){
		for (int i = 0; i < excercisesList.length; i++) {
			if (excercisesList[i].getId() == id) {
				excercisesList[i].setName(excercise.getName());
				excercisesList[i].setDescription(excercise.getDescription());
				excercisesList[i].setDifficulty(excercise.getDifficulty());
				excercisesList[i].setDuration(excercise.getDuration());
				excercisesList[i].setBodyPart(excercise.getBodyPart());
			}
		}
	}
	
	public void addExcerciseClass(ManagerExcercises excercises){
		Excercise[] excerciseForAddAux = new Excercise[excercises.getList().length + excercisesList.length];
		System.out.println("tamaño" + excerciseForAddAux.length);
		int auxPos = 0;
			for (int j = 0; j < excercisesList.length; j++) {
				if (excerciseForAddAux[auxPos] == null && excercisesList[j] != null) {
					excerciseForAddAux[auxPos] = excercisesList[j];
					auxPos++;
				}
			}
		for (int i = 0; i < excercises.getList().length; i++) {
			excerciseForAddAux[auxPos] = excercises.getList()[i];
			auxPos++;
		}
		this.excercisesList = excerciseForAddAux;
		System.out.println("esta es la lista final");
		System.out.println(Arrays.toString(this.excercisesList));
	}
	
	public boolean isFull(Excercise [] auxlist){
		for(int i=0; i < auxlist.length; i++){
			if(auxlist[i] == null)
				return false;	
		}
		return true;
	}	
	
	public void deleteExcercise(int id){
		for (int i = 0; i < excercisesList.length; i++) {
			if (excercisesList[i].getId() == id) {
				excercisesList[i] = null;
			}
		}
	}
	
	public Excercise searchExcercise(String name) {
		for (int i = 0; i < excercisesList.length; i++) {
			if (excercisesList[i] != null) {
				if (excercisesList[i].getName().equalsIgnoreCase(name)) {
					return excercisesList[i];
				}
			}
		}
		return null;
	}
	
	public Excercise findExcerciseId(int id){
		for (int i = 0; i < excercisesList.length; i++) {
			if (excercisesList[i] != null) {
				if (excercisesList[i].getId() == id) {
					return excercisesList[i];
				}
			}
		}
		return null;
	}
	
	public void print(Excercise[]list){
		for(int i = 0; i < list.length; i++){
			if(	list[i] != null){
				System.out.println(list[i].toString());
			}
		}
	}
}
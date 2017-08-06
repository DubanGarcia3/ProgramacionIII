package model;

public class Excercise {
	
	private static int ID_STATIC = 0;
	private int id;
	private String name;
	private String description;
	private int duration;
	private Difficulty difficulty;
	private BodyPart[] bodyPart;
	
	public Excercise(int id, String name, String description, int duration, Difficulty difficulty, BodyPart[] bodyPart) {
		this.id = id;
		this.name = name;
		this.description = description;
		this.duration = duration;
		this.difficulty = difficulty;
		this.bodyPart = bodyPart;
	}
	
	public Excercise(String name, String description, int duration, Difficulty difficulty, BodyPart[] bodyPart) {
		this.id = ID_STATIC++;
		this.name = name;
		this.description = description;
		this.duration = duration;
		this.difficulty = difficulty;
		this.bodyPart = bodyPart;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public int getDuration() {
		return duration;
	}

	public void setDuration(int duration) {
		this.duration = duration;
	}

	public Difficulty getDifficulty() {
		return difficulty;
	}

	public void setDifficulty(Difficulty difficulty) {
		this.difficulty = difficulty;
	}

	public BodyPart[] getBodyPart() {
		return bodyPart;
	}

	public void setBodyPart(BodyPart[] bodyPart) {
		this.bodyPart = bodyPart;
	}
}
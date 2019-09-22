package dci.ufro.cl.fifa.model;

public class Player {
	private String name;
	private String photo;
	private String nationality;
	private int rating;
	private int age;
	private String club;
	private int potential;



	/**
	 * @param name of player
	 * @param photo of player
	 * @param nationality of player
	 * @param rating of player
	 * @param age of player
	 * @param club of player
	 * @param potential player
	 */
	public Player(String name, String photo, String nationality, int rating, int age,String club, int potential) {
		this.name = name;
		this.photo = photo;
		this.nationality = nationality;
		this.rating = rating;
		this.age = age;
		this.club = club;
		this.potential = potential;

	}

	@Override
	public String toString() {
		return "Nombre: " + this.name + "\n"
				+ "Fotografía: " + this.photo + "\n"
		        + "Nacionalidad: " + this.nationality + "\n"
		        + "Rating: " + this.rating + "\n"
		        + "Edad: " + this.age + "\n"
				+ "Club: " + this.club + "\n"
				+ "Potencial: " + this.potential + "\n";

	}


	public int getRating() {
		return rating;
	}
	public String getPhoto() {
		return photo;
	}
	public String getName() {
		return name;
	}
	public String getNationality() {
		return nationality;
	}
	public int getAge() { return age; }
	public String getClub() { return club; }
	public int getPotential() { return potential; }



	public void setPhoto(String photo) {
		this.photo = photo;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setNationality(String nationality) {
		this.nationality = nationality;
	}

	public void setRating(int rating) { this.rating = rating;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public void setClub(String club) {
		this.club = club;
	}

	public void setPotential(int potential) {
		this.potential = potential;
	}
}
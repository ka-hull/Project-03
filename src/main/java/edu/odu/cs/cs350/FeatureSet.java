package edu.odu.cs.cs350;


public class FeatureSet {
	
	private String[] prefixes = { "Mr", "Ms", "Mrs", 
			"Miss", "Dr", "Chief", "Brother", 
			"Sister", "Father", "Professor", "General", 
			"Rabbi", "Reverend"};
	
	/**
	 * @return the prefixes
	 */
	public String[] getPrefixes() {
		return prefixes;
	}

	/**
	 * @param prefixes the prefixes to set
	 */
	public void setPrefixes(String[] prefixes) {
		this.prefixes = prefixes;
	}

	
	private String[] iconic = { "Bridge", "University", 
			"Statue", "Church", "Road"};
	
	/**
	 * @return the iconic
	 */
	public String[] getIconic() {
		return iconic;
	}

	/**
	 * @param iconic the iconic to set
	 */
	public void setIconic(String[] iconic) {
		this.iconic = iconic;
	}

	
	void merge(){
		
		
	}

}

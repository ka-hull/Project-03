package edu.odu.cs.cs350;

public class FeatureSet {

	/**
	 * Create arrays to hold the features
	 */

	private static final String[] prefixes = { "Mr", "Ms", "Mrs",
			"Miss", "Dr", "Chief", "Brother",
			"Sister", "Father", "Professor", "General",
			"Rabbi", "Reverend" };

	private static final String[] iconic = { "Bridge", "University",
			"Statue", "Church", "Road" };

	/**
	 * Boolean to check if features are found in token
	 * Eclipse recommended I format it this way
	 * if there is an issue with it I will fix it
	 */

	boolean theToken;

	public FeatureSet(String token) {
		this.theToken = token != null;
	}

	void isPrefix() {
		for (String prefix : prefixes) {
			if (this.theToken = prefix != null)
				return;
		}
	}

	void isIconic() {
		for (String icon : iconic) {
			if (this.theToken = icon != null)
				return;
		}
	}

	/**
	 * This is all old code commented out as reference
	 * 
	 * @return the prefixes
	 *
	 *         public String[] getPrefixes() {
	 *         return prefixes;
	 *         }
	 * 
	 *         /**
	 * @param prefixes the prefixes to set
	 *
	 *                 public void setPrefixes(String[] prefixes) {
	 *                 this.prefixes = prefixes;
	 *                 }
	 * 
	 *                 /**
	 * @return the iconic
	 *
	 *         public String[] getIconic() {
	 *         return iconic;
	 *         }
	 * 
	 *         /**
	 * @param iconic the iconic to set
	 *
	 *               public void setIconic(String[] iconic) {
	 *               this.iconic = iconic;
	 *               }
	 * 
	 * 
	 *               /*void merge(){
	 * 
	 * 
	 *               }
	 */

}

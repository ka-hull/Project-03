package edu.odu.cs.cs350;

public class FeatureSet {

	/**
	 * Create arrays to hold the features for prefixes
	 */

	private static final String[] prefixes = { "Mr", "Ms", "Mrs",
			"Miss", "Dr", "Chief", "Brother",
			"Sister", "Father", "Professor", "General",
			"Rabbi", "Reverend" };

	/**
	 * Create arrays to hold the features for icons
	 */

	private static final String[] iconic = { "Bridge", "University",
			"Statue", "Church", "Road" };

	/**
	 * Create arrays to hold the features for last names
	 */

	private static final String[] last = { "Smith", "Johnson",
			"Williams", "Brown", "Potter" };

	/**
	 * Create arrays to hold the features for first names
	 */

	private static final String[] first = { "John", "Stanley",
			"Marcus", "James", "Harry" };

	/**
	 * String to hold token
	 */

	String theToken;

	FeatureSet(String token) {
		this.theToken = token;
	}

	/**
	 * Boolean to check if its true that the token is a prefix
	 * 
	 * @param theToken is a string containing a token
	 * @return true if token is prefix, false otherwise
	 */

	boolean isPrefix(String theToken) {
		for (String prefix : prefixes) {
			if (theToken == prefix)
				return true;
		}
		return false;
	}

	/**
	 * Boolean to check if its true that the token is an icon
	 * 
	 * @param theToken is a string containing a token
	 * @return true if the token is iconic, false otherwise
	 */

	boolean isIconic(String theToken) {
		for (String icon : iconic) {
			if (theToken == icon)
				return true;
		}
		return false;
	}

	/**
	 * Boolean to check if its true that the token is a last name
	 * 
	 * @param theToken is a string containing a token
	 * @return true if the token is a last name, false otherwise
	 */

	boolean isLast(String theToken) {
		for (String lastN : last) {
			if (this.theToken == lastN)
				return true;
		}
		return false;
	}

	/**
	 * Boolean to check if its true that the token is a first name
	 * 
	 * @param theToken is a string containing a token
	 * @return true if the token is a first name, false otherwise
	 */

	boolean isFirst(String theToken) {
		for (String firstN : first) {
			if (theToken == firstN)
				return true;
		}
		return false;
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

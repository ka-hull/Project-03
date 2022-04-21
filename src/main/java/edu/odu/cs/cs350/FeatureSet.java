package edu.odu.cs.cs350;

public class FeatureSet {
	
	/**
	 * Create arrays to hold the features for prefixes
	 */
	
	private static final String[] prefixes = { "Mr", "Ms", "Mrs", 
			"Miss", "Dr", "Chief", "Brother", 
			"Sister", "Father", "Professor", "General", 
			"Rabbi", "Reverend"};
	
	/**
	 * Create arrays to hold the features for icons
	 */
	
	private static final String[] iconic = { "Bridge", "University", 
			"Statue", "Church", "Road"};
	
	/**
	 * Create arrays to hold the features for last names
	 */
	
	private static final String[] last = {"Smith", "Johnson",
			"Williams", "Brown", "Potter"};
	
	/**
	 * Create arrays to hold the features for first names
	 */
	
	private static final String[] first = {"John", "Stanley",
			"Marcus", "James", "Harry"};
	
	/**
	 * String to hold token 
	 */
	
	String theToken;
	
	FeatureSet(String token)
		{
			this.theToken = token;
		}
	
	/**
	 * Boolean to check if its true that the token is a prefix
	 */
	
	boolean isPrefix()
		{
			for (String prefix : prefixes)
				{
					if(this.theToken == prefix) 
						return true;
				}
						return false;
		}
	
	/**
	 * Boolean to check if its true that the token is an icon
	 */
	
	boolean isIconic()
		{
			for (String icon : iconic)
				{
					if(this.theToken == icon) 
						return true;
				}
						return false;
		}
	
	/**
	 * Boolean to check if its true that the token is a last name
	 */
	
	boolean isLast()
		{
			for (String lastN : last)
				{
					if(this.theToken == lastN) 
						return true;
				}
						return false;
		}
	
	/**
	 * Boolean to check if its true that the token is a first name
	 */
	
	boolean isFirst()
		{
			for (String firstN : first)
				{
					if(this.theToken == firstN) 
						return true;
				}
						return false;
		}
	
	/**
	 * This is all old code commented out as reference
	 * @return the prefixes
	 *
	public String[] getPrefixes() {
		return prefixes;
	}

	/**
	 * @param prefixes the prefixes to set
	 *
	public void setPrefixes(String[] prefixes) {
		this.prefixes = prefixes;
	}
	
	/**
	 * @return the iconic
	 *
	public String[] getIconic() {
		return iconic;
	}

	/**
	 * @param iconic the iconic to set
	 *
	public void setIconic(String[] iconic) {
		this.iconic = iconic;
	}

	
	/*void merge(){
		
		
	}*/

}

package edu.odu.cs.cs350;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

public class TestFeatureSet {

	@Test
	public void test() {

		/**
		 * Test to see if a number is found in the token
		 */

		FeatureSet featureSet = new FeatureSet("4");
		assertFalse(featureSet.isIconic("4"));
		assertFalse(featureSet.isPrefix("4"));
		assertFalse(featureSet.isLast("4"));
		assertFalse(featureSet.isFirst("4"));

		/**
		 * Test to see if Mr is found in Prefix
		 * Not the others
		 */

		FeatureSet featureSet1 = new FeatureSet("Mr");
		assertFalse(featureSet1.isIconic("Mr"));
		assertTrue(featureSet1.isPrefix("Mr"));
		assertFalse(featureSet1.isLast("Mr"));
		assertFalse(featureSet1.isFirst("Mr"));

		/**
		 * Test to see if Bridge is found in Iconic
		 * Not the others
		 */

		FeatureSet featureSet2 = new FeatureSet("Bridge");
		assertTrue(featureSet2.isIconic("Bridge"));
		assertFalse(featureSet2.isPrefix("Bridge"));
		assertFalse(featureSet2.isLast("Bridge"));
		assertFalse(featureSet2.isFirst("Bridge"));

		/**
		 * Test to see if Potter is found in Last
		 * Not the others
		 */

		FeatureSet featureSet3 = new FeatureSet("Potter");
		assertFalse(featureSet3.isIconic("Potter"));
		assertFalse(featureSet3.isPrefix("Potter"));
		assertTrue(featureSet3.isLast("Potter"));
		assertFalse(featureSet3.isFirst("Potter"));

		/**
		 * Test to see if Harry is found in First
		 * Not the others
		 */

		FeatureSet featureSet4 = new FeatureSet("Harry");
		assertFalse(featureSet4.isIconic("Harry"));
		assertFalse(featureSet4.isPrefix("Harry"));
		assertFalse(featureSet4.isLast("Harry"));
		assertTrue(featureSet4.isFirst("Harry"));

		/*
		 * old bad test for reference
		 * FeatureSet featureSet = new FeatureSet(toString());
		 * 
		 * assertArrayEquals(Arrays.asList("Mr", "Miss"), featureSet.isPrefix());
		 * assertEquals(Arrays.asList("Bridge", "University"), featureSet);
		 */

	}
}

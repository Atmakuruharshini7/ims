package mapdemo;

import java.util.Map;
import java.util.TreeMap;

public class RemoveTreeMapDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		TreeMap<String,String> countryISOCodeMapping=new TreeMap<>();

		countryISOCodeMapping.put("India", "IN");
		countryISOCodeMapping.put("United States of America", "US");
		countryISOCodeMapping.put("China", "CN");
		countryISOCodeMapping.put("United Kingdom", "UK");
		countryISOCodeMapping.put("Russia", "RU");
		countryISOCodeMapping.put("Japan", "JP");

		System.out.println("CountryISOCodeMapping : " + countryISOCodeMapping);

		// Remove the mapping for a given key
		String countryName = "Japan";
		String isoCode = countryISOCodeMapping.remove(countryName);
		if(isoCode != null) {
			System.out.println("Removed (" + countryName + " => " + isoCode + ") from the TreeMap. New TreeMap " + countryISOCodeMapping);
		} else {
			System.out.println(countryName + " does not exist, or it is mapped to a null value");
		}

		// Remove the mapping for the given key only if it is mapped to the given value
		countryName = "India";
		boolean isRemoved = countryISOCodeMapping.remove(countryName, "IA");
		System.out.println("Was the mapping removed for " + countryName + "? : " + isRemoved);

		// Remove the first entry from the TreeMap
		Map.Entry<String, String> firstEntry = countryISOCodeMapping.pollFirstEntry();
		System.out.println("Removed firstEntry : " + firstEntry + ", New TreeMap : " + countryISOCodeMapping);

		// Remove the last entry from the TreeMap
		Map.Entry<String, String> lastEntry = countryISOCodeMapping.pollLastEntry();
		System.out.println("Removed lastEntry : " + lastEntry + ", New TreeMap : " + countryISOCodeMapping);
		TreeMap<String, String> countryISOCodeMapping1 = new TreeMap<>();
		countryISOCodeMapping1.pollLastEntry();
		countryISOCodeMapping1.put("India", "IN");
		countryISOCodeMapping1.put("United States of America", "US");
		countryISOCodeMapping1.put("China", "CN");
		countryISOCodeMapping1.put("United Kingdom", "UK");
		countryISOCodeMapping1.put("Russia", "RU");
		countryISOCodeMapping1.put("Japan", "JP");

		System.out.println("CountryISOCodeMapping : " + countryISOCodeMapping1);

		// Remove the mapping for a given key
		String countryName1 = "Japan";
		String isoCode1 = countryISOCodeMapping1.remove(countryName1);
		if(isoCode1 != null) {
			System.out.println("Removed (" + countryName1 + " => " + isoCode1 + ") from the TreeMap. New TreeMap " + countryISOCodeMapping1);
		} else {
			System.out.println(countryName1 + " does not exist, or it is mapped to a null value");
		}

		// Remove the mapping for the given key only if it is mapped to the given value
		countryName1 = "India";
		boolean isRemoved1 = countryISOCodeMapping1.remove(countryName1, "IA");
		System.out.println("Was the mapping removed for " + countryName1 + "? : " + isRemoved1);

		// Remove the first entry from the TreeMap
		Map.Entry<String, String> firstEntry1 = countryISOCodeMapping1.pollFirstEntry();
		System.out.println("Removed firstEntry : " + firstEntry1 + ", New TreeMap : " + countryISOCodeMapping1);

		// Remove the last entry from the TreeMap
		Map.Entry<String, String> lastEntry1 = countryISOCodeMapping1.pollLastEntry();
		System.out.println("Removed lastEntry : " + lastEntry1 + ", New TreeMap : " + countryISOCodeMapping1);
		TreeMap<String, String> countryISOCodeMapping11 = new TreeMap<>();

		countryISOCodeMapping11.put("India", "IN");
		countryISOCodeMapping11.put("United States of America", "US");
		countryISOCodeMapping11.put("China", "CN");
		countryISOCodeMapping11.put("United Kingdom", "UK");
		countryISOCodeMapping11.put("Russia", "RU");
		countryISOCodeMapping11.put("Japan", "JP");

		System.out.println("CountryISOCodeMapping : " + countryISOCodeMapping11);

		// Remove the mapping for a given key
		String countryName1 = "Japan";
		String isoCode1 = countryISOCodeMapping11.remove(countryName1);
		if(isoCode1 != null) {
			System.out.println("Removed (" + countryName1 + " => " + isoCode1 + ") from the TreeMap. New TreeMap " + countryISOCodeMapping11);
		} else {
			System.out.println(countryName1 + " does not exist, or it is mapped to a null value");
		}

		// Remove the mapping for the given key only if it is mapped to the given value
		countryName1 = "India";
		boolean isRemoved11 = countryISOCodeMapping11.remove(countryName1, "IA");
		System.out.println("Was the mapping removed for " + countryName1 + "? : " + isRemoved11);

		// Remove the first entry from the TreeMap
		Map.Entry<String, String> firstEntry1 = countryISOCodeMapping11.pollFirstEntry();
		System.out.println("Removed firstEntry : " + firstEntry1 + ", New TreeMap : " + countryISOCodeMapping11);

		// Remove the last entry from the TreeMap
		Map.Entry<String, String> lastEntry1 =  countryISOCodeMapping.pollLastEntry();
				System.out.println("Removed lastEntry : " + lastEntry1 + ", New TreeMap : " + countryISOCodeMapping11);



	}

}

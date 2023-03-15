package edu.craptocraft.romans_go_home;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class RegexRomanNumber {
    
    private final Map<String, String> regexCollection = new HashMap<String, String>();
    
    public RegexRomanNumber(){
        this.intRegexCollection();
    }

    private void intRegexCollection() {
        this.addRegex("grupoSumatorio", "(?<!C)[DM]|(?<!X)[LC](?![DM])|(?<!I)[VX](?![LC])|I(?![VX])");
		this.addRegex("grupoSustractivo", "(C[DM])|(X[LC])|(I[VX])");
    }

    private void addRegex(String key, String value) {
        this.regexCollection.putIfAbsent(key, value);
    }

    public String getRegex(String key) {
		return this.regexCollection.get(key);
	}

	public List<String> getAllRegex() {
		return this.regexCollection.values().stream().collect(Collectors.toList());
	}
}

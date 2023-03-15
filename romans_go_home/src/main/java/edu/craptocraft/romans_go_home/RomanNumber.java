package edu.craptocraft.romans_go_home;

import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RomanNumber {

    private final String numRomano;
    private short numDecimal = 0;

    private RegexRomanNumber regexCollection = null;

    public RomanNumber(String numRomano) {
        this.numRomano = numRomano;
        this.numDecimal = (short) 0;
        regexCollection = new RegexRomanNumber();
    }

    @Override
    public String toString() {
        return this.numRomano;
    }

    private String getNumRomano() {
        return this.numRomano;
    }

    private short getNumDecimal() {
        return this.numDecimal;
    }

    public RegexRomanNumber getRegexCollection() {
		return this.regexCollection;
	}    

    public short toDecimal() {
		for(String regex : regexCollection()) {
			Matcher matcher = createMatcher(regex);
			groupSumatoryToDecimal(matcher);
		}		
		return getNumDecimal();
	}

    private void groupSumatoryToDecimal(Matcher matcher) {
        while (matcher.find()) {
            this.numDecimal += decimalValue(matcher.group());
        }
    }

    private Matcher createMatcher(String regex) {
        Pattern pattern = Pattern.compile(regex);
		Matcher matcher = pattern.matcher(getNumRomano());
		return matcher;
    }

    private List<String> regexCollection() {
		return getRegexCollection().getAllRegex();
	}

    public short decimalValue(String numeroRomano) {
		RomansSymbols simbolo = Enum.valueOf(RomansSymbols.class, String.valueOf(numeroRomano));
		return (short) simbolo.getValorRomano();
	}

}

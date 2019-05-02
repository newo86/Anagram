package gcp;

import com.googlecode.objectify.annotation.Entity;
import com.googlecode.objectify.annotation.Id;
@Entity // part 2 adding Objectify
public class Dictionary {

	@Id
	private String dictionaryWord;

	public String getDictionaryWord() {
		return dictionaryWord;
	}

	public void setDictionaryWord(String dictionaryWord) {
		this.dictionaryWord = dictionaryWord;
	}
	
}

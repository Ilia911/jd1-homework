package by.htp.homework.agregation.task1;

import java.util.ArrayList;
import java.util.List;

public class Sentence {

	private List<Word> sentence;

	public Sentence() {
		this.sentence = new ArrayList<Word>();
	}

	public Sentence(Word word) {
		this.sentence = new ArrayList<Word>();
		this.sentence.add(word);
	}

	public void add(Word word) {
		this.sentence.add(word);
	}

	public void remove(Word word) {
		this.sentence.remove(word);
	}

	public void setSentence(List<Word> sentence) {
		this.sentence = sentence;
	}

	public Sentence getSentence() {
		return this.getSentence();
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((sentence == null) ? 0 : sentence.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Sentence other = (Sentence) obj;
		if (sentence == null) {
			if (other.sentence != null)
				return false;
		} else if (!sentence.equals(other.sentence))
			return false;
		return true;
	}

	@Override
	public String toString() {
		String sentence = "";
		for (Word word : this.sentence) {
			sentence = sentence + word;
		}
		sentence = sentence + ".";
		return sentence;
	}

}

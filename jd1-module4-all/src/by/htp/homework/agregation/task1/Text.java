package by.htp.homework.agregation.task1;

import java.util.ArrayList;
import java.util.List;

public class Text {

	private String title;
	private List<Sentence> text;

	public Text() {
		this.title = "Unknown";
		this.text = new ArrayList<Sentence>();
	};

	public Text(String title) {
		this.title = title;
		this.text = new ArrayList<Sentence>();
	}

	public Text(Sentence sentence) {
		this.title = "Unknown";
		this.text = new ArrayList<Sentence>();
		text.add(sentence);
	}

	public Text(String title, Sentence sentence) {
		this.title = title;
		this.text = new ArrayList<Sentence>();
		this.text.add(sentence);
	}

	public void append(Sentence sentence) {
		this.text.add(sentence);
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public List<Sentence> getText() {
		return this.text;
	}

	public void setText(List<Sentence> text) {
		this.text = text;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((text == null) ? 0 : text.hashCode());
		result = prime * result + ((title == null) ? 0 : title.hashCode());
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
		Text other = (Text) obj;
		if (text == null) {
			if (other.text != null)
				return false;
		} else if (!text.equals(other.text))
			return false;
		if (title == null) {
			if (other.title != null)
				return false;
		} else if (!title.equals(other.title))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "Text [title=" + title + ", text=" + text + "]";
	}

}

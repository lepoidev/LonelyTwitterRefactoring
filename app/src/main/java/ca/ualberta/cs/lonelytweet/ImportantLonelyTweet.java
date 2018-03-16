package ca.ualberta.cs.lonelytweet;

import java.util.Date;

public class ImportantLonelyTweet extends LonelyTweet {

	public ImportantLonelyTweet() {
	}

	public ImportantLonelyTweet(String text) {
		this.tweetDate = new Date();
		this.text = text;
	}

	@Override
	public boolean isValid() {
		if (text.trim().length() == 0
				|| text.trim().length() > 20) {
			return false;
		}

		return true;
	}

	@Override
	public String toString() {
		return getTweetDate() + " | " + getText() ;
	}

	public String getText() {
        return text.toUpperCase();
    }
}
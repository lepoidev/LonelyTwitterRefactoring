package ca.ualberta.cs.lonelytweet;

import java.util.Date;

public class NormalLonelyTweet extends LonelyTweet {

	public NormalLonelyTweet() {
	}

	public NormalLonelyTweet(String text) {
		this.tweetDate = new Date();
		this.text = text;
	}

	@Override
	public boolean isValid() {
		if (text.trim().length() == 0
				|| text.trim().length() > 10) {
			return false;
		}

		return true;
	}

	@Override
	public String toString() {
		return getTweetDate() + " | " + getText() ;
	}

	public String getText() {
        return text;
    }
}
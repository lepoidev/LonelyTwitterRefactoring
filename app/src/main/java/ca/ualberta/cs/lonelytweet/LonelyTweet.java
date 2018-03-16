package ca.ualberta.cs.lonelytweet;

import java.io.IOException;
import java.io.Serializable;
import java.util.Date;

/**
 * Created by lepoidev on 3/15/18.
 */

public abstract class LonelyTweet implements Serializable {
    private static final long serialVersionUID = 1L;
    protected Date tweetDate;
    protected String text;

    public Date getTweetDate() {
        return tweetDate;
    }

    public void setTweetDate(Date tweetDate) {
        this.tweetDate = tweetDate;
    }

    public void setText(String text) {
        this.text = text;
    }

    private void writeObject(java.io.ObjectOutputStream out) throws IOException {
        out.writeObject(tweetDate);
        out.writeObject(text);
    }

    private void readObject(java.io.ObjectInputStream in) throws IOException,
            ClassNotFoundException {
        tweetDate = (Date) in.readObject();
        text = (String) in.readObject();
    }

    public abstract boolean isValid();
}

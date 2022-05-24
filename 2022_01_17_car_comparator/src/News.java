public class News implements Comparable<News> {

    int priority; // from 1 to 10
    String text;

    public News(int priority, String text) {
        this.priority = priority;
        this.text = text;
    }

    //TODO the news which is of a higher priority must go first, if the priorities are equal, the shorter news
    // must go first.
    @Override
    public int compareTo(News o) {
        if (o.priority > priority)
            return 1;
        else if (o.priority < priority)
            return -1;
        else return text.compareTo(o.text);
    }

    @Override
    public String toString() {
        return "priority = " + priority + ", text = " + text;
    }
}
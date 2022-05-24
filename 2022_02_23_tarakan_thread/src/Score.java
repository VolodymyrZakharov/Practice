public class Score {

    String name;
    Long time;

    public Score(String name, Long time) {
        this.name = name;
        this.time = time;
    }

    @Override
    public String toString() {
        return name + " passed distance fore " + time + " miliseconds\n";
    }
}

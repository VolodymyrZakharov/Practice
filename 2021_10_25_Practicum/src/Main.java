public class Main {

    public static void main(String[] args) {
	// write your code here
        boolean vasyaListenMusic = true;
        int hour = 12;
        isVasyaInTrouble(vasyaListenMusic, hour);
        System.out.println(isVasyaInTrouble(vasyaListenMusic, hour));
    }

    static boolean isVasyaInTrouble(boolean music, int hour) {
        return  music == true & (hour < 7 || hour > 20);
    }
}

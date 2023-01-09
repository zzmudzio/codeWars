package pl.zzmudzio.solutions.the_office;

public class TheOffice {
    public static Object meeting(char[] x) {
        int index = 0;
        for(char sign: x) {
            if(sign == 'O') {
                return index;
            }
            index++;
        }
        return "None available!";
    }
}
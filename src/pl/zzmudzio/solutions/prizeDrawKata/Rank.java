package pl.zzmudzio.solutions.prizeDrawKata;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Rank {
        public static String nthRank(String st, Integer[] we, int n) {
            if(st.equals("")) return "No participants";
            else if(we.length < n) return "Not enough participants";
            String[] firstNames = st.split(",");
            List<String[]> usersRanks = new ArrayList<>();
            for(int i=0; i<firstNames.length; i++) {
                usersRanks.add(new String[]{firstNames[i], getTotalRank(firstNames[i], we[i])});
            }
            Collections.sort(usersRanks, (String[] o1, String[] o2) ->
            {
                if(Integer.parseInt(o1[1]) == Integer.parseInt(o2[1])) {
                    return o1[0].compareTo(o2[0]);
                }
                else return Integer.parseInt(o2[1]) - Integer.parseInt(o1[1]);
            });
            return usersRanks.get(n-1)[0];
        }
        public static String getTotalRank(String firstName, int wag) {
            int sum = 0;
            firstName = firstName.toLowerCase();
            for(int i=0; i<firstName.length(); i++) {
                sum = sum + 26 - (122 - (int)firstName.charAt(i));
            }
            return String.valueOf((sum + firstName.length()) * wag);
        }
}

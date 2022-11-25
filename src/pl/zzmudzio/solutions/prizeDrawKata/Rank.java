package pl.zzmudzio.solutions.prizeDrawKata;

import pl.zzmudzio.solutions.Person;

import java.util.ArrayList;
import java.util.Collections;

public class Rank {
    class Rank {
        public static String nthRank(String st, Integer[] we, int n) {
            if(st.equals("")) return "No participants";
            else if(we.length < n) return "Not enough participants";
            String[] firstNames = st.split(",");
            List<Person> personsList = new ArrayList<>();
            for(int i=0; i< firstNames.length; i++) {
                personsList.add(new Person(firstNames[i], we[i]));
            }
            Collections.sort(personsList);
            Collections.reverse(personsList);
            personsList.stream().forEach((Person obj) -> System.out.println(obj));
            return "";
        }

    }
}

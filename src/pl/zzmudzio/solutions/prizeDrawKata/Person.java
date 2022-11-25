package pl.zzmudzio.solutions.prizeDrawKata;

public class Person {
    class Person implements Comparable<Person>{
        private final String firstName;
        private final int totalRank;

        public Person(String firstName, int we) {
            this.firstName = firstName;
            this.totalRank = getTotalRank(this.firstName, we);
        }
        public static int getTotalRank(String firstName, int wag) {
            int sum = 0;
            firstName = firstName.toLowerCase();
            for(int i=0; i<firstName.length(); i++) {
                sum = sum + 26 - (122 - (int)firstName.charAt(i));
            }
            return (sum + firstName.length()) * wag;
        }

        public String getFirstName() {
            return this.firstName;
        }

        public int getTotalRank() {
            return this.totalRank;
        }

        @Override
        public int compareTo(Person person) {
            if(this.getTotalRank() - person.getTotalRank() == 0) {
                System.out.println("są takie");
                return this.getFirstName().compareTo(person.getFirstName());
            }
            else return this.getTotalRank() - person.getTotalRank();
        }
        @Override
        public String toString() {
            return this.firstName + "," + this.totalRank;
        }
    }
}

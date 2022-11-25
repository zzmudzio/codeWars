package pl.zzmudzio.solutions;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Rank.nthRank("Addison,Jayden,Sofia,Michael,Andrew,Lily,YLil", new Integer[]{4, 2, 1, 4, 3, 1, 1}, 1);
    }
}


// {Andrew=213, Addison=292, Sofia=55, Michael=232, Jayden=130, Lily=62, YLil=62}
// [55, 62, 62, 130, 213, 232, 292]
// [Addison, Andrew, Jayden, Lily, Michael, Sofia, YLil]


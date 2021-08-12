package application;

/*
*y father’s family name being Pirrip, and my Christian name Philip, my infant tongue could make of both names nothing longer or more explicit than Pip. So, I called myself Pip, and came to be called Pip.

I give Pirrip as my father’s family name, on the authority of his tombstone and my sister,—Mrs. Joe Gargery, who married the blacksmith. As I never saw my father or my mother, and never saw any likeness of either of them (for their days were long before the days of photographs), my first fancies regarding what they were like were unreasonably derived from their tombstones. The shape of the letters on my father’s, gave me an odd idea that he was a square, stout, dark man, with curly black hair. From the character and turn of the inscription, “Also Georgiana Wife of the Above,” I drew a childish conclusion that my mother was freckled and sickly. To five little stone lozenges, each about a foot and a half long, which were arranged in a neat row beside their grave, and were sacred to the memory of five little brothers of mine,—who gave up trying to get a living, exceedingly early in that universal struggle,—I am indebted for a belief I religiously entertained that they had all been born on their backs with their hands in their trousers-pockets, and had never taken them out in this state of existence.
 */
public class RandomWord {
    private String[] words = {
            "father", "family", "name", "being", "Pirrip", "and", "Christian",
            "Philip,", "infant", "tongue", "nothing", "myself",
            "give", "Pirrip", "authority", "tombstone", "sister", "married",
            "blacksmith", "never", "mother", "never", "regarding", "unreasonably",
            "derived", "tombstones", "letters", "square", "stout", "character",
            "inscription", "conclusion", "freckled", "lozenges", "arranged",
            "sacred", "memory", "brothers", "exceedingly", "universal", "struggle",
            "indebted", "belief", "religiously", "entertained", "trousers",
            "pockets", "existence"};

    private String chosenWord;
    private static char[] characters;

    public RandomWord() {
        chosenWord = words[generateRandomNumber()];
        characters = chosenWord.toCharArray();
    }

    public int generateRandomNumber() {
        int min = 0;
        int max = words.length;
        int random_int = (int) Math.floor(Math.random() * (max - min + 1) + min);
        return random_int;
    }

//    Ieskau 'a' raides su ternary operator

    public String toString() {
        StringBuilder sb1 = new StringBuilder();
        char a = 'a';
        char empty = '_';
        char charX;

        for (char c : characters) {

            charX = c == a ? a : empty;
            {
                sb1.append(charX).toString();
            }
        }
        return sb1 + "\n" + chosenWord;

        //#region kiti variantai ieskant 'a' raides

        // Mano variantas

//        char x = 'a';
//
//        for (char c: characters) {
//            if(c == x) {
//                sb1.append(c);
//            } else {
//                sb1.append("_");
//            }
//            sb1.append(' ');
//        }
//         return sb1.toString() + "\n" + chosenWord;


        // Kursu variantas bet blogai veikia

//        for (char c: characters) {
//            if (c == '\u0101') {
//                sb1.append('_');
//            } else {
//                sb1.append(c);
//            }
//            sb1.append(' ');
//        }
//        return sb1.toString() + "\n" + chosenWord;


//    }
        //#end region
    }
}





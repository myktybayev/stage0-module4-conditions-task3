package school.mjc.stage0.conditions.task3;

public class AlphabeticCharacters {
    public void vowelDeterminer(char character) {
        if(character=='A' || character=='E'|| character=='I'|| character=='O'|| character=='U'|| character=='Y' ||
                character=='a' || character=='e'|| character=='i'|| character=='o'|| character=='u'|| character=='y'){
            System.out.println("Vowel");

        }else if(((int)character>=65 && (int)character<=90) || ((int)character>=97 && (int)character<=122)){
            System.out.println("Consonant");
        }else{
            System.out.println("wrong alphabet!");
        }
    }
}

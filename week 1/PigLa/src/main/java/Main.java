
/*
    Create a function that takes a string of words and moves the first letter of each word to the end of it,
    then adds "ay" to the end of the word. This is called "Pig Latin" and it gets more complicated than the
    rules in this particular challenge. I've intentionally kept things simple, otherwise this would turn into
    an extremely tedious challenge.
        Move the first letter of each word to the end of the word.
        Add "ay" to the end of the word.
        Words starting with a vowel (A, E, I, O, U) simply have "WAY" appended to the end.

        Examples
        pigLatin("Cats are great pets.")
        --> "Atscay areway reatgay etspay."

        pigLatin("Tom got a small piece of pie.")
        --> "Omtay otgay away mallsay iecepay ofway iepay."

        pigLatin("He told us a very exciting tale.")
        --> "Ehay oldtay usway away eryvay excitingway aletay."

        Notes
        Be sure to preserve proper capitalization and punctuation.
 */


public class Main {

    public static void main (String [] args){
        Piglatin test = new Piglatin();
        System.out.println(test.pL("Cats are great pets."));
        System.out.println(test.pL("Tom got a small piece of pie."));
        System.out.println(test.pL("He told us a very exciting tale."));
    }


}

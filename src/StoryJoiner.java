public class StoryJoiner {

    public static void joinWords(String...words){
        for(String word:words){
            System.out.print(word+" ");
        }
    }
    public static void main(String[] args) {
        joinWords("helloo","lets","do","it");

    }
}

public class Main {
    public static void main(String[] args) {
        String sentence = "Hello, World!";
        StringBuilder newSentence = new StringBuilder();
        for(char c : sentence.toCharArray()){
            if(c=='e')
                newSentence.append('o');
            else if (c=='o')
                newSentence.append('e');
            else
                newSentence.append(c);
        }

        System.out.println(newSentence);
    }
}
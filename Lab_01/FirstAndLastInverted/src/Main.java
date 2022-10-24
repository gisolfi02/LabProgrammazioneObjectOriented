public class Main {
    public static void main(String[] args) {
        String[] words = {"c", "ac", "pippo"};

        for (String word : words) {
            String result="";

            if(word.length()<2)
                System.out.print("Stringa corta");
            else if(word.length()==2){
                result = word.substring(1);
                result = result.concat(word.substring(0,1));
            }
            else {
                result = word.substring(word.length()-1);
                result = result.concat(word.substring(1,word.length()-1));
                result = result.concat(word.substring(0,1));
            }
            System.out.println(result);
        }
    }
}
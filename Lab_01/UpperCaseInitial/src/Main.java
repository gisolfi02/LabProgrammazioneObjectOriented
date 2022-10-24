public class Main {
    public static void main(String[] args) {
        String[] words = {"", "a", "alice", "bob", "pippo", "pluto"};

        for (String word : words) {
            String nuova = "";
            if(!word.isEmpty()){
                nuova = nuova + word.charAt(0);
                nuova = nuova.toUpperCase();
                nuova = nuova.concat(word.substring(1));
            }
            System.out.println(nuova);
        }
    }
}
package school.mjc.stage0.loops.task2;

public class WordsBuilder {
    public void buildPhrase(char... chars) {
        int i = 0;
        StringBuilder sb = new StringBuilder();
        int charsLenght = chars.length;
        while (i < charsLenght) {
            sb.append(chars[i]);
            i++;
        }
        String string = sb.toString();
        System.out.print(string);

    }
}

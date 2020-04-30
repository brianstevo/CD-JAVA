package compiler;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        try {
            Scanner file = new Scanner(new File("/home/brian/Documents/TXT3.txt"));
            file.useDelimiter("\\Z"); // end of file

            LexAnalyzer lex = new LexAnalyzer();

            String source = file.next();
            lex.tokenize(source);

            System.out.println("lexical Analyser: ");
            for (Token token : lex.tokens) {
                System.out.println(token);
            }
            
            System.out.println("Tokens/lexeme are: ");
            for (Token token : lex.tokens) {
                System.out.println(token.lexeme);
            }
            
            System.out.println("TokenType are: ");
            for (Token token : lex.tokens) {
                System.out.println(token.type);
            }

            file.close();
        } catch (FileNotFoundException f) {
            System.err.println(args[0] + " couldn't be opened.");
            System.exit(0);
        }

    }

}
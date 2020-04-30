package compiler;

public class Token {

    int line;
    String lexeme;
    Object literal;
    TokenType type;

    Token(int line, String lexeme, Object literal, TokenType type) {
        this.line = line;
        this.lexeme = lexeme;
        this.literal= literal;
        this.type = type;
    }

    @Override
    public String toString() {
        return "line " + line + " = lexeme: " + lexeme + " literal: " + literal + " type: " + type;
    }
    public String getLexeme() {
        return lexeme;
    }
    public TokenType getToken() {
        return type;
    }
}
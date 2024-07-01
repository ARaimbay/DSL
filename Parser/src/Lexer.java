import java.util.Arrays;
import java.util.List;

public class Lexer {
    public static List<Token> getHardcodedTokens() {
        return Arrays.asList(
                new Token(Token.Type.NUMBER, "3"),
                new Token(Token.Type.MULTIPLY, "*"),
                new Token(Token.Type.NUMBER, "5"),
                new Token(Token.Type.MULTIPLY, "*"),
                new Token(Token.Type.NUMBER, "10"),
                new Token(Token.Type.MULTIPLY, "*"),
                new Token(Token.Type.NUMBER, "4")
        );
    }
}

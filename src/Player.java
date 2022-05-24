import java.io.Serializable;
import java.util.List;

public class Player implements Serializable {

    private int playerId;
    private String nickName;
    private int games;
    private int defeats;
    private int rating;
    private List<String> secretDeck;
    private List<String> publicDeck;

    Player(String nickName) {
        this.nickName = nickName;
    }
    public void setSecretDeck(List<String> secretDeck) {
        this.secretDeck = secretDeck;
    }

    public List<String> getSecretDeck() {
        return secretDeck;
    }

    public String getNickName() {
        return nickName;
    }
}

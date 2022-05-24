import java.io.IOException;
import java.io.InputStream;
import java.io.ObjectInputStream;
import java.net.Socket;

public class Client {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        Socket socket = new Socket("127.0.0.1", 5050);
        System.out.println("서버에 접속 성공");
        socket.setKeepAlive(true);

        InputStream ins = socket.getInputStream();
        ObjectInputStream oins = new ObjectInputStream(ins);
        Player[] players = (Player[]) oins.readObject();
        for (Player p : players) {
            System.out.println(p.getSecretDeck());
        }
        // client에서 player deck 확인
        oins.close(); ins.close(); socket.close();
    }

}

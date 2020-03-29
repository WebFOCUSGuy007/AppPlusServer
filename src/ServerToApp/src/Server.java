import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.stream.Collectors;

public class Server {

    public void run(){

        try{
            ServerSocket mainServerSocket = new ServerSocket(7800);

            while(true){
                Socket s = mainServerSocket.accept();

                InputStreamReader msgReader = new InputStreamReader(s.getInputStream());

                BufferedReader br = new BufferedReader(msgReader);

                String message = br.lines().collect(Collectors.joining());

                System.out.println(message);
            }
        }
        catch (IOException e){
            e.printStackTrace();
        }
    }
}



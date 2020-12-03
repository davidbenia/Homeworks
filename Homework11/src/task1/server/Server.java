package task1.server;

import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Scanner;

public class Server extends Thread{
    Scanner scanner = new Scanner(System.in);
    ObjectInputStream inputStream;
    ObjectOutputStream outputStream;
    String send_data, receive_data;

    public void run(){
        try{
            ServerSocket serverSocket = new ServerSocket(8080);
            Socket client = serverSocket.accept();
            System.out.format("{server}$ Client connected from %s.\n", client.getInetAddress());

            while(true){
                outputStream = new ObjectOutputStream(client.getOutputStream());
                System.out.format("{server}$ Send message to %s:\n", client.getInetAddress());
                send_data = scanner.nextLine();
                if(send_data.equals("-")){
                    outputStream.writeObject(send_data);
                    break;
                }
                else {
                    outputStream.writeObject(send_data);
                }

                inputStream = new ObjectInputStream(client.getInputStream());
                receive_data = inputStream.readObject().toString();

                if(receive_data.equals("-")){
                    System.out.println("{server}$ Client disconnected.");
                    inputStream.close();
                    outputStream.close();
                    break;
                }
                else{
                    System.out.format("{server}$ client-> %s\n", receive_data);
                    Thread.sleep(15);
                }
            }
        }
        catch (Exception e){
            e.printStackTrace();
        }
    }
}

package task1.client;

import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.net.Socket;
import java.util.Scanner;

public class Client extends Thread{
    Scanner scanner = new Scanner(System.in);
    ObjectInputStream inputStream;
    ObjectOutputStream outputStream;
    String IPaddress, send_data, receive_data;

    public void run(){
        System.out.println("{client}$ Enter your IP address (e.g: 127.0.0.1):");
        IPaddress = scanner.nextLine();

        try{
            Socket server = new Socket(IPaddress, 8080);
            System.out.println("{client}$ Connected to server.\n");

            while(true){
                inputStream = new ObjectInputStream(server.getInputStream());
                receive_data = inputStream.readObject().toString();
                if(receive_data.equals("-")){
                    System.out.println("{client}$ Connection closed by server.");
                    inputStream.close();
                    outputStream.close();
                    break;
                }
                else{
                    System.out.format("{client}$ server-> %s\n", receive_data);
                    Thread.sleep(15);
                }

                outputStream = new ObjectOutputStream(server.getOutputStream());
                System.out.format("{client}$ Send message to %s:\n", server.getInetAddress());
                send_data = scanner.nextLine();

                if(send_data.equals("-")){
                    outputStream.writeObject(send_data);
                    break;
                }
                else {
                    outputStream.writeObject(send_data);
                }
            }

        }catch (Exception e){
            e.printStackTrace();
        }
    }
}

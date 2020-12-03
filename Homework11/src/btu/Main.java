package btu;

import task1.client.Client;
import task1.server.Server;

public class Main {

    public static void main(String[] args) {
        //Task 1
        Server server = new Server();
        Client client = new Client();
        server.start();
        client.start();

        //Task2
        //სამწუყაროდ ვერ მივხვდი შინაარს.
    }
}

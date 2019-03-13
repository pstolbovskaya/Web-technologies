package by.bsuir.stolbovskaya.Server.controller;

import by.bsuir.stolbovskaya.Server.Main;
import by.bsuir.stolbovskaya.Server.domain.User;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.ObjectOutputStream;
import java.net.Socket;

public class ServerThread extends Thread {

    private Socket socket;
    private User currentUser;

    public ServerThread(Socket socket) {
        this.socket = socket;
        this.setDaemon(true);
        this.start();
    }

    @Override
    public void run() {
        try {
            BufferedReader fromUser = new BufferedReader(new InputStreamReader(socket.getInputStream()));
            ObjectOutputStream toUser = new ObjectOutputStream(socket.getOutputStream());

            Controller controller = new Controller();

            String sentence = fromUser.readLine();
            while (sentence  != null) {
                toUser.writeObject(controller.doAction(sentence));
                toUser.flush();
                sentence = fromUser.readLine();
            }
        }
        catch (IOException e) {
            Main.getClientList().remove(socket);
        }
        finally {
            try {
                socket.close();
                System.out.println("Client disconnected");
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }

    public User getCurrentUser() {
        return currentUser;
    }

    public void setCurrentUser(User currentUser) {
        this.currentUser = currentUser;
    }
}

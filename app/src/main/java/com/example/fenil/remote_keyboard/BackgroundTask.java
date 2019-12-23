package com.example.fenil.remote_keyboard;
import android.os.AsyncTask;

import java.io.IOException;
import java.io.PrintWriter;
import java.net.Socket;
public class BackgroundTask extends AsyncTask<String,Void,Void>
{
    PrintWriter printWriter;
    Socket socket;
    String message;
    @Override
    protected Void doInBackground(String... voids) {

        try {
            message=voids[0];
            socket = new Socket("192.168.43.173",7400);
            printWriter=new PrintWriter(socket.getOutputStream());


            printWriter.write(message);
            printWriter.flush();
            printWriter.close();
            socket.close();



        } catch (IOException e) {
            e.printStackTrace();
        }
        return null;
    }
}

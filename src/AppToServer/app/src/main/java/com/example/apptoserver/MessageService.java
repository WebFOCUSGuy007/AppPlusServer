package com.example.apptoserver;

import android.os.AsyncTask;

import java.io.DataOutputStream;
import java.io.IOException;
import java.io.PrintWriter;
import java.net.Socket;


public class MessageService extends AsyncTask<String, Void, Void> {

    Socket primarySocket;
    DataOutputStream outputStream;

    PrintWriter printWriter;


    @Override
    protected Void doInBackground(String... voids) {

        String message = voids[0];

        try{
            primarySocket = new Socket("192.168.0.14", 7800);
            printWriter = new PrintWriter(primarySocket.getOutputStream());

            printWriter.write(message);

            printWriter.flush();

            printWriter.close();
        }
        catch (IOException e){
            e.printStackTrace();
        }

        return null;
    }
}

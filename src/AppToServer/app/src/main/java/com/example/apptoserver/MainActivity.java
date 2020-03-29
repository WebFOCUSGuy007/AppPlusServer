package com.example.apptoserver;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    TextView response;
    EditText message;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        message = (EditText) findViewById(R.id.messageEditText);
    }

    private void Main(){
        return;
    }

    public void sendMessage(View v){
        MessageService messageService = new MessageService();
        messageService.execute(message.getText().toString());
    }


}

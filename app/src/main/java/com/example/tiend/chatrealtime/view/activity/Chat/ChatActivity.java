package com.example.tiend.chatrealtime.view.activity.Chat;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.KeyEvent;
import android.widget.ArrayAdapter;
import android.widget.EditText;
import android.widget.TextView;

import com.example.tiend.chatrealtime.R;
import com.example.tiend.chatrealtime.model.Message;
import com.example.tiend.chatrealtime.model.User;
import com.example.tiend.chatrealtime.view.activity.ViewAdapter.ChatViewAdapter;

import java.util.ArrayList;

public class ChatActivity extends AppCompatActivity {

    RecyclerView rcv_chatWindow;
    ChatViewAdapter chatViewAdapter;
    ArrayList<Message> listMessage;
    EditText edt_inputField;
    User user;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_chat);
        addControls();
        addEvents();

    }

    private void addControls() {
        listMessage = new ArrayList<>();
        addMessageTest();
        user = new User("abc@gmail.com","Tai",123123123);
        rcv_chatWindow = (RecyclerView) findViewById(R.id.rcv_chatWindow);
        chatViewAdapter = new ChatViewAdapter(getApplicationContext(),listMessage,user);
        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(this,LinearLayoutManager.VERTICAL,false);
        rcv_chatWindow.setLayoutManager(linearLayoutManager);

        rcv_chatWindow.setAdapter(chatViewAdapter);
        edt_inputField = (EditText) findViewById(R.id.edt_inputField);
    }

    private void addEvents() {


    }

    private void addMessageTest () {
        listMessage.add(new Message("Chào Em",3,"Tai","Tien"));
        listMessage.add(new Message("Chào Anh",3,"Tien","Tien"));
        listMessage.add(new Message("Em thích ăn Rau dền không ?",3,"Tai","Tien"));
        listMessage.add(new Message("Dạ không !",3,"Tien","Tien"));
        listMessage.add(new Message("Thế mẹ em có thích ăn rau dền không ?",3,"Tai","Tien"));
        listMessage.add(new Message("Gia đình em không ai thích ăn rau dền anh ạ",3,"Tien","Tien"));
        listMessage.add(new Message("Thế sao em không ăn rau dền đì, rau dền tốt cho sức khỏe lắm",3,"Tai","Tien"));
        listMessage.add(new Message("Em không thích anh ạ !",3,"Tien","Tien"));
        listMessage.add(new Message("Sao lại không thích, em phải thích ăn rau dền cho anh",3,"Tai","Tien"));
        listMessage.add(new Message("Đỉ mẹ anh ! ",3,"Tien","Tien"));
        listMessage.add(new Message("Đỉ mẹ em ! Gạ địt chịch chịch :)))",3,"Tai","Tien"));
    }

}

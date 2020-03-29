package com.example.whatfruit_1;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    public static final String EXTRA_MESSAGE = "com.example.whatfruit_1";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        /** Called when the user taps the Send Button **/

    }
    public void sendMessage (View view){
        /**
       Intent intent = new Intent (this, DisplayMessageActivity.class);

       intent.putExtra (EXTRA_MESSAGE, message);
       startActivity (intent); **/
        EditText editText = (EditText) findViewById(R.id.eTStringChange);
        String message = editText.getText().toString();
        TextView tvString =  (TextView) findViewById(R.id.tvStringChange);
        tvString.setText(message);
    }
}

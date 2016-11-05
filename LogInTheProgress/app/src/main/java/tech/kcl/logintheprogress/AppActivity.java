package tech.kcl.logintheprogress;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class AppActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_app);
        TextView textView = (TextView) findViewById(R.id.textView);

        Intent letter = getIntent();
        Bundle stickers = letter.getExtras();
        String username = stickers.getString("username");

        textView.setText(username);
    }
}

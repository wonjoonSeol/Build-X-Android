package tech.kcl.logintheprogress;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class LoginActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        //final, so that it stays the same for all onClick instance. Put this outside because you only need to find it once findViewById()
        final EditText username_edit_text = (EditText) findViewById(R.id.editText);
        final EditText password_edit_text = (EditText) findViewById(R.id.editText2);

        Button button = (Button) findViewById(R.id.button);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String username = username_edit_text.getText().toString();
                String password = password_edit_text.getText().toString();
                if (username.equals("hello") && password.equals("password")){
                    Intent intent = new Intent(getApplicationContext(), AppActivity.class);
                    intent.putExtra("username", username);
                    intent.putExtra("password", password);
                    startActivity(intent);
                }
            }
        });
    }
}

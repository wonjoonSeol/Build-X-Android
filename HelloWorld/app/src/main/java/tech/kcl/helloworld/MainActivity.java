package tech.kcl.helloworld;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

import org.w3c.dom.Text;

public class MainActivity extends AppCompatActivity {

    TextView view;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //
        TextView view = (TextView) findViewById(R.id.text_view);
        view.setText("Android World");
        view.setText("fihsd");
    }

    @Override
     protected void onStart() {
        super .onStart();
        //Extra
        view.append("onStart/n")
    }

    @Override
    protected void onResume() {
        super.onResume();

    }
    @Override
    protected void onPause() {
        super.onPause();
    }
}

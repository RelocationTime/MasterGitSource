package chaoxin.im.mastergitsource;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Window;

public class MainActivity extends AppCompatActivity {

    private Window container;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private TextView tv;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        container = getWindow().getContainer();
        container.getContainer();
        tv = (TextView) findViewById(R.id.tv);
        tv.setText("one");
    }
}

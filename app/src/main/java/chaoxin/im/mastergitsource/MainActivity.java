package chaoxin.im.mastergitsource;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.Window;
import android.widget.TextView;


public class MainActivity extends AppCompatActivity {

    private TextView tv;
    private Window container;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        container = getWindow().getContainer();
        container.getContainer();
        tv = (TextView) findViewById(R.id.tv);
        tv.setText("one");
        tv.setText("two");
        tv.setText("123");
    }
}

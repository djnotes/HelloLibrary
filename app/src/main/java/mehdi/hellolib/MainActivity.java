package mehdi.hellolib;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

import com.udemy.hello.HelloView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        View v = new HelloView(this);
        setContentView(v);
    }
}

package li.zhaofeng.projectzero;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;
import android.widget.Toast;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void openApp(View view) {
        // http://stackoverflow.com/questions/5620772/get-text-from-pressed-button
        Button button = (Button)view;
        Toast.makeText(this, "Um... " + button.getText().toString() + " isn't ready yet. Stay tuned!", Toast.LENGTH_SHORT).show();
    }
}

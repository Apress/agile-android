package cyberdojotest.riis.mockitodatabasetest;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        SQLHelper db = new SQLHelper(this);
        User joeSmith = new User("Joe", "Smith");
        db.addUser(joeSmith);
    }
}

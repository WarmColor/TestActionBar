package net.warmcolor.blog.testactionbar;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;
import android.view.Menu;
import android.view.MenuItem;

public class MainActivity extends ActionBarActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        Intent intent = new Intent(this, Main2Activity.class);
        String message = null;
        switch (item.getItemId()) {
            case R.id.first_button:
                System.out.println("first");
                message = "first_button";
                break;
            case R.id.second_button:
                System.out.println("second");
                message = "second_button";
                break;
            case R.id.third_button:
                System.out.println("third");
                message = "third_button";
                break;
            case R.id.forth_button:
                System.out.println("forth");
                message = "forth_button";
            default:
        }

        intent.putExtra("EXTRA_MESSAGE", message);
        startActivity(intent);
        return super.onOptionsItemSelected(item);
    }
}

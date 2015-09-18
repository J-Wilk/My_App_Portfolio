package johnsamwilkie.co.uk.myappportfolio;

import android.content.Context;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Toast;


public class MainActivity extends ActionBarActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }

    public void createToast(View view) {
        String message;
        Context context = getApplicationContext();
        switch(view.getId()){
            case R.id.button:
                message = "This button will launch the spotify app";
                break;

            case R.id.button2:
                message = "This button will launch the scores app";
                break;

            case R.id.button3:
                message = "This button will launch the library app";
                break;

            case R.id.button4:
                message = "This button will launch the build it bigger app";
                break;

            case R.id.button5:
                message = "This button will launch the xyz reader app";
                break;

            case R.id.button6:
                message = "This button will launch the an app I created";
                break;

            default:
                message = "";
        }
        Toast toast = Toast.makeText(context, message, Toast.LENGTH_SHORT);
        toast.show();
    }
}

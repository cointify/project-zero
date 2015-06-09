package io.github.cointify.projectzero;

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

    public void onClickLaunchSpotifyStreamer(View view) {
        showToastMessage("This button will launch my spotify streamer app");
    }

    public void onClickLaunchScores(View view) {
        showToastMessage("This button will launch my scores app");
    }

    public void onClickLaunchLibrary(View view) {
        showToastMessage("This button will launch my library app");
    }

    public void onClickLaunchBuildItBigger(View view) {
        showToastMessage("This button will launch my build it bigger");
    }

    public void onClickLaunchBaconReader(View view) {
        showToastMessage("This button will launch my bacon reader");
    }

    public void onClickLaunchCapstone(View view) {
        showToastMessage("This button will launch my capstone: my own app");
    }

    private void showToastMessage(String message) {
        Toast.makeText(getApplicationContext(), message, Toast.LENGTH_SHORT).show();
    }
}

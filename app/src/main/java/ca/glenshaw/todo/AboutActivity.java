package ca.glenshaw.todo;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;

public class AboutActivity extends AppCompatActivity
{
    /*
     * AboutActivity
     * Activity that displays a basic about activity with a description, name & photo
     * called from a basic option menu
     */
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_about);
        logIt("onCreate: " + "");
    }

    // logit function for logging
    public void logIt(String msg) {
        final String TAG = "ToDoAPP - ABOUT";
        Log.d(TAG, msg);
    }

}

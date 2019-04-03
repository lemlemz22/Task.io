package laverdad.edu.ph.task_io;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.Window;

public class TaskActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        requestWindowFeature(Window.FEATURE_NO_TITLE);
        setContentView(R.layout.fragment_task);

    }

    public void onButtonClick1(View v) {
        if(v.getId() == R.id.Bdisplay){
            Intent i = new Intent(TaskActivity.this, NewTask.class);
            startActivity(i);
        }

    }
}

package laverdad.edu.ph.task_io;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.Window;

public class LoginActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        requestWindowFeature(Window.FEATURE_NO_TITLE);
        setContentView(R.layout.login_form);
    }

    public void onButtonClick2(View v) {
        if(v.getId() == R.id.Bdisplay1){
            Intent i = new Intent(LoginActivity.this, HomeActivity.class);
            startActivity(i);
        }

    }
}

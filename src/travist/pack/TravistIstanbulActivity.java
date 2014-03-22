package travist.pack;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class TravistIstanbulActivity extends Activity {
    /** Called when the activity is first created. */
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main);
        
    }
    
    public void openMap(View view) {
    	Intent intent = new Intent(this, TestOfflineMapActivity.class);
    	startActivity(intent);
    }
}
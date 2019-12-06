package ngopi.pagi.com;

import android.app.*;
import android.os.*;
import android.widget.*;

public class MainActivity extends Activity 
{
    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main);
		
		Toast.makeText(getApplicationContext(),R.string.hello_world,Toast.LENGTH_SHORT).show();
    }
}

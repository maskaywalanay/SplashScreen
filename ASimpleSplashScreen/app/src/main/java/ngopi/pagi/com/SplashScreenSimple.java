package ngopi.pagi.com;
import android.app.*;
import android.os.*;
import java.io.*;
import android.content.*;

public class SplashScreenSimple extends Activity
{

	@Override
	protected void onCreate(Bundle savedInstanceState)
	{
		// TODO: Implement this method
		super.onCreate(savedInstanceState);
		setContentView(R.layout.splash_screen);
		
		Thread thread = new Thread(){
			
			public void run(){
				try{
					
					sleep(3000);
				}catch(InterruptedException e){
					
					e.printStackTrace();
				} finally{
					startActivity(new Intent(SplashScreenSimple.this,MainActivity.class));
					finish();
				}
			}
		};
		
		thread.start();
	}
	

}

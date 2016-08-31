package com.lanchuang.wgc.android_textview;

import android.app.Activity;
import android.os.Bundle;
import android.view.KeyEvent;
import android.view.Menu;
import android.view.MenuItem;
import android.view.inputmethod.EditorInfo;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends Activity
{

	private EditText editText01;

	@Override
	protected void onCreate(Bundle savedInstanceState )
	{
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);

		editText01 = (EditText) findViewById(R.id.EditText_01);

		editText01.setOnEditorActionListener(new TextView.OnEditorActionListener()
		{

			@Override
			public boolean onEditorAction(TextView v , int actionId , KeyEvent event )
			{

				// String value = v.getText().toString();

				switch(actionId)
				{
					case EditorInfo.IME_ACTION_SEND:
						Toast.makeText(MainActivity.this ,v.getText().toString() + actionId ,Toast.LENGTH_LONG).show();
						break;

					case EditorInfo.IME_ACTION_DONE:
						Toast.makeText(MainActivity.this ,v.getText().toString() + actionId ,Toast.LENGTH_LONG).show();
						break;

					case EditorInfo.IME_ACTION_NEXT:
						Toast.makeText(MainActivity.this ,v.getText().toString() + actionId ,Toast.LENGTH_LONG).show();
						break;

					case EditorInfo.IME_ACTION_NONE:
						Toast.makeText(MainActivity.this ,v.getText().toString() + actionId ,Toast.LENGTH_LONG).show();
						break;

					case EditorInfo.IME_ACTION_PREVIOUS:
						Toast.makeText(MainActivity.this ,v.getText().toString() + actionId ,Toast.LENGTH_LONG).show();
						break;

					case EditorInfo.IME_ACTION_SEARCH:
						Toast.makeText(MainActivity.this ,v.getText().toString() + actionId ,Toast.LENGTH_LONG).show();
						break;

					case EditorInfo.IME_ACTION_GO:
						Toast.makeText(MainActivity.this ,v.getText().toString() + actionId ,Toast.LENGTH_LONG).show();
						break;

					default:
						Toast.makeText(MainActivity.this ,v.getText().toString() + actionId ,Toast.LENGTH_LONG).show();
						break;
				}

				return false;
			}
		});

	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu )
	{
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.main ,menu);
		return true;
	}

	@Override
	public boolean onOptionsItemSelected(MenuItem item )
	{
		// Handle action bar item clicks here. The action bar will
		// automatically handle clicks on the Home/Up button, so long
		// as you specify a parent activity in AndroidManifest.xml.
		int id = item.getItemId();
		if(id == R.id.action_settings)
		{
			return true;
		}
		return super.onOptionsItemSelected(item);
	}
}

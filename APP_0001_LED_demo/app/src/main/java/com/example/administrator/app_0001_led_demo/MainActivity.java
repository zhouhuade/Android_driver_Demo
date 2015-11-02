package com.example.administrator.app_0001_led_demo;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Button;
import android.view.View;
import android.widget.CheckBox;
import android.widget.Toast;
import android.view.Gravity;

public class MainActivity extends AppCompatActivity {

    private Button button = null;
    private CheckBox CheckBoxLed1 = null;
    private CheckBox CheckBoxLed2 = null;
    private CheckBox CheckBoxLed3 = null;
    private CheckBox CheckBoxLed4 = null;

    private boolean LedOnOff = false;

    public void onCheckboxClicked(View view) {
        Toast toast = null;
        // Is the view now checked?
        boolean checked = ((CheckBox) view).isChecked();
        // Check which checkbox was clicked
        switch(view.getId()) {
            case R.id.LED1:
                if (checked) {
                    // Put some meat on the sandwich
                    Toast.makeText(getApplicationContext(), "LED1-ON",
                            Toast.LENGTH_SHORT).show();
                }
                else {
                    // Remove the meat
                    Toast.makeText(getApplicationContext(), "LED1-OFF",
                            Toast.LENGTH_SHORT).show();
                }
                break;
            case R.id.LED2:
                if (checked) {
                    // Put some meat on the sandwich
                    toast = Toast.makeText(getApplicationContext(),
                            "LED2被按下", Toast.LENGTH_LONG);
                    toast.setGravity(Gravity.CENTER, 0, 0);
                    toast.show();
                }
                else {
                    // Remove the meat
                    toast = Toast.makeText(getApplicationContext(),
                            "LED2被释放", Toast.LENGTH_LONG);
                    toast.setGravity(Gravity.CENTER, 0, 0);
                    toast.show();
                }
                break;
            case R.id.LED3:
                if (checked) {
                    // Put some meat on the sandwich
                    toast = Toast.makeText(getApplicationContext(),
                            "LED3被按下", Toast.LENGTH_LONG);
                    toast.setGravity(Gravity.CENTER, 0, 0);
                    toast.show();
                }
                else {
                    // Remove the meat
                    toast = Toast.makeText(getApplicationContext(),
                            "LED3被释放", Toast.LENGTH_LONG);
                    toast.setGravity(Gravity.CENTER, 0, 0);
                    toast.show();
                }
                break;
            case R.id.LED4:
                if (checked) {
                    // Put some meat on the sandwich
                    toast = Toast.makeText(getApplicationContext(),
                            "LED4被按下", Toast.LENGTH_LONG);
                    toast.setGravity(Gravity.CENTER, 0, 0);
                    toast.show();
                }
                else {
                    // Remove the meat
                    toast = Toast.makeText(getApplicationContext(),
                            "LED4被释放", Toast.LENGTH_LONG);
                    toast.setGravity(Gravity.CENTER, 0, 0);
                    toast.show();
                }
                break;
            // TODO: Veggie sandwich
        }
    }
    class MyButtonListener implements View.OnClickListener {

        public void onClick(View v) {
            // Perform action on click
            LedOnOff = !LedOnOff;
            if (LedOnOff) {
                button.setText("ALL ON -");
                CheckBoxLed1.setChecked(false);
                CheckBoxLed2.setChecked(false);
                CheckBoxLed3.setChecked(false);
                CheckBoxLed4.setChecked(false);

            } else {
                button.setText("ALL OFF -");
                CheckBoxLed1.setChecked(true);
                CheckBoxLed2.setChecked(true);
                CheckBoxLed3.setChecked(true);
                CheckBoxLed4.setChecked(true);
            }
        }
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        button = (Button)findViewById(R.id.BUTTON);
        button.setOnClickListener(new MyButtonListener());

        CheckBoxLed1 = (CheckBox) findViewById(R.id.LED1);
        CheckBoxLed2 = (CheckBox) findViewById(R.id.LED2);
        CheckBoxLed3 = (CheckBox) findViewById(R.id.LED3);
        CheckBoxLed4 = (CheckBox) findViewById(R.id.LED4);
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
}

package com.example.android.displayingbitmaps.ui;

import android.app.Activity;
import android.os.Bundle;
import android.os.Environment;
import android.view.Menu;
import android.view.MenuItem;
import android.view.Window;
import android.view.WindowManager;

import com.example.android.common.logger.Log;
import com.example.android.displayingbitmaps.R;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.URL;

public class AboutActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        requestWindowFeature(Window.FEATURE_NO_TITLE);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN);
        setContentView(R.layout.activity_about);

        try{
            URL url = new URL("http://jerome.lendmyvoice.org/images/picturelist.txt");
            String path = "sdcard/downloads/picturelist.txt";
            InputStream ins = url.openStream();
            OutputStream ous = new FileOutputStream(path);
            final byte[] b = new byte[2048];
            int length;

            while ((length = ins.read(b)) != -1) {
                ous.write(b, 0, length);
            }

            ins.close();
            ous.close();
        } catch(Exception e){
            e.printStackTrace();
        }

        try {
            InputStream instream = new FileInputStream("sdcard/downloads/picturelist.txt");
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }


    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_about, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement


        return super.onOptionsItemSelected(item);
    }
}

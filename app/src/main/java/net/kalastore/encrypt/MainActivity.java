package net.kalastore.encrypt;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
         /* byte[] data =  "http://web.net".getBytes();
        String dex = Base64.encodeToString(data,Base64.DEFAULT);
        Log.i("TAG","Encrypt : " + dex);
        String site = "aHR0cDovL2thbGFzdG9yZS5uZXQ=";
       byte [] result =  Base64.decode(site.getBytes(),Base64.DEFAULT);
        String text = new String(result);
        Log.i("TAG","Decoded : " + text);*/
        String key = "Bar12345Bar12345"; // 128 bit key
        String initVector = "RandomInitVector"; // 16 bytes IV

        Log.i("TAG", Encryptor.encrypt(key, initVector, "http://web.net") +"||"+Encryptor.decrypt(key, initVector,
                Encryptor.encrypt(key, initVector, "Hello World")));
    }
}

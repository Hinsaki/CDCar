package allan.cdcar;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.content.Intent;

public class Main2Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
    }
    public void sc(View v){
        goStart();
    }

    private void goStart() {
        Intent intent = new Intent(this,Main3Activity.class);
        startActivity(intent);
    }
    public void WiFi(View v){
        goWiFi();
    }
    private void goWiFi() {
        Intent intent = new Intent(this,rpiwifirobot.class);
        startActivity(intent);
    }
    public void Sen(View v){
        goSen();
    }
    private void goSen() {
        Intent intent = new Intent(this,sensorcontrol.class);
        startActivity(intent);
    }
    public void photo(View v){
        goPhoto();
    }

    private void goPhoto() {
        Intent intent = new Intent(this,Main4Activity.class);
        startActivity(intent);
    }
    public void data(View v){
        goData();
    }

    private void goData() {
        Intent intent = new Intent(this,Main5Activity.class);
        startActivity(intent);
    }
    public void us(View v){
        goUs();
    }

    private void goUs() {
        Intent intent = new Intent(this,Main6Activity.class);
        startActivity(intent);
    }
}

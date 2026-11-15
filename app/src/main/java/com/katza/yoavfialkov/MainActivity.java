package com.katza.yoavfialkov;

import static android.view.View.INVISIBLE;
import static android.view.View.VISIBLE;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CompoundButton;
import android.widget.SeekBar;
import android.widget.Switch;
import android.widget.TextView;
import android.widget.Toast;

import androidx.activity.EdgeToEdge;
import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity implements View.OnClickListener, CompoundButton.OnCheckedChangeListener, SeekBar.OnSeekBarChangeListener {

    TextView tvUserName;
    Button btnSendMessage;
    Button btnFollow;
    Switch swVisible;

    SeekBar seekImage;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);

        tvUserName = findViewById(R.id.tvUserName);
        btnSendMessage = findViewById(R.id.btnSendMessage);
        btnFollow = findViewById(R.id.btnFollow);

        btnSendMessage.setOnClickListener(this);
        btnFollow.setOnClickListener(this);

        swVisible = findViewById(R.id.swVisible);
        swVisible.setOnCheckedChangeListener(this);

        seekImage = findViewById(R.id.seekImage);
        seekImage.setOnSeekBarChangeListener(this);

    }

    @Override
    public void onClick(View v) {
        int viewId = v.getId();

        if (viewId == R.id.btnSendMessage) {
            Toast.makeText(this, R.string.opening_chat, Toast.LENGTH_SHORT).show();
        } else if (viewId == R.id.btnFollow) {
            Toast.makeText(this, R.string.started_following, Toast.LENGTH_SHORT).show();
            btnFollow.setText(R.string.following);
        }
    }

    @Override
    public void onCheckedChanged(@NonNull CompoundButton compoundButton, boolean b) {

        if (b){
            btnSendMessage.setVisibility(VISIBLE);
            Toast.makeText(this, "false " ,Toast.LENGTH_SHORT);

        }else{
            btnSendMessage.setVisibility(INVISIBLE);
            Toast.makeText(this, "false " ,Toast.LENGTH_SHORT);
        }

    }

    @Override
    public void onProgressChanged(SeekBar seekBar, int i, boolean b) {

    }

    @Override
    public void onStartTrackingTouch(SeekBar seekBar ) {

    }

    @Override
    public void onStopTrackingTouch(SeekBar seekBar) {

    }
}
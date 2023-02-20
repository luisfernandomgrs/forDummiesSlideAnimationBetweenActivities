package com.codinginflow.slideanimationbetweenactivites;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;

public class Activity2 extends AppCompatActivity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_2);

		Button button_open_activity3 = findViewById(R.id.button_open_activity3);
		button_open_activity3.setOnClickListener(V -> {openActivity2();});
	}

	public void openActivity2() {
		Intent intent = new Intent(this, Activity3.class);
		startActivity(intent);
	}

	@Override
	public void finish() {
		super.finish();
		overridePendingTransition(R.anim.slide_in_left, R.anim.slide_out_right);
	}
}
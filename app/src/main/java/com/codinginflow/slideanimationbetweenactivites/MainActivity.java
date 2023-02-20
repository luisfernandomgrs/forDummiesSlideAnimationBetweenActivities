package com.codinginflow.slideanimationbetweenactivites;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);

		Button button_open_activity2 = findViewById(R.id.button_open_activity2);
		button_open_activity2.setOnClickListener(V -> { openActivity2(); });
	}

	public void openActivity2() {
		Intent intent = new Intent(this, Activity2.class);
		startActivity(intent);
		overridePendingTransition(R.anim.slide_in_right, R.anim.slide_out_left);
	}
}
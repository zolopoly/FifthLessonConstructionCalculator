package com.msaggik.fifthlessonconstructioncalculator;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

public class DrywallActivity extends AppCompatActivity {
    private EditText square;
    private EditText widthDrywall, lengthDrywall, costDrywall;
    private Button button;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_drywall);

        square = findViewById(R.id.square);
        widthDrywall = findViewById(R.id.widthDrywall);
        lengthDrywall = findViewById(R.id.lengthDrywall);
        costDrywall = findViewById(R.id.costDrywall);
        button = findViewById(R.id.button);

        button.setOnClickListener(listener);
    }

    private View.OnClickListener listener = v -> {
        int squareSurface = Integer.parseInt(square.getText().toString());
        int width = Integer.parseInt(widthDrywall.getText().toString());
        int length = Integer.parseInt(lengthDrywall.getText().toString());
        int cost = Integer.parseInt(costDrywall.getText().toString());

        Drywall drywall = new Drywall(width, length, cost);

        Intent intent = new Intent(getApplicationContext(), CalculationActivity.class);
        intent.putExtra("keySquare", squareSurface);
        intent.putExtra(Drywall.class.getSimpleName(), drywall);
        intent.putExtra("SENDER_CLASS_NAME", DrywallActivity.class.getName());
        startActivity(intent);
    };
}

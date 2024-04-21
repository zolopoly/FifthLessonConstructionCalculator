package com.msaggik.fifthlessonconstructioncalculator;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    // поля
    private Button buttonWallpaper, buttonDrywall, buttonElectricalWiring, buttonPaint, buttonHeatingRadiators; // кнопки

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // привязка полей к разметке
        buttonWallpaper = findViewById(R.id.buttonWallpaper);
        buttonDrywall = findViewById(R.id.buttonDrywall);
        buttonElectricalWiring = findViewById(R.id.buttonElectricalWiring);
        buttonPaint = findViewById(R.id.buttonPaint);
        buttonHeatingRadiators = findViewById(R.id.buttonHeatingRadiators);

        // обработка нажатия кнопок
        buttonWallpaper.setOnClickListener(listener);
        buttonDrywall.setOnClickListener(listener);
        buttonElectricalWiring.setOnClickListener(listener);
        buttonPaint.setOnClickListener(listener);
        buttonHeatingRadiators.setOnClickListener(listener);
    }

    // создание слушателя
    private View.OnClickListener listener = new View.OnClickListener() {
        @Override
        public void onClick(View view) {
            switch (view.getId()) {
                case R.id.buttonWallpaper:
                    Intent intent = new Intent(getApplicationContext(), WallpaperActivity.class); // создание намерения переключения в активность калькулятора обоев
                    startActivity(intent); // запуск намерения
                    break;
                case R.id.buttonDrywall:
                    startActivity(new Intent(getApplicationContext(), DrywallActivity.class));
                    break;
                case R.id.buttonElectricalWiring:
                    break;
                case R.id.buttonPaint:
                    break;
                case R.id.buttonHeatingRadiators:
                    break;
            }
        }
    };
}
package com.msaggik.fifthlessonconstructioncalculator;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class WallpaperActivity extends AppCompatActivity {

    // поля
    private EditText square; // площадь оклеиваемой поверхности
    private EditText widthWallpaper, heightWallpaper, costWallpaper; // параметры рулона обоев
    private Button button;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_wallpaper);

        // привязка полей к разметке
        square = findViewById(R.id.square);
        widthWallpaper = findViewById(R.id.widthWallpaper);
        heightWallpaper = findViewById(R.id.heightWallpaper);
        costWallpaper = findViewById(R.id.costWallpaper);
        button = findViewById(R.id.button);

        // обработка нажатия кнопки
        button.setOnClickListener(listener);
    }

    private View.OnClickListener listener = new View.OnClickListener() {
        @Override
        public void onClick(View view) {
            // считывание введённых данных
            int squareInt = Integer.parseInt(square.getText().toString()); // значение площади оклеиваемой поверхности (м*м)
            int width = Integer.parseInt(widthWallpaper.getText().toString()); // значение ширины рулона обоев (см)
            int height = Integer.parseInt(heightWallpaper.getText().toString()); // значение длины одного рулона обоев (м)
            int cost = Integer.parseInt(costWallpaper.getText().toString()); // значение стоимости одного рулона обоев (монет)

            Wallpaper wallpaper = new Wallpaper(width, height, cost); // создание объекта рулона обоев

            Intent intent = new Intent(getApplicationContext(), CalculationActivity.class); // создание объекта намерения
            intent.putExtra("keySquare", squareInt); // вложение в намерение значения squareInt по ключу keySquare
            intent.putExtra(Wallpaper.class.getSimpleName(), wallpaper); // вложение в намерение значения объекта wallpaper по ключу Wallpaper.class.getSimpleName()
            intent.putExtra("SENDER_CLASS_NAME", WallpaperActivity.class.getName());
            startActivity(intent); // запуск намерения
        }
    };
}
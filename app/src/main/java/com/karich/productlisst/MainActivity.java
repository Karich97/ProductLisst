package com.karich.productlisst;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ArrayList <String> list = new ArrayList<>();
        list.add("Coca-Cola    11 990  Humus");
        list.add("Bread    2 800   Evrywere");
        list.add("Лупёшка   2 800   Humus");
        list.add("Persil 3kg    79 990  Korzinka (discount)");
        list.add("Колбаса Rozmetov 0.5  37 490  Korzinka");
        list.add("Пельмени Musa 0.5     21 990  Humus");
        list.add("Tizin     28 000      Closest Pharmacy");
        list.add("");
        String string = "";
        for (String s : list) {
            string += s + "\n";
        }
        // Инициализируем компонент
        TextView textView = findViewById(R.id.textView);
// задаём текст
        textView.setText(string);
    }
}
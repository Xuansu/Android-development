package com.example.zhangtao.sy1_2;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.*;
public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button bt1 = (Button)findViewById(R.id.button1);
        bt1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                RadioButton rb1 = (RadioButton) findViewById(R.id.radioButton1);
                RadioButton rb2 = (RadioButton) findViewById(R.id.radioButton2);
                RadioButton rb3 = (RadioButton) findViewById(R.id.radioButton3);

                CheckBox cb1 = (CheckBox) findViewById(R.id.checkBox1);
                CheckBox cb2 = (CheckBox) findViewById(R.id.checkBox2);
                CheckBox cb3 = (CheckBox) findViewById(R.id.checkBox3);

                TextView et1 = (TextView) findViewById(R.id.textView1);

                String content = "";
                if (rb1.isChecked() == true)
                    content += rb1.getText() + "、";
                else if (rb2.isChecked() == true)
                    content += rb2.getText() + "、";
                else if (rb3.isChecked() == true)
                    content += rb3.getText() + "、";
                if (cb1.isChecked())
                    content += cb1.getText() + "、";
                if (cb2.isChecked())
                    content += cb2.getText() + "、";
                if (cb3.isChecked())
                    content += cb3.getText();

                et1.setText(content);
            }
        });

        Button bt2 = (Button)findViewById(R.id.button2);
        bt2.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                TextView et1 = (TextView) findViewById(R.id.textView1);
                et1.setText("");
            }
        });
    }
}

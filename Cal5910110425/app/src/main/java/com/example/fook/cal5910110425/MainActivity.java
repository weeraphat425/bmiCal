package com.example.fook.cal5910110425;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    TextView weight,height,bmi,hint;
    Button buttonC;
    EditText weightValue,heightValue;

    float floatWeight,floatHeight,calBmi;
    String strWeight,strHeight,strBmi;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        buttonC = (Button) findViewById(R.id.buttonC);
        weightValue = (EditText) findViewById(R.id.weight);
        heightValue = (EditText) findViewById(R.id.height);
        weight = (TextView) findViewById(R.id.w);
        height = (TextView) findViewById(R.id.h);
        bmi = (TextView) findViewById(R.id.bmi);
        hint = (TextView) findViewById(R.id.hint);

        buttonC.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                strWeight = weightValue.getText().toString();
                strHeight = heightValue.getText().toString();
                floatWeight = Float.parseFloat(strWeight);
                floatHeight = Float.parseFloat(strHeight)/100;
                calBmi = floatWeight/(floatHeight*floatHeight);
                strBmi = String.valueOf(calBmi);
                bmi.setText(strBmi);
                if(calBmi <= 18.5){
                    hint.setText("อยู่ในสภาวะ น้ำหนักน้อย ควร รับประทานอาหารให้มากขึ้น");
                }
                else if(calBmi > 18.5 && calBmi <= 22.9){
                    hint.setText("อยู่ในสภาวะ ปกติ ควร ดูแลสุขภาพให้อยู่ในระดับนี้");
                }
                else if(calBmi > 22.9 && calBmi <= 24.9){
                    hint.setText("อยู่ในสภาวะ ท้สม ควร รับประทานอาหารและออกกำลังกาย");
                }
                else if(calBmi > 24.9 && calBmi <= 29.9){
                    hint.setText("อยู่ในสภาวะ อ้วน ควร รับประทานอาหารให้น้อยลงและออกกำลังกายอย่างสม่ำเสมอ");
                }
                else if(calBmi > 29.9){
                    hint.setText("อยู่ในสภาวะ อ้วนมาก ควร พบแพทย์");
                }
            }
        });

        /*buttonAdd.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                if (crunchifyEditText == null) {
                    crunchifyEditText.setText("");
                } else {
                    mValueOne = Float.parseFloat(crunchifyEditText.getText() + "");
                    crunchifyAddition = true;
                    crunchifyEditText.setText(null);
                }
            }
        });

        buttonSub.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mValueOne = Float.parseFloat(crunchifyEditText.getText() + "");
                mSubtract = true;
                crunchifyEditText.setText(null);
            }
        });

        buttonMul.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mValueOne = Float.parseFloat(crunchifyEditText.getText() + "");
                crunchifyMultiplication = true;
                crunchifyEditText.setText(null);
            }
        });

        buttonDivision.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mValueOne = Float.parseFloat(crunchifyEditText.getText() + "");
                crunchifyDivision = true;
                crunchifyEditText.setText(null);
            }
        });

        buttonEqual.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mValueTwo = Float.parseFloat(crunchifyEditText.getText() + "");

                if (crunchifyAddition == true) {
                    crunchifyEditText.setText(mValueOne + mValueTwo + "");
                    crunchifyAddition = false;
                }

                if (mSubtract == true) {
                    crunchifyEditText.setText(mValueOne - mValueTwo + "");
                    mSubtract = false;
                }

                if (crunchifyMultiplication == true) {
                    crunchifyEditText.setText(mValueOne * mValueTwo + "");
                    crunchifyMultiplication = false;
                }

                if (crunchifyDivision == true) {
                    crunchifyEditText.setText(mValueOne / mValueTwo + "");
                    crunchifyDivision = false;
                }
            }
        });*/

    }
}
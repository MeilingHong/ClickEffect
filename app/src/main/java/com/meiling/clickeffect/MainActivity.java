package com.meiling.clickeffect;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.MotionEvent;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.ScrollView;
import android.widget.TextView;

import butterknife.BindView;
import butterknife.ButterKnife;

public class MainActivity extends AppCompatActivity {


    @BindView(R.id.linearLayout)
    LinearLayout linearLayout;
    @BindView(R.id.view)
    View view;
    @BindView(R.id.textView)
    TextView textView;
    @BindView(R.id.buttonButtonAttribute)
    Button buttonButtonAttribute;
    @BindView(R.id.buttonBackgroundAttribute)
    Button buttonBackgroundAttribute;
    @BindView(R.id.imageBackgroundAttribute)
    ImageView imageBackgroundAttribute;
    @BindView(R.id.imageButtonBackgroundAttribute)
    ImageButton imageButtonBackgroundAttribute;
    @BindView(R.id.radioButton)
    RadioButton radioButton;
    @BindView(R.id.radioGroup)
    RadioGroup radioGroup;
    @BindView(R.id.checkBox)
    CheckBox checkBox;
    @BindView(R.id.allContainer)
    LinearLayout allContainer;
    @BindView(R.id.layoutRoot)
    ScrollView layoutRoot;




    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ButterKnife.bind(this);

        setImageView();
        imageButtonBackgroundAttribute.setEnabled(false);
    }


    public void initValue() {

    }

    public void setLayout() {
    }

    public void setView() {
    }

    public void setTextView() {
    }

    public void setButton() {
    }

    public void setImageView(){
        //TODO 仅针对xml 中设置src属性有效，设置background属性无效
//        imageBackgroundAttribute.setImageResource(R.drawable.effection);//TODO 可以使用这个代码使之生效---当设置了这个属性时，这个才能生效
//        imageBackgroundAttribute.setBackgroundResource(R.drawable.effection);//TODO 若两个都设置了，则能看到效果

        imageBackgroundAttribute.setBackgroundResource(R.drawable.effection);//TODO 仅设置background，无效果

        imageBackgroundAttribute.setOnTouchListener(new View.OnTouchListener() {
            @Override
            public boolean onTouch(View v, MotionEvent event) {
                switch (event.getAction()) {
                    case MotionEvent.ACTION_DOWN:
                        imageBackgroundAttribute.setColorFilter(0x99000000);
                        return true;
                    case MotionEvent.ACTION_UP:
                    case MotionEvent.ACTION_CANCEL:
                        imageBackgroundAttribute.setColorFilter(null);
                        break;
                }
                return imageBackgroundAttribute.onTouchEvent(event);
            }
        });
    }

}

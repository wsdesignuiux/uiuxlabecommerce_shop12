package com.wolfsoft.uiuxlabecommercescreen12;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

public class Screen12 extends AppCompatActivity implements View.OnClickListener{

    LinearLayout linear1,linear2,linear3,linear4,linear5,linear6,linear7,linear8;
    View u_line1,u_line2,u_line3,u_line4,u_line5,u_line6,u_line7,u_line8;
    View d_line1,d_line2,d_line3,d_line4,d_line5,d_line6,d_line7,d_line8;
    TextView size_text1,size_text2,size_text3,size_text4,size_text5,size_text6,size_text7,size_text8;


    ImageView dot1,dot2,dot3,dot4,dot5,dot6,dot7,dot8;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_screen12);

        linear1 = findViewById(R.id.x1_linear);
        linear2 = findViewById(R.id.xl_linear);
        linear3 = findViewById(R.id.s_linear);
        linear4 = findViewById(R.id.xs_linear);
        linear5 = findViewById(R.id.xl1_linear);
        linear6 = findViewById(R.id.xx_linear);
        linear7 = findViewById(R.id.l_linear);
        linear8 = findViewById(R.id.sl_linear);

        u_line1 = findViewById(R.id.x1_view_up);
        u_line2 = findViewById(R.id.xl_view_up);
        u_line3 = findViewById(R.id.s_view_up);
        u_line4 = findViewById(R.id.xs_view_up);
        u_line5 = findViewById(R.id.xl1_view_up);
        u_line6 = findViewById(R.id.xx_view_up);
        u_line7 = findViewById(R.id.l_view_up);
        u_line8 = findViewById(R.id.sl_view_up);

        d_line1 = findViewById(R.id.x1_view_down);
        d_line2 = findViewById(R.id.xl_view_down);
        d_line3 = findViewById(R.id.s_view_down);
        d_line4 = findViewById(R.id.xs_view_down);
        d_line5 = findViewById(R.id.xl1_view_down);
        d_line6 = findViewById(R.id.xx_view_down);
        d_line7 = findViewById(R.id.l_view_down);
        d_line8 = findViewById(R.id.sl_view_down);

        size_text1 = findViewById(R.id.x1_text);
        size_text2 = findViewById(R.id.xl_text);
        size_text3 = findViewById(R.id.s_text);
        size_text4 = findViewById(R.id.xs_text);
        size_text5 = findViewById(R.id.xl1_text);
        size_text6 = findViewById(R.id.xx_text);
        size_text7 = findViewById(R.id.l_text);
        size_text8 = findViewById(R.id.sl_text);


        dot1=findViewById(R.id.dot1);
        dot2=findViewById(R.id.dot2);
        dot3=findViewById(R.id.dot3);
        dot4=findViewById(R.id.dot4);
        dot5=findViewById(R.id.dot5);
        dot6=findViewById(R.id.dot6);
        dot7=findViewById(R.id.dot7);
        dot8=findViewById(R.id.dot8);


        dot1.setOnClickListener(this);
        dot2.setOnClickListener(this);
        dot3.setOnClickListener(this);
        dot4.setOnClickListener(this);
        dot5.setOnClickListener(this);
        dot6.setOnClickListener(this);
        dot7.setOnClickListener(this);
        dot8.setOnClickListener(this);


        linear1.setOnClickListener(this);
        linear2.setOnClickListener(this);
        linear3.setOnClickListener(this);
        linear4.setOnClickListener(this);
        linear5.setOnClickListener(this);
        linear6.setOnClickListener(this);
        linear7.setOnClickListener(this);
        linear8.setOnClickListener(this);


    }

    @Override
    public void onClick(View view) {
        switch (view.getId()) {

            case R.id.x1_linear:
                u_line1.setVisibility(View.VISIBLE);
                d_line1.setVisibility(View.VISIBLE);
                size_text1.setTextSize(18);

                u_line2.setVisibility(View.INVISIBLE);
                d_line2.setVisibility(View.INVISIBLE);
                size_text2.setTextSize(10);

                u_line3.setVisibility(View.INVISIBLE);
                d_line3.setVisibility(View.INVISIBLE);
                size_text3.setTextSize(10);

                u_line4.setVisibility(View.INVISIBLE);
                d_line4.setVisibility(View.INVISIBLE);
                size_text4.setTextSize(10);

                u_line5.setVisibility(View.INVISIBLE);
                d_line5.setVisibility(View.INVISIBLE);
                size_text5.setTextSize(10);

                u_line6.setVisibility(View.INVISIBLE);
                d_line6.setVisibility(View.INVISIBLE);
                size_text6.setTextSize(10);

                u_line7.setVisibility(View.INVISIBLE);
                d_line7.setVisibility(View.INVISIBLE);
                size_text7.setTextSize(10);

                u_line8.setVisibility(View.INVISIBLE);
                d_line8.setVisibility(View.INVISIBLE);
                size_text8.setTextSize(10);

                break;

            case R.id.xl_linear:
                u_line1.setVisibility(View.INVISIBLE);
                d_line1.setVisibility(View.INVISIBLE);
                size_text1.setTextSize(10);

                u_line2.setVisibility(View.VISIBLE);
                d_line2.setVisibility(View.VISIBLE);
                size_text2.setTextSize(18);

                u_line3.setVisibility(View.INVISIBLE);
                d_line3.setVisibility(View.INVISIBLE);
                size_text3.setTextSize(10);

                u_line4.setVisibility(View.INVISIBLE);
                d_line4.setVisibility(View.INVISIBLE);
                size_text4.setTextSize(10);

                u_line5.setVisibility(View.INVISIBLE);
                d_line5.setVisibility(View.INVISIBLE);
                size_text5.setTextSize(10);


                u_line6.setVisibility(View.INVISIBLE);
                d_line6.setVisibility(View.INVISIBLE);
                size_text6.setTextSize(10);

                u_line7.setVisibility(View.INVISIBLE);
                d_line7.setVisibility(View.INVISIBLE);
                size_text7.setTextSize(10);

                u_line8.setVisibility(View.INVISIBLE);
                d_line8.setVisibility(View.INVISIBLE);
                size_text8.setTextSize(10);


                break;


            case R.id.s_linear:
                u_line1.setVisibility(View.INVISIBLE);
                d_line1.setVisibility(View.INVISIBLE);
                size_text1.setTextSize(10);

                u_line2.setVisibility(View.INVISIBLE);
                d_line2.setVisibility(View.INVISIBLE);
                size_text2.setTextSize(10);

                u_line3.setVisibility(View.VISIBLE);
                d_line3.setVisibility(View.VISIBLE);
                size_text3.setTextSize(18);

                u_line4.setVisibility(View.INVISIBLE);
                d_line4.setVisibility(View.INVISIBLE);
                size_text4.setTextSize(10);

                u_line5.setVisibility(View.INVISIBLE);
                d_line5.setVisibility(View.INVISIBLE);
                size_text5.setTextSize(10);


                u_line6.setVisibility(View.INVISIBLE);
                d_line6.setVisibility(View.INVISIBLE);
                size_text6.setTextSize(10);

                u_line7.setVisibility(View.INVISIBLE);
                d_line7.setVisibility(View.INVISIBLE);
                size_text7.setTextSize(10);

                u_line8.setVisibility(View.INVISIBLE);
                d_line8.setVisibility(View.INVISIBLE);
                size_text8.setTextSize(10);


                break;

            case R.id.xs_linear:
                u_line1.setVisibility(View.INVISIBLE);
                d_line1.setVisibility(View.INVISIBLE);
                size_text1.setTextSize(10);

                u_line2.setVisibility(View.INVISIBLE);
                d_line2.setVisibility(View.INVISIBLE);
                size_text2.setTextSize(10);

                u_line3.setVisibility(View.INVISIBLE);
                d_line3.setVisibility(View.INVISIBLE);
                size_text3.setTextSize(10);

                u_line4.setVisibility(View.VISIBLE);
                d_line4.setVisibility(View.VISIBLE);
                size_text4.setTextSize(18);

                u_line5.setVisibility(View.INVISIBLE);
                d_line5.setVisibility(View.INVISIBLE);
                size_text5.setTextSize(10);


                u_line6.setVisibility(View.INVISIBLE);
                d_line6.setVisibility(View.INVISIBLE);
                size_text6.setTextSize(10);

                u_line7.setVisibility(View.INVISIBLE);
                d_line7.setVisibility(View.INVISIBLE);
                size_text7.setTextSize(10);

                u_line8.setVisibility(View.INVISIBLE);
                d_line8.setVisibility(View.INVISIBLE);
                size_text8.setTextSize(10);


                break;

            case R.id.xl1_linear:
                u_line1.setVisibility(View.INVISIBLE);
                d_line1.setVisibility(View.INVISIBLE);
                size_text1.setTextSize(10);

                u_line2.setVisibility(View.INVISIBLE);
                d_line2.setVisibility(View.INVISIBLE);
                size_text2.setTextSize(10);

                u_line3.setVisibility(View.INVISIBLE);
                d_line3.setVisibility(View.INVISIBLE);
                size_text3.setTextSize(10);

                u_line4.setVisibility(View.INVISIBLE);
                d_line4.setVisibility(View.INVISIBLE);
                size_text4.setTextSize(10);

                u_line5.setVisibility(View.VISIBLE);
                d_line5.setVisibility(View.VISIBLE);
                size_text5.setTextSize(18);


                u_line6.setVisibility(View.INVISIBLE);
                d_line6.setVisibility(View.INVISIBLE);
                size_text6.setTextSize(10);

                u_line7.setVisibility(View.INVISIBLE);
                d_line7.setVisibility(View.INVISIBLE);
                size_text7.setTextSize(10);

                u_line8.setVisibility(View.INVISIBLE);
                d_line8.setVisibility(View.INVISIBLE);
                size_text8.setTextSize(10);


                break;

            case R.id.xx_linear:
                u_line1.setVisibility(View.INVISIBLE);
                d_line1.setVisibility(View.INVISIBLE);
                size_text1.setTextSize(10);

                u_line2.setVisibility(View.INVISIBLE);
                d_line2.setVisibility(View.INVISIBLE);
                size_text2.setTextSize(10);

                u_line3.setVisibility(View.INVISIBLE);
                d_line3.setVisibility(View.INVISIBLE);
                size_text3.setTextSize(10);

                u_line4.setVisibility(View.INVISIBLE);
                d_line4.setVisibility(View.INVISIBLE);
                size_text4.setTextSize(10);

                u_line5.setVisibility(View.INVISIBLE);
                d_line5.setVisibility(View.INVISIBLE);
                size_text5.setTextSize(10);


                u_line6.setVisibility(View.VISIBLE);
                d_line6.setVisibility(View.VISIBLE);
                size_text6.setTextSize(18);

                u_line7.setVisibility(View.INVISIBLE);
                d_line7.setVisibility(View.INVISIBLE);
                size_text7.setTextSize(10);

                u_line8.setVisibility(View.INVISIBLE);
                d_line8.setVisibility(View.INVISIBLE);
                size_text8.setTextSize(10);


                break;

            case R.id.l_linear:
                u_line1.setVisibility(View.INVISIBLE);
                d_line1.setVisibility(View.INVISIBLE);
                size_text1.setTextSize(10);

                u_line2.setVisibility(View.INVISIBLE);
                d_line2.setVisibility(View.INVISIBLE);
                size_text2.setTextSize(10);

                u_line3.setVisibility(View.INVISIBLE);
                d_line3.setVisibility(View.INVISIBLE);
                size_text3.setTextSize(10);

                u_line4.setVisibility(View.INVISIBLE);
                d_line4.setVisibility(View.INVISIBLE);
                size_text4.setTextSize(10);

                u_line5.setVisibility(View.INVISIBLE);
                d_line5.setVisibility(View.INVISIBLE);
                size_text5.setTextSize(10);

                u_line6.setVisibility(View.INVISIBLE);
                d_line6.setVisibility(View.INVISIBLE);
                size_text6.setTextSize(10);

                u_line7.setVisibility(View.VISIBLE);
                d_line7.setVisibility(View.VISIBLE);
                size_text7.setTextSize(18);

                u_line8.setVisibility(View.INVISIBLE);
                d_line8.setVisibility(View.INVISIBLE);
                size_text8.setTextSize(10);
                break;

            case R.id.sl_linear:
                u_line1.setVisibility(View.INVISIBLE);
                d_line1.setVisibility(View.INVISIBLE);
                size_text1.setTextSize(10);

                u_line2.setVisibility(View.INVISIBLE);
                d_line2.setVisibility(View.INVISIBLE);
                size_text2.setTextSize(10);

                u_line3.setVisibility(View.INVISIBLE);
                d_line3.setVisibility(View.INVISIBLE);
                size_text3.setTextSize(10);

                u_line4.setVisibility(View.INVISIBLE);
                d_line4.setVisibility(View.INVISIBLE);
                size_text4.setTextSize(10);

                u_line5.setVisibility(View.INVISIBLE);
                d_line5.setVisibility(View.INVISIBLE);
                size_text5.setTextSize(10);

                u_line6.setVisibility(View.INVISIBLE);
                d_line6.setVisibility(View.INVISIBLE);
                size_text6.setTextSize(10);

                u_line7.setVisibility(View.INVISIBLE);
                d_line7.setVisibility(View.INVISIBLE);
                size_text7.setTextSize(10);

                u_line8.setVisibility(View.VISIBLE);
                d_line8.setVisibility(View.VISIBLE);
                size_text8.setTextSize(18);


                break;

            case R.id.dot1:

                dot1.setImageResource(R.drawable.ic_radio_oval1);
                dot2.setImageResource(R.drawable.oval2);
                dot3.setImageResource(R.drawable.oval3);
                dot4.setImageResource(R.drawable.oval4);
                dot5.setImageResource(R.drawable.oval5);
                dot6.setImageResource(R.drawable.oval6);
                dot7.setImageResource(R.drawable.oval7);
                dot8.setImageResource(R.drawable.oval8);

                break;

            case R.id.dot2:
                dot1.setImageResource(R.drawable.oval1);
                dot2.setImageResource(R.drawable.ic_radio_oval2);
                dot3.setImageResource(R.drawable.oval3);
                dot4.setImageResource(R.drawable.oval4);
                dot5.setImageResource(R.drawable.oval5);
                dot6.setImageResource(R.drawable.oval6);
                dot7.setImageResource(R.drawable.oval7);
                dot8.setImageResource(R.drawable.oval8);

                break;

            case R.id.dot3:
                dot1.setImageResource(R.drawable.oval1);
                dot2.setImageResource(R.drawable.oval2);
                dot3.setImageResource(R.drawable.ic_radio_oval3);
                dot4.setImageResource(R.drawable.oval4);
                dot5.setImageResource(R.drawable.oval5);
                dot6.setImageResource(R.drawable.oval6);
                dot7.setImageResource(R.drawable.oval7);
                dot8.setImageResource(R.drawable.oval8);

                break;

            case R.id.dot4:
                dot1.setImageResource(R.drawable.oval1);
                dot2.setImageResource(R.drawable.oval2);
                dot3.setImageResource(R.drawable.oval3);
                dot4.setImageResource(R.drawable.ic_radio_oval4);
                dot5.setImageResource(R.drawable.oval5);
                dot6.setImageResource(R.drawable.oval6);
                dot7.setImageResource(R.drawable.oval7);
                dot8.setImageResource(R.drawable.oval8);

                break;

            case R.id.dot5:
                dot1.setImageResource(R.drawable.oval1);
                dot2.setImageResource(R.drawable.oval2);
                dot3.setImageResource(R.drawable.oval3);
                dot4.setImageResource(R.drawable.oval4);
                dot5.setImageResource(R.drawable.ic_radio_oval5);
                dot6.setImageResource(R.drawable.oval6);
                dot7.setImageResource(R.drawable.oval7);
                dot8.setImageResource(R.drawable.oval8);
                break;

            case R.id.dot6:
                dot1.setImageResource(R.drawable.oval1);
                dot2.setImageResource(R.drawable.oval2);
                dot3.setImageResource(R.drawable.oval3);
                dot4.setImageResource(R.drawable.oval4);
                dot5.setImageResource(R.drawable.oval5);
                dot6.setImageResource(R.drawable.ic_radio_oval6);
                dot7.setImageResource(R.drawable.oval7);
                dot8.setImageResource(R.drawable.oval8);
                break;
            case R.id.dot7:
                dot1.setImageResource(R.drawable.oval1);
                dot2.setImageResource(R.drawable.oval2);
                dot3.setImageResource(R.drawable.oval3);
                dot4.setImageResource(R.drawable.oval4);
                dot5.setImageResource(R.drawable.oval5);
                dot6.setImageResource(R.drawable.oval6);
                dot7.setImageResource(R.drawable.ic_radio_oval7);
                dot8.setImageResource(R.drawable.oval8);
                break;

            case R.id.dot8:
                dot1.setImageResource(R.drawable.oval1);
                dot2.setImageResource(R.drawable.oval2);
                dot3.setImageResource(R.drawable.oval3);
                dot4.setImageResource(R.drawable.oval4);
                dot5.setImageResource(R.drawable.oval5);
                dot6.setImageResource(R.drawable.oval6);
                dot7.setImageResource(R.drawable.oval7);
                dot8.setImageResource(R.drawable.ic_radio_oval8);
                break;

        }


    }
}

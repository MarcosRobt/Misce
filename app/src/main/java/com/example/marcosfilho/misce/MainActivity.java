package com.example.marcosfilho.misce;

import android.animation.ObjectAnimator;
import android.graphics.drawable.Drawable;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.Layout;
import android.view.LayoutInflater;
import android.view.View;
import android.view.animation.AccelerateInterpolator;
import android.view.animation.AlphaAnimation;
import android.view.animation.Animation;
import android.view.animation.DecelerateInterpolator;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;


public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }


    public void register(View view){

        View layoutLogin = this.findViewById(R.id.layout_login);
        View layoutRegister = this.findViewById(R.id.layout_register);
        ImageView imageBottomReg = this.findViewById(R.id.imageBottomReg);
        ImageView imageBottomLog = this.findViewById(R.id.imageBottomLog);
        TextView logo = this.findViewById(R.id.textView);


        layoutRegister.setVisibility(View.VISIBLE);

        ObjectAnimator animOut = ObjectAnimator.ofFloat(layoutLogin, "Alpha", 1, 0);
        animOut.setDuration(100);
        animOut.start();

        ObjectAnimator animOutLogo = ObjectAnimator.ofFloat(logo, "Alpha", 1, 0);
        animOutLogo.setDuration(1000);
        animOutLogo.start();
        logo.setVisibility(View.GONE);

        ObjectAnimator animIn = ObjectAnimator.ofFloat(layoutRegister, "Alpha", 0, 1 );
        animIn.setDuration(1000);
        animIn.start();

        imageBottomReg.setBackgroundResource(R.drawable.bar_rounded_focus);
        imageBottomLog.setBackgroundResource(R.drawable.bar_rounded_unfocus);


    }

    public void login(View view){

        View layoutRegister = this.findViewById(R.id.layout_register);
        View layoutLogin = this.findViewById(R.id.layout_login);
        ImageView imageBottomReg = this.findViewById(R.id.imageBottomReg);
        ImageView imageBottomLog = this.findViewById(R.id.imageBottomLog);
        TextView logo = this.findViewById(R.id.textView);

        ObjectAnimator animOut = ObjectAnimator.ofFloat(layoutRegister, "Alpha", 1, 0);
        animOut.setDuration(100);
        animOut.start();

        ObjectAnimator animIn = ObjectAnimator.ofFloat(layoutLogin, "Alpha", 0, 1 );
        animIn.setDuration(1000);
        animIn.start();

        ObjectAnimator animOutLogo = ObjectAnimator.ofFloat(logo, "Alpha", 0, 1 );
        animOutLogo.setDuration(1000);
        animOutLogo.start();
        logo.setVisibility(View.VISIBLE);

        imageBottomReg.setBackgroundResource(R.drawable.bar_rounded_unfocus);
        imageBottomLog.setBackgroundResource(R.drawable.bar_rounded_focus);

    }
}

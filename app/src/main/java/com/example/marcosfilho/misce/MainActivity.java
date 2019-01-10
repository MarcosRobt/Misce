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


public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }


    public void register(View view){

        View layoutLogin = this.findViewById(R.id.layout_login);
        ImageView imageBottomReg = this.findViewById(R.id.imageBottomReg);
        ImageView imageBottomLog = this.findViewById(R.id.imageBottomLog);

        ObjectAnimator anim = ObjectAnimator.ofFloat(layoutLogin, "Alpha", 1, 0);
        anim.setDuration(300);
        anim.start();

        imageBottomReg.setBackgroundResource(R.drawable.bar_rounded_focus);
        imageBottomLog.setBackgroundResource(R.drawable.bar_rounded_unfocus);


    }

    public void login(View view){

        View layoutLogin = this.findViewById(R.id.layout_login);
        ImageView imageBottomReg = this.findViewById(R.id.imageBottomReg);
        ImageView imageBottomLog = this.findViewById(R.id.imageBottomLog);

        ObjectAnimator anim = ObjectAnimator.ofFloat(layoutLogin, "Alpha", 0, 1 );
        anim.setDuration(300);
        anim.start();

        layoutLogin.setVisibility(View.VISIBLE );
        imageBottomReg.setBackgroundResource(R.drawable.bar_rounded_unfocus);
        imageBottomLog.setBackgroundResource(R.drawable.bar_rounded_focus);

    }
}

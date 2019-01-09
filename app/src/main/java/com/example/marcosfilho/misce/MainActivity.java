package com.example.marcosfilho.misce;

import android.graphics.drawable.Drawable;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.animation.AccelerateInterpolator;
import android.view.animation.AlphaAnimation;
import android.view.animation.Animation;
import android.view.animation.DecelerateInterpolator;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;

import static com.example.marcosfilho.misce.R.id.btnLogin;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }


    public void register(View view){

        Animation fadeOut = new AlphaAnimation(1, 0);
        fadeOut.setInterpolator(new AccelerateInterpolator()); //and this
        fadeOut.setStartOffset(1000);
        fadeOut.setDuration(1000);

        EditText user = this.findViewById(R.id.user);
        EditText password = this.findViewById(R.id.password);
        Button btnLogin = this.findViewById(R.id.btnLogin);
        ImageView imageBottomReg = this.findViewById(R.id.imageBottomReg);
        ImageView imageBottomLog = this.findViewById(R.id.imageBottomLog);

        user.setAnimation(fadeOut);
        password.setAnimation(fadeOut);
        btnLogin.setAnimation(fadeOut);
        imageBottomReg.setBackgroundResource(R.drawable.bar_rounded_focus);
        imageBottomLog.setBackgroundResource(R.drawable.bar_rounded_unfocus);


    }

    public void login(View view){

        Animation fadeIn = new AlphaAnimation(0, 1);
        fadeIn.setInterpolator(new DecelerateInterpolator()); //add this
        fadeIn.setDuration(1000);

        EditText user = this.findViewById(R.id.user);
        EditText password = this.findViewById(R.id.password);
        Button btnLogin = this.findViewById(R.id.btnLogin);
        ImageView imageBottomReg = this.findViewById(R.id.imageBottomReg);
        ImageView imageBottomLog = this.findViewById(R.id.imageBottomLog);

        user.setVisibility(View.VISIBLE);
        password.setVisibility(View.VISIBLE);
        btnLogin.setVisibility(View.VISIBLE);
        imageBottomReg.setBackgroundResource(R.drawable.bar_rounded_unfocus);
        imageBottomLog.setBackgroundResource(R.drawable.bar_rounded_focus);

    }
}

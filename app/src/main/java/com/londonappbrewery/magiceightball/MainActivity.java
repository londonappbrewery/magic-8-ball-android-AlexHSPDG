package com.londonappbrewery.magiceightball;


import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;


import java.lang.reflect.Array;
import java.util.Random;
import java.util.Set;

public class MainActivity extends Activity{

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final ImageView ballDisplay = findViewById(R.id.image_eightBall);

        final int[] ballArray = {R.drawable.ball1, R.drawable.ball2, R.drawable.ball3, R.drawable.ball4,
                R.drawable.ball5};
        Button myButton = findViewById(R.id.askButton);

        View.OnClickListener myClickListener = new View.OnClickListener() {
            @Override
            public void onClick(View view)
            {
                Random randomNumberGenerator = new Random();
                int number = randomNumberGenerator.nextInt(5);

                //récupérer un int correspondant au nombre généré
                int imageId = ballArray[number];

                //Afiicher l'image qui correspond à imageId
                ballDisplay.setImageResource(imageId);
            }
        };
        myButton.setOnClickListener(myClickListener);
    }
}

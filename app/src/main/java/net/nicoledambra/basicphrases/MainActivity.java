package net.nicoledambra.basicphrases;

import android.content.res.Resources;
import android.media.MediaPlayer;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {


    int[] spanishPhrases = {R.raw.hablasingles,
            R.raw.buenasnoches,
            R.raw.buenosdias,
            R.raw.comoestas,
            R.raw.yosoyde,
            R.raw.mellamo,
            R.raw.porfavor,
            R.raw.bienvenidos};

    public void playPhrase(View view) {
        Button button = (Button) view;
        int phraseButton = Integer.parseInt(button.getTag().toString());

        Log.i("Button", phraseButton + " button was pressed");
        MediaPlayer mediaPlayer = MediaPlayer.create(this, spanishPhrases[phraseButton]);
        mediaPlayer.start();

    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
}

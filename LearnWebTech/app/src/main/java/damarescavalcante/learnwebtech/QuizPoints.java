package damarescavalcante.learnwebtech;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.support.v7.app.AppCompatActivity;
import android.widget.TextView;

/**
 * Created by damarescavalcante on 19/03/16.
 */
public class QuizPoints extends AppCompatActivity {

    private TextView messageFinal;
    private TextView pointsFinal;

    protected void onCreate(Bundle savedStateInstance){
        super.onCreate(savedStateInstance);
        setContentView(R.layout.quiz_points);

        Intent intent = getIntent();
        Bundle extras = intent.getExtras();

        if(extras.containsKey("POINTS")) {

            if (Integer.parseInt(extras.getString("POINTS")) <= 3) {

                messageFinal = (TextView) findViewById(R.id.lbl_message_final);
                messageFinal.setText("Oh! It was not so bad!");

                pointsFinal = (TextView) findViewById(R.id.lbl_points_final);
                pointsFinal.setText(extras.getString("POINTS"));

            } else if (Integer.parseInt(extras.getString("POINTS")) > 3 && Integer.parseInt(extras.getString("POINTS")) <= 5) {

                messageFinal = (TextView) findViewById(R.id.lbl_message_final);
                messageFinal.setText("Oh! Was good!");

                pointsFinal = (TextView) findViewById(R.id.lbl_points_final);
                pointsFinal.setText(extras.getString("POINTS"));

            } else if (Integer.parseInt(extras.getString("POINTS")) > 5 && Integer.parseInt(extras.getString("POINTS")) <= 7) {

                messageFinal = (TextView) findViewById(R.id.lbl_message_final);
                messageFinal.setText("Oh! Congratulations, you was well");

                pointsFinal = (TextView) findViewById(R.id.lbl_points_final);
                pointsFinal.setText(extras.getString("POINTS"));

            } else if (Integer.parseInt(extras.getString("POINTS")) > 7 && Integer.parseInt(extras.getString("POINTS")) <= 10) {

                messageFinal = (TextView) findViewById(R.id.lbl_message_final);
                messageFinal.setText("Oh yeeeh! Congratulations, you was very well!");

                pointsFinal = (TextView) findViewById(R.id.lbl_points_final);
                pointsFinal.setText(extras.getString("POINTS"));
            }

        }


    }

}

package damarescavalcante.learnwebtech;

import android.content.Intent;
import android.os.Bundle;
import android.os.Looper;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View;
import android.widget.RadioButton;
import android.widget.Toast;
import android.os.Handler;

/**
 * Created by damarescavalcante on 19/03/16.
 */
public class QuizHtmlQuestion2 extends AppCompatActivity{

    private int pointsHtml = 0;
    private RadioButton radioButton1;
    private RadioButton radioButton2;
    private Handler handler = new Handler();

    protected void onCreate(Bundle savedStateInstance){
        super.onCreate(savedStateInstance);
        setContentView(R.layout.quiz_html_question2);
    }


    public void continueQuiz(View view){

        radioButton1 = (RadioButton)findViewById(R.id.quiz_html_option2_1);
        radioButton2 = (RadioButton)findViewById(R.id.quiz_html_option2_2);

        Intent intent = getIntent();
        Bundle extras = intent.getExtras();

        if(extras.containsKey("POINTS")) {
            pointsHtml = Integer.parseInt(extras.getString("POINTS"));
            Log.v("pointsextra: ", "" + pointsHtml);

            if(!radioButton1.isChecked() && !radioButton2.isChecked()){
                Toast.makeText(getApplicationContext(), "Please select radio button!", Toast.LENGTH_SHORT).show();
            }
            else{

                if(radioButton1.isChecked()){
                    pointsHtml = pointsHtml + 1;
                }else{
                    pointsHtml = pointsHtml + 0;
                }

                Log.v("points quiz 2: ", "" + pointsHtml);
                intent = new Intent(this, QuizHtmlQuestion3.class);
                intent.putExtra("POINTS", ""+pointsHtml);
                startActivity(intent);
            }

        }
    }

}

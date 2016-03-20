package damarescavalcante.learnwebtech;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View;
import android.widget.RadioButton;
import android.widget.TextView;
import android.widget.Toast;

/**
 * Created by damarescavalcante on 18/03/16.
 */
public class QuizHtmlQuestion1 extends AppCompatActivity{

    private int pointsHtml = 0;
    private RadioButton radioButton1;
    private RadioButton radioButton2;

    protected void onCreate(Bundle savedStateInstance){
        super.onCreate(savedStateInstance);
        setContentView(R.layout.quiz_html_question1);
    }

    public void continueQuiz(View view){
        radioButton1 = (RadioButton)findViewById(R.id.quiz_html_option1_1);
        radioButton2 = (RadioButton)findViewById(R.id.quiz_html_option1_2);

        if(!radioButton1.isChecked() && !radioButton2.isChecked()){
            Toast.makeText(getApplicationContext(), "Please select radio button!", Toast.LENGTH_SHORT).show();
        }
        else{
            if(radioButton1.isChecked()){
                pointsHtml = pointsHtml + 1;
            }else{
                pointsHtml = pointsHtml + 0;
            }

            Log.v("points quiz 1: ", "" + pointsHtml);

            Intent intent = new Intent(this, QuizHtmlQuestion2.class);
            intent.putExtra("POINTS", ""+pointsHtml);
            startActivity(intent);
        }
    }

}

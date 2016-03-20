package damarescavalcante.learnwebtech;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View;
import android.widget.RadioButton;
import android.widget.Toast;

/**
 * Created by damarescavalcante on 19/03/16.
 */
public class QuizHtmlQuestion7 extends AppCompatActivity {


    private int pointsHtml = 0;
    private RadioButton radioButton1;
    private RadioButton radioButton2;

    protected void onCreate(Bundle savedStateInstance){
        super.onCreate(savedStateInstance);
        setContentView(R.layout.quiz_html_question7);
    }

    public void continueQuiz(View view){

        radioButton1 = (RadioButton)findViewById(R.id.quiz_html_option7_1);
        radioButton2 = (RadioButton)findViewById(R.id.quiz_html_option7_2);

        Intent intent = getIntent();
        Bundle extras = intent.getExtras();

        if(extras.containsKey("POINTS")) {
            pointsHtml = Integer.parseInt(extras.getString("POINTS"));
            Log.v("pointsextra: ", "" + pointsHtml);

            if(!radioButton1.isChecked() && !radioButton2.isChecked()){
                Toast.makeText(getApplicationContext(), "Please select radio button!", Toast.LENGTH_SHORT).show();
            }
            else{

                if(radioButton2.isChecked()){
                    pointsHtml = pointsHtml + 1;
                }else{
                    pointsHtml = pointsHtml + 0;
                }

                Log.v("points quiz 7: ", "" + pointsHtml);
                intent = new Intent(this, QuizHtmlQuestion8.class);
                intent.putExtra("POINTS", ""+pointsHtml);
                startActivity(intent);
            }

        }
    }

}

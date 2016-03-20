package damarescavalcante.learnwebtech;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

/**
 * Created by damarescavalcante on 17/03/16.
 */
public class LayoutFinalHtml extends AppCompatActivity{

    protected void onCreate(Bundle savedStateInstance){
        super.onCreate(savedStateInstance);
        setContentView(R.layout.layout_final_html);
    }

    public void startAnotherActivity(View view){
        Intent intent = new Intent(this, QuizHtmlQuestion1.class);
        startActivity(intent);
    }
}

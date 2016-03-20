package damarescavalcante.learnwebtech;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.content.Intent;
import android.widget.Button;
import android.util.Log;

/**
 * Created by damarescavalcante on 16/03/16.
 */
public class LayoutAboutApp extends AppCompatActivity{



    protected void onCreate(Bundle savedStateInstance){
        super.onCreate(savedStateInstance);
        setContentView(R.layout.layout_about_app);
    }



    public void startAnotherActivity(View view){

        if(view.getId() == R.id.btnHtml){

            startHtmlActivity(view);

        }else{
            Log.v("test method", "the startAnotherActivity method fail");
        }

    }

    /* methods privates for inicialization acitivty */

    private void startHtmlActivity(View view) {
        Intent intent = new Intent(this, LayoutFinalHtml.class);
        startActivity(intent);
    }


}

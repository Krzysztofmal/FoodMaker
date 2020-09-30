package whattoeat.food.inmyfridge;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.view.WindowManager;
import android.widget.EditText;
import android.widget.TextView;

public class AddingNewRecipe extends AppCompatActivity {

    //private EditText etTitle;
    private TextView etTitle;
    private TextView etDescription;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_adding_new_recipe);

        //clear focus ?
        etTitle = (TextView) findViewById(R.id.etTitle);
        etDescription = (TextView) findViewById(R.id.etDescription);




    }


}
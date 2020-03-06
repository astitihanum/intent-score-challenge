package id.putraprima.skorbola;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

import androidx.appcompat.app.AppCompatActivity;

public class ScorerActivity extends AppCompatActivity {
    EditText scorer;

    public static final String SCORER_KEY="scorer";
    public static final String ADD_KEY = "add";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_scorer);
        scorer = findViewById(R.id.scorerNameInput);

    }

    public void handleAddScore(View view) {
        Intent intent = new Intent();
        intent.putExtra(ADD_KEY, scorer.getText().toString());
        setResult(RESULT_OK, intent);
        finish();
    }
}

package cafecod.com.barfind;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

import com.google.firebase.auth.FirebaseAuth;

public class SecondBarUserPage extends AppCompatActivity {

    private FirebaseAuth mAuth;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second_bar_user_page);

        mAuth = FirebaseAuth.getInstance();


        ImageButton gol = (ImageButton) findViewById(R.id.gol);
        ImageButton putini = (ImageButton) findViewById(R.id.putini);
        ImageButton multi = (ImageButton) findViewById(R.id.multi);

        gol.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

            }
        });
    }
}



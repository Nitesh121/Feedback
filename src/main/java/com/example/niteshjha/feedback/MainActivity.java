package com.example.niteshjha.feedback;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    EditText et1, et2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        et1 = (EditText) findViewById(R.id.name);
        et2 = (EditText) findViewById(R.id.pass);

    }
    public void Submit(View v) {

        String USER = et1.getText().toString();
        String Pass = et2.getText().toString();

        if (USER.isEmpty())
        {
            et1.requestFocus();
            et1.setError("Error");
        }
        else {
            if (Pass.isEmpty())
            {
                et2.requestFocus();
                et2.setError("Error");
            } else
                {
                if (USER.equals("admin") && (Pass.equals("admin")))
                {
                    Intent i1 = new Intent(this,Login_Activity.class);
                    startActivity(i1);
                    et1.setText("");
                    et2.setText("");
                } else
                    {
                    Toast.makeText(this," Invalid password",Toast.LENGTH_LONG).show();
                }
            }
        }
    }
}



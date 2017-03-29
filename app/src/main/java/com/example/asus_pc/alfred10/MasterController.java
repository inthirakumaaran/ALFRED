package com.example.asus_pc.alfred10;

import android.content.Intent;
import android.support.annotation.IdRes;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import butterknife.OnClick;

public class MasterController extends AppCompatActivity {
    private Button login;
    private EditText name,password;
    private DBcontroller Dbh;
    private session s;
    private TextView signup;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_master_controller);
//        activity a =new activity();
//        ProgressController.createprogress(a);
        signup =(TextView) findViewById(R.id.signup);
        login =(Button)findViewById(R.id.llogin);
        name=(EditText)findViewById(R.id.lname);
        password=(EditText)findViewById(R.id.lpass);
        Dbh = new DBcontroller(this);
        s =new session(this);

        if (s.loggedIn()){
            startActivity(new Intent(MasterController.this,welcome.class));
            finish();
        }

        findViewById (R.id.signup).setOnClickListener(
                new Button.OnClickListener(){
                    @Override
                    public void onClick(View view) {
                        startActivity(new Intent(MasterController.this,Register.class));
                    }});
    }

    public void onloginn(View view){
        String nam = name.getText().toString();
        String pass = password.getText().toString();
        if (Dbh.check(nam, pass)) {
            s.setLogg(true);
            startActivity(new Intent(MasterController.this,welcome.class));
        }else {
            displaytoast("invalid user");
        }
    }


    private void displaytoast(String msg){
        Toast.makeText(this,msg,Toast.LENGTH_LONG).show();
    }
}
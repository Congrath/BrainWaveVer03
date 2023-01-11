package com.example.brainwavever02;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.text.method.ScrollingMovementMethod;
import android.view.View;
import android.widget.Button;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        TextView value_of_data=(TextView) this.findViewById(R.id.value_of_data);

        Button change_to_main=(Button) this.findViewById(R.id.change_to_history);
        change_to_main.setOnClickListener((View view) ->{
            Intent intent = new Intent(this, History.class);
            this.startActivity(intent);
        });

        Button change_to_setting=(Button) this.findViewById(R.id.change_to_setting);
        change_to_setting.setOnClickListener((View view) ->{
            Intent intent = new Intent(this, Settings.class);
            this.startActivity(intent);
        });

       RadioGroup rdgroup_data=(RadioGroup)this.findViewById(R.id.rdgroup);
       rdgroup_data.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
           @SuppressLint("SetTextI18n")
           @Override
           public void onCheckedChanged(RadioGroup radioGroup, int i) {
               int checkID=radioGroup.getCheckedRadioButtonId();
               if(checkID==R.id.RAWTP9){
                   value_of_data.setText("0\n" +
                           "786.9231\n" +
                           "36.666668\n" +
                           "1642.7472\n" +
                           "665.2381\n" +
                           "0\n" +
                           "682.96704\n" +
                           "1645.9707\n" +
                           "49.56044\n" +
                           "815.9341\n" +
                           "0\n" +
                           "679.34064\n" +
                           "1640.3297\n" +
                           "66.886444\n" +
                           "969.85345\n" +
                           "0\n" +
                           "649.12085\n" +
                           "1643.5531\n" +
                           "61.245422\n" +
                           "1015.38464\n" +
                           "0\n");
               }
               else if(checkID==R.id.RAWTP10){
                   value_of_data.setText("1200.3297\n" +
                           "76.15385\n" +
                           "0\n" +
                           "568.5348\n" +
                           "79.37729\n" +
                           "1351.4286\n" +
                           "205.09157\n" +
                           "0\n" +
                           "454.90842\n" +
                           "1622.6007\n" +
                           "1542.0146\n" +
                           "412.60074\n" +
                           "0\n" +
                           "358.20514\n" +
                           "1502.9304\n" +
                           "64.871796\n" +
                           "639.45056\n" +
                           "0\n" +
                           "155.53113\n");
               }
               else if(checkID==R.id.RAWAF7){
                   value_of_data.setText("195.01831\n" +
                           "1331.2821\n" +
                           "137.39926\n" +
                           "1197.9121\n" +
                           "39.89011\n" +
                           "4.835165\n" +
                           "1117.326\n" +
                           "132.5641\n" +
                           "1365.9341\n" +
                           "246.19048\n" +
                           "0\n" +
                           "914.2491\n" +
                           "81.79487\n" +
                           "1560.5494\n" +
                           "532.674\n" +
                           "0\n" +
                           "765.56775\n" +
                           "20.952381\n" +
                           "26.593407\n");
               }
               else if(checkID==R.id.RAWAF8){
                   value_of_data.setText("178.9011\n" +
                           "921.50183\n" +
                           "0\n" +
                           "0\n" +
                           "891.685\n" +
                           "189.78021\n" +
                           "938.4249\n" +
                           "0\n" +
                           "0\n" +
                           "724.87177\n" +
                           "166.41026\n" +
                           "949.707\n" +
                           "0\n" +
                           "0\n" +
                           "606.8132\n" +
                           "139.01099\n" +
                           "1082.674\n" +
                           "14.102564\n" +
                           "0\n");
               }
               else if(checkID==R.id.AUX_R){
                   value_of_data.setText("1041.978\n" +
                           "1230.1465\n" +
                           "970.2564\n" +
                           "601.1722\n" +
                           "464.9817\n" +
                           "1120.1465\n" +
                           "1305.0916\n" +
                           "955.34796\n" +
                           "591.9048\n" +
                           "366.66666\n" +
                           "958.1685\n" +
                           "1247.8755\n" +
                           "945.2747\n" +
                           "630.18317\n" +
                           "412.1978\n" +
                           "873.5531\n" +
                           "1192.2711\n" +
                           "866.30035\n" +
                           "567.72894\n");
               }
               else{
                   value_of_data.setText("Here is the region for presenting all the data or the\n" +
                           "specific line data decided by the radio buttons defined on the right. \\n\\n\n" +
                           "The max number of lines are the  14 lines, after 14 lines the text region will\n" +
                           "begin to change to rolling format automatically.\\n\\n\n" +
                           "And these words are created for test.\"");
               }
           }
       });


        value_of_data.setMovementMethod(ScrollingMovementMethod.getInstance());

    }

}
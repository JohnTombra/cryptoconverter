package com.adain.cryptosquash;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.TextView;
import android.widget.Toast;

import org.w3c.dom.Text;

public class MainActivity extends AppCompatActivity {


    TextView convert;
    TextView output;

    Spinner from;
    Spinner to;

    EditText input;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        from = findViewById(R.id.from);
        to = findViewById(R.id.to);


        Context context = this;



        String str = "SET VALUE###ETHEREUM###BNB###BITCOIN###DOGE###XRP###TRON";
        String[] array = str.split("###");
        ArrayAdapter<String> arrayAdapter = new ArrayAdapter<String>(context, R.layout.support_simple_spinner_dropdown_item, array);

        to.setAdapter(arrayAdapter);
        from.setAdapter(arrayAdapter);


        input = findViewById(R.id.input);

        convert = findViewById(R.id.convert);

        output = findViewById(R.id.output);




        convert.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                if(from.getSelectedItem().toString().equals("SET VALUE")){
                    Toast.makeText(context,"Select input coin",Toast.LENGTH_SHORT).show();
                    return;
                }



                if(to.getSelectedItem().toString().equals("SET VALUE")){
                    Toast.makeText(context,"Select output coin",Toast.LENGTH_SHORT).show();
                    return;
                }

                if(input.getText().toString().isEmpty() || input.getText().toString().equals("")){
                    Toast.makeText(context,"Invalid input",Toast.LENGTH_SHORT).show();
                    return;
                }



                double in = Double.parseDouble(input.getText().toString());

                if(in <= 0){
                    Toast.makeText(context,"Invalid input",Toast.LENGTH_SHORT).show();
                    return;
                }

                currencyConverter(to,from);
            }
        });







    }






    private void currencyConverter(Spinner from, Spinner to){

      if(from.getSelectedItem().toString().equals(to.getSelectedItem().toString())){

            output.setText(input.getText().toString() + " " + to.getSelectedItem().toString());

        }


        if(from.getSelectedItem().toString().equals("BITCOIN")){

            switch (to.getSelectedItem().toString()){
                case "ETHEREUM":
                    double in = Double.parseDouble(input.getText().toString());
                    double convfactor = 13.16;//
                    converter(in, convfactor);
                    break;
                case "BNB":
                    double in2 = Double.parseDouble(input.getText().toString());
                    double convfactor2 = 95.95;//
                    converter(in2, convfactor2);
                    break;
                case "DOGE":
                    double in3 = Double.parseDouble(input.getText().toString());
                    double convfactor3 = 286030.70;//
                    converter(in3, convfactor3);
                    break;
                //
                case "XRP":
                    double in4 = Double.parseDouble(input.getText().toString());
                    double convfactor4 = 58171.66;//
                    converter(in4, convfactor4);
                    break;

                case "TRON":
                    double in5 = Double.parseDouble(input.getText().toString());
                    double convfactor5 = 660913.45;//
                    converter(in5, convfactor5);
                    break;
            }

        }



        if(from.getSelectedItem().toString().equals("ETHEREUM")){

            switch (to.getSelectedItem().toString()){
                case "BITCOIN":
                    double in = Double.parseDouble(input.getText().toString());
                    double convfactor = 0.076;//
                    converter(in, convfactor);
                    break;
                case "BNB":
                    double in2 = Double.parseDouble(input.getText().toString());
                    double convfactor2 = 7.30;//
                    converter(in2, convfactor2);
                    break;
                case "DOGE":
                    double in3 = Double.parseDouble(input.getText().toString());
                    double convfactor3 = 21813.49;//
                    converter(in3, convfactor3);
                    break;
                //
                case "XRP":
                    double in4 = Double.parseDouble(input.getText().toString());
                    double convfactor4 = 4277.95;//
                    converter(in4, convfactor4);
                    break;

                case "TRON":
                    double in5 = Double.parseDouble(input.getText().toString());
                    double convfactor5 = 50322.58;//
                    converter(in5, convfactor5);
                    break;
            }

        }


        if(from.getSelectedItem().toString().equals("BNB")){

            switch (to.getSelectedItem().toString()){
                case "ETHEREUM":
                    double in = Double.parseDouble(input.getText().toString());
                    double convfactor = 0.14;//
                    converter(in, convfactor);
                    break;
                case "BITCOIN":

                    double in2 = Double.parseDouble(input.getText().toString());
                    double convfactor2 = 0.010;//
                    converter(in2, convfactor2);
                    break;
                case "DOGE":
                    double in3 = Double.parseDouble(input.getText().toString());
                    double convfactor3 = 2989.25;//
                    converter(in3, convfactor3);
                    break;
                //
                case "XRP":
                    double in4 = Double.parseDouble(input.getText().toString());
                    double convfactor4 = 575.34;//
                    converter(in4, convfactor4);
                    break;

                case "TRON":
                    double in5 = Double.parseDouble(input.getText().toString());
                    double convfactor5 = 6899.67;//
                    converter(in5, convfactor5);
                    break;
            }

        }

        if(from.getSelectedItem().toString().equals("DOGE")){

            switch (to.getSelectedItem().toString()){
                case "ETHEREUM":
                    double in = Double.parseDouble(input.getText().toString());
                    double convfactor = 0.000046;//
                    converter(in, convfactor);
                    break;
                case "BNB":
                    double in2 = Double.parseDouble(input.getText().toString());
                    double convfactor2 = 0.00033;//
                    converter(in2, convfactor2);
                    break;
                case "BITCOIN":
                    double in3 = Double.parseDouble(input.getText().toString());
                    double convfactor3 = 0.0000035;//
                    converter(in3, convfactor3);
                    break;
                //
                case "XRP":
                    double in4 = Double.parseDouble(input.getText().toString());
                    double convfactor4 = 0.20;//
                    converter(in4, convfactor4);
                    break;

                case "TRON":
                    double in5 = Double.parseDouble(input.getText().toString());
                    double convfactor5 = 2.30;//
                    converter(in5, convfactor5);
                    break;
            }

        }



        if(from.getSelectedItem().toString().equals("XRP")){

            switch (to.getSelectedItem().toString()){
                case "ETHEREUM":
                    double in = Double.parseDouble(input.getText().toString());
                    double convfactor = 0.00023;//
                    converter(in, convfactor);
                    break;
                case "BNB":
                    double in2 = Double.parseDouble(input.getText().toString());
                    double convfactor2 = 0.0017;//
                    converter(in2, convfactor2);
                    break;
                case "DOGE":
                    double in3 = Double.parseDouble(input.getText().toString());
                    double convfactor3 = 5.11;//
                    converter(in3, convfactor3);
                    break;
                //
                case "TRON":
                    double in4 = Double.parseDouble(input.getText().toString());
                    double convfactor4 = 11.77;//
                    converter(in4, convfactor4);
                    break;

                case "BITCOIN":
                    double in5 = Double.parseDouble(input.getText().toString());
                    double convfactor5 = 0.000018;//
                    converter(in5, convfactor5);
                    break;
            }

        }




        if(from.getSelectedItem().toString().equals("TRON")){

            switch (to.getSelectedItem().toString()){
                case "ETHEREUM":
                    double in = Double.parseDouble(input.getText().toString());
                    double convfactor = 0.000020;//
                    converter(in, convfactor);
                    break;
                case "BNB":
                    double in2 = Double.parseDouble(input.getText().toString());
                    double convfactor2 = 0.00015;//
                    converter(in2, convfactor2);
                    break;
                case "DOGE":
                    double in3 = Double.parseDouble(input.getText().toString());
                    double convfactor3 = 0.43;//
                    converter(in3, convfactor3);
                    break;
                //
                case "BITCOIN":
                    double in4 = Double.parseDouble(input.getText().toString());
                    double convfactor4 = 0.0000015;//
                    converter(in4, convfactor4);
                    break;

                case "XRP":
                    double in5 = Double.parseDouble(input.getText().toString());
                    double convfactor5 = 0.085;//
                    converter(in5, convfactor5);
                    break;
            }

        }






    }




    private void converter(Double inputvalue,Double conversionfactor){
        double outputvalue = inputvalue * conversionfactor; //print out value
        output.setText(String.valueOf(outputvalue) + " " + to.getSelectedItem().toString());
    }



      /*      double inputvalue = 0.0;//user input
                    double conversionfactor = 0.0;//conversion factor
                    double outputvalue = inputvalue * conversionfactor; //print out value*/




}
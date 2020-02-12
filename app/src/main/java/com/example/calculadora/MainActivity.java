package com.example.calculadora;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {
    TextView escritura,resultado;
    Button b1,b2,b3,b4,b5,b6,b7,b8,b9,b0,bPunto;
    Button sumar,restar,multiplicar,dividir,igual;
    Button potencia,raiz,porcentaje,borrar;
    Button seno,coseno,tangente,logaritmo,phi;
    float numFinal,num1,num2;
    int operador;
    double resFunction;

    public void operations(){
        String aux=escritura.getText().toString();
        num1=Float.parseFloat(aux);
        escritura.setText("");
        aux="";
    }

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        getSupportActionBar().setDisplayShowHomeEnabled(true);
        getSupportActionBar().setIcon(R.mipmap.ic_launcher);
        escritura = findViewById(R.id.escritura);
        resultado = findViewById(R.id.resultado);
        b1 = findViewById(R.id.b1);
        b2 = findViewById(R.id.b2);
        b3 = findViewById(R.id.b3);
        b4 = findViewById(R.id.b4);
        b5 = findViewById(R.id.b5);
        b6 = findViewById(R.id.b6);
        b7 = findViewById(R.id.b7);
        b8 = findViewById(R.id.b8);
        b9 = findViewById(R.id.b9);
        b0 = findViewById(R.id.b0);
        bPunto= findViewById(R.id.bPunto);
        potencia= findViewById(R.id.potencia);
        raiz= findViewById(R.id.raiz);
        porcentaje=findViewById(R.id.porcentaje);
        sumar= findViewById(R.id.sumar);
        restar= findViewById(R.id.restar);
        multiplicar= findViewById((R.id.multiplicar));
        dividir=findViewById(R.id.dividir);
        borrar= findViewById(R.id.borrar);
        igual= findViewById(R.id.igual);
        seno= findViewById(R.id.seno);
        coseno= findViewById(R.id.coseno);
        tangente= findViewById(R.id.tangente);
        logaritmo= findViewById(R.id.logaritmo);
        phi= findViewById(R.id.phi);

        if(escritura.getText().equals("") || resultado.equals("")){
            escritura.setText("");
            resultado.setText("");}

        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String aux=escritura.getText().toString();
                escritura.setText(aux+"1");} });
        b2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String aux=escritura.getText().toString();
                escritura.setText(aux+"2");} });
        b3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String aux=escritura.getText().toString();
                escritura.setText(aux+"3");} });
        b4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String aux=escritura.getText().toString();
                escritura.setText(aux+"4");} });
        b5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String aux=escritura.getText().toString();
                escritura.setText(aux+"5");} });
        b6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String aux=escritura.getText().toString();
                escritura.setText(aux+"6");} });
        b7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String aux=escritura.getText().toString();
                escritura.setText(aux+"7");} });
        b8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String aux=escritura.getText().toString();
                escritura.setText(aux+"8");} });
        b9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String aux=escritura.getText().toString();
                escritura.setText(aux+"9");} });
        b0.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String aux=escritura.getText().toString();
                escritura.setText(aux+"0");} });
        bPunto.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String aux = escritura.getText().toString();
            if (aux.contains(".")){
                try {} catch (NumberFormatException nfe){}
            }
            else {
                escritura.setText(aux+".");  }
            }});

        borrar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                try {
                    String aux=escritura.getText().toString();
                    if (!aux.isEmpty()) {
                        aux=aux.substring(0,aux.length()-1);
                        escritura.setText(aux); }
                } catch (NumberFormatException nfe){
                    System.out.println("error: " + nfe);}
            }
        });
        borrar.setOnLongClickListener(new View.OnLongClickListener() {
            @Override
            public boolean onLongClick(View v) {
                String aux="";
                escritura.setText("");
                resultado.setText("");
                operador=0;
                return true;
            }
        });

        sumar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                try {
                    String aux=escritura.getText().toString();
                    String aux1 ="+";
                    operations();
                    resultado.setText(aux+aux1);
                    operador=1;
                } catch (NumberFormatException nfe){}
            }
        });
        restar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                try{
                    String aux=escritura.getText().toString();
                    String aux1="-";
                    operations();
                    resultado.setText(aux+aux1);
                    operador=2;
                } catch (NumberFormatException nfe){}
            }
        });
        multiplicar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                try {
                    String aux=escritura.getText().toString();
                    String aux1="x";
                    operations();
                    resultado.setText(aux+aux1);
                    operador=3;
                } catch (NumberFormatException nfe){}
            }
        });
        dividir.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                try {
                    String aux=escritura.getText().toString();
                    String aux1="÷";
                    operations();
                    resultado.setText(aux+aux1);
                    operador=4;
                } catch (NumberFormatException nfe){}
            }
        });
        potencia.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                try {
                    String aux=escritura.getText().toString();
                    String aux1="^";
                    operations();
                    resultado.setText(aux+aux1);
                    operador=5;
                } catch (NumberFormatException nfe){}
            }
        });
        raiz.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                try {
                    String aux1="√";
                    resultado.setText((aux1)+"");
                    escritura.setText("");
                    operador=6;
                } catch (NumberFormatException nfe){}
            }
        });
        porcentaje.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                try {
                    String aux=escritura.getText().toString();
                    String aux1="%";
                    operations();
                    resultado.setText(aux+aux1);
                    operador=7;
                } catch (NumberFormatException nfe){}
            }
        });
        seno.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                try {
                    String aux1 = "sin(";
                    resultado.setText((aux1) + "");
                    escritura.setText("");
                    operador = 8;
                } catch (NumberFormatException nfe) {}
            }
        });

        coseno.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                try {
                    String aux1 = "cos(";
                    resultado.setText((aux1) + "");
                    escritura.setText("");
                    operador = 9;
                } catch (NumberFormatException nfe) {}
            }
        });

        tangente.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                try {
                    String aux1 = "tan(";
                    resultado.setText((aux1) + "");
                    escritura.setText("");
                    operador = 10;
                } catch (NumberFormatException nfe) {}
            }
        });
        logaritmo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                try {
                    String aux1 = "log(";
                    resultado.setText((aux1) + "");
                    escritura.setText("");
                    operador = 11;
                } catch (NumberFormatException nfe) {}
            }
        });
        phi.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                try {
                    double resFunction=Math.PI;
                    String resFunc = Double.toString(resFunction);
                    numFinal=Float.parseFloat(resFunc);
                    escritura.setText((Math.round(numFinal * 10000.0) / 10000.0) + "");
                    num1=numFinal;
                } catch (NumberFormatException nfe) {}
            }
        });
        igual.setOnClickListener((new View.OnClickListener() {

            public void function() {
                String aux = escritura.getText().toString();
                String puntoCero = ".0";
                String rNumFinal = Float.toString(numFinal);
                rNumFinal = rNumFinal.toUpperCase();
                String calPuntCero = rNumFinal.substring(rNumFinal.length() - 2);
                if (calPuntCero.equals(puntoCero)) {
                    rNumFinal = rNumFinal.substring(0, rNumFinal.length() - 2);
                    escritura.setText(rNumFinal);
                    numFinal = Float.parseFloat(rNumFinal);
                } else {
                    escritura.setText((Math.round(numFinal * 100.0) / 100.0) + "");
                }
                String res = resultado.getText().toString();
                resultado.setText(res + aux);
                numFinal = Integer.parseInt(rNumFinal);
                num1 = numFinal;
            }

            public void operationsFunctions(){
                String aux=escritura.getText().toString();
                String puntoCero=".0";
                String rNumFinal= Double.toString(resFunction);
                rNumFinal = rNumFinal.toUpperCase();
                String calPuntCero= rNumFinal.substring(rNumFinal.length()-2);
                if (calPuntCero.equals(puntoCero)){
                    rNumFinal=rNumFinal.substring(0,rNumFinal.length()-2);
                    escritura.setText(rNumFinal);
                    numFinal=Float.parseFloat(rNumFinal);
                }
                else {
                    escritura.setText((Math.round(numFinal * 100.0) / 100.0) + "");
                }
                String res=resultado.getText().toString();
                resultado.setText(res+aux);
                numFinal=Integer.parseInt(rNumFinal);
                num1=numFinal;
            }
            public void oFunctions(){
                String aux=escritura.getText().toString();
                String resFunc = Double.toString(resFunction);
                numFinal=Float.parseFloat(resFunc);
                escritura.setText((Math.round(numFinal * 10000.0) / 10000.0) + "");
                String res=resultado.getText().toString();
                resultado.setText(res+aux+")");
                num1=numFinal;
            }
            @Override
            public void onClick(View v) {
                try {
                    String aux=escritura.getText().toString();
                    num2=Float.parseFloat(aux);
                    System.out.println(num2);
                    if ( operador ==1 ){
                        numFinal = num1+num2;
                        function();
                    }
                    else if( operador ==2 ){
                        numFinal=num1-num2;
                        function();
                    }
                    else if( operador ==3 ){
                        numFinal=num1*num2;
                        if (num1 == 0 || num2 == 0 ){
                            numFinal=0;
                            function();
                        }
                        else {
                            function();
                        }
                    }
                    else if( operador ==4 ){
                        numFinal=num1/num2;
                        if (num2 ==0 ){
                            escritura.setText("No se puede dividir por "+num2);
                        }
                        else{
                            function();
                        }
                    }
                    else if ( operador == 5 ) {
                        resFunction = Math.pow(num1, num2);
                        operationsFunctions();
                    }
                    else if ( operador == 6 ){
                        resFunction=Math.sqrt(num2);
                        operationsFunctions();
                    }
                    else if ( operador == 7 ){
                        resFunction=((num1*num2)/100);
                        operationsFunctions();
                    }
                    else if (operador == 8){
                        resFunction=Math.sin(num2);
                        oFunctions();
                    }
                    else if (operador == 9){
                        resFunction=Math.cos(num2);
                        oFunctions();
                    }
                    else if (operador == 10){
                        resFunction=Math.tan(num2);
                        oFunctions();
                    }
                    else if (operador == 11){
                        resFunction=Math.log(num2);
                        oFunctions();
                    }
                } catch (NumberFormatException nfe){}
            }
        }));
    }
}

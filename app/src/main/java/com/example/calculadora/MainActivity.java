package com.example.calculadora;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    Button btn1,btn2,btn3,btn4,btn5,btn6,btn7,btn8,btn9,btn0,btnPunto,btnMas,btnMenos,btnIgual,BtnC,btnDivision,btnMulti,btnx2,btnPorcentaje;
    TextView resultado;
    String operacion;
    double n1= 0.0;
    double n2= 0.0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

       resultado=findViewById(R.id.resultado);

       BtnC=findViewById(R.id.BtnC);
       BtnC.setOnClickListener(new View.OnClickListener() {
           @Override
           public void onClick(View v) {
               resultado.setText("");
           }
       });

       btn0=findViewById(R.id.btn0);
       btn0.setOnClickListener(new View.OnClickListener() {
           @Override
           public void onClick(View v) {
               resultado.setText(resultado.getText()+"0");

        btn2=findViewById(R.id.btn2);
        btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                resultado.setText(resultado.getText()+"2");
        btn3=findViewById(R.id.btn3);
        btn3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                resultado.setText(resultado.getText()+"3");
        btn4=findViewById(R.id.btn4);
        btn4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                resultado.setText(resultado.getText()+"4");
        btn5.findViewById(R.id.btn5);
        btn5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                resultado.setText(resultado.getText()+"5");
        btn6=findViewById(R.id.btn6);
        btn6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                resultado.setText(resultado.getText()+"6");
        btn7=findViewById(R.id.btn7);
        btn7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                resultado.setText(resultado.getText()+"7");
        btn8.findViewById(R.id.btn7);
        btn8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                resultado.setText(resultado.getText()+"8");
        btn9.findViewById(R.id.btn9);
        btn9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                resultado.setText(resultado.getText()+"9");
        btn1.findViewById(R.id.btn1);
        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                resultado.setText(resultado.getText()+"1");
            }
        });

         btnMas.findViewById(R.id.btnMas);
         btnMas.setOnClickListener(new View.OnClickListener() {
             @Override
             public void onClick(View v) {
                 operacion= "+";
                 n1= Integer.parseInt(resultado.getText().toString());
                 resultado.setText("");
          btnMenos.findViewById(R.id.btnMenos);
          btnMenos.setOnClickListener(new View.OnClickListener() {
              @Override
              public void onClick(View v) {
                  operacion= "-";
                  n1= Integer.parseInt(resultado.getText().toString());
                  resultado.setText("");
          btnx2.findViewById(R.id.btnx2);
          btnx2.setOnClickListener(new View.OnClickListener() {
              @Override
              public void onClick(View v) {
                  operacion="^";
                  n1 = Integer.parseInt(resultado.getText().toString());
                  resultado.setText("");
           btnMulti.findViewById(R.id.btnMulti);
           btnMulti.setOnClickListener(new View.OnClickListener() {
               @Override
               public void onClick(View v) {
                   operacion ="*";
                   n1 = Integer.parseInt(resultado.getText().toString());
                   resultado.setText("");
            btnDivision.findViewById(R.id.btnDivision);
            btnDivision.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    operacion ="/";
                    n1 = Integer.parseInt(resultado.getText().toString());
                    resultado.setText("");

              btnPunto.findViewById(R.id.btnPunto);
              btnPunto.setOnClickListener(new View.OnClickListener() {
                  @Override
                  public void onClick(View v) {
                      resultado.setText(resultado.getText()+".");
              btnPorcentaje.findViewById(R.id.btnPorcentaje);
              btnPorcentaje.setOnClickListener(new View.OnClickListener() {
                  @Override
                  public void onClick(View v) {
                      operacion="%";
                      n1= Integer.parseInt(resultado.getText().toString());
                      resultado.setText("");

                      btnIgual.findViewById(R.id.btnIgual);
                      btnIgual.setOnClickListener(new View.OnClickListener() {
                          @Override
                          public void onClick(View v) {
                              n2= Integer.parseInt(resultado.getText().toString());

                              double op1;

                              if (operacion == "+"){
                                  op1 = Suma ((n1),(n2));
                                  resultado.setText(op1+"");
                              }
                              else if (operacion == "-"){
                                  op1 = Resta ((n1),(n2));
                                  resultado.setText(op1+"");
                              }
                              else if (operacion == "*"){
                                  op1 = Multiplicacion ((n1),(n2));
                                  resultado.setText(op1+"");
                              }
                              else if (operacion == "/"){
                                  op1 = Division ((n1),(n2));
                                  resultado.setText(op1+"");
                              }
                              else if (operacion == "^"){
                                  op1 = Potencia ((n1),(n2));
                                  resultado.setText(op1+"");
                              }
                              else if (operacion == "%"){
                                  op1 = Porcentaje ((n1),(n2));
                                  resultado.setText(op1+"");
                              }




                          }

                          private double Porcentaje(double n1, double n2) {
                              Double e;
                              e = Math.nextUp(n1);
                              return e;
                          }

                          private double Potencia(double n1, double n2) {
                              Double e;
                              e = Math.pow(n1,n2);
                              return e;
                          }

                          private double Division(double n1, double n2) {
                              Double e;
                              e = n1 /n2;
                              return e;
                          }

                          private double Multiplicacion(double n1, double n2) {
                              Double e;
                              e = n1 *n2;
                              return e;
                          }

                          private double Resta(double n1, double n2) {
                              Double e;
                              e = n1 -n2;
                              return e;
                          }

                          private double Suma(double n1, double n2) {
                              Double e;
                              e = n1 +n2;
                              return e;
                          }
                      });

                  }
              });
                 }

             });
                };
            });
               }
           });
              }
          });
              }
          });
             }
         });

            }
        });
            }
        });
            }
        });
            }
        });
            }
        });
            }
        });
            }
        });

            }
        });

           }

       });
    }


}
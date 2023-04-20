# autoria do arduinos
## explicação
o video mostra uma sequencia de leds ligando em uma ordem quando o sensor de proximidade percebe algo a uma certa distancia o circuito eletronico poderia ser mais complexo mas o codigo iria ficar muito comfuso e tanbem as portas do arduino ja estavam quase cheias
## o codigo

#include <Ultrasonic.h>

#define pino_trigger 3
#define pino_echo 2

Ultrasonic ultrasonic(pino_trigger, pino_echo);
 
void setup()
{
  Serial.begin(9600);
  Serial.println("Lendo dados do sensor...");
  pinMode(8,OUTPUT);//inicializando os pinos
  pinMode(9,OUTPUT);
  pinMode(10,OUTPUT);
  pinMode(11,OUTPUT);
  pinMode(12,OUTPUT);
  pinMode(13,OUTPUT);
}
 
void loop()
{
  //Le as informacoes do sensor, em cm e pol
  float cmMsec;
  long microsec = ultrasonic.timing();
  cmMsec = ultrasonic.convert(microsec, Ultrasonic::CM);
  Serial.print("Distancia em cm: ");// falando a distancia atual
  Serial.print(cmMsec);
  
  if(cmMsec <= 20){// começãr a piscar os leds a uma distancia de 20 cm
    digitalWrite(8,HIGH);
    delay(500);
     digitalWrite(8,LOW);
     digitalWrite(9,HIGH);
    delay(500);
     digitalWrite(9,LOW);
     digitalWrite(10,HIGH);
    delay(500);
     digitalWrite(10,LOW);
     digitalWrite(11,HIGH);
     delay(500);
     digitalWrite(11,LOW);
     digitalWrite(12,HIGH);
     delay(500);
     digitalWrite(12,LOW);
     digitalWrite(13,HIGH);
     delay(500);
     digitalWrite(13,LOW);
     
  }



  
}
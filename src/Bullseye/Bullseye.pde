void setup(){
  size(700,700);
}


void draw(){
  

for(int i=10;i>0;i--){
 ellipse( 350,350,i*65,i*65);
 if(i%2==0){
   fill(#FA0000);
   
}
else{
  fill(#FCFCFC);
}

}
}

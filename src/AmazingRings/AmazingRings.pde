int X1 = 500;
int X2 = 1500;
void draw(){
 background(#76766F);
  noFill();
  for(int i=10;i>0;i--){
 ellipse( X1,350,i*65,i*65);
 if(i%2==0){
  
   
}
else{
  
}


} 
for(int i=10;i>0;i--){
 ellipse( X2,350,i*65,i*65);
 if(i%2==0){
  
   
}
else{
  
}

} 
X1 +=5;
X2 -=5;
if(X1==1750){
 X1=250; 
}
if(X2==250){
  X2=1750;
}
}

void setup(){
  size(2000,2000);
}

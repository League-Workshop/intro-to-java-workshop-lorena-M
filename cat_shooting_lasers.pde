PImage catPic;
int x = 290;
int y = 190;
int secondX = 452;
int secondY = 159;
int acceleration = 5 ;
void setup(){
  size(700,600);
  catPic = loadImage("cat.jpg");
  catPic.resize(700,600);
  background(catPic);
  
}



void draw(){
  if(mousePressed){

println("Mouse’s x-position: " + mouseX + "\n" + "Mouse’s y-position: " + mouseY + "\n");}
 noStroke();
ellipse(x,y,60,60);
ellipse(secondX,secondY,60,60);
fill(#F57C7C);
  
}
void keyPressed(){
y+=2*acceleration;
x+=2*acceleration;
secondY+=2*acceleration;
secondX+=2*acceleration;
  
}

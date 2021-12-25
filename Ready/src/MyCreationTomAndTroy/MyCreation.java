/*
Tom Philip and Troy saldanha-Martins
Ms. Krasteva
2021-11-18
This program is the start of the my creation which is animation of Kailey the dolphin's birthday
*/


package MyCreationTomAndTroy;

import hsa.Console;

public class MyCreation extends Thread{
    Console c;
    public MyCreation(){
	c = new Console();
    }
    public void intro(){
	IntroBG i = new IntroBG(c);
	i.draw();
	try{
	    Thread.sleep(3000);
	} catch(Exception ignored){}
    }

    public void playBall(){
	PlayBallBG p = new PlayBallBG(c);
	p.draw();
	Dolphin d = new Dolphin(c);
	d.draw(100, 200);
	Whale w = new Whale(c);
	w.draw(370, 10);
	Jellyfish j = new Jellyfish(c);
	j.draw(90, 50);
	Ball b = new Ball(c);
	b.draw(200, 180);
	try{
	    Thread.sleep(2000);
	} catch(Exception ignored){}
	b.move(200, 180, 350, -100);
	d.move(100, 200, 160, 180, 4);
	d.move(160, 180, 300, -200, 10);
    }
    public void chase(){
	ChaseBG chaseBG = new ChaseBG(c);
	chaseBG.draw();
	Shark s = new Shark(c);
	s.draw(350, 100);

	Ball b = new Ball(c);
	b.move(240, -20, 400, 640);

	s.move(350,100,380, 300, 9);
	s.move(380, 300, 160, 320, 8);
	Dolphin d = new Dolphin(c);
	d.move(160, -200, 160, 40, 10);
	d.move(160, 40, 220, 100, 5);


	d.start();
	s.move(160, 320, 640, -200, 10);
    }
    public void eatCake(){
    	EatCakeBG e = new EatCakeBG(c);
    	e.background();
		Whale w = new Whale(c);
		w.draw(480,110);
		Turtle t = new Turtle(c);
		t.draw(480, 310);
		Jellyfish j = new Jellyfish(c);
		j.draw(20, 100);
		Fish fishA = new Fish(c, Colors.fishGrey,20, -15, 5);
		Fish fishB =new Fish(c, Colors.turquoise,20, -8, 20);
		Fish fishC =new Fish(c, Colors.purple,18, 11, 7);
		Fish fishD =new Fish(c, Colors.orange,20, 15, 15);
		fishA.draw(380, 150);
		fishB.draw(380, 150);
		fishC.draw(380, 150);
		fishD.draw(380, 159);
		Dolphin d = new Dolphin(c);
		d.move(-100, 210, 200, 210, 10 );

		Thread threadA = new Thread(new Fish(c, Colors.fishGrey,20, -15, 5));
		Thread threadB = new Thread(new Fish(c, Colors.turquoise,20, -8, 20));
		Thread threadC = new Thread(new Fish(c, Colors.purple,18, 11, 7));
		Thread threadD = new Thread(new Fish(c, Colors.orange,20, 15, 15));
		Thread net = new Thread(new Net(c));
		net.start();
		threadA.start();
		threadB.start();
		threadC.start();
		threadD.start();

	}
    public void endScreen(){
		EndScreen e = new EndScreen(c);
		e.drawText();

    }
    public static void main(String[] args){
	MyCreation m = new MyCreation();
	m.intro();
	m.playBall();
	m.chase();
	m.eatCake();
	m.endScreen();
    }
}

package face.controller;

import lejos.nxt.Motor;

public class LegoFaceController
{
	public LegoFaceController()
	{
		
	}
	
	public void start()
	{
		drawFigure();
	}
	
	public void drawFigure()
	{
		drawLongLine();
		turnLeft();
		drawShortLine();
		turnRight();
		drawMediumLine();
		turnRight();
		drawMediumLine();
		turnRight();
		drawMediumLine();
		turnRight();
		drawShortLine();
		turnLeft();
		drawLongLine();
		
	}
	
	private void drawShortLine()
	{
		Motor.A.setSpeed(500);
		Motor.B.setSpeed(500);
		Motor.A.forward();
		Motor.B.forward();
		try
		{
			Thread.sleep(1500);
		}
		catch(InterruptedException e)
		{
			e.printStackTrace();
		}
	}
	private void turnRight()
	{
		Motor.A.setSpeed(500);
		Motor.B.setSpeed(500);
		Motor.A.forward();
		Motor.B.backward();
		try
		{
			Thread.sleep(1250);
		}
		catch (InterruptedException e)
		{
			e.printStackTrace();
		}
	}
	private void turnLeft()
	{
		Motor.A.setSpeed(500);
		Motor.B.setSpeed(500);
		Motor.A.backward();
		Motor.B.forward();
		try
		{
			Thread.sleep(1250);
		}
		catch (InterruptedException e)
		{
			e.printStackTrace();
		}
	}
	private void drawMediumLine()
	{
		Motor.A.setSpeed(500);
		Motor.B.setSpeed(500);
		Motor.A.forward();
		Motor.B.forward();
		try
		{
			Thread.sleep(2500);
		}
		catch(InterruptedException e)
		{
			e.printStackTrace();
		}
	}
	private void drawLongLine()
	{
		Motor.A.setSpeed(500);
		Motor.B.setSpeed(500);
		Motor.A.forward();
		Motor.B.forward();
		try
		{
			Thread.sleep(3500);
		}
		catch(InterruptedException e)
		{
			e.printStackTrace();
		}
	}
}

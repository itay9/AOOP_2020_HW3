package gui;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;

import javax.swing.JPanel;

import components.Driving;
import components.Junction;
import components.LightedJunction;
import components.Road;
import components.Vehicle;

public class PaintMap extends JPanel {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private Driving driving;
	
	public PaintMap(Driving d) {
		driving=d;
        setPreferredSize(getPreferredSize());
	};
	
	@Override
    public Dimension getPreferredSize() {
        return new Dimension(800, 600);
	}
	@Override
	protected void paintComponent(Graphics g) {
		super.paintComponent(g);	
//        setLayout(new BorderLayout());

		if(getDriving()!=null) {
			for(Road road : getDriving().getMap().getRoads()) {
				double[] x_points = {road.getStartJunction().getX(),road.getEndJunction().getX()};
				double[] y_points = {road.getStartJunction().getY(),road.getEndJunction().getY()};

				g.drawLine((int)x_points[0], (int)y_points[0], (int)x_points[1], (int)y_points[1]);
				
			}
			for(Junction junc: getDriving().getMap().getJunctions()) {
				double x=junc.getX();
				double y=junc.getY();
				g.drawOval((int) (x),(int)y, 10, 10);
					
				 if(junc instanceof LightedJunction && ((LightedJunction) junc).getLights().getTrafficLightsOn()) {
					g.setColor(Color.red);
					g.fillOval((int) (x),(int)y, 10, 10);
				}
				else if(junc instanceof LightedJunction && !((LightedJunction) junc).getLights().getTrafficLightsOn()) {
					g.setColor(Color.green);
					g.fillOval((int) (x),(int)y, 10, 10);
					
				}
				else {
					g.setColor(Color.black);
					g.fillOval((int) (x),(int)y, 10, 10);
				}
			}
			
			for(Vehicle v : getDriving().getVehicles()) {
				
				double[] x_points = {v.getLastRoad().getStartJunction().getX(),v.getLastRoad().getEndJunction().getX()};
				double[] y_points = {v.getLastRoad().getStartJunction().getY(),v.getLastRoad().getEndJunction().getY()};

				drawRotetedVehicle(g,(int)x_points[0], (int)y_points[0], (int)x_points[1], (int)y_points[1],10,4);
			}
			
		}
		
	}

	public void update() {
		this.repaint();
		this.revalidate();
	}

	private void drawRotetedVehicle(Graphics g, int x1, int y1, int x2, int y2, int d, int h) {
		int dx = x2 - x1, dy = y2 - y1, delta = 10;
		double D = Math.sqrt(dx*dx + dy*dy);
		double xm = delta, xn = xm, ym = h, yn = -h, x;
		double xm1 = delta + d, xn1 = xm1, ym1 = h, yn1 = -h, xx; 
		double sin = dy / D, cos = dx / D;
		x = xm*cos - ym*sin + x1;
		xx = xm1*cos - ym1*sin + x1;
		ym = xm*sin + ym*cos + y1;
		ym1 = xm1*sin + ym1*cos + y1;
		xm = x;
		xm1 = xx; 
		x = xn*cos - yn*sin + x1;
		xx = xn1*cos - yn1*sin + x1; 
		yn = xn*sin + yn*cos + y1;
		yn1 = xn1*sin + yn1*cos + y1;
		xn = x;
		xn1 = xx;
		int[] xpoints = {(int) xm1, (int) xn1,  (int) xn, (int) xm};
		int[] ypoints = {(int) ym1, (int) yn1, (int) yn, (int) ym};
		g.fillPolygon(xpoints, ypoints, 4);
		g.setColor(Color.BLACK);
		g.fillOval((int) xm1-2,(int) ym1-2,4,4);
		g.fillOval((int) xn1-2,(int) yn1-2,4,4);
		g.fillOval((int) xm-2,(int) ym-2,4,4);
		g.fillOval((int) xn-2,(int) yn-2,4,4);
		
	}

	public Driving getDriving() {
		return driving;
	}

	public void setDriving(Driving driving) {
		this.driving = driving;
	}

	
}
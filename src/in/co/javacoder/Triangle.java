package in.co.javacoder;

import java.util.List;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;

public class Triangle //implements ApplicationContextAware //, InitializingBean, DisposableBean 
{
	
	
	//private List<Point> points;
	
	//private ApplicationContext appContext;
	
	
	  private Point pointA; 
	  private Point pointB;
	  private Point pointC;
	 
	
	

	/*
	 * public void draw() { System.out.println("Point A " + pointA.toString() );
	 * System.out.println("Point B " + pointB.toString() );
	 * System.out.println("Point C " + pointC.toString() );
	 * 
	 * }
	 */


	/*
	 * public void draw() { System.out.println("Point A " + pointA.toString() );
	 * System.out.println("Point B " + pointB.toString() );
	 * System.out.println("Point C " + pointC.toString() );
	 * 
	 * }
	 */
	
	
	
	public void draw() {
		/*
		 * for(Point point : points) { System.out.println("Point " + point.toString());
		 */
			
			
			  System.out.println("Point " + pointA.toString() );
			  System.out.println("Point " + pointB.toString() );
			  System.out.println("Point " + pointC.toString() );
			 
		//}
		
//		System.out.println("Class Name : " + ((Side)this.appContext.getBean("side1")).getClass().getName());
	}

	/*
	 * public List<Point> getPoints() { return points; }
	 * 
	 * public void setPoints(List<Point> points) { this.points = points; }
	 * 
	 * 
	 * 
	 * 
	 * @Override public void setApplicationContext(ApplicationContext context)
	 * throws BeansException { this.appContext = context; }
	 */
	  
	/*
	 * @Override public void destroy() throws Exception {
	 * System.out.println("Bean is about to destroyed."); }
	 * 
	 * @Override public void afterPropertiesSet() throws Exception {
	 * System.out.println("Bean initialized..."); }
	 */
	 
	
	  public Point getPointA() { return pointA; }
	  
	  
	  
	  public void setPointA(Point pointA) { this.pointA = pointA; }
	  
	  
	  
	  public Point getPointB() { return pointB; }
	  
	  
	  
	  public void setPointB(Point pointB) { this.pointB = pointB; }
	  
	  
	  
	  public Point getPointC() { return pointC; }
	  
	  
	  
	  public void setPointC(Point pointC) { this.pointC = pointC; }
	 
	
	
	/*public void myInit() {
		System.out.println("Bean with id  is initialized....");  /// " + ((Triangle)this.appContext.getBean("parenttriangle").) + "
		
	}
	
	
	public void cleanup() {
		System.out.println("Bean with id is is about to destroyed...."); // " + ((Triangle)this.appContext.getBean("parenttriangle")) + "
		
	}*/
}

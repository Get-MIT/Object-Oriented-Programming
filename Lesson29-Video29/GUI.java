/* IMPORTANT - on newer eclipse editions (is mine right now) imports have options "Modulepath" and "Classpath".
* If you add jfreechart-1.0.19.jar and jcommon-1.0.23.jar in "Modulepath" the compiler doesn't show errors
* but at runtime Java can't find the class "org.jfree.data.category.CategoryDataset". 
*/

// Downloaded JFreeChart 1.0.19 from "https://sourceforge.net/projects/jfreechart/files/" end imported freechart-1.0.19.jar and jcommon-1.0.23.jar

import javax.swing.JFrame;

import org.jfree.chart.*;
import org.jfree.chart.plot.PlotOrientation;
import org.jfree.data.category.*;

public class GUI extends JFrame{
	
	public GUI() {
		
			// Created data structure
		DefaultCategoryDataset dataset = new DefaultCategoryDataset();
		
			//Added the data
		dataset.addValue(212, "Classes", "JDK 1.0");
		dataset.addValue(504, "Classes", "JDK 1.1");
		dataset.addValue(1520, "Classes", "SDK 1.2");
		dataset.addValue(1842, "Classes", "JDK 1.3");
		dataset.addValue(2991, "Classes", "JDK 1.4");
		
			// created the chart
		JFreeChart chart = ChartFactory.createBarChart3D("Evolution of JDK Classes", "JDK Versions", "Class Count", dataset, 
				PlotOrientation.HORIZONTAL, false, true, false); // calling another method of the class with 8 parameters.
								// Orientation=horizontal, legend=false, tooltips=true, URL=false
		
			// added chart to the panel
		ChartPanel panel = new ChartPanel(chart);
		
			// shown the panel
		this.setContentPane(panel);
		
		this.setVisible(true);
		this.setSize(400, 400);
		this.setTitle("My Chart");
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}

}

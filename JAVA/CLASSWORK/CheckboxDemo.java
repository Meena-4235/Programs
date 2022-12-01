import java.awt.*;
import java.awt.event.*;
public class CheckboxDemo extends Frame implements ItemListener {
	String msg="";
	Checkbox windows,andorid,solorias,mac;
	public CheckboxDemo(){
		setLayout(new FlowLayout());
		windows=new Checkbox("Windows",true);
		andorid=new Checkbox("Andorid");
		solorias=new Checkbox("Solorias");
		mac=new Checkbox("Mac OS");
		add(windows);
		add(andorid);
		add(solorias);
		add(mac);
		windows.addItemListener(this);
		andorid.addItemListener(this);
		solorias.addItemListener(this);
		mac.addItemListener(this);
		addWindowListener(new WindowAdapter(){
			public void windowClosing(WindowEvent we) {
				System.exit(0);
			}
		});
	}
	public void itemStateChanged(ItemEvent ie) {
		repaint();
	}
	public void paint(Graphics g) {
		msg="Current State:";
		g.drawString(msg, 20, 120);
		msg="Windows:"+windows.getState();
		g.drawString(msg, 20, 140);
		msg="Andorid:"+andorid.getState();
		g.drawString(msg, 20, 160);
		msg="Solorias:"+solorias.getState();
		g.drawString(msg, 20, 180);
		msg="Mac OS:"+mac.getState();
		g.drawString(msg, 20, 200);
	}
	public static void main(String[] args) {
		CheckboxDemo appwin=new CheckboxDemo();
		appwin.setSize(new Dimension(220,240));
		appwin.setTitle("CheckboxDemo");
		appwin.setVisible(true);

	}

}

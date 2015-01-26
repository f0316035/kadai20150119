package framesystem;

import java.awt.Button;
import java.awt.FlowLayout;
import java.awt.Frame;
import java.awt.Label;
import java.awt.TextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;

import framesystem.FrameSystemController;
import lib.Calculation_lib;
import lib.MM1_lib;
import lib.MMS_lib;

public class FrameSystemView extends Frame implements ActionListener,WindowListener {
	
		//" "�̒��͏����l�A���̐����͌���
	private TextField text1 = new TextField("", 10);
	private TextField text2 = new TextField("", 10);
	private TextField text3 = new TextField("", 10);
	private Button button1 = new Button("�����Z");
	//M/M/1�p
	private TextField m1 = new TextField("", 10);
	private TextField m2 = new TextField("", 10);
	private TextField m3 = new TextField("", 10);
	private Button bm = new Button("M/M/1");
	//M/M/S�p
	private TextField mm0 = new TextField("",10);
	private TextField mm1 = new TextField("", 10);
	private TextField mm2 = new TextField("", 10);
	private TextField mm3 = new TextField("", 10);
	private Button bmm = new Button("M/M/S");
	
	
	public FrameSystemView(FrameSystemController controller) {
		// TODO Auto-generated constructor stub
		addWindowListener(this);	
		setTitle("FrameSystem");
		setLayout(new FlowLayout(FlowLayout.CENTER));
		add(text1);
		add(text2);
		add(button1);
		add(new Label("����"));
		add(text3);
		//M/M/1�p
		add(new Label("��"));
		add(m1);
		add(new Label("��"));
		add(m2);
		add(bm);
		add(new Label("���όn���l��"));
		add(m3);
		//M/M/S�p
		add(new Label("s"));
		add(mm0);
		add(new Label("��"));
		add(mm1);
		add(new Label("��"));
		add(mm2);
		add(bmm);
		add(new Label("���όn���l��"));
		add(mm3);
		button1.addActionListener(this);
		bm.addActionListener(this);
		bmm.addActionListener(this);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		if(e.getSource()==button1){
			int val1=Integer.parseInt(text1.getText());//���͂��Ă�������Ȃ̂�int�^�ɕϊ�
			int val2=Integer.parseInt(text2.getText());
			Calculation_lib clib = new Calculation_lib(val1,val2);
			text3.setText(String.valueOf(clib.getPlus()));
		}
		//M/M/1�p
		else if(e.getSource()==bm){
			double lambda=Double.parseDouble(m1.getText());
			double mu=Double.parseDouble(m2.getText());//
			MM1_lib mlib = new MM1_lib(lambda,mu);
			m3.setText(String.valueOf(mlib.getLength()));
		}
		//M/M/S�p
		else if(e.getSource()==bmm){
			int s=Integer.parseInt(mm0.getText());
			double lambda=Double.parseDouble(mm1.getText());
			double mu=Double.parseDouble(mm2.getText());//
			MMS_lib mlib = new MMS_lib(lambda,mu,s);
			mm3.setText(String.valueOf(mlib.getL()));
				}
	}
	@Override
	public void windowOpened(WindowEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void windowClosing(WindowEvent e) {
		// TODO Auto-generated method stub
		System.exit(0);
	}

	@Override
	public void windowClosed(WindowEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void windowIconified(WindowEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void windowDeiconified(WindowEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void windowActivated(WindowEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void windowDeactivated(WindowEvent e) {
		// TODO Auto-generated method stub
		
	}

}

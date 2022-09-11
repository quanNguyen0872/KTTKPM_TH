package client;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import org.apache.log4j.BasicConfigurator;

import data.Person;
import helper.XMLConvert;

import javax.swing.JTextField;
import javax.jms.Connection;
import javax.jms.ConnectionFactory;
import javax.jms.Destination;
import javax.jms.JMSException;
import javax.jms.Message;
import javax.jms.MessageProducer;
import javax.jms.Session;
import javax.naming.Context;
import javax.naming.InitialContext;
import javax.swing.JButton;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Date;
import java.util.Properties;

public class Sender extends JFrame {

	private JPanel contentPane;
	private JTextField textField;
	private JButton btnSend;
	public static Session session;
	public static MessageProducer producer;
	public static String message;
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					//config environment for JMS
					BasicConfigurator.configure();
					//config environment for JNDI
					Properties settings = new Properties();
					settings.setProperty(Context.INITIAL_CONTEXT_FACTORY, "org.apache.activemq.jndi.ActiveMQInitialContextFactory");
					settings.setProperty(Context.PROVIDER_URL, "tcp://localhost:61616");
					//create context
					Context ctx = new InitialContext(settings);
					//lookup JMS connection factory
					ConnectionFactory factory = (ConnectionFactory) ctx.lookup("ConnectionFactory");
					//lookup destination. (If not exist-->ActiveMQ create once)
					Destination destination = (Destination) ctx.lookup("dynamicQueues/nguyenhongquan");
					//get connection using credential
					Connection con = factory.createConnection("admin", "admin");
					//connect to MOM
					con.start();
					//create session
					session = con.createSession(/* transaction */false, /* ACK */Session.AUTO_ACKNOWLEDGE);
					//create producer
					producer = session.createProducer(destination);
					Sender frame = new Sender();
					//create text message
					
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public Sender() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(new BorderLayout(0, 0));
		setContentPane(contentPane);
		
		JPanel panel = new JPanel();
		contentPane.add(panel, BorderLayout.CENTER);
		panel.setLayout(null);
		
		textField = new JTextField();
		textField.setBounds(75, 39, 265, 78);
		panel.add(textField);
		textField.setColumns(10);
		
		btnSend = new JButton("Send");
		btnSend.setFont(new Font("Tahoma", Font.PLAIN, 20));
		btnSend.setBounds(146, 146, 113, 54);
		panel.add(btnSend);
		
		btnSend.addActionListener(new ActionListener() {
			
			public void actionPerformed(ActionEvent e) {
				message = textField.getText();	
				Message msg;
				try {
					msg = session.createTextMessage(message);
					producer.send(msg);
					Person p = new Person(1002, "Nguyen Hong Quan", new Date());
					String xml = new XMLConvert<Person>(p).object2XML(p);
					msg = session.createTextMessage(xml);
					producer.send(msg);
					//shutdown connection
//					session.close();
//					con.close();
					System.out.println("Finished....");
				} catch (JMSException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				} catch (Exception e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
				
			}
		});
	}

}

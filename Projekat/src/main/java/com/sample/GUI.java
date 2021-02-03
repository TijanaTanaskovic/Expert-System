package com.sample;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JRadioButton;

import org.kie.api.KieServices;
import org.kie.api.runtime.KieContainer;
import org.kie.api.runtime.KieSession;

import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JPanel;
import java.awt.BorderLayout;
import java.awt.Font;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Color;

public class GUI {
	
	public Pacijent pacijent;
	public ButtonGroup group;
	public JRadioButton[] radio;
	public KieSession kSession;
	private JFrame frame;
	
	public JLabel pitanja = new JLabel();
	public JLabel dijagnoza = new JLabel();
	public JButton[] dugme;
	public JLabel lekovi;
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					GUI window = new GUI();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	
	public void Promeni(int red) {
		group.clearSelection();
		for(int i=0;i<dugme.length;i++) {
			dugme[i].setVisible(false);
			dugme[i].setText("Dalje");
		}
		for(int i=0;i<radio.length;i++) {
			radio[i].setVisible(false);
			radio[i].setSelected(false);
		}
		if(red==0) {
			radio[0].setVisible(true);
			radio[0].setText("Poremecaj opsteg stanja");
			radio[1].setVisible(true);
			radio[1].setText("Promene na kozi");
			radio[2].setVisible(true);
			radio[2].setText("Bolovi");
			radio[3].setVisible(true);
			radio[3].setText("Gastroindestinalne tegobe");
			dugme[0].setVisible(true);
			this.pitanja.setText("Kakav problem imate?");
		}
		if(red==1) {
			radio[0].setVisible(true);
			radio[0].setText("Da");
			radio[1].setVisible(true);
			radio[1].setText("Ne");
			dugme[1].setVisible(true);
			this.pitanja.setText("Da li imate temperaturu?");
		}
		if(red==2) {
			radio[0].setVisible(true);
			radio[0].setText("Da");
			radio[1].setVisible(true);
			radio[1].setText("Ne");
			dugme[2].setVisible(true);
			this.pitanja.setText("Da li Vas boli grlo?");
		}
		if(red==3) {
			radio[0].setVisible(true);
			radio[0].setText("Da");
			radio[1].setVisible(true);
			radio[1].setText("Ne");
			dugme[3].setVisible(true);
			this.pitanja.setText("Da li Vam curi nos?");
		}
		if(red==4) {
			radio[0].setVisible(true);
			radio[0].setText("Da");
			radio[1].setVisible(true);
			radio[1].setText("Ne");
			dugme[4].setVisible(true);
			this.pitanja.setText("Da li kasljete?");
		}
		if(red==5) {
			radio[0].setVisible(true);
			radio[0].setText("Da");
			radio[1].setVisible(true);
			radio[1].setText("Ne");
			dugme[5].setVisible(true);
			this.pitanja.setText("Da li imate gorusicu?");
		}
		if(red==6) {
			radio[0].setVisible(true);
			radio[0].setText("suvo");
			radio[1].setVisible(true);
			radio[1].setText("produktivno");
			dugme[6].setVisible(true);
			this.pitanja.setText("Ako kasljete, kakvo je iskasljavanje?");
		}
		if(red==7) {
			radio[0].setVisible(true);
			radio[0].setText("Da");
			radio[1].setVisible(true);
			radio[1].setText("Ne");
			dugme[7].setVisible(true);
			this.pitanja.setText("Da li su promene u nivou koze ili ne? (ono sto nije u nivou koze je neko ispupcenje)");
		}
		if(red==8) {
			radio[0].setVisible(true);
			radio[0].setText("rana(ogrebotina/posekotina)");
			radio[1].setVisible(true);
			radio[1].setText("opekotina");
			radio[2].setVisible(true);
			radio[2].setText("oziljak");
			dugme[9].setVisible(true);
			this.pitanja.setText("Da li je promena nesto od navedenog:?");
		}
		if(red==9) {
			radio[0].setVisible(true);
			radio[0].setText("samo crvenilo");
			radio[1].setVisible(true);
			radio[1].setText("crvenilo i svrab");
			radio[2].setVisible(true);
			radio[2].setText("svrab, perutanje i crvenilo");
			radio[3].setVisible(true);
			radio[3].setText("crvenilo i vlaznost");
			dugme[8].setVisible(true);
			this.pitanja.setText("Kakav je izgled promene?");
		}
		if(red==10) {
			radio[0].setVisible(true);
			radio[0].setText("hronican(traje duze od 3 meseca)");
			radio[1].setVisible(true);
			radio[1].setText("akutni(trenutni)");
			dugme[10].setVisible(true);
			this.pitanja.setText("Kakav je bol?");
		}
		if(red==11) {
			radio[0].setVisible(true);
			radio[0].setText("nema promena");
			radio[1].setVisible(true);
			radio[1].setText("modrica i otok");
			radio[2].setVisible(true);
			radio[2].setText("modrica");
			radio[3].setVisible(true);
			radio[3].setText("otok");
			dugme[11].setVisible(true);
			this.pitanja.setText("Da li postoji neka od navedenih promena?");
		}
		if(red==12) {
			radio[0].setVisible(true);
			radio[0].setText("dijareja");
			radio[1].setVisible(true);
			radio[1].setText("mucnina");
			radio[2].setVisible(true);
			radio[2].setText("dijareja i mucnina");
			dugme[12].setVisible(true);
			this.pitanja.setText("Da li vas muci nesto od navedenog?");
		}
		if(red==13) {
			dugme[13].setVisible(true);
			dugme[13].setText("Exit");
			this.dijagnoza.setText(pacijent.getDijagnoza());
			this.pitanja.setText("Zavrseno ispitivanje.");
		}
		System.out.println(pacijent.getPromenakozaprvo());
	}
	
	
	public GUI() {
		this.pacijent = new Pacijent();
		this.dugme = new JButton[14];
		this.radio = new JRadioButton[4];
		initialize();
		Promeni(0);
	}
	
	public void Dijagnoza(String s) {
		this.dijagnoza.setText(s);
		
	}

	public void Kie(Pacijent pacijent) {
		try {
			
            // load up the knowledge base
			KieServices ks = KieServices.Factory.get();
		    KieContainer kContainer = ks.getKieClasspathContainer();
	    	this.kSession = kContainer.newKieSession("ksession-rules");
	    	//kada pokrecem sa tabelom ovde treba da se zameni sa ksession-dtables
            // go !
            
            this.kSession.insert(pacijent);
            this.kSession.fireAllRules();
            
        } catch (Throwable t) {
            t.printStackTrace();
        }
		
	}
	
	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.getContentPane().setBackground(new Color(245, 222, 179));
		frame.setForeground(Color.WHITE);
		frame.getContentPane().setForeground(new Color(0, 0, 0));
		frame.setBounds(100, 100, 800, 406);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBackground(new Color(220, 220, 220));
		panel.setForeground(Color.BLACK);
		panel.setBounds(10, 10, 800, 350);
		frame.getContentPane().add(panel, BorderLayout.CENTER);
		panel.setLayout(null);
		
		pitanja.setFont(new Font("Arial", Font.BOLD, 16));
		pitanja.setBounds(10, 11, 1000, 23);
		panel.add(pitanja);
		
		JRadioButton radiobutton1 = new JRadioButton("radiobutton1");
		radiobutton1.setBackground(new Color(255, 255, 255));
		radiobutton1.setFont(new Font("Arial", Font.PLAIN, 14));
		radiobutton1.setBounds(20, 61, 283, 21);
		panel.add(radiobutton1);
		
		JRadioButton radiobutton2 = new JRadioButton("radiobutton2");
		radiobutton2.setBackground(new Color(255, 255, 255));
		radiobutton2.setFont(new Font("Arial", Font.PLAIN, 14));
		radiobutton2.setBounds(20, 96, 283, 21);
		panel.add(radiobutton2);
		
		JRadioButton radiobutton3 = new JRadioButton("radiobutton3");
		radiobutton3.setBackground(new Color(255, 255, 255));
		radiobutton3.setFont(new Font("Arial", Font.PLAIN, 14));
		radiobutton3.setBounds(20, 135, 283, 21);
		panel.add(radiobutton3);
		
		JRadioButton radiobutton4 = new JRadioButton("radiobutton4");
		radiobutton4.setBackground(new Color(255, 255, 255));
		radiobutton4.setFont(new Font("Arial", Font.PLAIN, 14));
		radiobutton4.setBounds(20, 171, 283, 21);
		panel.add(radiobutton4);
		
		
		group = new ButtonGroup();
		group.add(radiobutton1);
		group.add(radiobutton2);
		group.add(radiobutton3);
		group.add(radiobutton4);
		
		radio[0]=radiobutton1;
		radio[1]=radiobutton2;
		radio[2]=radiobutton3;
		radio[3]=radiobutton4;
		
		JButton btnNewButton = new JButton("Dalje");
		btnNewButton.setBackground(new Color(0, 0, 0));
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(radio[0].isSelected()) {
					pacijent.setKategorija("poremecaj opsteg stanja");
					Kie(pacijent);
					Promeni(pacijent.getRed());
					}
				else if(radio[1].isSelected()) {
					pacijent.setKategorija("promene na kozi");
					Kie(pacijent);
					Promeni(pacijent.getRed());
					}
				else if(radio[2].isSelected()) {
					pacijent.setKategorija("bolovi");
					Kie(pacijent);
					Promeni(pacijent.getRed());
					}
				else if(radio[3].isSelected()) {
					pacijent.setKategorija("gastroindestinalne tegobe");
					Kie(pacijent);
					Promeni(pacijent.getRed());
					}
				else JOptionPane.showMessageDialog(null, "Morate izbarati neki od ponudjenih odgovora!");
				
			}
		});
		btnNewButton.setFont(new Font("Arial", Font.BOLD, 14));
		btnNewButton.setBounds(640, 215, 85, 21);
		panel.add(btnNewButton);
		
		JButton btnNewButton1 = new JButton("Dalje1");
		btnNewButton1.setBackground(new Color(0, 0, 0));
		btnNewButton1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(radio[0].isSelected()) {
					pacijent.setTemperatura("da");
					Kie(pacijent);
					Promeni(pacijent.getRed());
					}
				else if(radio[1].isSelected()) {
					pacijent.setTemperatura("ne");
					Kie(pacijent);
					Promeni(pacijent.getRed());
					}
				else JOptionPane.showMessageDialog(null, "Morate izbarati neki od ponudjenih odgovora!");
				
			}
		});
		btnNewButton1.setFont(new Font("Arial", Font.BOLD, 14));
		btnNewButton1.setBounds(640, 215, 85, 21);
		panel.add(btnNewButton1);
		
		JButton btnNewButton2 = new JButton("Dalje2");
		btnNewButton2.setBackground(new Color(0, 0, 0));
		btnNewButton2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(radio[0].isSelected()) {
					pacijent.setGrlo("da");
					Kie(pacijent);
					Promeni(pacijent.getRed());
					}
				else if(radio[1].isSelected()) {
					pacijent.setGrlo("ne");
					Kie(pacijent);
					Promeni(pacijent.getRed());
					}
				else JOptionPane.showMessageDialog(null, "Morate izbarati neki od ponudjenih odgovora!");
				
			}
		});
		btnNewButton2.setFont(new Font("Arial", Font.BOLD, 14));
		btnNewButton2.setBounds(640, 215, 85, 21);
		panel.add(btnNewButton2);
		
		JButton btnNewButton3 = new JButton("Dalje3");
		btnNewButton3.setBackground(new Color(0, 0, 0));
		btnNewButton3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(radio[0].isSelected()) {
					pacijent.setNos("da");
					Kie(pacijent);
					Promeni(pacijent.getRed());
					}
				else if(radio[1].isSelected()) {
					pacijent.setNos("ne");
					Kie(pacijent);
					Promeni(pacijent.getRed());
					}
				else JOptionPane.showMessageDialog(null, "Morate izbarati neki od ponudjenih odgovora!");
				
			}
		});
		btnNewButton3.setFont(new Font("Arial", Font.BOLD, 14));
		btnNewButton3.setBounds(640, 215, 85, 21);
		panel.add(btnNewButton3);
		
		JButton btnNewButton4 = new JButton("Dalje4");
		btnNewButton4.setBackground(new Color(0, 0, 0));
		btnNewButton4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(radio[0].isSelected()) {
					pacijent.setKasalj("da");
					Kie(pacijent);
					Promeni(pacijent.getRed());
					}
				else if(radio[1].isSelected()) {
					pacijent.setKasalj("ne");
					Kie(pacijent);
					Promeni(pacijent.getRed());
					}
				else JOptionPane.showMessageDialog(null, "Morate izbarati neki od ponudjenih odgovora!");
				
			}
		});
		btnNewButton4.setFont(new Font("Arial", Font.BOLD, 14));
		btnNewButton4.setBounds(640, 215, 85, 21);
		panel.add(btnNewButton4);
		
		JButton btnNewButton5 = new JButton("Dalje5");
		btnNewButton5.setBackground(new Color(0, 0, 0));
		btnNewButton5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(radio[0].isSelected()) {
					pacijent.setGorusica("da");
					Kie(pacijent);
					Promeni(pacijent.getRed());
					}
				else if(radio[1].isSelected()) {
					pacijent.setGorusica("ne");
					Kie(pacijent);
					Promeni(pacijent.getRed());
					}
				else JOptionPane.showMessageDialog(null, "Morate izbarati neki od ponudjenih odgovora!");
				
			}
		});
		btnNewButton5.setFont(new Font("Arial", Font.BOLD, 14));
		btnNewButton5.setBounds(640, 215, 85, 21);
		panel.add(btnNewButton5);
		
		JButton btnNewButton6 = new JButton("Dalje6");
		btnNewButton6.setBackground(new Color(0, 0, 0));
		btnNewButton6.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(radio[0].isSelected()) {
					pacijent.setIskasljavanje("suvo");
					Kie(pacijent);
					Promeni(pacijent.getRed());
					}
				else if(radio[1].isSelected()) {
					pacijent.setIskasljavanje("produktivno");
					Kie(pacijent);
					Promeni(pacijent.getRed());
					}
				else JOptionPane.showMessageDialog(null, "Morate izbarati neki od ponudjenih odgovora!");
				
			}
		});
		btnNewButton6.setFont(new Font("Arial", Font.BOLD, 14));
		btnNewButton6.setBounds(640, 215, 85, 21);
		panel.add(btnNewButton6);
		
		JButton btnNewButton7 = new JButton("Dalje7");
		btnNewButton7.setBackground(new Color(0, 0, 0));
		btnNewButton7.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(radio[0].isSelected()) {
					pacijent.setNivokoze("da");
					Kie(pacijent);
					Promeni(pacijent.getRed());
					}
				else if(radio[1].isSelected()) {
					pacijent.setNivokoze("ne");
					Kie(pacijent);
					Promeni(pacijent.getRed());
					}
				else JOptionPane.showMessageDialog(null, "Morate izbarati neki od ponudjenih odgovora!");
				
			}
		});
		btnNewButton7.setFont(new Font("Arial", Font.BOLD, 14));
		btnNewButton7.setBounds(640, 215, 85, 21);
		panel.add(btnNewButton7);
		
		JButton btnNewButton8 = new JButton("Dalje8");
		btnNewButton8.setBackground(new Color(0, 0, 0));
		btnNewButton8.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(radio[0].isSelected()) {
					pacijent.setPromenakozaprvo("samo crvenilo");
					Kie(pacijent);
					Promeni(pacijent.getRed());
					}
				else if(radio[1].isSelected()) {
					pacijent.setPromenakozaprvo("crvenilo i svrab");
					Kie(pacijent);
					Promeni(pacijent.getRed());
					}
				else if(radio[2].isSelected()) {
					pacijent.setPromenakozaprvo("svrab, perutanje i crvenilo");
					Kie(pacijent);
					Promeni(pacijent.getRed());
					}
				else if(radio[3].isSelected()) {
					pacijent.setPromenakozaprvo("crvenilo i vlaznost");
					Kie(pacijent);
					Promeni(pacijent.getRed());
					}
				else JOptionPane.showMessageDialog(null, "Morate izbarati neki od ponudjenih odgovora!");
				
			}
		});
		btnNewButton8.setFont(new Font("Arial", Font.BOLD, 14));
		btnNewButton8.setBounds(640, 215, 85, 21);
		panel.add(btnNewButton8);
		
		JButton btnNewButton9 = new JButton("Dalje9");
		btnNewButton9.setBackground(new Color(0, 0, 0));
		btnNewButton9.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(radio[0].isSelected()) {
					pacijent.setPromenakoza2("rana(ogrebotina/posekotina)");
					Kie(pacijent);
					Promeni(pacijent.getRed());
					}
				else if(radio[1].isSelected()) {
					pacijent.setPromenakoza2("opekotina");
					Kie(pacijent);
					Promeni(pacijent.getRed());
					}
				else if(radio[2].isSelected()) {
					pacijent.setPromenakoza2("oziljak");
					Kie(pacijent);
					Promeni(pacijent.getRed());
					}
				else JOptionPane.showMessageDialog(null, "Morate izbarati neki od ponudjenih odgovora!");
				
			}
		});
		btnNewButton9.setFont(new Font("Arial", Font.BOLD, 14));
		btnNewButton9.setBounds(640, 215, 85, 21);
		panel.add(btnNewButton9);
		
		JButton btnNewButton10 = new JButton("Dalje10");
		btnNewButton10.setBackground(new Color(0, 0, 0));
		btnNewButton10.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(radio[0].isSelected()) {
					pacijent.setTipbola("hronican(traje duze od 3 meseca)");
					Kie(pacijent);
					Promeni(pacijent.getRed());
					}
				else if(radio[1].isSelected()) {
					pacijent.setTipbola("akutni(trenutni)");
					Kie(pacijent);
					Promeni(pacijent.getRed());
					}
				else JOptionPane.showMessageDialog(null, "Morate izbarati neki od ponudjenih odgovora!");
				
			}
		});
		btnNewButton10.setFont(new Font("Arial", Font.BOLD, 14));
		btnNewButton10.setBounds(640, 215, 85, 21);
		panel.add(btnNewButton10);
		
		JButton btnNewButton11 = new JButton("Dalje11");
		btnNewButton11.setBackground(new Color(0, 0, 0));
		btnNewButton11.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(radio[0].isSelected()) {
					pacijent.setPromenabol("nema promena");
					Kie(pacijent);
					Promeni(pacijent.getRed());
					}
				else if(radio[1].isSelected()) {
					pacijent.setPromenabol("modrica i otok");
					Kie(pacijent);
					Promeni(pacijent.getRed());
					}
				else if(radio[2].isSelected()) {
					pacijent.setPromenabol("modrica");
					Kie(pacijent);
					Promeni(pacijent.getRed());
					}
				else if(radio[3].isSelected()) {
					pacijent.setPromenabol("otok");
					Kie(pacijent);
					Promeni(pacijent.getRed());
					}
				else JOptionPane.showMessageDialog(null, "Morate izbarati neki od ponudjenih odgovora!");
				
			}
		});
		btnNewButton11.setFont(new Font("Arial", Font.BOLD, 14));
		btnNewButton11.setBounds(640, 215, 85, 21);
		panel.add(btnNewButton11);
		
		JButton btnNewButton12 = new JButton("Dalje12");
		btnNewButton12.setBackground(new Color(0, 0, 0));
		btnNewButton12.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(radio[0].isSelected()) {
					pacijent.setGastroitegobe("dijareja");
					Kie(pacijent);
					Promeni(pacijent.getRed());
					}
				else if(radio[1].isSelected()) {
					pacijent.setGastroitegobe("mucnina");
					Kie(pacijent);
					Promeni(pacijent.getRed());
					}
				else if(radio[2].isSelected()) {
					pacijent.setGastroitegobe("dijareja i mucnina");
					Kie(pacijent);
					Promeni(pacijent.getRed());
					}
				else JOptionPane.showMessageDialog(null, "Morate izbarati neki od ponudjenih odgovora!");
				
			}
		});
		btnNewButton12.setFont(new Font("Arial", Font.BOLD, 14));
		btnNewButton12.setBounds(640, 215, 85, 21);
		panel.add(btnNewButton12);
		
		JButton btnNewButton13 = new JButton("Dalje13");
		btnNewButton13.setBackground(new Color(0, 0, 0));
		btnNewButton13.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.exit(0);	
			}
		});
		btnNewButton13.setFont(new Font("Arial", Font.BOLD, 14));
		btnNewButton13.setBounds(640, 215, 85, 21);
		panel.add(btnNewButton13);
		
		dugme[0]=btnNewButton;
		dugme[1]=btnNewButton1;
		dugme[2]=btnNewButton2;
		dugme[3]=btnNewButton3;
		dugme[4]=btnNewButton4;
		dugme[5]=btnNewButton5;
		dugme[6]=btnNewButton6;
		dugme[7]=btnNewButton7;
		dugme[8]=btnNewButton8;
		dugme[9]=btnNewButton9;
		dugme[10]=btnNewButton10;
		dugme[11]=btnNewButton11;
		dugme[12]=btnNewButton12;
		dugme[13]=btnNewButton13;
		
		
		JLabel lekovi = new JLabel("Dijagnoza/preporuceni lekovi: ");
		lekovi.setFont(new Font("Arial", Font.PLAIN, 14));
		lekovi.setBounds(10, 231, 192, 55);
		panel.add(lekovi);
		
		
		dijagnoza.setFont(new Font("Arial", Font.PLAIN, 14));
		
		dijagnoza.setBounds(10, 250, 756, 100);
		panel.add(dijagnoza);
			
	}
}

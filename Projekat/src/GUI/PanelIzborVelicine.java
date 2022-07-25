package GUI;

import javax.swing.ButtonGroup;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.border.TitledBorder;
import java.awt.GridBagLayout;

/**
 * Klasa koja extend-a JPanel, sadr�i radio dugmad Veliki/Normalan/Mali, za izbor veli�ine prozora
 * 
 * @param radioDugme1 - dugme "Veliki" za veli�inu prozora
 * @param radioDugme2 - dugme "Normalan" za veli�inu prozora
 * @param radioDugme3 - dugme "Mali" za veli�inu prozora
 */
public class PanelIzborVelicine extends JPanel {
	
	private JRadioButton radioDugme1;
    private JRadioButton radioDugme2;
    private JRadioButton radioDugme3;
    
    /**
     * Konstuktor klase PanelIzborVelicine
     * 
     * @param ram - okvir oko ovog panela
     */
	public PanelIzborVelicine() {
		
		TitledBorder ram = new TitledBorder("Veli�ina prozora: ");
		setBorder(ram);
		setLayout(new GridBagLayout());
		ubaciRadioDugmad();
	
	}
	
	/**
	 * Funkcija za kreiranje i ubacivanje radio dugmadi u panel
	 * 
	 * @param grupa - grupa koja sadr�i sva radio dugmad tj. grupi�e ih
	 */
	private void ubaciRadioDugmad() {
		
		radioDugme1 = new JRadioButton("Veliki");
		radioDugme2 = new JRadioButton("Normalan");
		radioDugme3 = new JRadioButton("Mali");

		radioDugme2.setSelected(true);
		
		ButtonGroup grupa = new ButtonGroup();
		grupa.add(radioDugme1);
		grupa.add(radioDugme2);
		grupa.add(radioDugme3);
		  
		this.add(radioDugme1);
		this.add(radioDugme2);
		this.add(radioDugme3);	
	
	}
	
	/**
	 * Geter funkcija za radioDugme1
	 * 
	 */
    public JRadioButton getRadioDugme1() {
    	return radioDugme1;
    }

	/**
	 * Geter funkcija za radioDugme2
	 * 
	 */
    public JRadioButton getRadioDugme2() {
    	return radioDugme2;
    }

	/**
	 * Geter funkcija za radioDugme3
	 * 
	 */
    public JRadioButton getRadioDugme3() {
    	return radioDugme3;
    }
    
}
import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class VentanaGrid extends Frame{
    private Label lblEtiqueta1;
    private Label lblEtiqueta2;
    private TextField txtCuaro1;
    private TextField txtCuaro2;
    private Button boton1;
    private GridLayout layout;

    public VentanaGrid(String title) throws HeadlessException {
        super(title);
        layout = new GridLayout(3,2);
        this.setSize(800, 600);
        this.setLayout(layout);

        lblEtiqueta1 = new Label("ETIQUETA 1");
        this.add(lblEtiqueta1,0);

        txtCuaro1 = new TextField(30);
        this.add(txtCuaro1,1);

        lblEtiqueta2 = new Label("ETIQUETA 2");
        this.add(lblEtiqueta2,2);

        txtCuaro2 = new TextField(30);
        this.add(txtCuaro2,3);

        boton1 = new Button("PRESIONAME");
        this.add(boton1,4);

        boton1.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                String texto = txtCuaro1.getText() + " " + txtCuaro2.getText();
                JOptionPane.showMessageDialog(null,texto);

            }
        });




        this.addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosing(WindowEvent e) {
                System.exit(0);
            }
        });
        this.setVisible(true);

    }
}

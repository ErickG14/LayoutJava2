import java.awt.*;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class Ventana extends Frame {
    private Label lblEtiqueta1;
    private Label lblEtiqueta2;
    private TextField txtCuaro1;
    private TextField txtCuaro2;
    private Button boton1;
    private FlowLayout layout;

    public Ventana(String title) throws HeadlessException {
        super(title);
        layout = new FlowLayout(FlowLayout.LEFT);
        this.setLayout(layout);

        lblEtiqueta1 = new Label("ETIQUETA 1");
        this.add(lblEtiqueta1);

        txtCuaro1 = new TextField(30);
        this.add(txtCuaro1);

        lblEtiqueta2 = new Label("ETIQUETA 2");
        this.add(lblEtiqueta2);

        txtCuaro2 = new TextField(30);
        this.add(txtCuaro2);

        this.setSize(800,600);

        this.addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosing(WindowEvent e) {
                System.exit(0);
            }
        });

        this.setVisible(true);

    }
}

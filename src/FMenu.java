import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class FMenu {
    private JButton jogadoresButton;
    private JButton clubesButton;
    private JPanel PanelPrincipal;

    public void setVisible(boolean b)
    {
        JFrame frame=new JFrame("Gestao de Jogadores");
        frame.setLocationRelativeTo(null);
        frame.setSize(600,500);
        frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        frame.setContentPane(new FMenu().PanelPrincipal);
        frame.setVisible(true);
    }


    public FMenu() {
        jogadoresButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
            new FGjogadores().setVisible(true);
            }
        });

        clubesButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                new FClubes().setVisible(true);
            }

        });
    }
}

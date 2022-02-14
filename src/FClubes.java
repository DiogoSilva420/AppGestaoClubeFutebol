import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

public class FClubes {
    private JTextField textFieldDesignacaoCl;
    private JButton atribuirJogadoresButton;
    private JTextArea textAreaClube;
    private JButton gravarClubeButton;
    private JPanel panelClubes;
    public static Clube clube;
    public static ArrayList<Clube> clu = new ArrayList<Clube>();

    public void setVisible(boolean b) {
        JFrame frame = new JFrame("Gestão de Jogadores");
        frame.setContentPane(new FClubes().panelClubes);
        frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        frame.setSize(600, 420);
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);
    }

    public FClubes() {
        atribuirJogadoresButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                for(Jogador j: FGjogadores.jogadores){
                   textAreaClube.append(j.toString());
                }
            }
        });

        gravarClubeButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if(textFieldDesignacaoCl.getText()!="" && textAreaClube.getText()!=""){
                    clube = new Clube();
                    clube.setDesignacao(textFieldDesignacaoCl.getText());
                    clube.setJogadores(FGjogadores.jogadores);
                    clu.add(clube);
                    JOptionPane.showMessageDialog(null, "Gravado com sucesso!");
                }
            }
        });
    }
}

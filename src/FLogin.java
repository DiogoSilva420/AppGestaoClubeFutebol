import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class FLogin {
    private JTextField textFieldUser;
    private JButton okButton;
    private JPanel PanelLogin;
    private JTextField textFieldPass;

    public static void main(String[] args) {
        JFrame frame = new JFrame("Gestão Jogadores e Clubes");
        frame.setContentPane(new FLogin().PanelLogin);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(600,500);
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);
    }

    public FLogin() {
        okButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String txtUser=textFieldUser.getText();
                String txtPass=textFieldPass.getText();


                try
                {
                    Connection conn=Conexao.createConnection();

                    String sql="SELECT NOME, USERNAME, PASSWRD, CC FROM FUNCIONARIOS";
                    PreparedStatement ps = conn.prepareStatement(sql);
                    ResultSet rs=ps.executeQuery();
                    boolean fg=false;

                    while(rs.next())
                    {
                        String nome = rs.getString(1);
                        String user=rs.getString("NOMEUTILIZADOR");
                        String pass=rs.getString("PALAVRAPASS");
                        System.out.printf("%s - %s - %s", nome,user,pass);
                        //System.out.printf(nome+"-" + user + "-" + pass);

                        if (txtUser.equals(user) && txtPass.equals(pass))
                        {
                            new FMenu().setVisible(true);
                            fg=true;
                        }
                    }
                    if(!fg)
                    {
                        JOptionPane.showMessageDialog(null,"Login errado! username/password incorretos!");
                    }
                }
                catch(SQLException ex)
                {
                    JOptionPane.showMessageDialog(null,"Erro: " + ex.getMessage());
                }
            }
        });
    }
}

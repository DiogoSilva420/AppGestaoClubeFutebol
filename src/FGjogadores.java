import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.FocusAdapter;
import java.awt.event.FocusEvent;
import java.util.ArrayList;

public class FGjogadores {
    private JTabbedPane tabbedPaneConsultar;
    private JTextField textFieldNome;
    private JTextField textFieldIdade;
    private JTextField textFieldMorada;
    private JTextField textFieldPeso;
    private JTextField textFieldAltura;
    private JTextField textFieldNCamisola;
    private JTextField textFieldPosicao;
    private JTextField textFieldRenum;
    private JButton gravarButton;
    private JTextField textFieldNomePesquisar;
    private JButton pesquisarButton;
    private JTextField textFieldAlNome;
    private JTextField textFieldAIIDade;
    private JTextField textFieldAlMorada;
    private JTextField textFieldAlPeso;
    private JTextField textFieldAlAltura;
    private JTextField textFieldAlNCamisola;
    private JTextField textFieldAlPCampo;
    private JTextField textFieldAlRenumeracao;
    private JButton alterarButton;
    private JTextArea textAreaConsulta;
    private JTextField textFieldNomeJAEliminar;
    private JButton procurarEButton;
    private JTextArea textAreaEliminar;
    private JPanel PanelJogadores;
    private JButton eliminarButton;
    private JTextArea textAreaMassaCorporal;
    private JTextArea textAreaSalarioAnual;



    public static Jogador jogador;
    public static ArrayList<Jogador> jogadores = new ArrayList<Jogador>();

    public FGjogadores() {
        gravarButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (textFieldNome.getText() != "" && textFieldIdade.getText() != "" && textFieldMorada.getText() != "" && textFieldPeso.getText() != "" &&
                        textFieldAltura.getText() != "" && textFieldAlMorada.getText() != "" && textFieldNCamisola.getText() != "" && textFieldPosicao.getText() != ""
                        && textFieldRenum.getText() != "") {
                    jogador = new Jogador();

                    jogador.Nome = textFieldNome.getText();
                    jogador.Idade = Integer.valueOf(textFieldIdade.getText());
                    jogador.Morada = textFieldMorada.getText();
                    jogador.Peso = Double.valueOf(textFieldPeso.getText());
                    jogador.Altura = Double.valueOf(textFieldAltura.getText());
                    jogador.NCamisola = Integer.valueOf(textFieldNCamisola.getText());
                    jogador.Posicao = textFieldPosicao.getText();
                    jogador.Renumeracao = Double.valueOf(textFieldRenum.getText());

                    jogadores.add(jogador);
                    JOptionPane.showMessageDialog(null, jogador.getNome() + ", " + "Gravado com sucesso!");
                }
            }

        });


        pesquisarButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String nome = textFieldNomePesquisar.getText();
                for(Jogador j : jogadores)
                    if(j.getNome().equals(nome))
                    {
                        textFieldAlNome.setText(j.getNome());
                        textFieldAIIDade.setText(String.valueOf(j.getIdade()));
                        textFieldAlMorada.setText(j.getMorada());
                        textFieldAlPeso.setText(String.valueOf(j.getPeso()));
                        textFieldAlAltura.setText(String.valueOf(j.getAltura()));
                        textFieldAlNCamisola.setText(String.valueOf(j.getNCamisola()));
                        textFieldAlPCampo.setText(j.getPosicao());
                        textFieldAlRenumeracao.setText(String.valueOf(j.getRenumeracao()));
                        textAreaSalarioAnual.setText(String.valueOf(j.SalarioAnual()));
                        textAreaMassaCorporal.setText(String.valueOf(j.MassaC()));


                    }
            }
        });
        alterarButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String nome = textFieldNomePesquisar.getText();
                for(Jogador j : jogadores)
                    if(j.getNome().equals(nome))
                    {
                        j.Nome = textFieldAlNome.getText();
                        j.Idade = Integer.parseInt(textFieldAIIDade.getText());
                        j.Morada = textFieldAlMorada.getText();
                        j.Peso = Double.parseDouble(textFieldAlPeso.getText());
                        j.Altura = Double.parseDouble(textFieldAlAltura.getText());
                        j.NCamisola = Integer.parseInt(textFieldAlNCamisola.getText());
                        j.Posicao = textFieldAlPCampo.getText();
                        j.Renumeracao = Double.parseDouble(textFieldAlRenumeracao.getText());
                        jogador = j;

                    }
            }
        });
        textAreaConsulta.addFocusListener(new FocusAdapter() {
            @Override
            public void focusGained(FocusEvent e) {
                super.focusGained(e);
                textFieldNome.setText("");
                textFieldIdade.setText("");
                textFieldMorada.setText("");
                textFieldPeso.setText("");
                textFieldAltura.setText("");
                textFieldNCamisola.setText("");
                textFieldPosicao.setText("");
                textFieldRenum.setText("");
                textAreaConsulta.setText("");
                textFieldAlNome.setText("");
                textFieldAIIDade.setText("");
                textFieldAlMorada.setText("");
                textFieldAlPeso.setText("");
                textFieldAlAltura.setText("");
                textFieldAlNCamisola.setText("");
                textFieldAlPCampo.setText("");
                textFieldAlRenumeracao.setText("");
                for(Jogador j : jogadores){
                    textAreaConsulta.append(j.toString());
                }
            }
        });

        procurarEButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String nome = textFieldNomePesquisar.getText();
                for(Jogador j : jogadores)
                    if(j.getNome().equals(nome))
                    {
                        textAreaEliminar.setText("");
                        textAreaEliminar.setText(j.toString());
                    }
            }

        });
        eliminarButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String nome = textFieldNomePesquisar.getText();
                for(Jogador j : jogadores){
                    if(j.getNome().equals(nome))
                    {
                        textAreaEliminar.setText("");
                        jogadores.remove(j);
                    }

                }
            }
        });
    }
}

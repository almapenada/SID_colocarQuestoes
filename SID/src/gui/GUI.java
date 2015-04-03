package gui;

import java.awt.Dimension;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextArea;

import classes.Curso;
import classes.Modulo;
import classes.NivelDificuldade;
import classes.Questao;
import controlador.ctrlResponderQuestao;

public class GUI extends JPanel {

	private JComboBox jcompListaCursos;
	private JComboBox jcompListaModulos;
	private JComboBox jcompGraus;
	private JComboBox jcompListaSubModulos;
	private JComboBox jcompResposta;
	private JButton jcompObterQuestao;
	private JButton jcompAbandonar;
	private JButton jcompEnviarResposta;
	private JTextArea jcompTextoDaQuestao;
	private JLabel jcompImagemAnexada;
	private JTextArea jcompHipotesesResposta;
	private JTextArea jcomp20;
	private JTextArea jcomp22;
	private JLabel labelRespostaQuestao;
	private JLabel labelSelecionarCurso;
	private JLabel labelSelecionarModulo;
	private JLabel labelSelecionarSubModulo;
	private JLabel labelGraus;
	private JLabel jcomp14;
	private JLabel jcomp15;
	private JLabel jcomp16;
	private JLabel jcomp19;
	private JLabel jcomp21;

	private Questao questao;

	public GUI() {

		final ctrlResponderQuestao ctrl = new ctrlResponderQuestao();

		ArrayList<Curso> auxCursos = ctrl.obterCursos();
		ArrayList<String> cursos = new ArrayList<String>();
		if (auxCursos != null) {
			for (Curso c : auxCursos)
				cursos.add(c.getSiglaCurso());
		}
		ArrayList<Modulo> auxModulos = ctrl.obterModulos("LEI");
		/******* ATENÇAO *********/
		ArrayList<String> modulos = new ArrayList<String>();
		ArrayList<String> subModulos = new ArrayList<String>();
		if (auxModulos != null) {
			for (Modulo m : auxModulos) {
				modulos.add(m.getDesignacaoModulo());
				subModulos.add(m.getDesignacaoSubModulo());
			}
		}
		ArrayList<NivelDificuldade> auxNiveis = ctrl.obterNiveis();
		ArrayList<String> niveis = new ArrayList<String>();
		if (auxNiveis != null) {
			for (NivelDificuldade n : auxNiveis)
				niveis.add(n.getDesignacaoNivel());
		}
		// construct preComponents

		Object[] listaCursos = cursos.toArray();
		Object[] listaModulos = modulos.toArray();
		Object[] listaGrausDificuldade = niveis.toArray();
		Object[] listaSubModulos = subModulos.toArray();
		String[] hipotesesResposta = { "1", "2", "3", "4" };

		// construct components
		jcompListaCursos = new JComboBox(listaCursos);
		jcompListaModulos = new JComboBox(listaModulos);
		jcompGraus = new JComboBox(listaGrausDificuldade);
		jcompListaSubModulos = new JComboBox(listaSubModulos);
		jcompObterQuestao = new JButton("Obter Questão");
		jcompTextoDaQuestao = new JTextArea(5, 5);
		jcompTextoDaQuestao.setEditable(false);
		jcompImagemAnexada = new JLabel()/* JTextArea(5, 5) */;
		// jcompImagemAnexada.setEditable(false);
		jcompHipotesesResposta = new JTextArea(5, 5);
		jcompHipotesesResposta.setEditable(false);
		labelRespostaQuestao = new JLabel("Resposta à questão:");
		labelSelecionarCurso = new JLabel("Selecionar Curso");
		labelSelecionarModulo = new JLabel("Selecionar Módulo");
		labelSelecionarSubModulo = new JLabel("Selecionar SubMódulo");
		labelGraus = new JLabel("Indique o nivel de dificuldade");
		jcomp14 = new JLabel("Questão:");
		jcomp15 = new JLabel("Imagem anexa:");
		jcomp16 = new JLabel("Hípoteses de resposta:");
		jcompResposta = new JComboBox(hipotesesResposta);
		jcompEnviarResposta = new JButton("Enviar Resposta");
		jcomp19 = new JLabel("Avaliação:");
		jcomp20 = new JTextArea(5, 5);
		jcomp20.setEditable(false);
		jcomp21 = new JLabel("Explicação:");
		jcomp22 = new JTextArea(5, 5);
		jcomp22.setEditable(false);
		jcompAbandonar = new JButton("Abandonar Avaliação");
		// adjust size and set layout
		setPreferredSize(new Dimension(667, 367));
		setLayout(null);
		// add components
		add(jcompListaCursos);
		add(jcompListaModulos);
		add(jcompGraus);
		add(jcompListaSubModulos);
		add(jcompObterQuestao);
		add(jcompTextoDaQuestao);
		add(jcompImagemAnexada);
		add(jcompHipotesesResposta);
		add(labelRespostaQuestao);
		add(labelSelecionarCurso);
		add(labelSelecionarModulo);
		add(labelSelecionarSubModulo);
		add(labelGraus);
		add(jcomp14);
		add(jcomp15);
		add(jcomp16);
		add(jcompResposta);
		add(jcompEnviarResposta);
		add(jcomp19);
		add(jcomp20);
		add(jcomp21);
		add(jcomp22);
		add(jcompAbandonar);
		// set component bounds (only needed by Absolute Positioning)
		jcompListaCursos.setBounds(25, 25, 100, 25);
		jcompListaModulos.setBounds(250, 25, 100, 25);
		jcompGraus.setBounds(250, 95, 100, 25/* 25, 95, 100, 25 */);
		jcompListaSubModulos.setBounds(25, 95, 100, 25);
		jcompObterQuestao.setBounds(195, 135, 130, 25);
		jcompTextoDaQuestao.setBounds(10, 175, 325, 135);
		jcompImagemAnexada.setBounds(345, 175, 155, 135);
		jcompHipotesesResposta.setBounds(10, 345, 490, 75);
		labelRespostaQuestao.setBounds(10, 420, 140, 25);
		labelSelecionarCurso.setBounds(10, 0, 115, 25);
		labelSelecionarModulo.setBounds(240, 0, 120, 25);

		labelSelecionarSubModulo.setBounds(10, 70, 195, 25/* 240, 70, 140, 25 */);
		labelGraus.setBounds(240, 70, 190, 25);

		jcomp14.setBounds(10, 150, 100, 25);
		jcomp15.setBounds(345, 150, 100, 25);
		jcomp16.setBounds(10, 320, 145, 25);
		jcompResposta.setBounds(135, 420, 60, 25);
		jcompEnviarResposta.setBounds(225, 420, 135, 25);
		jcomp19.setBounds(10, 455, 70, 25);
		jcomp20.setBounds(80, 460, 185, 25);
		jcomp21.setBounds(10, 490, 80, 25);
		jcomp22.setBounds(10, 515, 490, 75);
		jcompAbandonar.setBounds(185, 600, 165, 30);

		// Sentinelas
		jcompAbandonar.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {

			}
		});

		jcompObterQuestao.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				questao = ctrl.obterQuestao("a", "b", 1);
				// Questao q = ctrl.obterQuestao(jcompListaModulos
				// .getSelectedItem().toString(), jcompListaSubModulos
				// .getSelectedItem().toString(), 1 /*
				// * jcompListaCursos.
				// * getSelectedItem()
				// */);

				jcompTextoDaQuestao.setText(questao.getTexto());
				ImageIcon i = new ImageIcon(
						"C:\\Users\\Utilizador\\Desktop\\Modo_Trap_P16.jpg");
				jcompImagemAnexada.setIcon(i);
				jcompHipotesesResposta.setText(String.valueOf(questao
						.getResposta()));

			}
		});
		jcompEnviarResposta.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				if (questao != null) {
					ctrl.responder(Integer.parseInt(jcompResposta
							.getSelectedItem().toString()), questao.getId(),
							"sid@iscte-iul.pt");
					if (questao.getResposta() == Integer.parseInt(jcompResposta
							.getSelectedItem().toString())) {
						jcomp20.setText("Resposta correcta");
					} else {
						jcomp20.setText("Resposta incorrecta");
					}
					jcomp22.setText(questao.getExplicacao());
					jcompEnviarResposta.setEnabled(false);
					jcompResposta.setEnabled(false);
				} else {
					JOptionPane.showMessageDialog(jcompEnviarResposta, "Não existe questão seleccionada");
				}
			}
		});

	}

	public static void main(String[] args) {
		JFrame frame = new JFrame("Resposta à questão");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setSize(510, 660);
		frame.getContentPane().add(new GUI());
		frame.setResizable(false);
		frame.setLocationRelativeTo(null);
		frame.setVisible(true);
	}

}

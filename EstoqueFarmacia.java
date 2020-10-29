import javax.swing.*;
import java.util.Scanner;

public class EstoqueFarmacia {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        byte quantidade = 0;
        byte codigoMedicamento = 0;
        byte numeroPesquisa = 0;

        String nomeMedicamento = null, tipoMedicamento = null;
        short miligramas = 0;

        String[] vetorTipoMedicamento = new String[20];
        String[] vetorNomeMedicamento = new String[20];
        short vetorMiligramas[] = new short[20];
        byte vetorCodigo[] = new byte[20];

        System.out.println("==================================");
        System.out.println("digite: ");
        System.out.println("\t1 - cadastrar até 20 produtos");
        System.out.println("\t2 - para cadastrar o produto ");
        System.out.println("\t3 - para mostrar cadastro desejado");
        System.out.println("\t0 - para sair");
        System.out.println("opção");
        byte opcao = entrada.nextByte();

        while (opcao != 0) {
            switch (opcao) {
                case 1:
                    quantidade = Byte.parseByte(JOptionPane.showInputDialog(null,"digite a quantidade de cadastros"));

                    //determina o tamanho dos vetores
                    vetorNomeMedicamento = new String[quantidade];
                    vetorMiligramas = new short[quantidade];
                    vetorCodigo = new byte[quantidade];

                    //cadastro feito até o tamanho determinado
                    for (int i = 0; i < quantidade; i++){
                        nomeMedicamento = JOptionPane.showInputDialog(null, "digite o nome do produto "+(i + 1));
                        miligramas = Short.parseShort(JOptionPane.showInputDialog(null,"digite as miligramas do produto "+(i + 1)));
                        codigoMedicamento = Byte.parseByte(JOptionPane.showInputDialog(null, "digite o código do produto "+(i + 1)));

                        vetorNomeMedicamento[i] = nomeMedicamento;
                        vetorMiligramas[i] = miligramas;
                        vetorCodigo[i] = codigoMedicamento;
                    }
                    break;
                case 2:
                    numeroPesquisa = Byte.parseByte(JOptionPane.showInputDialog(null,"digite um código para pesquisar"));

                    for (int i = 0; i < quantidade; i++){
                        if (numeroPesquisa == 1) {
                            JOptionPane.showMessageDialog(null, vetorNomeMedicamento[i] + "\n" + vetorMiligramas[i] + "\n" + vetorCodigo[i]);
                        } else if (numeroPesquisa == 2){
                            JOptionPane.showMessageDialog(null, vetorNomeMedicamento[i] + "\n" + vetorMiligramas[i] + "\n" + vetorCodigo[i]);
                        }
                    }
                    /*if (numeroPesquisa == 1) {
                        JOptionPane.showMessageDialog(null, vetorNomeMedicamento[0] + "\n" + vetorMiligramas[0] + "\n" + vetorCodigo[0]);
                    }
                    if (numeroPesquisa == 2){
                        JOptionPane.showMessageDialog(null, vetorNomeMedicamento[1] + "\n" + vetorMiligramas[1] + "\n" + vetorCodigo[1]);
                    }

                     */
                    break;
                case 3:
                    //mostrar todos os cadastros seguidos
                        JOptionPane.showMessageDialog(null, vetorNomeMedicamento[0] + "\n" + vetorMiligramas[0] + "\n" + vetorCodigo[0]);
                        JOptionPane.showMessageDialog(null, vetorNomeMedicamento[1] + "\n" + vetorMiligramas[1] + "\n" + vetorCodigo[1]);
                    break;
                default:
                    //System.out.println("digite uma opção válida");
                    JOptionPane.showMessageDialog(null,"DIGITE UMA OPÇÃO VÁLIDA");
                    break;
            }
            System.out.println("==================================");
            System.out.println("digite: ");
            System.out.println("\t1 - cadastrar até 20 produtos");
            System.out.println("\t2 - para cadastrar o produto ");
            System.out.println("\t3 - para mostrar cadastro desejado");
            System.out.println("\t0 - para sair");
            System.out.println("opção");
            opcao = entrada.nextByte();

        }

        entrada.close();
    }
}

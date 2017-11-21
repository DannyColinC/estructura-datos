package ActividadF;
import java.util.Scanner;

import BinaryNode.BinaryNode; 

public class FindAnimal {
	public static void main(String[] args) {
        String[] arrStr;

        BinaryNode root = new BinaryNode(4, "Es Mamifero");

        BinaryNode node2 = new BinaryNode(1, "Muerde");

        BinaryNode node1 = new BinaryNode("Perro");
        BinaryNode node3 = new BinaryNode("Gato");

        BinaryNode node5 = new BinaryNode(0, "Tiene escamas");


        BinaryNode node7 = new BinaryNode(1, "Respira bajo el agua");
        BinaryNode node9 = new BinaryNode("Ave");

        BinaryNode node10 = new BinaryNode("Pescado");
        BinaryNode node11 = new BinaryNode("Serpiente");



    
        root.leftChild = node2;
        root.rightChild = node5;

 
        node2.leftChild = node1;
        node2.rightChild = node3;


        node5.leftChild = node7;
        node5.rightChild = node9;

        node7.leftChild = node10;
        node7.rightChild = node11;


        arrStr = pregunta(root);

        if(arrStr[0].toUpperCase().equals("NO")){
            System.out.println(arrStr[0]);
        }

    }

    public static String[] pregunta(BinaryNode node){
        String[] animFi = new String[2];
        String respond;
        Scanner entrada = new Scanner(System.in);
        if(node.rightChild == null && node.leftChild == null){
            System.out.println("Tu animal es un: " + node.animal+"?");
            respond = entrada.next();
            animFi[0] = respond;
            animFi[1] = node.animal;
            return animFi;
        }

        System.out.println(node.qs+"?");
        respond = entrada.next();

        if(respond.toUpperCase().equals("SI")){
            return pregunta(node.leftChild);
        }else{
            return pregunta(node.rightChild);
        }
}

}

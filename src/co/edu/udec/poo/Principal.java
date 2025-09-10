package co.edu.udec.poo;

public class Principal {
    public static void main(String[] args) {
        PrincipalView view = new PrincipalView();
        view.setExtendedState(PrincipalView.MAXIMIZED_BOTH);
        view.setVisible(true);
    }
}
package expressoesregulares;

import javax.swing.JOptionPane;

public class Main {

    public static void main(String[] args) {
        // obtém entrada do usuário e verifica se entrada segue o padrão especificado
        String firstName = JOptionPane.showInputDialog("Please enter first name:");
        if(!ValidateInput.validateFirstName(firstName))
            throw new IllegalArgumentException("Invalid first name");
        
        String lastName = JOptionPane.showInputDialog("Please enter last name:");
        if(!ValidateInput.validateLastName(lastName))
            throw new IllegalArgumentException("Invalid last name");
        
        String address = JOptionPane.showInputDialog("Please enter address:");
        if(!ValidateInput.validateAddress(address))
            throw new IllegalArgumentException("Invalid address");
        
        String city = JOptionPane.showInputDialog("Please enter city:");
        if(!ValidateInput.validateCity(city))
            throw new IllegalArgumentException("Invalid city");
        
        String state = JOptionPane.showInputDialog("Please enter state:");
        if(!ValidateInput.validateState(state))
            throw new IllegalArgumentException("Invalid state");
        
        String zip = JOptionPane.showInputDialog("Please enter zip:");
        if(!ValidateInput.validateZip(zip))
            throw new IllegalArgumentException("Invalid zip");
        
        String phone = JOptionPane.showInputDialog("Please enter phone:");
        if(!ValidateInput.validatePhone(phone))
            throw new IllegalArgumentException("Invalid phone");
    }
    
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package kalkulacka_3.pkg0;

/**
 *
 * @author janko
 */
public class tlacitko_carka implements I_algoritmus{
    RadekModel model = RadekModel.getInstance();
    @Override
    public void algoritmus() {        
        if(model.getRadek2().indexOf('.') > 0){
            
        }else{
            model.setRadek2(model.getRadek2()+".");
        }
    }
    
}

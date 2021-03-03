package business;

import data.EmpresaData;
import domain.Empresa;

public class EmpresaBusiness {
    EmpresaData empresaData = new EmpresaData();
    
    public Empresa getBusiness(){
    return this.empresaData.getBusiness();
    }
    
    public int updateBusiness(Empresa empresa){
        return this.empresaData.updateBusiness(empresa);
    }
    
}
